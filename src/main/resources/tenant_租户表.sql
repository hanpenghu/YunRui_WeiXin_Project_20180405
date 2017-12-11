-- 出库单:   即erp里的出库单
-- 1)	出库单 转单来源：还是出库单(起校验作用)
-- 创建表(和excha在同一数据库)


-- 逻辑:
-- 1)如果TENANT.LockBill= CK; 则说明出库单要锁单控制，按照逻辑2）
-- 2)出库单选择出库单扫描时,如有扫到任何一个二维码匹配不上，该出库单扫描记录不保存进Exhca,直接保存进LockDocu  Bill_ID=‘CK’,BIL_NO=该出库单号 ，Bill_FT=‘T’,PDA前端弹框提示： 对不起！XXX单号已锁定！
-- 3）出库单PDA下次再扫或者选择该单号时，弹出框：
-- 锁定单号：XXX
-- 解锁密码：输入TENANT.Pswd
-- 解锁原因：输入
-- 密码正确，解锁原因有输入则 该单Bill_FT=‘F’,可以带到明细界面扫码后保存进Excha


CREATE TABLE tenant(-------租户ID
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),---主键,自增长字段
    TenantID VARCHAR(20),----租户ID
    TenantName VARCHAR (50),---租户名称
    tokentime BIGINT
)
insert into tenant(TenantID,TenantName)values('ipace','艾班士')
select*from tenant
-- select*from tenant
-------------------------------------------select*from users---------------

create TABLE USERS(
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),---主键,自增长字段
    TenantID	VARCHAR(20),--------A	20	租户ID
    UserEmail	VARCHAR(50),--------A	50	用户账号	邮件
    UserPswd	VARCHAR(50),---------A	50	用户密码	可以先明文
    LockBill	VARCHAR(50),------A	50	锁单	CK;EXT;
    timetoken VARCHAR(200),--
    phone_no  VARCHAR(20),
    user_name VARCHAR(50)
)
---insert into users(tenantId,userEmail,userPswd,lockbill)values('1','gb123@gb.com','123456','CK;EXT;')
-------------------------------------------------------------------		select*from lockDocu

CREATE TABLE lockDocu(-------租户ID
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),---主键,自增长字段
    Bill_ID VARCHAR(20),----单据别   ck
    Bill_NO VARCHAR (50),---单据号
    Bill_DD	DATETIME,----------@	时间	锁单解锁时间	到年月日小时分钟
    Bill_FT VARCHAR (50),---锁单状态
    Unlock_Reason VARCHAR (50)-----开锁原因
)