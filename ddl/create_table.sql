CREATE TABLE `example` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `comment` varchar(1000) DEFAULT NULL,
  `create_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator` int(9) NOT NULL DEFAULT '0',
  `update_datetime` timestamp NULL DEFAULT NULL,
  `updater` int(9) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
