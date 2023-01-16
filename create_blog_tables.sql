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

CREATE TABLE `blog_post`(
	`id` INT(20) NOT null AUTO_INCREMENT COMMENT 'postID',
    `userID` INT(20) NOT null,
    `feeling_rating` INT(20) DEFAULT '3' COMMENT 'rating of current feeling, range from 1 to 5',
	`content` VARCHAR(255) NOT null COMMENT 'text content of the post',
    `score` INT(20) DEFAULT null COMMENT 'sentiment analysis result of the content',
	PRIMARY KEY(`id`)
)
COMMENT 'Blog Post Table';

INSERT INTO `mental_placeblog`.`blog_post` VALUES (1, 1, 5, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \n Phasellus faucibus scelerisque eleifend donec pretium vulputate sapien nec. ', 0);
INSERT INTO `mental_placeblog`.`blog_post` VALUES (2, 1, 3, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \n Phasellus faucibus scelerisque eleifend donec pretium vulputate sapien nec. ', 0);