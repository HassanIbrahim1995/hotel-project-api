CREATE TABLE address (
                         id BIGINT,
                         street VARCHAR(255),
                         city VARCHAR(255),
                         state VARCHAR(255),
                         zipcode VARCHAR(255),
                         country VARCHAR(255),
                         PRIMARY KEY (id)
);

CREATE TABLE appuser (
                         id BIGINT,
                         username VARCHAR(255),
                         password VARCHAR(255),
                         profile BIGINT,
                         PRIMARY KEY (id)
);

CREATE TABLE booking (
                         id BIGINT,
                         bookingtime DATETIME,
                         status VARCHAR(255),
                         reservation BIGINT,
                         guest BIGINT,
                         PRIMARY KEY (id)
);

CREATE TABLE department (
                            id BIGINT,
                            name VARCHAR(255),
                            PRIMARY KEY (id)
);

CREATE TABLE guest (
                       PRIMARY KEY (id)
);

CREATE TABLE person (
                        id BIGINT,
                        phonenumber VARCHAR(255),
                        name BIGINT,
                        dateofbirth DATETIME,
                        bsn VARCHAR(255),
                        profile BIGINT,
                        PRIMARY KEY (id)
);

CREATE TABLE profile (
                         id BIGINT,
                         email VARCHAR(255),
                         photourl VARCHAR(255),
                         createdat DATETIME,
                         updatedat DATETIME,
                         person BIGINT,
                         user BIGINT,
                         PRIMARY KEY (id)
);
