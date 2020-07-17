/*
Navicat MySQL Data Transfer

Source Server         : bendi
Source Server Version : 50642
Source Host           : 127.0.0.1:3307
Source Database       : b_xuexi

Target Server Type    : MYSQL
Target Server Version : 50642
File Encoding         : 65001

Date: 2020-07-16 15:31:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `serial` varchar(200) COLLATE utf8_bin DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of payment
-- ----------------------------
INSERT INTO `payment` VALUES ('1', '测试');
INSERT INTO `payment` VALUES ('2', '司法');
INSERT INTO `payment` VALUES ('3', null);
INSERT INTO `payment` VALUES ('4', '2');
