/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : xy

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-12-26 13:57:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `activity`
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity` (
  `activity_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '活动编号',
  `account` varchar(20) DEFAULT NULL COMMENT '发起人',
  `name` varchar(20) DEFAULT NULL COMMENT '活动名',
  `startTime` date DEFAULT NULL COMMENT '活动开始时间',
  `endTime` date DEFAULT NULL COMMENT '活动结束时间',
  `place` varchar(20) DEFAULT NULL COMMENT '活动地点',
  `ava` varchar(100) DEFAULT NULL COMMENT '活动照片',
  `intro` longtext COMMENT '活动介绍',
  `peopleNum` tinyint(10) DEFAULT NULL COMMENT '活动人数',
  `keyWord` varchar(10) DEFAULT NULL COMMENT '活动关键字',
  `onLine` tinyint(1) DEFAULT NULL COMMENT '1：线上，0：线下',
  `pic1` varchar(100) DEFAULT NULL,
  `pic2` varchar(100) DEFAULT NULL,
  `pic3` varchar(100) DEFAULT NULL,
  `activityPass` tinyint(1) DEFAULT '0' COMMENT '是否审核，0.未审核;1.通过,2:未通过',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`activity_id`),
  KEY `account` (`account`),
  CONSTRAINT `activity_ibfk_1` FOREIGN KEY (`account`) REFERENCES `userinfo` (`account`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity
-- ----------------------------
INSERT INTO `activity` VALUES ('1', 'longhaihua', '荧光健康环校夜跑', '2018-06-28', '2018-06-29', '九江学院北区田径场', 'http://www.wuruicheng.top/activity/nightrun0', '每天一跑', '2', '运动,日常运动,娱乐', '0', 'http://www.wuruicheng.top/activity/nightrun1', 'http://www.wuruicheng.top/activity/nightrun2', 'http://www.wuruicheng.top/activity/nightrun3', '1', '2018-11-20 11:10:36');
INSERT INTO `activity` VALUES ('2', 'admin', '轮滑集训', '2018-06-29', '2018-06-30', '九江九院南区轮滑场', 'http://www.wuruicheng.top/activity/skate0', '（∩▽∩）\r\n（∩▽∩）\r\n（∩▽∩）\r\n练习：外蟹步，内蟹步，单脚跳跃，单脚起蹲.\r\n第一阶段：cross,snake,back cross,back snake,one foot snake,selson,back,nelson,back one foot,snake,eagle,sun.\r\n第二阶段：crazy,盘藤,volt,double crazy,back double crazy,crazy sun.\r\n第三阶段：heel snake,toe snake,heel toe snake,back toe snake,back heel toe snake.\r\n第四阶段：sun,chap,X,mexican,italian,单桩crazy,单桩 double crazy,back 单桩double crazy.\r\n经过四个阶段后，一个菜鸟就消失了，但是要想成为高手，后面的路还很长，大家加油吧！！\r\n（∩▽∩）\r\n（∩▽∩）\r\n（∩▽∩）', '5', '运动,娱乐', '0', 'http://www.wuruicheng.top/activity/skate1', 'http://www.wuruicheng.top/activity/skate2', 'http://www.wuruicheng.top/activity/skate3', '1', '2018-11-20 11:10:40');
INSERT INTO `activity` VALUES ('3', 'laihuanhuan', '救助流浪猫', '2018-06-28', '2018-06-30', '九江学院南区轮滑场', 'http://www.wuruicheng.top/activity/cat0', '进行基础训练', '5', '公益', '1', 'http://www.wuruicheng.top/activity/cat1', 'http://www.wuruicheng.top/activity/cat2', 'http://www.wuruicheng.top/activity/cat3', '1', '2018-11-20 11:10:43');
INSERT INTO `activity` VALUES ('4', 'testa', '健康长跑', '2018-07-01', '2018-07-01', '九江学院北区田径场', 'http://www.wuruicheng.top/activity/run0', '健身', '5', '运动', '1', 'http://www.wuruicheng.top/activity/run1', 'http://www.wuruicheng.top/activity/run2', 'http://www.wuruicheng.top/activity/run3', '1', '2018-11-20 11:10:46');
INSERT INTO `activity` VALUES ('5', 'admin', '中国云顶游', '2018-08-10', '2018-09-01', '中国云顶', 'http://www.wuruicheng.top/activity/yunding0', '旅游', '5', '旅游', '1', 'http://www.wuruicheng.top/activity/yunding1', 'http://www.wuruicheng.top/activity/yunding2', 'http://www.wuruicheng.top/activity/yunding3', '1', '2018-11-23 11:10:49');
INSERT INTO `activity` VALUES ('6', 'longhaihua', '全国青少年生态环保宣传作品征集', '2018-11-20', '2018-11-20', null, 'http://www.wuruicheng.top/activity/environment0', '生态保护', '5', '公益,比赛', '1', 'http://www.wuruicheng.top/activity/environment1', 'http://www.wuruicheng.top/activity/environment2', 'http://www.wuruicheng.top/activity/environment3', '1', '2018-11-20 11:10:53');
INSERT INTO `activity` VALUES ('7', 'admin', 'Javapeixun', '2019-01-01', '2019-01-31', '11', 'http://www.wuruicheng.top/activityAva/20181220054902', 'xuexi', '100', '公益,讲座,其他', '1', 'http://www.wuruicheng.top/activityPic/20181220054902', 'http://www.wuruicheng.top/activityPic/20181220054902', 'http://www.wuruicheng.top/activityPic/20181220054902', '0', '2018-12-20 13:49:07');
INSERT INTO `activity` VALUES ('11', 'wuruicheng', '黄山一日游', '2018-12-26', '2018-12-27', '黄山', 'http://www.wuruicheng.top/activityAva/20181226051210', '旅游', '5', '旅游', '0', 'http://www.wuruicheng.top/activityAva/20181226050628', 'http://www.wuruicheng.top/clubAva/20181224122421', 'http://www.wuruicheng.top/activityPic/20181226051210', '1', '2018-12-26 13:12:11');

-- ----------------------------
-- Table structure for `activityjoins`
-- ----------------------------
DROP TABLE IF EXISTS `activityjoins`;
CREATE TABLE `activityjoins` (
  `joins_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '报名编号',
  `account` varchar(20) DEFAULT NULL COMMENT '用户编号',
  `activity_id` int(10) DEFAULT NULL COMMENT '活动编号',
  `name` varchar(10) DEFAULT NULL COMMENT '申请人',
  `contact` varchar(20) DEFAULT NULL COMMENT '联系方式',
  PRIMARY KEY (`joins_id`),
  KEY `activityjoins_ibfk_2` (`activity_id`),
  KEY `account` (`account`),
  CONSTRAINT `activityjoins_ibfk_2` FOREIGN KEY (`activity_id`) REFERENCES `activity` (`activity_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `activityjoins_ibfk_3` FOREIGN KEY (`account`) REFERENCES `userinfo` (`account`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activityjoins
-- ----------------------------
INSERT INTO `activityjoins` VALUES ('1', 'longhaihua', '1', 'longhaihua', '18720243094');
INSERT INTO `activityjoins` VALUES ('2', 'admin', '2', 'admin', '18720243094');
INSERT INTO `activityjoins` VALUES ('3', 'laihuanhuan', '3', 'huanhuan', '18720243094');
INSERT INTO `activityjoins` VALUES ('4', 'testa', '4', 'testa', '18720243094');
INSERT INTO `activityjoins` VALUES ('5', 'admin', '5', 'admin', '18720243094');
INSERT INTO `activityjoins` VALUES ('6', 'longhaihua', '6', 'long', '18720243094');
INSERT INTO `activityjoins` VALUES ('7', 'admin', '7', 'admin', '18720243094');
INSERT INTO `activityjoins` VALUES ('8', 'hujun', '2', 'hujun', '18720243094');
INSERT INTO `activityjoins` VALUES ('9', 'wuruicheng', '11', null, null);
INSERT INTO `activityjoins` VALUES ('10', 'hujun', '11', 'hujun', '18720243094');

-- ----------------------------
-- Table structure for `activitypraise`
-- ----------------------------
DROP TABLE IF EXISTS `activitypraise`;
CREATE TABLE `activitypraise` (
  `activitypraise_id` int(10) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL,
  `activity_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`activitypraise_id`),
  KEY `activity_id` (`activity_id`),
  KEY `account` (`account`),
  CONSTRAINT `activitypraise_ibfk_1` FOREIGN KEY (`activity_id`) REFERENCES `activity` (`activity_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `activitypraise_ibfk_2` FOREIGN KEY (`account`) REFERENCES `userinfo` (`account`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activitypraise
-- ----------------------------
INSERT INTO `activitypraise` VALUES ('1', 'longhaihua', '1');
INSERT INTO `activitypraise` VALUES ('2', 'admin', '2');
INSERT INTO `activitypraise` VALUES ('3', 'laihuanhuan', '3');
INSERT INTO `activitypraise` VALUES ('4', 'testa', '4');
INSERT INTO `activitypraise` VALUES ('5', 'admin', '5');
INSERT INTO `activitypraise` VALUES ('6', 'longhaihua', '6');

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(10) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL,
  `passWord` varchar(32) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `power` varchar(10) DEFAULT 'common',
  PRIMARY KEY (`admin_id`),
  KEY `account` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', 'e10adc3949ba59abbe56e057f20f883e', '2018-09-01 20:57:13', 'super');
INSERT INTO `admin` VALUES ('2', 'admin1', 'e10adc3949ba59abbe56e057f20f883e', '2018-10-01 20:57:04', 'common');
INSERT INTO `admin` VALUES ('3', 'admin2', 'e10adc3949ba59abbe56e057f20f883e', '2018-11-01 20:56:55', 'common');
INSERT INTO `admin` VALUES ('4', 'admin3', 'e10adc3949ba59abbe56e057f20f883e', '2018-12-01 20:56:48', 'common');
INSERT INTO `admin` VALUES ('5', 'admin4', 'e10adc3949ba59abbe56e057f20f883e', '2018-12-01 21:03:06', 'common');
INSERT INTO `admin` VALUES ('6', 'admin5', 'e10adc3949ba59abbe56e057f20f883e', '2018-12-01 21:10:25', 'common');
INSERT INTO `admin` VALUES ('7', 'admin6', 'e10adc3949ba59abbe56e057f20f883e', '2018-12-02 10:16:43', 'common');

-- ----------------------------
-- Table structure for `adminlog`
-- ----------------------------
DROP TABLE IF EXISTS `adminlog`;
CREATE TABLE `adminlog` (
  `info_id` int(100) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL,
  `details` varchar(50) DEFAULT NULL COMMENT '管理员进行的操作',
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`info_id`),
  KEY `account` (`account`),
  CONSTRAINT `adminlog_ibfk_1` FOREIGN KEY (`account`) REFERENCES `admin` (`account`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of adminlog
-- ----------------------------
INSERT INTO `adminlog` VALUES ('1', 'admin1', '删除了用户wuruicheng', '2018-11-24 10:34:11');
INSERT INTO `adminlog` VALUES ('2', 'admin2', '审核了活动编号为5的活动', '2018-11-24 10:34:14');
INSERT INTO `adminlog` VALUES ('3', 'admin1', '审核了活动Javapeixun', '2018-12-25 10:22:46');
INSERT INTO `adminlog` VALUES ('4', 'admin1', '审核了活动Javapeixun', '2018-12-25 10:29:05');
INSERT INTO `adminlog` VALUES ('5', 'admin', '审核了活动黄山一日游', '2018-12-26 13:12:21');

-- ----------------------------
-- Table structure for `club`
-- ----------------------------
DROP TABLE IF EXISTS `club`;
CREATE TABLE `club` (
  `club_id` int(10) NOT NULL AUTO_INCREMENT,
  `clubName` varchar(20) DEFAULT NULL COMMENT '社团名',
  `groupId` varchar(20) DEFAULT NULL COMMENT '群号',
  `account` varchar(20) DEFAULT NULL COMMENT '发布人账号',
  `clubAva` varchar(100) DEFAULT NULL COMMENT '社团头像',
  `clubSlogan` varchar(20) DEFAULT NULL COMMENT '口号',
  `clubIntro` varchar(200) DEFAULT NULL COMMENT '介绍',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `clubSchool` varchar(10) DEFAULT '' COMMENT '社团所在学校',
  `sort` varchar(5) DEFAULT NULL COMMENT '分类',
  `clubPass` tinyint(1) DEFAULT '0' COMMENT '是否审核，0.未审核;1.通过,2:未通过',
  PRIMARY KEY (`club_id`),
  KEY `clubSchool` (`clubSchool`),
  KEY `account` (`account`),
  KEY `groupId` (`groupId`),
  CONSTRAINT `club_ibfk_2` FOREIGN KEY (`clubSchool`) REFERENCES `userinfo` (`school`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `club_ibfk_3` FOREIGN KEY (`account`) REFERENCES `userinfo` (`account`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of club
-- ----------------------------
INSERT INTO `club` VALUES ('3', '轮滑协会', '30977960', 'admin', 'http://www.wuruicheng.top/club/skate', 'Keep roling', '轮滑协会，校十佳社团，全国体育公益百佳社团，年轻是我们的力量，滚出宿舍，滚动青春，做不宅轮滑人', '2018-10-09 20:38:42', '九江学院', '体育类', '1');
INSERT INTO `club` VALUES ('4', '电影发烧友', '28554495', 'admin', 'http://www.wuruicheng.top/club/tv', '一起欣赏热门电影', '电影发骚友', '2018-10-10 11:15:00', '九江学院', null, '1');
INSERT INTO `club` VALUES ('5', '街舞协会', '28554499', 'admin', 'http://www.wuruicheng.top/club/dance', '舞动青春', '想学街舞，来我们协会吧', '2018-10-10 11:15:04', '九江学院', '体育类', '1');
INSERT INTO `club` VALUES ('6', '动漫协会', '28554501', 'admin', 'http://www.wuruicheng.top/club/comic', '让我们一起开启大航海时代吧', '动漫迷', '2018-10-11 09:13:36', '九江学院', null, '1');
INSERT INTO `club` VALUES ('7', '自强社', '28554503', 'admin', 'http://www.wuruicheng.top/club/strength', '天行健，君子以自强不息', '少儿当自强', '2018-10-11 09:13:39', '九江学院', null, '1');
INSERT INTO `club` VALUES ('8', '创业梦想', '30977966', 'admin', 'http://www.wuruicheng.top/club/work', '梦想启航', '欢迎各大学校的同学加入我们，一起学习，一起成长', '2018-10-11 09:13:42', '九江学院', null, '1');
INSERT INTO `club` VALUES ('9', '书友会社', '30977962', 'admin', 'http://www.wuruicheng.top/club/book', '欢畅书洋', '阅读交流', '2018-10-11 09:13:44', '九江学院', null, '1');
INSERT INTO `club` VALUES ('10', '明师工程', '30977964', 'admin', 'http://www.wuruicheng.top/club/teacher', '携手共进', '征战教师资格证', '2018-10-11 15:51:01', '九江学院', null, '1');
INSERT INTO `club` VALUES ('11', '木工俱乐部', '28554497', 'admin', 'http://www.wuruicheng.top/club/wood', '木头的温度', '手工制作木制品爱好者', '2018-10-11 15:51:04', '九江学院', null, '1');
INSERT INTO `club` VALUES ('13', 'lunhua', '28522771', 'wuruicheng', 'http://www.wuruicheng.top/clubAva/20181224122421', 'exercise', 'it is null', '2018-10-26 17:14:27', '九江学院', '体育类', '1');
INSERT INTO `club` VALUES ('14', 'Java', '28877393', 'admin', 'http://www.wuruicheng.top/clubAva/20181220061447', 'xuexxi', 'xuexi', '2018-12-20 14:14:59', '九江学院', '学习类', '0');
INSERT INTO `club` VALUES ('19', 'phyon', '28898195', 'admin', 'http://www.wuruicheng.top/clubAva/20181223100934', 'xuexi', 'xuexi', '2018-12-23 18:09:39', '九江学院', '学习类', '0');
INSERT INTO `club` VALUES ('20', 'C', '31330920', 'admin', 'http://www.wuruicheng.top/clubAva/20181224122421', 'xuex', 'xuexi', '2018-12-24 20:24:26', '九江学院', '学习类', '0');

-- ----------------------------
-- Table structure for `clubfocus`
-- ----------------------------
DROP TABLE IF EXISTS `clubfocus`;
CREATE TABLE `clubfocus` (
  `focus_id` int(10) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL,
  `club_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`focus_id`),
  KEY `account` (`account`),
  KEY `club_id` (`club_id`),
  CONSTRAINT `clubfocus_ibfk_1` FOREIGN KEY (`account`) REFERENCES `userinfo` (`account`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `clubfocus_ibfk_2` FOREIGN KEY (`club_id`) REFERENCES `club` (`club_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of clubfocus
-- ----------------------------
INSERT INTO `clubfocus` VALUES ('1', 'admin', '3');
INSERT INTO `clubfocus` VALUES ('2', 'admin', '10');

-- ----------------------------
-- Table structure for `clubmember`
-- ----------------------------
DROP TABLE IF EXISTS `clubmember`;
CREATE TABLE `clubmember` (
  `member_id` int(10) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL,
  `joinTime` datetime DEFAULT NULL,
  `groupId` varchar(20) DEFAULT NULL,
  `club_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`member_id`),
  KEY `account` (`account`),
  KEY `groupId` (`groupId`),
  KEY `club_id` (`club_id`),
  CONSTRAINT `clubmember_ibfk_3` FOREIGN KEY (`account`) REFERENCES `userinfo` (`account`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `clubmember_ibfk_4` FOREIGN KEY (`groupId`) REFERENCES `club` (`groupId`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `clubmember_ibfk_5` FOREIGN KEY (`club_id`) REFERENCES `club` (`club_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of clubmember
-- ----------------------------
INSERT INTO `clubmember` VALUES ('1', 'admin', '2018-11-28 16:24:16', '30977960', '3');
INSERT INTO `clubmember` VALUES ('2', 'admin', '2018-11-02 16:03:32', '28554495', '4');
INSERT INTO `clubmember` VALUES ('3', 'admin', '2018-11-02 16:03:38', '28554499', '5');
INSERT INTO `clubmember` VALUES ('4', 'admin', '2018-11-02 16:03:48', '28554501', '6');
INSERT INTO `clubmember` VALUES ('5', 'admin', '2018-11-02 16:04:02', '28554503', '7');
INSERT INTO `clubmember` VALUES ('6', 'admin', '2018-11-02 16:04:07', '30977966', '8');
INSERT INTO `clubmember` VALUES ('7', 'admin', '2018-11-02 16:04:10', '30977962', '9');
INSERT INTO `clubmember` VALUES ('8', 'admin', '2018-11-02 16:04:13', '30977964', '10');
INSERT INTO `clubmember` VALUES ('9', 'admin', '2018-11-13 10:50:45', '28554497', '11');
INSERT INTO `clubmember` VALUES ('10', 'wuruicheng', '2018-11-02 16:04:17', '28522771', '13');
INSERT INTO `clubmember` VALUES ('11', 'wuruicheng', '2018-11-05 16:37:08', '28554497', '11');
INSERT INTO `clubmember` VALUES ('12', 'longhaihua', '2018-11-21 13:11:07', '30977960', '3');
INSERT INTO `clubmember` VALUES ('13', 'laihuanhuan', '2018-11-21 13:11:36', '30977960', '3');
INSERT INTO `clubmember` VALUES ('14', 'wuruicheng', '2018-11-21 13:12:04', '30977960', '3');
INSERT INTO `clubmember` VALUES ('15', 'testa', '2018-11-21 13:12:21', '30977960', '3');
INSERT INTO `clubmember` VALUES ('16', 'testb', '2018-11-21 13:12:37', '30977960', '3');
INSERT INTO `clubmember` VALUES ('17', 'admin', '2018-12-20 14:14:59', '28877393', '14');
INSERT INTO `clubmember` VALUES ('22', 'admin', '2018-12-23 18:09:39', null, '19');
INSERT INTO `clubmember` VALUES ('23', 'admin', '2018-12-24 20:24:26', null, '20');

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `message_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `sendAccount` varchar(20) DEFAULT NULL COMMENT '发送方账号',
  `receiveAccount` varchar(20) DEFAULT NULL COMMENT '接收方账号',
  `root` varchar(20) DEFAULT NULL COMMENT '来源，如好友添加、社团申请等',
  `reason` varchar(20) DEFAULT NULL COMMENT '添加原因',
  `result` tinyint(1) DEFAULT '0' COMMENT '结果，0标识还未反馈,1标识同意,2标识拒绝',
  `club_id` int(10) DEFAULT NULL COMMENT '如果是社团申请，则添加欲要加入的社团id',
  `activity_id` int(10) DEFAULT NULL COMMENT '如果是活动申请，则添加欲要加入的活动id',
  PRIMARY KEY (`message_id`),
  KEY `sendAccount` (`sendAccount`),
  KEY `receiveAccount` (`receiveAccount`),
  KEY `club_id` (`club_id`),
  KEY `activity_id` (`activity_id`),
  CONSTRAINT `message_ibfk_1` FOREIGN KEY (`sendAccount`) REFERENCES `userinfo` (`account`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `message_ibfk_2` FOREIGN KEY (`receiveAccount`) REFERENCES `userinfo` (`account`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `message_ibfk_3` FOREIGN KEY (`club_id`) REFERENCES `club` (`club_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `message_ibfk_4` FOREIGN KEY (`activity_id`) REFERENCES `activity` (`activity_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', 'wuruicheng', 'admin', '好友申请', '交个朋友', '1', null, null);
INSERT INTO `message` VALUES ('2', 'longhaihua', 'admin', '活动申请', '参与活动认识更多的朋友', '2', null, '1');
INSERT INTO `message` VALUES ('3', 'laihuanhuan', 'admin', '社团申请', '认识更多志同道合的好友', '1', '3', null);
INSERT INTO `message` VALUES ('4', 'wuruicheng', 'longhaihua', '好友申请', '111', '1', null, null);
INSERT INTO `message` VALUES ('5', 'laihuanhuan', 'admin', '活动申请', '刷街', '1', null, '2');
INSERT INTO `message` VALUES ('6', 'longhaihua', 'admin', '社团申请', '街舞协会', '1', '5', null);
INSERT INTO `message` VALUES ('7', 'wuruicheng', 'admin', '社团申请', '梦想启航', '0', '8', null);
INSERT INTO `message` VALUES ('8', 'wuruicheng', 'admin', '社团申请', '木头的温度', '1', '11', null);
INSERT INTO `message` VALUES ('9', 'admin', 'hujun', '好友申请', '', '1', null, null);

-- ----------------------------
-- Table structure for `praise`
-- ----------------------------
DROP TABLE IF EXISTS `praise`;
CREATE TABLE `praise` (
  `praise_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '点赞id',
  `talk_id` int(10) DEFAULT NULL COMMENT '分享id',
  `use_id` int(10) DEFAULT NULL COMMENT '用户id',
  `nickName` varchar(10) DEFAULT NULL COMMENT '用户昵称',
  PRIMARY KEY (`praise_id`),
  KEY `praise_ibfk_1` (`use_id`),
  KEY `praise_ibfk_2` (`talk_id`),
  KEY `praise_ibfk_3` (`nickName`),
  CONSTRAINT `praise_ibfk_1` FOREIGN KEY (`use_id`) REFERENCES `userinfo` (`use_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `praise_ibfk_2` FOREIGN KEY (`talk_id`) REFERENCES `talk` (`talk_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `praise_ibfk_3` FOREIGN KEY (`nickName`) REFERENCES `userinfo` (`nickName`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of praise
-- ----------------------------

-- ----------------------------
-- Table structure for `replytalk`
-- ----------------------------
DROP TABLE IF EXISTS `replytalk`;
CREATE TABLE `replytalk` (
  `replytalk_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '回复分享编号',
  `talk_id` int(10) DEFAULT NULL COMMENT '分享编号',
  `use_id` int(10) DEFAULT NULL COMMENT '回复的用户id',
  `replyTime` varchar(20) DEFAULT NULL COMMENT '回复时间',
  `replyContent` varchar(256) DEFAULT NULL COMMENT '回复内容',
  PRIMARY KEY (`replytalk_id`),
  KEY `replytalk_ibfk_1` (`use_id`),
  KEY `replytalk_ibfk_2` (`talk_id`),
  CONSTRAINT `replytalk_ibfk_1` FOREIGN KEY (`use_id`) REFERENCES `userinfo` (`use_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `replytalk_ibfk_2` FOREIGN KEY (`talk_id`) REFERENCES `talk` (`talk_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of replytalk
-- ----------------------------

-- ----------------------------
-- Table structure for `suggest`
-- ----------------------------
DROP TABLE IF EXISTS `suggest`;
CREATE TABLE `suggest` (
  `suggest_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '意见编号',
  `use_id` int(10) DEFAULT NULL COMMENT '用户编号',
  `suggestcontent` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `suggesttime` datetime DEFAULT NULL COMMENT '发布建议时间',
  PRIMARY KEY (`suggest_id`),
  KEY `suggest_ibfk_1` (`use_id`),
  CONSTRAINT `suggest_ibfk_1` FOREIGN KEY (`use_id`) REFERENCES `userinfo` (`use_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of suggest
-- ----------------------------
INSERT INTO `suggest` VALUES ('1', '4', '加油', '2018-08-31 15:51:44');
INSERT INTO `suggest` VALUES ('2', '1', '软件很好用，感谢程序猿的辛苦开发', '2018-12-01 16:55:32');
INSERT INTO `suggest` VALUES ('3', '4', '好用，好用', '2018-12-02 13:38:39');

-- ----------------------------
-- Table structure for `talk`
-- ----------------------------
DROP TABLE IF EXISTS `talk`;
CREATE TABLE `talk` (
  `talk_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '分享编号',
  `use_id` int(10) DEFAULT NULL COMMENT '用户id',
  `talkContent` varchar(256) DEFAULT NULL COMMENT '分享内容',
  `talkPhoto` varchar(100) DEFAULT NULL COMMENT '晒图地址',
  `talkTime` datetime DEFAULT NULL COMMENT '分享时间',
  `topicName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`talk_id`),
  KEY `talk_ibfk_1` (`use_id`),
  KEY `topicName` (`topicName`),
  CONSTRAINT `talk_ibfk_1` FOREIGN KEY (`use_id`) REFERENCES `userinfo` (`use_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `talk_ibfk_2` FOREIGN KEY (`topicName`) REFERENCES `topic` (`topicName`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of talk
-- ----------------------------
INSERT INTO `talk` VALUES ('1', '3', '天命圈(ಡωಡ)hiahiahia', 'http://www.wuruicheng.top/talk1', '2018-06-28 15:21:36', '校园头条');
INSERT INTO `talk` VALUES ('2', '2', '人上了年纪的特征之一就是聊天列表里面全部都是群聊吧(●—●)', 'http://www.wuruicheng.top/talk2', '2018-06-28 15:24:13', '每日吐槽');
INSERT INTO `talk` VALUES ('3', '5', '放假了，好开心', 'http://www.wuruicheng.top/talk3', '2018-06-30 16:44:39', '校园头条');
INSERT INTO `talk` VALUES ('4', '3', '不开心不开心！！！！！', null, '2018-12-17 18:45:52', null);

-- ----------------------------
-- Table structure for `topic`
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `topic_id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL,
  `topicName` varchar(20) DEFAULT NULL,
  `topicIntro` varchar(20) DEFAULT NULL,
  `topicPic` varchar(100) DEFAULT NULL,
  `topicCreateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`topic_id`),
  KEY `topicName` (`topicName`),
  KEY `topicIntro` (`topicIntro`),
  KEY `account` (`account`),
  CONSTRAINT `topic_ibfk_1` FOREIGN KEY (`account`) REFERENCES `userinfo` (`account`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of topic
-- ----------------------------
INSERT INTO `topic` VALUES ('1', 'admin', '每日心情', '记录每个心情瞬间', 'http://www.wuruicheng.top/topic1', '2018-10-16 19:51:37');
INSERT INTO `topic` VALUES ('2', 'admin', '美图收录', '分享美腻的壁纸，献给美图控的你', 'http://www.wuruicheng.top/topic2', '2018-10-16 19:53:32');
INSERT INTO `topic` VALUES ('3', 'admin', '随手拍', '记录每个风景', 'http://www.wuruicheng.top/topic3', '2018-10-16 19:53:39');
INSERT INTO `topic` VALUES ('4', 'admin', '每日吐槽', '想吐槽啥就吐槽啥', 'http://www.wuruicheng.top/topic4', '2018-10-16 19:53:40');
INSERT INTO `topic` VALUES ('5', 'admin', '校园头条', '掌握校园新鲜事', 'http://www.wuruicheng.top/topic5', '2018-10-16 19:53:41');

-- ----------------------------
-- Table structure for `userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `use_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `account` varchar(20) NOT NULL COMMENT '账号',
  `passWord` varchar(32) NOT NULL COMMENT '密码',
  `avaPath` varchar(100) DEFAULT NULL COMMENT '头像地址',
  `nickName` varchar(10) DEFAULT NULL COMMENT '昵称',
  `birth` date DEFAULT NULL COMMENT '生日',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `school` varchar(10) DEFAULT NULL COMMENT '学校',
  `academy` varchar(10) DEFAULT NULL COMMENT '学院',
  `major` varchar(10) DEFAULT NULL COMMENT '专业',
  `entryYear` date DEFAULT NULL COMMENT '入学时间',
  `perSign` varchar(20) DEFAULT NULL COMMENT '个人签名',
  `hobby` varchar(20) DEFAULT NULL COMMENT '兴趣爱好',
  `homeTown` varchar(10) DEFAULT NULL COMMENT '家乡',
  `registerTime` datetime DEFAULT NULL,
  PRIMARY KEY (`use_id`),
  KEY `nickName` (`nickName`),
  KEY `school` (`school`),
  KEY `account` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', 'admin', '827ccb0eea8a706c4c34a16891f84e7b', 'http://p9sertmb8.bkt.clouddn.com/userHeadPic/20180912110325', '管理员', '2018-06-28', '男', '九江学院', '会计学院', '计算机科学与技术', '2015-09-09', '管理', '轮滑', '江西九江', '2018-06-28 14:14:00');
INSERT INTO `userinfo` VALUES ('2', 'longhaihua', 'e10adc3949ba59abbe56e057f20f883e', 'http://p9sertmb8.bkt.clouddn.com/userHeadPic/20180912110339', '龙海华', '1995-01-01', '男', '九江学院', '信息学院', '计算机科学与技术', '2015-09-01', '华华', '看电影', '江西吉安', '2018-08-28 14:52:18');
INSERT INTO `userinfo` VALUES ('3', 'laihuanhuan', 'e10adc3949ba59abbe56e057f20f883e', '2131624025userHeadPic/20181217105245', '赖欢欢', '2018-12-17', '男', '九江学院', '信息学院', '计算机科学与技术', '2015-09-01', '欢欢', '看电影', '江西上饶', '2018-06-28 15:14:58');
INSERT INTO `userinfo` VALUES ('4', 'wuruicheng', 'e10adc3949ba59abbe56e057f20f883e', 'http://p9sertmb8.bkt.clouddn.com/userHeadPic/20180912110224', '吴瑞成', '1995-05-05', '男', '九江学院', '信息科学与技术学院', '计算机科学与技术', '2015-09-01', '加油！', '锻炼，轮滑', '江西上饶', '2018-06-28 17:15:05');
INSERT INTO `userinfo` VALUES ('5', 'testa', 'e10adc3949ba59abbe56e057f20f883e', 'http://p9sertmb8.bkt.clouddn.com/userHeadPic/20180912110404', '测试a', '2018-05-05', '男', '九江学院', '信息学院', '计科', '2015-09-01', '加油', '跑步', '江西九江', '2018-06-30 16:41:21');
INSERT INTO `userinfo` VALUES ('6', 'testb', 'e10adc3949ba59abbe56e057f20f883e', 'http://p9sertmb8.bkt.clouddn.com/userHeadPic/20181029075105', '测试b', '2018-09-04', '男', '九江学院', '信息学院', '计科', '2018-09-26', '加油', '跑步', '江西九江', '2018-09-26 20:17:31');
INSERT INTO `userinfo` VALUES ('7', 'hujun', 'e10adc3949ba59abbe56e057f20f883e', '2131624025userHeadPic/20181222153616', '胡俊', '2018-12-22', '男', '1', '1', '1', '2018-12-22', '1', '1', '1', null);

-- ----------------------------
-- Table structure for `view`
-- ----------------------------
DROP TABLE IF EXISTS `view`;
CREATE TABLE `view` (
  `view_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '风景编号',
  `club_id` int(10) DEFAULT NULL COMMENT '社团id',
  `use_id` int(10) DEFAULT NULL COMMENT '上传用户id',
  `photo` varchar(100) DEFAULT NULL COMMENT '照片地址',
  `clubName` varchar(20) DEFAULT NULL COMMENT '照片学校',
  `uploadTime` varchar(20) DEFAULT NULL COMMENT '上传时间',
  PRIMARY KEY (`view_id`),
  KEY `view_ibfk_1` (`use_id`),
  KEY `club_id` (`club_id`),
  CONSTRAINT `view_ibfk_1` FOREIGN KEY (`use_id`) REFERENCES `userinfo` (`use_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `view_ibfk_2` FOREIGN KEY (`club_id`) REFERENCES `club` (`club_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of view
-- ----------------------------
INSERT INTO `view` VALUES ('1', '3', '1', 'http://www.wuruicheng.top/view/2018112814353600', 'lhxh', '2018-11-28 14:35:38');
INSERT INTO `view` VALUES ('2', '3', '1', 'http://www.wuruicheng.top/view/2018112814353601', 'lhxh', '2018-11-28 14:35:40');
INSERT INTO `view` VALUES ('3', '3', '1', 'http://www.wuruicheng.top/view/2018112814353602', 'lhxh', '2018-11-28 14:35:40');
INSERT INTO `view` VALUES ('4', '3', '1', 'http://www.wuruicheng.top/view/2018112814353603', 'lhxh', '2018-11-28 14:35:40');
INSERT INTO `view` VALUES ('5', '3', '1', 'http://www.wuruicheng.top/view/2018112814353604', 'lhxh', '2018-11-28 14:35:40');
INSERT INTO `view` VALUES ('6', '3', '1', 'http://www.wuruicheng.top/view/2018112814353605', 'lhxh', '2018-11-28 14:35:43');
INSERT INTO `view` VALUES ('7', '3', '1', 'http://www.wuruicheng.top/view/2018112814353606', 'lhxh', '2018-11-28 14:35:44');
INSERT INTO `view` VALUES ('8', '3', '1', 'http://www.wuruicheng.top/view/2018112814353607', 'lhxh', '2018-11-28 14:35:44');
INSERT INTO `view` VALUES ('9', '3', '1', 'http://www.wuruicheng.top/view/2018112814353608', 'lhxh', '2018-11-28 14:35:44');
