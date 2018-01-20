-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 11, 2018 at 03:44 PM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `amsdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `documentdet`
--

CREATE TABLE IF NOT EXISTS `documents` (
  `documentId` int(11) NOT NULL,
  `documentName` varchar(500) NOT NULL,
  `documentPath` varchar(500) NOT NULL,
  `userId` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `flatregistration`
--

CREATE TABLE IF NOT EXISTS `flats` (
  `flatId` int(11) NOT NULL,
  `flatNumber` varchar(100) NOT NULL,
  `wing` varchar(100) NOT NULL,
  `floorNumber` varchar(100) NOT NULL,
  `electricityMeter` varchar(100) NOT NULL,
  `gasMeter` varchar(100) NOT NULL,
  `flatArea` varchar(100) NOT NULL,
  `parkingDetails` varchar(100) NOT NULL,
  `furnishedType` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `userregistration`
--

CREATE TABLE IF NOT EXISTS `users` (
  `userId` int(11) NOT NULL,
  `firstName` varchar(500) NOT NULL,
  `middleName` varchar(500) NOT NULL,
  `lastName` varchar(500) NOT NULL,
  `currentAddress` varchar(500) NOT NULL,
  `permanentAddress` varchar(500) NOT NULL,
  `officeAddress` varchar(500) NOT NULL,
  `dateOfBirth` date NOT NULL,
  `contactNumber` bigint(100) NOT NULL,
  `alternateContactNumber` bigint(100) NOT NULL,
  `adhaarCardNumber` varchar(150) NOT NULL,
  `panCardNumber` varchar(150) NOT NULL,
  `role` varchar(150) NOT NULL,
  `registrationDate` date NOT NULL,
  `flatId` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

CREATE  TABLE user_login (
  username VARCHAR(20) NOT NULL ,
  password VARCHAR(20) NOT NULL ,
  enabled TINYINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username));
  
CREATE TABLE user_roles (
  user_role_id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(20) NOT NULL,
  role varchar(20) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE KEY uni_username_role (role,username),
  KEY fk_username_idx (username),
  CONSTRAINT fk_user_roles_login FOREIGN KEY (username) REFERENCES user_login (username));
  
INSERT INTO user_login(username,password,enabled) VALUES ('jack','jack', true);
INSERT INTO user_login(username,password,enabled) VALUES ('peter','peter', true);

INSERT INTO user_roles (username, role) VALUES ('jack', 'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('jack', 'ROLE_ADMIN');

INSERT INTO flats values (1,'A-101','A','3','562943524','GC423423','2000','A-101','Furnished');
commit;
