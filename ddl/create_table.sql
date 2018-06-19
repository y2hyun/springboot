CREATE TABLE `example` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `comment` varchar(1000) DEFAULT NULL,
  `create_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator` int(9) NOT NULL DEFAULT '0',
  `update_datetime` timestamp NULL DEFAULT NULL,
  `updater` int(9) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


CREATE TABLE `account` (
  `account_id` int(11) NOT NULL AUTO_INCREMENT,
  `id` varchar(255) NOT NULL,
  `password` varchar(128) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `status` char(1) NOT NULL DEFAULT '1',
  `create_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator` int(9) NOT NULL DEFAULT '0',
  `update_datetime` timestamp NULL DEFAULT NULL,
  `updater` int(9) DEFAULT NULL,
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


CREATE UNIQUE INDEX ACCOUNT_IX1 ON account(id);