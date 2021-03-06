/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : fast-platform

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2019-05-05 20:28:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_layui_table_cols
-- ----------------------------
DROP TABLE IF EXISTS `sys_layui_table_cols`;
CREATE TABLE `sys_layui_table_cols` (
  `col_id` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '主键，自增长',
  `table_code` varchar(100) COLLATE utf8_bin NOT NULL COMMENT 'table列表code编码',
  `field` varchar(100) COLLATE utf8_bin NOT NULL COMMENT '设定字段名',
  `title` varchar(200) COLLATE utf8_bin NOT NULL COMMENT '设定标题名称',
  `width` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT ' 设定列宽（默认自动分配）',
  `min_width` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '局部定义当前常规单元格的最小宽度',
  `type` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '设定列类型。可选值有：normal(常规列，无需设定)、checkbox(复选框列)、space(空列)、numbers(序号列)，如果为tree，则只有在表格为treeTable时候代表树状显示列',
  `LAY_CHECKED` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '是否全选状态',
  `fixed` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '固定列',
  `sort` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '是否允许排序(默认：false)',
  `unresize` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '是否禁用拖拽列宽(默认：false)',
  `edit` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '单元格编辑类型(默认不开启)',
  `event` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '自定义单元格点击事件名',
  `style` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '自定义单元格样式',
  `align` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '单元格排列方式',
  `colspan` int(11) DEFAULT NULL COMMENT '单元格所占列数(默认：1)。一般用于多级表头',
  `rowspan` int(11) DEFAULT NULL COMMENT '单元格所占行数(默认：1)。一般用于多级表头',
  `templet` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '自定义列模板',
  `toolbar` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT ' 绑定列工具条',
  `STATUS` int(11) DEFAULT NULL COMMENT '是否为失效状态,0:失效，1：有效',
  `orders` int(5) DEFAULT NULL COMMENT '列表列的排序值',
  PRIMARY KEY (`col_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of sys_layui_table_cols
-- ----------------------------
INSERT INTO `sys_layui_table_cols` VALUES ('1', 'user', 'loginName', '登录账号', '15%', '100', null, null, null, null, null, null, null, null, 'left', null, null, null, null, null, '1');
INSERT INTO `sys_layui_table_cols` VALUES ('10', 'role', 'status', '状态', '13%', null, null, null, null, null, null, null, null, null, 'left', null, null, null, null, null, '2');
INSERT INTO `sys_layui_table_cols` VALUES ('11', 'role', '', '全选', '13%', null, 'checkbox', null, null, null, null, null, null, null, 'left', null, null, null, null, null, '0');
INSERT INTO `sys_layui_table_cols` VALUES ('12', 'role', 'tool', '操作', '20%', null, null, null, null, null, null, null, null, null, 'left', null, null, null, '#roletoolbar', null, '3');
INSERT INTO `sys_layui_table_cols` VALUES ('2', 'user', 'userName', '用户姓名', '15%', null, null, null, null, null, null, null, null, null, 'left', null, null, null, null, null, '2');
INSERT INTO `sys_layui_table_cols` VALUES ('3', 'user', 'sex', '性别', '12%', null, null, null, null, null, null, null, null, null, 'left', null, null, null, null, null, '3');
INSERT INTO `sys_layui_table_cols` VALUES ('4', 'user', 'mobilePhone', '手机号', '15%', null, null, null, null, null, null, null, null, null, 'left', null, null, null, null, null, '4');
INSERT INTO `sys_layui_table_cols` VALUES ('5', 'user', 'createTime', '创建时间', '15%', null, null, null, null, null, null, null, null, null, 'left', null, null, null, null, null, '5');
INSERT INTO `sys_layui_table_cols` VALUES ('6', 'user', 'status', '状态', '11%', null, null, null, null, null, null, null, null, null, 'left', null, null, null, null, null, '6');
INSERT INTO `sys_layui_table_cols` VALUES ('7', 'user', 'tool', '操作', '13%', null, null, null, null, null, null, null, null, null, 'left', null, null, null, '#usertoolbar', null, '7');
INSERT INTO `sys_layui_table_cols` VALUES ('8', 'user', ' ', '全选', '3%', null, 'checkbox', null, null, null, null, null, null, null, '', null, null, null, null, null, '0');
INSERT INTO `sys_layui_table_cols` VALUES ('9', 'role', 'roleName', '角色名称', '13%', null, null, null, null, null, null, null, null, null, 'left', null, null, null, null, null, '1');

-- ----------------------------
-- Table structure for sys_layui_table_config
-- ----------------------------
DROP TABLE IF EXISTS `sys_layui_table_config`;
CREATE TABLE `sys_layui_table_config` (
  `table_id` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '主键，自增长',
  `table_code` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT 'table列表code编码',
  `elem` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '指定原始 table 容器的选择器或 DOM，方法渲染方式必填',
  `url` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '异步数据接口相关参数。其中 url 参数为必填项',
  `width` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '设定容器宽度',
  `height` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '设定容器高度',
  `cell_min_width` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '全局定义所有常规单元格的最小宽度',
  `page` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '开启分页(默认：false),也可以自定义',
  `limit` int(11) DEFAULT NULL COMMENT '每页显示的条数',
  `limits` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '每页条数的选择项(默认{10,20,30,40,50,60,70,80,90,100})',
  `loading` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '是否显示加载条(默认：true)',
  `text` varchar(1000) COLLATE utf8_bin DEFAULT NULL COMMENT '自定义文本，如空数据时的异常提示等',
  `init_sort` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '初始排序状态',
  `skin` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '设定表格各种外观、尺寸等',
  `even` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '若不开启隔行背景，不设置该参数即可',
  `size` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '用于设定表格尺寸，若使用默认尺寸不设置该属性即可',
  `done` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '数据渲染完的回调。你可以借此做一些其它的操作',
  `css_class` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT 'table的css的class',
  `status` int(11) DEFAULT NULL COMMENT '是否为失效状态,0:失效，1：有效',
  `tree_table` varchar(11) CHARACTER SET utf8 DEFAULT NULL COMMENT '是否为treeTable结构,true:是，false：否',
  `tag` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '为每个table组赋统一标识',
  PRIMARY KEY (`table_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of sys_layui_table_config
-- ----------------------------
INSERT INTO `sys_layui_table_config` VALUES ('1', 'user', '#userList', '/admin/user/tableData', '', 'full-60', null, 'true', '20', '20,40,60', null, '暂无相关数据!', '', '', 'true', '', null, 'layui-hide', '1', null, null);
INSERT INTO `sys_layui_table_config` VALUES ('2', 'role', '#roleList', '/admin/role/tableData', null, 'full-60', null, 'true', '20', '20,40,60', null, '暂无相关数据!', null, null, 'true', null, null, 'layui-hide', '1', null, null);

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `LOG_ID` varchar(120) COLLATE utf8_bin NOT NULL COMMENT '主键ID',
  `USER_NAME` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '用户名',
  `REQUEST_FROM` varchar(750) COLLATE utf8_bin DEFAULT NULL COMMENT '来源',
  `METHOD` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '请求方式',
  `REQUEST_URL` varchar(750) COLLATE utf8_bin DEFAULT NULL COMMENT '请求地址',
  `PARAMS` varchar(5000) COLLATE utf8_bin DEFAULT NULL COMMENT '请求参数',
  `BROWSER` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '浏览器',
  `IP_ADDRESS` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT 'IP地址',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '操作时间',
  `TIPS` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`LOG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of sys_log
-- ----------------------------

-- ----------------------------
-- Table structure for sys_res
-- ----------------------------
DROP TABLE IF EXISTS `sys_res`;
CREATE TABLE `sys_res` (
  `RES_ID` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '主键ID',
  `RES_CODE` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '资源编码',
  `PAR_RES_ID` varchar(50) COLLATE utf8_bin DEFAULT '0' COMMENT '父资源ID',
  `RES_NAME` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '资源名称',
  `RES_ICON` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '资源图标',
  `RES_URL` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '资源地址',
  `RES_ORDER` int(11) DEFAULT NULL COMMENT '资源排序',
  `TIPS` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `STATUS` int(11) DEFAULT NULL COMMENT '资源状态',
  `CREATE_USER` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `MODIFY_USER` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '修改人',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `RES_LEVELS` int(11) DEFAULT NULL COMMENT '资源层级',
  PRIMARY KEY (`RES_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of sys_res
-- ----------------------------
INSERT INTO `sys_res` VALUES ('1001', '', '0', '管理系统', 'fa fa-align-justify', null, '0', null, '1', '1', '2019-04-30 10:24:31', null, null, '1');
INSERT INTO `sys_res` VALUES ('1003', 'system:user', '1006', '用户管理', 'fa fa-user', '/admin/user/index', '0', null, '1', '1', '2019-04-30 10:27:06', null, null, '3');
INSERT INTO `sys_res` VALUES ('1004', 'system:role', '1006', '角色管理', 'fa fa-user', '/admin/role/index', '1', null, '1', '1', '2019-04-30 10:27:46', null, null, '3');
INSERT INTO `sys_res` VALUES ('1005', 'system:res', '1006', '资源管理', 'fa fa-navicon', '/admin/res/index', '2', null, '1', '1', '2019-04-30 10:28:56', null, null, '3');
INSERT INTO `sys_res` VALUES ('1006', 'system', '1001', '系统管理', 'fa fa-align-justify', null, '0', null, '1', '1', '2019-04-30 17:06:19', null, null, '2');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `ROLE_ID` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '角色ID',
  `ROLE_ORDER` int(11) DEFAULT NULL COMMENT '排序',
  `ROLE_NAME` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '角色名称',
  `TIPS` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态,0:删除，1：正常',
  `CREATE_USER` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `MODIFY_USER` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '修改人',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `ROLE_CODE` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '角色编码',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '0', '超级管理员', null, '1', '1', '2019-04-23 20:22:20', null, null, 'systemManager');

-- ----------------------------
-- Table structure for sys_role_res
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_res`;
CREATE TABLE `sys_role_res` (
  `ROLE_RES_ID` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '主键ID',
  `RES_ID` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '资源ID',
  `ROLE_ID` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '角色ID',
  `CREATE_USER` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `MODIFY_USER` varchar(125) COLLATE utf8_bin NOT NULL COMMENT '修改人',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态(1：正常 0：删除）',
  PRIMARY KEY (`ROLE_RES_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of sys_role_res
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `USER_ID` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '账号',
  `LOGIN_NAME` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '登录账号',
  `USER_NAME` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '用户姓名',
  `AVATAR` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '头像',
  `PASSWORD` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `SEX` int(11) DEFAULT NULL COMMENT '性别（1：男 2：女）',
  `DEPT_ID` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '部门ID',
  `EMAIL` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '电子邮件',
  `MOBILE_PHONE` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '电话',
  `PHONE` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '办公电话',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态(1：启用  2：冻结  3：删除）',
  `ONLINE_STATUS` int(11) DEFAULT NULL COMMENT '在线状态1-在线 0-离线',
  `CREATE_USER` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `MODIFY_USER` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '修改人',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `SYS_SALT` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT 'MD5加密盐值',
  `TYPE` int(11) DEFAULT NULL COMMENT '用户类型（0:系统管理，1:app用户）',
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '超级管理员', null, '123456', '1', '1', 'abraxas101@163.com', '17705183367', '58189811', '1', '1', '1', '2019-04-23 20:21:29', null, null, '123', '1');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `USER_ROLE_ID` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '主键ID',
  `USER_ID` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '用户ID',
  `ROLE_ID` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '角色ID',
  `CREATE_USER` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `MODIFY_USER` varchar(125) COLLATE utf8_bin DEFAULT NULL COMMENT '修改人',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态(1：正常  0：删除）',
  PRIMARY KEY (`USER_ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------

-- ----------------------------
-- Function structure for getResChildList
-- ----------------------------
DROP FUNCTION IF EXISTS `getResChildList`;
DELIMITER ;;
CREATE DEFINER=`skip-grants user`@`skip-grants host` FUNCTION `getResChildList`(`resId` longtext) RETURNS varchar(1000) CHARSET utf8mb4
BEGIN
	DECLARE sTemp VARCHAR(1000);
   DECLARE sTempChd VARCHAR(1000);
   SET sTemp = '$';
   SET sTempChd =cast(resId as CHAR);
     WHILE sTempChd is not null DO
       SET sTemp = concat(sTemp,',',sTempChd);
       SELECT group_concat(res_id) INTO sTempChd FROM (select * from sys_res where par_res_id <> 0) t where FIND_IN_SET(par_res_id,sTempChd)>0;
      END WHILE;
      RETURN sTemp;
END
;;
DELIMITER ;
