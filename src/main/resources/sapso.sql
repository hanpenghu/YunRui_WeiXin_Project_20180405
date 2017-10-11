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



-- ALTER TABLE tf_pos_z ALTER COLUMN SAPWLM VARCHAR(100)
--
-- ALTER TABLE tf_pos_z ALTER COLUMN CFDM VARCHAR(100)





----创建表tf_pos_z,把sapwlm改成sapwlm1,把cfdm改成cfdm1

USE [DB_BARC]
GO

/****** Object:  Table [dbo].[TF_POS_Z]    Script Date: 2017-10-10 10:17:01 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[TF_POS_Z](
	[OS_ID] [varchar](2) NOT NULL,
	[OS_NO] [varchar](20) NOT NULL,
	[ITM] [int] NOT NULL,
	[BZ] [text] NULL,
	[CFDM1] [varchar](100) NULL,
	[KHHH] [varchar](50) NULL,
	[KHHPMC] [varchar](50) NULL,
	[KHNBDH] [varchar](50) NULL,
	[SAPHH] [varchar](30) NULL,
	[SAPPM] [varchar](40) NULL,
	[XQSL] [numeric](22, 8) NULL,
	[FHRQ] [datetime] NULL,
	[SAPWLM1] [varchar](100) NULL,
	[QDL] [varchar](30) NULL,
	[SAPPH] [varchar](50) NULL,
	[KHDDHM] [varchar](10) NULL,
 CONSTRAINT [PK__TF_POS_Z] PRIMARY KEY CLUSTERED
(
	[OS_ID] ASC,
	[OS_NO] ASC,
	[ITM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO






