DROP TABLE IF EXISTS aircrafts;
DROP TABLE IF EXISTS companies;
DROP TABLE IF EXISTS ownership;

CREATE TABLE aircrafts (
        id_aircraft INT NOT NULL AUTO_INCREMENT,
        name VARCHAR(50) NULL,
        passengers INT NULL,
        max_weight__kg INT NULL,
        max_range__km INT NULL,
        PRIMARY KEY (id_aircraft))
        ENGINE = InnoDB
        DEFAULT CHARACTER SET = utf8
        COLLATE = utf8_general_ci;

CREATE TABLE companies (
        id_companies INT NOT NULL AUTO_INCREMENT,
        name VARCHAR(50) NULL,
        country VARCHAR(50) NULL,
        PRIMARY KEY (id_companies))
        ENGINE = InnoDB
        DEFAULT CHARACTER SET = utf8
        COLLATE = utf8_general_ci;

CREATE TABLE ownership (
        id_ownership INT NOT NULL AUTO_INCREMENT,
        id_companies INT NULL,
        id_aircraft INT NULL,
        quantity INT NULL,
        PRIMARY KEY (id_ownership))
        ENGINE = InnoDB
        DEFAULT CHARACTER SET = utf8
        COLLATE = utf8_general_ci;


INSERT INTO aircrafts (name, passengers, max_weight__kg, max_range__km)
        VALUES ('Airbus A319', 156, 75000, 6850);
INSERT INTO aircrafts (name, passengers, max_weight__kg, max_range__km)
        VALUES ('Airbus A320', 180, 77000, 6150);
INSERT INTO aircrafts (name, passengers, max_weight__kg, max_range__km)
        VALUES ('Airbus A321', 220, 93500, 5950);
INSERT INTO aircrafts (name, passengers, max_weight__kg, max_range__km)
        VALUES ('Airbus A330', 335, 233000, 10800);
INSERT INTO aircrafts (name, passengers, max_weight__kg, max_range__km)
        VALUES ('Airbus A350', 440, 268000, 15000);
INSERT INTO aircrafts (name, passengers, max_weight__kg, max_range__km)
        VALUES ('Airbus A380', 525, 560000, 12000);
INSERT INTO aircrafts (name, passengers, max_weight__kg, max_range__km)
        VALUES ('Boeing 737-500', 132, 52390, 5200);
INSERT INTO aircrafts (name, passengers, max_weight__kg, max_range__km)
        VALUES ('Boeing 747-400ER', 524, 412000, 14205);
INSERT INTO aircrafts (name, passengers, max_weight__kg, max_range__km)
        VALUES ('Boeing 767-200ER', 255, 179000, 12200);
INSERT INTO aircrafts (name, passengers, max_weight__kg, max_range__km)
        VALUES ('Boeing 777-200ER', 400, 297560, 14260);
INSERT INTO aircrafts (name, passengers, max_weight__kg, max_range__km)
        VALUES ('Boeing 787 Dreamliner', 290, 254000, 14140);
                    

INSERT INTO companies (name, country) VALUES('Emirates', 'United Arab Emirates');
INSERT INTO companies (name, country) VALUES('Air China', 'China');
INSERT INTO companies (name, country) VALUES('All Nippon Airways', 'Japan');
INSERT INTO companies (name, country) VALUES('Jet Airways', 'India');
INSERT INTO companies (name, country) VALUES('Aeroflot', 'Russian Federation');
INSERT INTO companies (name, country) VALUES('Lufthansa', 'Germany');
INSERT INTO companies (name, country) VALUES('American Airlines', 'USA');
INSERT INTO companies (name, country) VALUES('Alitalia', 'Italy');
INSERT INTO companies (name, country) VALUES('Ryanair', 'Ireland');
                    

INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (1, 6, 23);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (1, 8, 45);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (1, 10, 11);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (1, 11, 7);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (2, 3, 73);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (2, 10, 52);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (2, 5, 18);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (3, 4, 21);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (3, 8, 38);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (3, 9, 41);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (4, 9, 73);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (4, 4, 43);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (5, 1, 28);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (5, 2, 36);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (5, 4, 41);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (5, 8, 56);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (6, 7, 57);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (6, 3, 19);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (6, 11, 33);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (7, 3, 68);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (7, 5, 72);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (7, 8, 45);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (7, 9, 24);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (8, 6, 37);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (8, 1, 34);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (8, 7, 45);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (9, 2, 43);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (9, 7, 15);
INSERT INTO ownership (id_companies, id_aircraft, quantity) VALUES (9, 11, 29);
