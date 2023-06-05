CREATE DATABASE IF NOT EXISTS 'securecapita';

USE 'securecapita';

CREATE TABLE IF NOT EXISTS 'securecapita'.'Users'(
    'id' BIGINT NOT NULL AUTO_INCREMENT,
    'first_name' VARCHAR(50) NOT NULL,
    'last_name' VARCHAR(50) NOT NULL,
    'email' VARCHAR(100) NOT NULL,
    'phone' VARCHAR(20) NULL,
    PRIMARY KEY('id')
)