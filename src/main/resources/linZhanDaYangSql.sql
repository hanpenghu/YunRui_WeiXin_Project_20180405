GO
create table PRDT_SAMP
(
id VARCHAR(100) PRIMARY KEY NOT NULL,---一般uuid   36位
prd_code VARCHAR (200) DEFAULT '' ,---产品编码,就是prdt表中的name
idx_name VARCHAR(200) DEFAULT '',----产品名称
idx_no VARCHAR(200) DEFAULT '',----产品分类
mark_name VARCHAR(200) DEFAULT '',----品牌名称
mark_no VARCHAR (200) DEFAULT '',---品牌号
colour VARCHAR (200)  DEFAULT '',---颜色
size VARCHAR (200)DEFAULT '',----尺寸
sal_name varchar(50)DEFAULT '',---产品负责人
sal_no VARCHAR (70)DEFAULT '',---产品负责人编码
cus_no VARCHAR (70) DEFAULT '',
cus_name VARCHAR (200) DEFAULT '',
isFenJie VARCHAR (5) DEFAULT 'n',---是否分解,  y代表分解,  n代表不分解
samp_make datetime DEFAULT null,---打样时间
samp_send datetime DEFAULT NULL ,----样品寄出时间
samp_requ VARCHAR (1000)DEFAULT '',----样品要求
samp_desc VARCHAR (1000) DEFAULT '',---产品描述
thum varchar(MAX) DEFAULT '',---缩略图名字包含的字符串,用;隔开
attach varchar(max) DEFAULT ''-----附件名字包含的字符串,用;隔开
)
GO