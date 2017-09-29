----//插入自建表before_same_prdNo_merge//这个表是为了记录合并prdNo之前的saphh(sap行号)用的
-----注意同一批合并prdno的uuid绝对相同，时间在不考虑微妙差的时候,同一批合并prdno的时间相同
CREATE TABLE sapso(
 id int IDENTITY (1,1) PRIMARY KEY ,---唯一标识
 timeSameBatch VARCHAR (26) DEFAULT '',---同一批插进来的时候时间要相同
 uuid VARCHAR (70) DEFAULT '',---同一批进来(相同)的唯一标识符
 osNo VARCHAR (120) DEFAULT '',----客户订单号
 ebNo VARCHAR(100)DEFAULT '',----EB单号
 caiGouNo VARCHAR(100)DEFAULT '',---采购单号
 prdNo VARCHAR (100) DEFAULT '',---货号
 saphh VARCHAR (100) DEFAULT '',---sap行号
 sapph VARCHAR(100) DEFAULT '',----sap品号
 sapwlm VARCHAR(100)DEFAULT '',-----sap物料名
 qty NUMERIC(22,8) DEFAULT 0,---数量
 maiTouNo VARCHAR(100)DEFAULT ''---唛头号
)