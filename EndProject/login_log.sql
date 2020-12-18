

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for login_log
-- ----------------------------
DROP TABLE IF EXISTS `login_log`;
CREATE TABLE `login_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginDate` datetime DEFAULT NULL COMMENT '登录时间',
  `ip` varchar(255) DEFAULT NULL COMMENT 'Ip地址',
  `browser` varchar(255) DEFAULT NULL COMMENT '浏览器',
  `loginMode` varchar(255) DEFAULT NULL COMMENT '登录方式',
  `equipment` varchar(255) DEFAULT NULL COMMENT '设备',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login_log
-- ----------------------------
INSERT INTO `login_log` VALUES ('1', '2020-12-09 16:58:47', '127.0.0.2', '360浏览器', '暂无数据', '电脑');
INSERT INTO `login_log` VALUES ('2', '2020-12-16 16:58:55', '41.32.158.13', '火狐', '扫码登录 ', '电脑');
