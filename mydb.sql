CREATE DATABASE IF NOT EXISTS apistock;

USE apistock;

CREATE TABLE `stock` (
     `id` bigint unsigned NOT NULL AUTO_INCREMENT,
     `ticker` varchar(10) DEFAULT NULL,
     `name` varchar(255) DEFAULT NULL,
     `sector` varchar(255) DEFAULT NULL,
     `price` double DEFAULT NULL,
     PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

