drop database railway;
create database railway;
use railway;

-- -------------------------------------------------------------------------------

CREATE TABLE location
(
	pin_code DECIMAL(6) PRIMARY KEY,
	city VARCHAR(15) NOT NULL,
    state VARCHAR(11) NOT NULL
);
-- -------------------------------------------------------------------------------
CREATE TABLE passenger
(
	aadhar_number DECIMAL(12) PRIMARY KEY,
	first_name VARCHAR(30) NOT NULL,
	last_name VARCHAR(30) NOT NULL,
	email VARCHAR(30) CHECK(email LIKE '%@%.com'),
    passenger_password VARCHAR(15) CHECK(LENGTH(passenger_password) >= 8),
	date_of_birth DATE CHECK(DATEDIFF('2020-06-05',date_of_birth) > 6570),
    phone DECIMAL(10) NOT NULL,
    pin_code DECIMAL(6) NOT NULL,
	street VARCHAR(20) NOT NULL,
    FOREIGN KEY(pin_code) REFERENCES location(pin_code) ON DELETE NO ACTION ON UPDATE CASCADE
);

CREATE TABLE train
(
	train_id INT PRIMARY KEY ,
	train_name varchar(20) 
);

CREATE TABLE class
(
    train_id INT NOT NULL,
	class_name VARCHAR(20) NOT NULL,
	fare DECIMAL(10,2) NOT NULL,
    FOREIGN KEY(train_id) REFERENCES train(train_id) ON DELETE CASCADE ON UPDATE CASCADE,
    PRIMARY KEY(class_name,train_id)
);

CREATE TABLE  journey
( 
	journey_id INT PRIMARY KEY auto_increment,
    train_id INT,
	source_name VARCHAR(20) NOT NULL,
	destination_name VARCHAR(20) NOT NULL,
    departure DATETIME NOT NULL,
	arrival DATETIME NOT NULL,
    FOREIGN KEY(train_id) REFERENCES train(train_id) ON DELETE CASCADE
);

CREATE TABLE seat
(
	seat_no INT NOT NULL,
    journey_id INT NOT NULL,
    class_name VARCHAR(20) NOT NULL,
    booking_status INT NOT NULL DEFAULT 0,
	FOREIGN KEY (journey_id) REFERENCES journey(journey_id) ON DELETE NO ACTION,
    FOREIGN KEY (class_name) REFERENCES class(class_name) ON DELETE CASCADE ON UPDATE CASCADE,
    PRIMARY KEY (seat_no,class_name,journey_id)
);

