DROP DATABASE IF EXISTS `mental_placeblog`;
CREATE SCHEMA `mental_placeblog` DEFAULT CHARACTER SET utf8 ;
USE `mental_placeblog`;

CREATE TABLE `blog_user`(
	`id` INT(20) NOT null AUTO_INCREMENT COMMENT 'userID',
    `email` VARCHAR(32) NOT null,
	`username` VARCHAR(32) NOT null,
	`password` VARCHAR(32) DEFAULT null,
	`password_salt` VARCHAR(32) DEFAULT null,
	PRIMARY KEY(`id`)
)
COMMENT 'User Table';


CREATE TABLE `quote`(
	`id` INT(20) NOT null AUTO_INCREMENT COMMENT 'quoteID',
    `content` VARCHAR(255) NOT null,
	PRIMARY KEY(`id`)
)
COMMENT 'Quote Table';
