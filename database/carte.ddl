CREATE TABLE  `khalid`.`carte` (
  `CARTE_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  
`CARTE_NAME` varchar(50) NOT NULL,
  
PRIMARY KEY (`CARTE_ID`) USING BTREE,
  
UNIQUE KEY `UNI_CARTE_NAME` (`CARTE_NAME`)
) 
ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;