CREATE TABLE booking
(
	booking_id INT PRIMARY KEY AUTO_INCREMENT,
    aadhar_number DECIMAL(12) NOT NULL,
    seat_no INT NOT NULL,
    class_name VARCHAR(20) NOT NULL,
	-- train_id INT NOT NULL,
	journey_id INT NOT NULL,
    FOREIGN KEY (aadhar_number) REFERENCES passenger(aadhar_number) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (seat_no) REFERENCES seat(seat_no) ON DELETE CASCADE ON UPDATE CASCADE,
    -- FOREIGN KEY (train_id) REFERENCES train(train_id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (journey_id) REFERENCES journey(journey_id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (class_name) REFERENCES class(class_name) ON DELETE CASCADE ON UPDATE CASCADE
);
ALTER TABLE booking AUTO_INCREMENT = 5000;

CREATE TABLE admin
(
	adminID int PRIMARY KEY,
	email varchar (30) CHECK(email LIKE '%@%.com'),
	admin_password varchar (15) NOT NULL CHECK(LENGTH(admin_password) >= 8)
);

insert into admin value(1,"admin@gmail.com", "admin123");

-- -------------------------------------------------Procedures and Functions-------------------------------------------------
delimiter &&
CREATE FUNCTION check_passenger(aadhar_no decimal(12)) RETURNS INTEGER READS SQL DATA 
BEGIN
	DECLARE present INTEGER;
    SELECT COUNT(aadhar_number) INTO present FROM passenger WHERE (aadhar_number = aadhar_no) ;
    RETURN present;
END &&

CREATE FUNCTION check_zip(pin decimal(6)) RETURNS INTEGER DETERMINISTIC 
BEGIN
	DECLARE exist INTEGER;
    SELECT COUNT(pin_code) INTO exist FROM location WHERE (pin_code = pin) ;
    RETURN exist;
END &&

CREATE PROCEDURE add_passenger
( IN an DECIMAL(12), IN fn VARCHAR(30), IN ln VARCHAR(30),IN mail VARCHAR(30), IN dob DATE,IN str VARCHAR(20), IN pin DECIMAL(6),IN phone DECIMAL(10), IN pswd VARCHAR(15), IN city VARCHAR(15),
  IN state VARCHAR(11), OUT stat INT )
BEGIN
	IF (check_passenger(an) = 0) THEN
        IF (check_zip(pin) = 0) THEN
			INSERT INTO location VALUES(pin,city,state);
		END IF;
			INSERT INTO passenger VALUES(an,fn,ln,mail,pswd,dob,phone,pin,str);
        SET stat=1;
	ELSE
		SET stat=0;
    END IF;
END &&

-- --------------------Train Realated-------------------------------------------------
delimiter &&

-- DROP FUNCTION check_available_seats&&
CREATE FUNCTION check_available_seats (j_id INT, c_name VARCHAR(20)) RETURNS INTEGER READS SQL DATA 
BEGIN
	DECLARE available INTEGER;
    SELECT COUNT(seat_no) INTO available FROM seat WHERE (journey_id=j_id AND class_name=c_name AND booking_status=0);
    RETURN available;
END &&

-- DROP FUNCTION check_all_seats&&

CREATE FUNCTION check_all_seats (j_id INT, c_name VARCHAR(20)) RETURNS INTEGER READS SQL DATA
BEGIN
	DECLARE available INTEGER;
    SELECT COUNT(seat_no) INTO available FROM seat WHERE (journey_id=j_id AND class_name=c_name) ;
    RETURN available;
END &&

CREATE FUNCTION get_seat_no (j_id INT, c_name VARCHAR(20)) RETURNS INTEGER READS SQL DATA
BEGIN
	DECLARE seat_number INTEGER  DEFAULT 0;
    DECLARE unavailable INTEGER DEFAULT 1;
    DECLARE c1 CURSOR FOR SELECT seat_no FROM seat WHERE (journey_id=j_id AND class_name=c_name AND booking_status=0) ORDER BY seat_no DESC;
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET unavailable=0;
	OPEN c1;
    WHILE unavailable DO
		FETCH c1 INTO seat_number;
    END WHILE;
    CLOSE c1;
    RETURN seat_number;
END &&

CREATE PROCEDURE add_journey
(IN j_id INT, IN t_id INT,  IN s_name VARCHAR(20), IN d_name VARCHAR(20),IN dp DATETIME, IN ar DATETIME)
BEGIN
		INSERT INTO journey VALUES(j_id,t_id,s_name,d_name,dp,ar);
END &&

-- DROP PROCEDURE add_journey_data&&

CREATE PROCEDURE add_journey_data
(IN no_of_days INT,IN start_date DATE)
BEGIN
	DECLARE i INTEGER DEFAULT 1;
    DECLARE date_itr DATE DEFAULT start_date;
	WHILE (i <= (no_of_days/2)) DO
		INSERT INTO journey(train_id,source_name,destination_name,departure,arrival) VALUES
            (12952,"Delhi","Mumbai",DATE_ADD(date_itr, INTERVAL 985 MINUTE),DATE_ADD(date_itr, INTERVAL 1935 MINUTE)),
			(12951,"Mumbai","Delhi",DATE_ADD(date_itr, INTERVAL 2460 MINUTE),DATE_ADD(date_itr, INTERVAL 3395 MINUTE)),
            (12954,"Delhi","Mumbai",DATE_ADD(date_itr, INTERVAL 1010 MINUTE),DATE_ADD(date_itr, INTERVAL 2025 MINUTE)),
			(12953,"Mumbai","Delhi",DATE_ADD(date_itr, INTERVAL 2500 MINUTE),DATE_ADD(date_itr, INTERVAL 3540 MINUTE)),
            
			(12163,"Mumbai","Chennai",DATE_ADD(date_itr, INTERVAL 1230 MINUTE),DATE_ADD(date_itr,INTERVAL 2625 MINUTE)),
			(12164,"Chennai","Mumbai",DATE_ADD(date_itr, INTERVAL 1845 MINUTE),DATE_ADD(date_itr,INTERVAL 3240 MINUTE)),
            (11042,"Chennai","Mumbai",DATE_ADD(date_itr, INTERVAL 740 MINUTE),DATE_ADD(date_itr, INTERVAL 2255 MINUTE)),
			(11041,"Mumbai","Chennai",DATE_ADD(date_itr, INTERVAL 2280 MINUTE),DATE_ADD(date_itr, INTERVAL 3860 MINUTE)),
            
			(12304,"Delhi","Kolkata",DATE_ADD(date_itr, INTERVAL 1055 MINUTE),DATE_ADD(date_itr, INTERVAL 2475 MINUTE)),
            (12303,"Kolkata","Delhi",DATE_ADD(date_itr,INTERVAL 1920 MINUTE),DATE_ADD(date_itr, INTERVAL 3245 MINUTE)),
			(12301,"Kolkata","Delhi",DATE_ADD(date_itr,INTERVAL 975 MINUTE),DATE_ADD(date_itr, INTERVAL 2040 MINUTE)),
			(12302,"Delhi","Kolkata",DATE_ADD(date_itr, INTERVAL 1015 MINUTE),DATE_ADD(date_itr, INTERVAL 3475 MINUTE)),
            
			(12841,"Chennai","Kolkata",DATE_ADD(date_itr, INTERVAL 525 MINUTE),DATE_ADD(date_itr, INTERVAL 1435 MINUTE)),
			(12841,"Kolkata","Chennai",DATE_ADD(date_itr, INTERVAL 2330 MINUTE),DATE_ADD(date_itr, INTERVAL 3900 MINUTE)),
			(12665,"Kolkata","Chennai",DATE_ADD(date_itr, INTERVAL 970 MINUTE),DATE_ADD(date_itr, INTERVAL 2688 MINUTE)),
			(12507,"Chennai","Kolkata",DATE_ADD(date_itr, INTERVAL 2040 MINUTE),DATE_ADD(date_itr, INTERVAL 3720 MINUTE));
            SET i=i+2;
            SET date_itr=DATE_ADD(date_itr, INTERVAL 2 DAY);
	END WHILE;
END &&

CREATE PROCEDURE add_seats
(IN class_name VARCHAR(20),IN journey_id INT, IN no_of_seats INT)
BEGIN
	DECLARE i INTEGER DEFAULT 1;
	WHILE (i <= no_of_seats) DO
		INSERT INTO seat VALUES (i,journey_id,class_name,0);
        SET i= i+1;
	END WHILE;
END &&
-- DROP PROCEDURE add_seats&&

-- drop procedure booking_ticket&&

call add_journey_data(10, "2020-09-10 00:00:00")&&
CREATE PROCEDURE booking_ticket
(IN a_no DECIMAL(12), IN c_name VARCHAR(20), IN j_id INT, IN qty INT, OUT state INT)
BEGIN
	DECLARE i INTEGER DEFAULT 1;
    DECLARE s_no INTEGER;
    DECLARE available INTEGER DEFAULT check_available_seats(j_id,c_name);
	IF qty > available THEN
		SET state=0;
    ELSE
		WHILE i<=qty DO
			SET s_no=get_seat_no(j_id,c_name);
			INSERT INTO booking (aadhar_number,seat_no, class_name,journey_id) VALUES (a_no,s_no,c_name,j_id);
            SET i=i+1;
		END WHILE;
		SET state=1;
    END IF;
END &&

CREATE TRIGGER after_booking_modify_seat AFTER INSERT ON booking
	FOR EACH ROW
    BEGIN
		CALL update_seat_status(NEW.seat_no,NEW.class_name,NEW.journey_id);
    END &&

-- -drop procedure cancellation_ticket&
CREATE PROCEDURE cancellation_ticket(IN b_id INT,IN a_no DECIMAL(12),OUT state INT)
BEGIN
	DECLARE counter INTEGER DEFAULT 0;
    SELECT count(booking_id) INTO counter FROM booking WHERE (booking_id=b_id AND aadhar_number=a_no);
	IF (counter>0) THEN
		DELETE FROM booking  WHERE (booking_id=b_id AND aadhar_number=a_no);
        SET state=1;
	ELSE
		SET state=0;
    END IF;
END &&

CREATE TRIGGER after_cancellation_modify_seat AFTER DELETE ON booking
	FOR EACH ROW
    BEGIN
		CALL update_seat_status(OLD.seat_no,OLD.class_name,OLD.journey_id);
    END &&

CREATE PROCEDURE update_seat_status(IN s_no INT,IN c_name VARCHAR(20),IN j_id INT)
BEGIN
	DECLARE b_status INTEGER;
    SELECT booking_status INTO b_status FROM seat WHERE (journey_id=j_id AND class_name=c_name AND seat_no=s_no);
	IF b_status=0 THEN
		SET b_status=1;
	ELSE
		SET b_status=0;
	END IF;
    UPDATE seat SET booking_status = b_status  WHERE (journey_id=j_id AND class_name=c_name AND seat_no=s_no);
END &&

CREATE PROCEDURE view_tickets(IN a_no decimal(12) )
BEGIN
SELECT 
booking_id AS "Booking ID",
(SELECT CONCAT(first_name," ",last_name) FROM passenger WHERE aadhar_number=b.aadhar_number) AS "Passenger",
(SELECT (SELECT train_name FROM train WHERE j.train_id=train_id) FROM journey j WHERE b.journey_id=journey_id) AS "Train Name",
seat_no AS "Seat Number",
class_name AS "Class Name",
journey_id AS "Journey ID",
(SELECT source_name FROM journey where journey_id=b.journey_id) AS "Source",
(SELECT destination_name FROM journey where journey_id=b.journey_id) AS "Destination",
(SELECT departure FROM journey where journey_id=b.journey_id) AS "Departure",
(SELECT arrival FROM journey where journey_id=b.journey_id) AS "Arrival",
(SELECT (SELECT get_fare(class_name,train_id,1) FROM journey j WHERE journey_id=b.journey_id)) AS "Cost"
FROM booking b WHERE aadhar_number=a_no;
END &&


Create procedure final_amount(IN class_name varchar(20),IN j_id int, in qty INT, out amount int)
BEGIN
DECLARE t_id INTEGER;
select train_id into t_id from journey where journey_id = j_id;
set amount = get_fare(class_name, t_id, qty) ;
END &&



CREATE FUNCTION get_fare(c_name VARCHAR(20),t_id INT,qty INT) RETURNS INTEGER READS SQL DATA
BEGIN
	DECLARE amount INTEGER;
    SELECT fare*qty INTO amount FROM class WHERE (train_id=t_id AND class_name=c_name) ;
--    SELECT fare*1 FROM class WHERE (train_id=12952 AND class_name="AC") ;
    RETURN amount;
END &&

-- -----------------------------------------------Train Testing-----------------------------------------------
INSERT INTO train VALUES
(12951,"MUMBAI RAJDHANI"),
(12952,"MUMBAI RAJDHANI"), 
(12954,"AG KRANTI RJDHN"), 
(12953,"AUG KR RAJ EXP"), 
(12163,"CHENNAI EXPRESS"), 
(12164,"CHENNAI EXPRESS"), 
(11041,"CSMT CHENNAI EXPRESS"),
(11042,"MUMBAI EXPRESS"),
(12841,"COROMANDAL EXPRESS"),
(12665,"KANYAKUMARI EXPRESS"),
(12303,"POORVA EXPRESS"),
(12304,"POORVA EXPRESS"),
(12301,"KOLKATA RAJDHANI"),
(12302,"KOLKATA RAJDHANI"),
(12507,"ARONAI EXPRESS")&&

CALL add_journey_data(10,"2020-10-10 00:00:00")&&

insert into class values
(12951,"AC",1550), (12952,"AC",1560), (12954,"AC",1550), (12953,"AC",1550), (12163,"AC",1550), (12164,"AC",1550),
(11042,"AC",1520), (11041,"AC",1510), (12841,"AC",1550), (12665,"AC",1550), (12303,"AC",1550), (12304,"AC",1550),
(12301,"AC",1550), (12302,"AC",1550), (12507,"AC",1550),
(12951,"General",600), (12952,"General",610), (12954,"General",630), (12953,"General",620), (12163,"General",420), 
(12164,"General",420), (11042,"General",565), (11041,"General",340), (12841,"General",410), (12665,"General",410),
(12303,"General",540), (12304,"General",540), (12301,"General",510), (12302,"General",513), (12507,"General",525);
&&
-- Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails (`railway`.`seat`, CONSTRAINT `seat_ibfk_1` FOREIGN KEY (`journey_id`) REFERENCES `journey` (`journey_id`))

call add_seats("AC",33,10)&&
call add_seats("General",33,20)&&
SELECT check_all_seats(33,"General")&&
SELECT check_all_seats(33,"AC")&&
SELECT check_available_seats(33,"AC")&&
SELECT check_available_seats(33,"General")&&
SELECT get_seat_no(33,"AC")&&
SELECT get_seat_no(33,"General")&&
-- ---------------------------------------------General Testing-----------------------------------------------
delimiter ;

call add_passenger(449845678891,"Atharva","Ghodmare","atharva@gmail.com",'2000-02-09',"PUB-G Road",440009,9579649056,"atharva13","Nagpur","Maharashtra",@stat);
call add_passenger(918745876597,"Meet","Malde","meet@gmail.com",'2000-02-10',"PUB-G Road",440009,7845987548,"atharva43","Nagpur","Maharashtra",@stat);
select @stat;

call add_journey_data(10,"2020-09-10 00:00:00");
use railway;
select * from passenger;
SELECT * From seat;
SELECT * FROM class;
select * from booking;
select * from seat;
SELECT * FROM journey;
select * from train;
drop table journey;
call view_tickets(449845678891);
call cancellation_ticket(5005);
select train_id from journey where journey_id = 33;
call final_amount("AC", 12952, 1, @stat);

call add_seats("AC",1,20);
call add_seats("General",1,20);
call add_seats("General",2,20);
call add_seats("General",3,20);
call add_seats("General",4,20);
call add_seats("General",5,20);
call add_seats("General",6,20);
call add_seats("General",7 ,20);
call add_seats("General",8,20);
call add_seats("General",9 ,20);
call add_seats("General",10,20);
call add_seats("General",11,20);
call add_seats("General",12,20);
call add_seats("General",13,20);
call add_seats("General",14,20);
call add_seats("General",15,20);
call add_seats("General",16,20);
call add_seats("General",17,20);
call add_seats("General",18,20);
call add_seats("General",19,20);
call add_seats("General",20,20);
call add_seats("General",21,20);
call add_seats("General",22,20);
call add_seats("General",23,20);
call add_seats("General",24,20);
call add_seats("General",25,20);
call add_seats("General",26,20);
call add_seats("General",27,20);
call add_seats("General",28,20);
call add_seats("General",29,20);
call add_seats("General",30,20);
call add_seats("General",31,20);
call add_seats("General",32,20);

call add_seats("AC",2,20);
call add_seats("AC",3,20);
call add_seats("AC",4,20);
call add_seats("AC",5,20);
call add_seats("AC",6,20);
call add_seats("AC",7 ,20);
call add_seats("AC",8,20);
call add_seats("AC",9 ,20);
call add_seats("AC",10,20);
call add_seats("AC",11,20);
call add_seats("AC",12,20);
call add_seats("AC",13,20);
call add_seats("AC",14,20);
call add_seats("AC",15,20);
call add_seats("AC",16,20);
call add_seats("AC",17,20);
call add_seats("AC",18,20);
call add_seats("AC",19,20);
call add_seats("AC",20,20);
call add_seats("AC",21,20);
call add_seats("AC",22,20);
call add_seats("AC",23,20);
call add_seats("AC",24,20);
call add_seats("AC",25,20);
call add_seats("AC",26,20);
call add_seats("AC",27,20);
call add_seats("AC",28,20);
call add_seats("AC",29,20);
call add_seats("AC",30,20);
call add_seats("AC",31,20);
call add_seats("AC",32,20);


