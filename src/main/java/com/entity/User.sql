-- auto Generated on 2019-11-08
-- DROP TABLE IF EXISTS t_user;
CREATE TABLE t_user(
	`uid` INT (11) NOT NULL AUTO_INCREMENT COMMENT 'uid',
	account VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'account',
	`password` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'password',
	is_admin INT (11) NOT NULL DEFAULT -1 COMMENT '0普通用户1管理员',
	nickname VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'nickname',
	head_sculpture VARCHAR (50) NOT NULL DEFAULT '' COMMENT '头像',
	PRIMARY KEY (`uid`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_user';
