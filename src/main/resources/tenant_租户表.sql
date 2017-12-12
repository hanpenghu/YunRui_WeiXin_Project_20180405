GO
/****** Object:  Table [dbo].[sapso]    Script Date: 11/08/2017 10:47:21 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO
 if not exists (select * from sysobjects where id = object_id('sapso') and OBJECTPROPERTY(id, 'IsUserTable') = 1)
begin
CREATE TABLE [dbo].[sapso](
[id] [int] IDENTITY(1,1) NOT NULL,
[timeSameBatch] [varchar](26) NULL,
[uuid] [varchar](70) NULL,
[osNo] [varchar](120) NULL,
[ebNo] [varchar](100) NULL,
[caiGouNo] [varchar](100) NULL,
[prdNo] [varchar](100) NULL,
[saphh] [varchar](100) NULL,
[sapph] [varchar](100) NULL,
[sapwlm] [varchar](255) NULL,
[qty] [numeric](22, 8) NULL,
[maiTouNo] [varchar](100) NULL,
[luoHao] [varchar](300) NULL,
[gangHao] [varchar](300) NULL,
[realWidth] [varchar](300) NULL,
[realLength] [varchar](300) NULL,
PRIMARY KEY CLUSTERED
(
[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
end
GO
if not exists(select*from syscolumns where id=object_id('sapso')and name='chengFenDaiMa')
begin
alter table sapso add [chengFenDaiMa] [varchar](255) NULL
end
 GO
 --------------------------------------------
GO
if not exists (select * from sysobjects where id = object_id('PRDT_SAMP') and OBJECTPROPERTY(id, 'IsUserTable') = 1)
begin
create table PRDT_SAMP
(
id VARCHAR(100) PRIMARY KEY NOT NULL,---一般uuid 36位
prd_code VARCHAR (200) DEFAULT '' ,---产品编码,就是prdt表中的name
idx_name VARCHAR(200) DEFAULT '',----产品名称
idx_no VARCHAR(200) DEFAULT '',----产品分类
mark_name VARCHAR(200) DEFAULT '',----品牌名称
mark_no VARCHAR (200) DEFAULT '',---品牌号
colour VARCHAR (200) DEFAULT '',---颜色
size VARCHAR (200)DEFAULT '',----尺寸
sal_name varchar(50)DEFAULT '',---产品负责人
sal_no VARCHAR (70)DEFAULT '',---产品负责人编码
cus_no VARCHAR (70) DEFAULT '',
cus_name VARCHAR (200) DEFAULT '',
isFenJie VARCHAR (5) DEFAULT 'n',---是否分解, y代表分解, n代表不分解
samp_make datetime DEFAULT null,---打样时间
samp_send datetime DEFAULT NULL ,----样品寄出时间
samp_requ VARCHAR (1000)DEFAULT '',----样品要求
samp_desc VARCHAR (1000) DEFAULT '',---产品描述
thum varchar(MAX) DEFAULT '',---缩略图名字包含的字符串,用;隔开
attach varchar(max) DEFAULT '',-----附件名字包含的字符串,用;隔开
insertdate datetime default getdate()
)
end
GO
if not exists(select*from syscolumns where id=object_id('PRDT_SAMP')and name='confirmMan')
begin
alter table PRDT_SAMP add [confirmMan] [varchar](25) NULL----确认人
end
go
if not exists(select*from syscolumns where id=object_id('PRDT_SAMP')and name='confirmTimeStr')
begin
alter table PRDT_SAMP add [confirmTimeStr] [varchar](27) NULL----确认时间用String
end
go
if not exists(select*from syscolumns where id=object_id('PRDT_SAMP')and name='isConfirm')
begin
alter table PRDT_SAMP add [isConfirm] [int] default 0----是否确认,  0代表未确认,1代表已经确认
end
go
-----------下面的是登录注册用---------------------------------------
if not exists (select * from sysobjects where id = object_id('tenant') and OBJECTPROPERTY(id, 'IsUserTable') = 1)
begin
CREATE TABLE tenant(-------租户ID
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),---主键,自增长字段
    TenantID VARCHAR(20),----租户ID
    TenantName VARCHAR (50),---租户名称
    tokentime BIGINT
)
end
go
-----------------上面是公司表,下面是用户表-------------------------------------
if not exists (select * from sysobjects where id = object_id('USERS') and OBJECTPROPERTY(id, 'IsUserTable') = 1)
begin
create TABLE USERS(
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),---主键,自增长字段
    TenantID VARCHAR(20),--------A  20 租户ID
    UserEmail  VARCHAR(50),--------A  50 用户账号 邮件
    UserPswd VARCHAR(50),---------A 50 用户密码 可以先明文
    LockBill VARCHAR(50),------A  50 锁单 CK;EXT;
    timetoken VARCHAR(200),--
    phone_no  VARCHAR(20),
    user_name VARCHAR(50)
)
end
go