DROP DATABASE IF EXISTS springsecuritydb;
CREATE DATABASE springsecuritydb CHARACTER SET utf8 COLLATE utf8_general_ci;

USE springsecuritydb;

DROP TABLE IF EXISTS topics;
DROP TABLE IF EXISTS users;

CREATE TABLE topics (
                      topic_id INT  AUTO_INCREMENT
                        PRIMARY KEY,
                      category  VARCHAR(100) NOT NULL,
                      title VARCHAR(100) NOT NULL,
                      CONSTRAINT topic_id_UNIQUE
                        UNIQUE(topic_id)
)
  ENGINE = innoDB
  DEFAULT CHARACTER SET = utf8
;

create table users (
                     username varchar(50) not null,
                     country varchar(30),
                     enabled smallint,
                     full_name varchar(100),
                     password varchar(800) not null,
                     role varchar(50),
                     primary key (username)
);