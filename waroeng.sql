-- Adminer 3.3.3 MySQL dump

SET NAMES utf8;
SET foreign_key_checks = 0;
SET time_zone = 'SYSTEM';
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

CREATE DATABASE `waroeng` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `waroeng`;

DROP TABLE IF EXISTS `barang`;
CREATE TABLE `barang` (
  `nama` varchar(45) NOT NULL,
  `hargajual` bigint(20) unsigned NOT NULL,
  `persediaan` int(10) unsigned NOT NULL,
  PRIMARY KEY (`nama`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `barang` (`nama`, `hargajual`, `persediaan`) VALUES
('Bakwan',	500,	15),
('Buku Isi 40',	3500,	120),
('Goreng Pisang',	1000,	60),
('Pensil',	1300,	45);

DROP TABLE IF EXISTS `barangpenjualan`;
CREATE TABLE `barangpenjualan` (
  `idpenjualan` int(10) unsigned NOT NULL,
  `barang` varchar(45) NOT NULL,
  `jumlah` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idpenjualan`,`barang`),
  CONSTRAINT `barangpenjualan_ibfk_1` FOREIGN KEY (`idpenjualan`) REFERENCES `penjualan` (`idpenjualan`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `barangpenjualan` (`idpenjualan`, `barang`, `jumlah`) VALUES
(1,	'Bakwan',	4),
(1,	'Goreng Pisang',	5),
(2,	'Bakwan',	5);

DROP TABLE IF EXISTS `penjualan`;
CREATE TABLE `penjualan` (
  `idpenjualan` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `waktu` datetime NOT NULL,
  PRIMARY KEY (`idpenjualan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `penjualan` (`idpenjualan`, `waktu`) VALUES
(1,	'2012-01-04 00:00:00'),
(2,	'2012-01-27 00:00:00');

-- 2012-01-13 01:20:32
