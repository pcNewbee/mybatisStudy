/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 8.0.15 : Database - mybatis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis` /*!40100 DEFAULT CHARACTER SET gbk COLLATE gbk_bin */;

USE `mybatis`;

/*Table structure for table `blog` */

DROP TABLE IF EXISTS `blog`;

CREATE TABLE `blog` (
  `id` varchar(50) NOT NULL COMMENT '博客id',
  `title` varchar(100) NOT NULL COMMENT '博客标题',
  `author` varchar(30) NOT NULL COMMENT '博客作者',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `views` int(30) NOT NULL COMMENT '浏览量'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `blog` */

insert  into `blog`(`id`,`title`,`author`,`create_time`,`views`) values ('835cc8503b7e4f969bfc3031c0ce5d99','动态SQL','pc','2020-02-06 08:23:34',9999),('4842821c7bfd4df78917ebd5593bca83','Java如此简单','pc','2020-02-06 08:23:34',9999),('c0dd52ce5ce3465b8027699aee8cf86b','Spring如此简单','pc','2020-02-06 08:23:34',9999),('b057edad5dd649e1ab5228aca03d1a45','微服务如此简单','pc','2020-02-06 08:23:34',1000),('d672d007d5924cabb3d37d23cd1df3f0','Mybatis如此简单','cpc','2020-02-06 08:29:40',99),('9c04735d15594e2dbffb98afdefb2d8b','Java如此简单','cpc','2020-02-06 08:29:40',99),('3183c8e87bbd4c879a3ae3fa4a19de9b','Spring如此简单','cpc','2020-02-06 08:29:40',99),('a03e3d6780eb43f3967f5cc2f8464bcb','微服务如此简单','cpc','2020-02-06 08:29:40',99);

/*Table structure for table `stu` */

DROP TABLE IF EXISTS `stu`;

CREATE TABLE `stu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE gbk_bin NOT NULL,
  `pwd` varchar(45) COLLATE gbk_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=gbk COLLATE=gbk_bin;

/*Data for the table `stu` */

insert  into `stu`(`id`,`name`,`pwd`) values (1,'pc','123'),(2,'user','111'),(3,'cus','222'),(4,'pcc','333'),(5,'cpc','444'),(7,'add','addNada');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(10) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `tid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fktid` (`tid`),
  CONSTRAINT `fktid` FOREIGN KEY (`tid`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COLLATE=gbk_bin;

/*Data for the table `student` */

insert  into `student`(`id`,`name`,`tid`) values (1,'小明',1),(2,'小红',1),(3,'小张',1),(4,'小李',1),(5,'小王',1);

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `id` int(10) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COLLATE=gbk_bin;

/*Data for the table `teacher` */

insert  into `teacher`(`id`,`name`) values (1,'曹老师');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
