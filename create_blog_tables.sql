DROP DATABASE IF EXISTS `mental_placeblog`;
CREATE SCHEMA `mental_placeblog` DEFAULT CHARACTER SET utf8 ;
USE `mental_placeblog`;

CREATE TABLE `user`(
    `email` VARCHAR(32) NOT null,
	`username` VARCHAR(32) NOT null,
	`password` VARCHAR(32) DEFAULT null,
	PRIMARY KEY(`email`)
)
COMMENT 'User Table';

INSERT INTO `mental_placeblog`.`user` VALUES ('test@gmail.com', 'tester', 'f6b338015a5a6321ba4468010ba2a71e');

CREATE TABLE `quote`(
	`id` INT(20) NOT null AUTO_INCREMENT COMMENT 'quoteID',
    `content` VARCHAR(255) NOT null,
	PRIMARY KEY(`id`)
)
COMMENT 'Quote Table';

INSERT INTO `mental_placeblog`.`quote` VALUES (1, 'A sample quote.');
INSERT INTO `mental_placeblog`.`quote` VALUES (2, 'Another sample quote');