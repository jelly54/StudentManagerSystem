/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50528
Source Host           : 127.0.0.1:3306
Source Database       : stuman

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-05-18 22:33:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `m_id` int(11) NOT NULL AUTO_INCREMENT,
  `m_name` varchar(255) DEFAULT NULL,
  `m_pass` varchar(255) DEFAULT NULL,
  `m_authority` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`m_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1023 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('1001', '小二狗', '123', '1');
INSERT INTO `manager` VALUES ('1002', 'Jelly', '123', '1');
INSERT INTO `manager` VALUES ('1003', ' q', '123', '0');
INSERT INTO `manager` VALUES ('1013', '小黄人0', '123', '0');
INSERT INTO `manager` VALUES ('1014', '小黄人1', '123', '0');
INSERT INTO `manager` VALUES ('1015', '小黄人2', '123', '0');
INSERT INTO `manager` VALUES ('1016', '小黄人3', '123', '0');
INSERT INTO `manager` VALUES ('1017', '小黄人4', '123', '0');
INSERT INTO `manager` VALUES ('1018', '小黄人5', '123', '0');
INSERT INTO `manager` VALUES ('1019', '小黄人6', '123', '0');
INSERT INTO `manager` VALUES ('1020', '小黄人7', '123', '0');
INSERT INTO `manager` VALUES ('1021', '小黄人8', '123', '0');
INSERT INTO `manager` VALUES ('1022', '小黄人9', '123', '0');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `institute` varchar(255) DEFAULT NULL,
  `sclass` varchar(255) DEFAULT NULL,
  `authority` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1013 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1001', 'Jelly', '123', '男', '1996-11-19', '东北农业大学', '15546098372', '电气与信息学院', '1606', null);
INSERT INTO `user` VALUES ('1004', '果冻2', '123', '男', '1996-11-19', '地球上哦', '123789121', '大中国', '754', null);
INSERT INTO `user` VALUES ('1005', '果冻3', '123', '男', '1996-11-19', '地球上哦', '123789121', '大中国', '754', null);
INSERT INTO `user` VALUES ('1006', '果冻4', '23', '男', '1996-11-19', '地球上哦', '123789121', '大中国', '754', null);
INSERT INTO `user` VALUES ('1007', '果冻5', '3', '男', '1996-11-19', '地球上哦', '123789121', '大中国', '754', null);
INSERT INTO `user` VALUES ('1008', '果冻6', '3123', '男', '1996-11-19', '地球上哦', '123789121', '大中国', '754', null);
INSERT INTO `user` VALUES ('1009', '果冻7', '2312', '男', '1996-11-19', '地球上哦', '123789121', '大中国', '754', null);
INSERT INTO `user` VALUES ('1010', '果冻8', '12312', '男', '1996-11-19', '地球上哦', '123789121', '大中国', '754', null);
INSERT INTO `user` VALUES ('1011', '果冻9', '2312', '男', '1996-11-19', '地球上哦', '123789121', '大中国', '754', null);
INSERT INTO `user` VALUES ('1012', '张小栋', null, '男', '1996-11-19', '中国', '196513165', '电气与信息', '461', null);
