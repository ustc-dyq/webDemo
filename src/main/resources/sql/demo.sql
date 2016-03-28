CREATE DATABASE `demo` /*!40100 DEFAULT CHARACTER SET utf8 */
CREATE TABLE `user` (
  `id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(25) NOT NULL COMMENT '�û���',
  `user_passwd` VARCHAR(25) NOT NULL COMMENT '�û�����',
  `user_priv` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '�û�Ȩ�ޣ�0��ͨ�û���1����Ա�˻�',
  `add_time` TIMESTAMP NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '���ʱ��',
  `update_time` TIMESTAMP NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '����ʱ��',
  `del_flag` TINYINT(4) NOT NULL DEFAULT '0' COMMENT 'ɾ����ǣ�1����ɾ��',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8

CREATE TABLE `group` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `group_name` varchar(25) NOT NULL COMMENT '����',
  `add_user_name` varchar(25) NOT NULL COMMENT '����������',
  `add_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '���ʱ��',
  `del_flag` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `group_member` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `group_id` int(11) NOT NULL,
  `group_name` varchar(25) NOT NULL,
  `member_name` varchar(25) NOT NULL COMMENT '��Ա����',
  `add_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `del_flag` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `head_img` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `user_name` varchar(25) NOT NULL,
  `img_url` varchar(128) NOT NULL COMMENT 'ͷ�񱣴��·��',
  `add_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `del_flag` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `USER_ID` (`user_id`),
  UNIQUE KEY `USER_NAME` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `login` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `user_name` varchar(25) NOT NULL,
  `is_online` tinyint(4) NOT NULL DEFAULT '0' COMMENT '�Ƿ����ߣ�0�����ߣ�1����',
  `del_flag` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `USER_ID` (`user_id`),
  UNIQUE KEY `USER_NAME` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `login_log` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `user_name` varchar(25) NOT NULL,
  `login_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `logout_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `del_flag` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `USER_ID` (`user_id`),
  KEY `USER_NAME` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `reciv_msg` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `send_user_id` int(11) NOT NULL,
  `send_user_name` varchar(25) NOT NULL,
  `reciv_user_id` int(11) NOT NULL,
  `reciv_user_name` varchar(25) NOT NULL,
  `msg` varchar(256) NOT NULL DEFAULT '',
  `msg_type` tinyint(4) NOT NULL DEFAULT '0',
  `send_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `is_read` tinyint(4) DEFAULT '0',
  `del_flag` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `send_msg` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `send_user_id` int(11) NOT NULL,
  `send_user_name` varchar(25) NOT NULL,
  `reciv_user_id` int(11) NOT NULL,
  `reciv_user_name` varchar(25) NOT NULL,
  `msg` varchar(256) NOT NULL COMMENT '���͵���Ϣ',
  `msg_type` tinyint(4) NOT NULL COMMENT '��Ϣ���ͣ�1���ı���2��ͼƬ��3�������ļ�',
  `send_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `del_flag` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `USER_ID` (`send_user_id`),
  KEY `USER_NAME` (`send_user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8