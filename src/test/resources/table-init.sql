/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-05-28 11:11:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `customer`
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `openid` varchar(100) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------

-- ----------------------------
-- Table structure for `module_info`
-- ----------------------------
DROP TABLE IF EXISTS `module_info`;
CREATE TABLE `module_info` (
  `type` varchar(100) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(4000) DEFAULT NULL,
  `title` varchar(200) DEFAULT NULL,
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` bigint(20) DEFAULT NULL,
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP,
  `customer_id` bigint(20) DEFAULT NULL,
  `order_type` varchar(200) DEFAULT NULL,
  `order_date` timestamp DEFAULT CURRENT_TIMESTAMP,
  `order_num` varchar(100) DEFAULT NULL,
  `price` float(16,2) DEFAULT NULL,
  `pay_status` varchar(10) DEFAULT NULL,
  `pay_num` varchar(100) DEFAULT NULL,
  `platenum` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for `photo`
-- ----------------------------
DROP TABLE IF EXISTS `photo`;
CREATE TABLE `photo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
	`platenum_id` bigint(20) DEFAULT NULL,
  `photo` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of photo
-- ----------------------------

-- ----------------------------
-- Table structure for `platenum`
-- ----------------------------
DROP TABLE IF EXISTS `platenum`;
CREATE TABLE `platenum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_id` bigint(20) DEFAULT NULL,
  `platenum` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of platenum
-- ----------------------------

-- ----------------------------
-- Table structure for `admin_user`
-- ----------------------------
DROP TABLE IF EXISTS `admin_user`;
CREATE TABLE `admin_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
	`name` varchar(100) DEFAULT NULL,
	`password` varchar(255) DEFAULT NULL,
  `create_time` timestamp DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;