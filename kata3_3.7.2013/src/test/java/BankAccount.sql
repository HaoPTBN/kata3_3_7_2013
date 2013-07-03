/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50532
Source Host           : localhost:3306
Source Database       : db_junit_test

Target Server Type    : MYSQL
Target Server Version : 50532
File Encoding         : 65001

Date: 2013-07-03 14:31:51
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `bankaccount`
-- ----------------------------
DROP TABLE IF EXISTS `bankaccount`;
CREATE TABLE `bankaccount` (
  `accountNumber` varchar(100) NOT NULL,
  `balance` float DEFAULT NULL,
  PRIMARY KEY (`accountNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bankaccount
-- ----------------------------
INSERT INTO `BankAccount` VALUES ('111', '6000');
INSERT INTO `BankAccount` VALUES ('123', '5000');

-- ----------------------------
-- Table structure for `transaction`
-- ----------------------------
DROP TABLE IF EXISTS `transaction`;
CREATE TABLE `transaction` (
  `accountNumber` varchar(100) NOT NULL,
  `timeStamp` float NOT NULL,
  `amount` float DEFAULT NULL,
  `description` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of transaction
-- ----------------------------
