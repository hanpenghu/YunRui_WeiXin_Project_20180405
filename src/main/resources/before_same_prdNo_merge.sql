----//插入自建表before_same_prdNo_merge//这个表是为了记录合并prdNo之前的saphh(sap行号)用的
-----注意同一批合并prdno的uuid绝对相同，时间在不考虑微妙差的时候,同一批合并prdno的时间相同
CREATE TABLE before_same_prdNo_merge(
 id int IDENTITY (1,1) PRIMARY KEY ,---唯一标识
 timeSameBatch VARCHAR (26) DEFAULT '',---同一批插进来的时候时间要相同
 uuid VARCHAR (70) DEFAULT '',---同一批进来(相同)的唯一标识符
 osNo VARCHAR (120) DEFAULT '',----受订单号
 prdNo VARCHAR (100) DEFAULT '',---货号
 saphh VARCHAR (100) DEFAULT '',---sap行号
 qty NUMERIC(22,8) DEFAULT 0---数量
)