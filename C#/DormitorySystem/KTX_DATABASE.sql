USE [master]
GO
CREATE DATABASE [KTX_THPT]
GO
USE [KTX_THPT]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 4/5/2020 8:32:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL,
	[type] [int] NULL,
 CONSTRAINT [PK_AccountStudent] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Admin]    Script Date: 4/5/2020 8:32:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Admin](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[username] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Admin] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[AvailibleBookingTime]    Script Date: 4/5/2020 8:32:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[AvailibleBookingTime](
	[adID] [int] NOT NULL,
	[from] [date] NOT NULL,
	[to] [date] NOT NULL,
	[bookingPeriod] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Bed]    Script Date: 4/5/2020 8:32:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Bed](
	[roomName] [nchar](10) NOT NULL,
	[bedNo] [int] NOT NULL,
	[status] [int] NOT NULL,
 CONSTRAINT [PK_Bed] PRIMARY KEY CLUSTERED 
(
	[roomName] ASC,
	[bedNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ElectricityWaterBills]    Script Date: 4/5/2020 8:32:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ElectricityWaterBills](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[roomName] [nchar](10) NOT NULL,
	[monthYear] [date] NOT NULL,
	[soDien] [int] NOT NULL,
	[soNuoc] [int] NOT NULL,
	[paid] [int] NULL,
 CONSTRAINT [PK_ElectricityWaterBills] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HistoryBook]    Script Date: 4/5/2020 8:32:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HistoryBook](
	[stuID] [nchar](30) NOT NULL,
	[dateBook] [date] NOT NULL,
	[roomName] [nchar](10) NOT NULL,
	[bedNo] [int] NOT NULL,
	[bookID] [int] IDENTITY(1,1) NOT NULL,
	[status] [int] NULL,
	[dateExpiry] [date] NULL,
 CONSTRAINT [PK__HistoryB__8BE5A12D8567CAC7] PRIMARY KEY CLUSTERED 
(
	[bookID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HistoryPayment]    Script Date: 4/5/2020 8:32:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HistoryPayment](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[stuID] [nchar](30) NOT NULL,
	[datePay] [date] NOT NULL,
	[type] [nvarchar](50) NOT NULL,
	[moneyPay] [int] NOT NULL,
	[roomName] [nchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Manager]    Script Date: 4/5/2020 8:32:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Manager](
	[maID] [nchar](30) NOT NULL,
	[username] [nvarchar](50) NOT NULL,
	[dob] [date] NOT NULL,
	[gender] [int] NOT NULL,
	[mail] [nvarchar](50) NOT NULL,
	[phoneNumber] [nvarchar](50) NOT NULL,
	[name] [nvarchar](50) NULL,
 CONSTRAINT [PK_Manager] PRIMARY KEY CLUSTERED 
(
	[maID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Request]    Script Date: 4/5/2020 8:32:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Request](
	[stuID] [nchar](30) NOT NULL,
	[dateRequest] [nvarchar](50) NULL,
	[requestContent] [nvarchar](200) NOT NULL,
	[maID] [nchar](30) NULL,
	[dateReply] [nvarchar](50) NULL,
	[reply] [nvarchar](200) NULL,
	[requestID] [int] IDENTITY(1,1) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[requestID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Room]    Script Date: 4/5/2020 8:32:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Room](
	[roomName] [nchar](10) NOT NULL,
	[gender] [int] NOT NULL,
	[price] [int] NULL,
 CONSTRAINT [PK_Dom] PRIMARY KEY CLUSTERED 
(
	[roomName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Student]    Script Date: 4/5/2020 8:32:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Student](
	[stuID] [nchar](30) NOT NULL,
	[username] [nvarchar](50) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[dob] [date] NOT NULL,
	[gender] [int] NOT NULL,
	[roomName] [nchar](10) NULL,
	[bedNo] [int] NULL,
	[bookingDate] [date] NULL,
	[moneyAccount] [int] NOT NULL,
	[debt] [int] NOT NULL,
 CONSTRAINT [PK_Student] PRIMARY KEY CLUSTERED 
(
	[stuID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'Admin', N'Admin', 2)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'c', N'c', 1)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'chuc', N'chuc', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'chucnc', N'chucnc', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'chucnche', N'chucnche', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'd', N'd', 1)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'dd', N'dd', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'eeeee', N'eeeee', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'hminh', N'hminh', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'itachi', N'itachi', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'long', N'long', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'Luffy', N'chuc', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'manhminh', N'manhminh', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'minh', N'minh', 1)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'minh1', N'123', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'minh2', N'123', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'minh3', N'123', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'nam', N'nam', 1)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'namak', N'namak', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'sasuke', N'chuc', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'student', N'student', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'tiennam', N'tiennam', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'trung', N'trung', 0)
INSERT [dbo].[Account] ([username], [password], [type]) VALUES (N'wwww', N'wwww', 0)
SET IDENTITY_INSERT [dbo].[Admin] ON 

INSERT [dbo].[Admin] ([id], [username]) VALUES (4, N'Admin')
SET IDENTITY_INSERT [dbo].[Admin] OFF
INSERT [dbo].[AvailibleBookingTime] ([adID], [from], [to], [bookingPeriod]) VALUES (4, CAST(N'2020-04-15' AS Date), CAST(N'2020-04-16' AS Date), NULL)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P101      ', 1, 1)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P101      ', 2, 1)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P101      ', 3, 1)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P101      ', 4, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P101      ', 5, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P101      ', 6, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P101      ', 7, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P101      ', 8, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P102      ', 1, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P102      ', 2, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P102      ', 3, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P102      ', 4, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P102      ', 5, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P102      ', 6, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P102      ', 7, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P102      ', 8, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P103      ', 1, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P103      ', 2, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P103      ', 3, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P103      ', 4, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P103      ', 5, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P103      ', 6, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P103      ', 7, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P103      ', 8, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P104      ', 1, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P104      ', 2, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P104      ', 3, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P104      ', 4, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P104      ', 5, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P104      ', 6, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P104      ', 7, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P104      ', 8, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P105      ', 1, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P105      ', 2, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P105      ', 3, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P105      ', 4, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P105      ', 5, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P105      ', 6, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P105      ', 7, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P105      ', 8, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P106      ', 1, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P106      ', 2, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P106      ', 3, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P106      ', 4, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P106      ', 5, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P106      ', 6, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P106      ', 7, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P106      ', 8, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P107      ', 1, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P107      ', 2, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P107      ', 3, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P107      ', 4, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P107      ', 5, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P107      ', 6, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P107      ', 7, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P107      ', 8, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P108      ', 1, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P108      ', 2, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P108      ', 3, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P108      ', 4, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P108      ', 5, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P108      ', 6, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P108      ', 7, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P108      ', 8, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P109      ', 1, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P109      ', 2, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P109      ', 3, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P109      ', 4, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P109      ', 5, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P109      ', 6, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P109      ', 7, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P109      ', 8, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P110      ', 1, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P110      ', 2, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P110      ', 3, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P110      ', 4, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P110      ', 5, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P110      ', 6, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P110      ', 7, 0)
INSERT [dbo].[Bed] ([roomName], [bedNo], [status]) VALUES (N'P110      ', 8, 0)
SET IDENTITY_INSERT [dbo].[ElectricityWaterBills] ON 

INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (1, N'P101      ', CAST(N'2019-08-31' AS Date), 25, 4, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (2, N'P101      ', CAST(N'2019-11-30' AS Date), 25, 6, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (3, N'P101      ', CAST(N'2020-03-30' AS Date), 25, 6, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (4, N'P102      ', CAST(N'2019-08-31' AS Date), 0, 0, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (5, N'P102      ', CAST(N'2019-09-30' AS Date), 20, 3, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (6, N'P103      ', CAST(N'2019-08-31' AS Date), 0, 0, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (7, N'P104      ', CAST(N'2019-08-31' AS Date), 0, 0, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (8, N'P105      ', CAST(N'2019-08-31' AS Date), 0, 0, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (9, N'P106      ', CAST(N'2019-08-31' AS Date), 0, 0, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (10, N'P107      ', CAST(N'2019-08-31' AS Date), 0, 0, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (11, N'P107      ', CAST(N'2020-03-30' AS Date), 25, 6, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (12, N'P108      ', CAST(N'2019-08-31' AS Date), 0, 0, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (13, N'P109      ', CAST(N'2019-08-31' AS Date), 0, 0, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (14, N'P110      ', CAST(N'2019-08-31' AS Date), 0, 0, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (15, N'P101      ', CAST(N'2020-04-03' AS Date), 3, 3, 1)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (16, N'P102      ', CAST(N'2020-04-03' AS Date), 3, 3, 0)
INSERT [dbo].[ElectricityWaterBills] ([id], [roomName], [monthYear], [soDien], [soNuoc], [paid]) VALUES (17, N'P101      ', CAST(N'2020-04-05' AS Date), 38, 38, 1)
SET IDENTITY_INSERT [dbo].[ElectricityWaterBills] OFF
SET IDENTITY_INSERT [dbo].[HistoryBook] ON 

INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130111                      ', CAST(N'2020-04-03' AS Date), N'P101      ', 1, 1, 2, CAST(N'2020-05-10' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130249                      ', CAST(N'2019-08-01' AS Date), N'P101      ', 2, 2, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2019-11-04' AS Date), N'P101      ', 1, 4, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2019-11-04' AS Date), N'P101      ', 8, 5, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130249                      ', CAST(N'2019-11-04' AS Date), N'P101      ', 4, 6, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130269                      ', CAST(N'2019-01-01' AS Date), N'P101      ', 3, 7, 2, CAST(N'2019-06-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2019-11-04' AS Date), N'P106      ', 1, 8, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130269                      ', CAST(N'2019-11-04' AS Date), N'P101      ', 1, 11, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2019-11-04' AS Date), N'P101      ', 3, 12, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130271                      ', CAST(N'2019-01-01' AS Date), N'P102      ', 1, 13, 2, CAST(N'2019-06-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2019-11-04' AS Date), N'P101      ', 5, 14, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2019-11-04' AS Date), N'P101      ', 2, 15, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2019-11-04' AS Date), N'P101      ', 3, 16, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130111                      ', CAST(N'2019-01-01' AS Date), N'P101      ', 5, 17, 2, CAST(N'2019-06-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130333                      ', CAST(N'2019-11-05' AS Date), N'P101      ', 8, 19, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130555                      ', CAST(N'2019-11-05' AS Date), N'P101      ', 2, 20, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130444                      ', CAST(N'2019-11-05' AS Date), N'P102      ', 2, 21, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130144                      ', CAST(N'2019-11-05' AS Date), N'P102      ', 8, 22, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130229                      ', CAST(N'2019-11-05' AS Date), N'P101      ', 5, 24, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2019-11-06' AS Date), N'P101      ', 6, 25, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2019-11-06' AS Date), N'P101      ', 1, 26, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2019-11-06' AS Date), N'P101      ', 6, 27, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2019-11-06' AS Date), N'P101      ', 1, 28, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130299                      ', CAST(N'2019-11-06' AS Date), N'P101      ', 6, 29, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130111                      ', CAST(N'2019-11-08' AS Date), N'P101      ', 7, 30, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130345                      ', CAST(N'2019-11-10' AS Date), N'P102      ', 1, 31, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130297                      ', CAST(N'2019-11-10' AS Date), N'P102      ', 3, 32, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130234                      ', CAST(N'2019-11-10' AS Date), N'P102      ', 7, 33, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130245                      ', CAST(N'2019-11-10' AS Date), N'P102      ', 6, 34, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130267                      ', CAST(N'2019-11-10' AS Date), N'P103      ', 1, 35, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2019-11-10' AS Date), N'P102      ', 5, 36, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2019-11-10' AS Date), N'P101      ', 1, 37, 2, CAST(N'2020-01-01' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2020-04-03' AS Date), N'P101      ', 1, 38, 0, CAST(N'2020-05-10' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2020-04-04' AS Date), N'P101      ', 2, 39, 0, CAST(N'2020-05-10' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130228                      ', CAST(N'2020-04-04' AS Date), N'P101      ', 2, 40, 2, CAST(N'2020-05-10' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130144                      ', CAST(N'2020-04-04' AS Date), N'P101      ', 4, 41, 0, CAST(N'2020-05-10' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130144                      ', CAST(N'2020-04-05' AS Date), N'P101      ', 3, 42, 0, CAST(N'2020-05-10' AS Date))
INSERT [dbo].[HistoryBook] ([stuID], [dateBook], [roomName], [bedNo], [bookID], [status], [dateExpiry]) VALUES (N'he130003                      ', CAST(N'2020-04-05' AS Date), N'P101      ', 3, 43, 2, CAST(N'2020-05-10' AS Date))
SET IDENTITY_INSERT [dbo].[HistoryBook] OFF
SET IDENTITY_INSERT [dbo].[HistoryPayment] ON 

INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (1, N'he130228                      ', CAST(N'2019-08-01' AS Date), N'tiền phòng', 2250000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (3, N'he130249                      ', CAST(N'2019-08-01' AS Date), N'tiền phòng', 2250000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (4, N'he130228                      ', CAST(N'2019-11-03' AS Date), N'phụ trội', 37000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (10, N'he130249                      ', CAST(N'2019-11-04' AS Date), N'phụ trội', 37000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (11, N'he130269                      ', CAST(N'2019-01-01' AS Date), N'tiền phòng', 2250000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (14, N'he130269                      ', CAST(N'2019-11-04' AS Date), N'tiền phòng', 900000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (15, N'he130271                      ', CAST(N'2019-01-01' AS Date), N'tiền phòng', 2250000, N'P102      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (16, N'he130111                      ', CAST(N'2019-01-01' AS Date), N'tiền phòng', 2250000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (18, N'he130333                      ', CAST(N'2019-11-05' AS Date), N'tiền phòng', 900000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (19, N'he130555                      ', CAST(N'2019-11-05' AS Date), N'tiền phòng', 900000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (20, N'he130444                      ', CAST(N'2019-11-05' AS Date), N'tiền phòng', 900000, N'P102      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (21, N'he130144                      ', CAST(N'2019-11-05' AS Date), N'tiền phòng', 900000, N'P102      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (23, N'he130229                      ', CAST(N'2019-11-05' AS Date), N'tiền phòng', 900000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (24, N'he130228                      ', CAST(N'2019-11-06' AS Date), N'phụ trội', 12000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (25, N'he130299                      ', CAST(N'2019-11-06' AS Date), N'tiền phòng', 900000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (26, N'he130249                      ', CAST(N'2019-11-08' AS Date), N'phụ trội', 12000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (27, N'he130111                      ', CAST(N'2019-11-08' AS Date), N'phụ trội', 12000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (28, N'he130111                      ', CAST(N'2019-11-08' AS Date), N'tiền phòng', 900000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (29, N'he130345                      ', CAST(N'2019-11-10' AS Date), N'tiền phòng', 900000, N'P102      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (30, N'he130297                      ', CAST(N'2019-11-10' AS Date), N'tiền phòng', 900000, N'P102      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (31, N'he130234                      ', CAST(N'2019-11-10' AS Date), N'tiền phòng', 900000, N'P102      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (32, N'he130245                      ', CAST(N'2019-11-10' AS Date), N'tiền phòng', 900000, N'P102      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (33, N'he130267                      ', CAST(N'2019-11-10' AS Date), N'tiền phòng', 900000, N'P103      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (34, N'he130228                      ', CAST(N'2019-11-11' AS Date), N'phụ trội', 12000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (37, N'he130111                      ', CAST(N'2020-04-03' AS Date), N'tiền phòng', 650000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (38, N'he130228                      ', CAST(N'2020-04-04' AS Date), N'tiền phòng', 650000, N'P101      ')
INSERT [dbo].[HistoryPayment] ([id], [stuID], [datePay], [type], [moneyPay], [roomName]) VALUES (39, N'he130003                      ', CAST(N'2020-04-05' AS Date), N'tiền phòng', 650000, N'P101      ')
SET IDENTITY_INSERT [dbo].[HistoryPayment] OFF
INSERT [dbo].[Manager] ([maID], [username], [dob], [gender], [mail], [phoneNumber], [name]) VALUES (N'MR1000                        ', N'c', CAST(N'1980-01-01' AS Date), 0, N'yenptmr1000@gmail.com', N'0944340172', NULL)
SET IDENTITY_INSERT [dbo].[Request] ON 

INSERT [dbo].[Request] ([stuID], [dateRequest], [requestContent], [maID], [dateReply], [reply], [requestID]) VALUES (N'he130228                      ', N'2019-10-28 20:22:55', N'abcxxxxx', N'MR1000                        ', N'2019-11-07 19:18:19', N'oke', 1)
INSERT [dbo].[Request] ([stuID], [dateRequest], [requestContent], [maID], [dateReply], [reply], [requestID]) VALUES (N'he130228                      ', N'2019-10-28 20:23:18', N'abcxxxxx', N'MR1000                        ', N'2019-11-10 18:21:01', N'quản lí kí túc xá đã xác nhận vấn đề của em.ktx sẽ cố gắng giải quyết sớm nhất', 2)
INSERT [dbo].[Request] ([stuID], [dateRequest], [requestContent], [maID], [dateReply], [reply], [requestID]) VALUES (N'he130228                      ', N'4/3/2020 9:56:56 PM', N'rrrrrrrrrrrrrrrrrrrrrrrr', N'MR1000                        ', N'4/3/2020 10:22:53 PM', N'cccccccccccc', 31)
INSERT [dbo].[Request] ([stuID], [dateRequest], [requestContent], [maID], [dateReply], [reply], [requestID]) VALUES (N'he130228                      ', N'4/3/2020 10:02:43 PM', N'fffffffffffffffffffffff', NULL, NULL, NULL, 32)
INSERT [dbo].[Request] ([stuID], [dateRequest], [requestContent], [maID], [dateReply], [reply], [requestID]) VALUES (N'he130228                      ', N'4/3/2020 10:03:41 PM', N'fffffffffffffffffffffffffffff', NULL, NULL, NULL, 33)
INSERT [dbo].[Request] ([stuID], [dateRequest], [requestContent], [maID], [dateReply], [reply], [requestID]) VALUES (N'he130228                      ', N'4/3/2020 10:17:48 PM', N'ccccccccccc', NULL, NULL, NULL, 34)
INSERT [dbo].[Request] ([stuID], [dateRequest], [requestContent], [maID], [dateReply], [reply], [requestID]) VALUES (N'he130228                      ', N'4/4/2020 8:35:53 AM', N'fffff', NULL, NULL, NULL, 35)
INSERT [dbo].[Request] ([stuID], [dateRequest], [requestContent], [maID], [dateReply], [reply], [requestID]) VALUES (N'he130228                      ', N'4/5/2020 5:08:18 PM', N'abc', N'MR1000                        ', N'4/5/2020 5:15:00 PM', N'rply ok', 36)
INSERT [dbo].[Request] ([stuID], [dateRequest], [requestContent], [maID], [dateReply], [reply], [requestID]) VALUES (N'he130003                      ', N'4/5/2020 7:06:18 PM', N'TEST', N'MR1000                        ', N'4/5/2020 7:09:00 PM', N'OK', 37)
SET IDENTITY_INSERT [dbo].[Request] OFF
INSERT [dbo].[Room] ([roomName], [gender], [price]) VALUES (N'P101      ', 1, 650000)
INSERT [dbo].[Room] ([roomName], [gender], [price]) VALUES (N'P102      ', 1, 650000)
INSERT [dbo].[Room] ([roomName], [gender], [price]) VALUES (N'P103      ', 1, 650000)
INSERT [dbo].[Room] ([roomName], [gender], [price]) VALUES (N'P104      ', 1, 650000)
INSERT [dbo].[Room] ([roomName], [gender], [price]) VALUES (N'P105      ', 1, 650000)
INSERT [dbo].[Room] ([roomName], [gender], [price]) VALUES (N'P106      ', 1, 650000)
INSERT [dbo].[Room] ([roomName], [gender], [price]) VALUES (N'P107      ', 1, 650000)
INSERT [dbo].[Room] ([roomName], [gender], [price]) VALUES (N'P108      ', 1, 650000)
INSERT [dbo].[Room] ([roomName], [gender], [price]) VALUES (N'P109      ', 1, 650000)
INSERT [dbo].[Room] ([roomName], [gender], [price]) VALUES (N'P110      ', 1, 650000)
INSERT [dbo].[Room] ([roomName], [gender], [price]) VALUES (N'P111      ', 1, 650000)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130001                      ', N'minh1', N'Chu Minh', CAST(N'1999-06-14' AS Date), 1, N'P101      ', 0, CAST(N'2020-04-05' AS Date), 100000, 0)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130002                      ', N'minh2', N'Chu Minh', CAST(N'2020-04-05' AS Date), 1, N'P101      ', 0, CAST(N'2020-04-05' AS Date), 0, 200000)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130003                      ', N'minh3', N'Chu Nguyen Nhat Minh', CAST(N'1999-06-14' AS Date), 1, N'P101      ', 3, CAST(N'2020-04-05' AS Date), 4350000, 46666)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130111                      ', N'long', N'longcnnnnnnnnnnnn', CAST(N'1999-10-09' AS Date), 1, N'P101      ', 1, CAST(N'2020-04-03' AS Date), 1395000, 127666)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130144                      ', N'eeeee', N'chucnche130228', CAST(N'1999-10-10' AS Date), 1, N'P102      ', 0, CAST(N'2019-11-05' AS Date), 1000000, 0)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130228                      ', N'chuc', N'NguyenCOngChuc', CAST(N'1998-04-10' AS Date), 1, N'P101      ', 2, CAST(N'2020-04-04' AS Date), 1615000, 46666)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130229                      ', N'wwww', N'Monkey D.Dragon', CAST(N'1999-03-10' AS Date), 1, N'P101      ', 0, CAST(N'2019-11-05' AS Date), 2250000, 55000)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130234                      ', N'sasuke', N'MOnkeyDLuffy', CAST(N'1999-03-10' AS Date), 1, N'P102      ', 0, CAST(N'2019-11-10' AS Date), 2250000, 0)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130245                      ', N'itachi', N'Uchiha Itachi', CAST(N'1999-10-10' AS Date), 1, N'P102      ', 0, CAST(N'2019-11-10' AS Date), 0, 0)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130249                      ', N'minh', N'minh', CAST(N'1999-10-12' AS Date), 1, N'P101      ', 0, CAST(N'2019-08-01' AS Date), 1988000, 43000)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130267                      ', N'Luffy', N'Monkey D.Luffy', CAST(N'1999-03-10' AS Date), 1, N'P103      ', 0, CAST(N'2019-11-10' AS Date), 0, 0)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130269                      ', N'nam', N'nam', CAST(N'1999-10-01' AS Date), 1, N'P101      ', 0, CAST(N'2019-11-04' AS Date), 200000, 55000)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130271                      ', N'trung', N'trung', CAST(N'1999-10-19' AS Date), 1, N'P102      ', 0, CAST(N'2019-01-01' AS Date), 0, 0)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130297                      ', N'manhminh', N'uzumaki Naruto', CAST(N'1999-03-10' AS Date), 1, N'P102      ', 0, CAST(N'2019-11-10' AS Date), 0, 0)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130299                      ', N'namak', N'dong tien nam', CAST(N'1999-10-10' AS Date), 1, N'P101      ', 0, CAST(N'2019-11-06' AS Date), 0, 43000)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130333                      ', N'hminh', N'hoangminh', CAST(N'1999-10-10' AS Date), 1, N'P101      ', 0, CAST(N'2019-11-05' AS Date), 0, 55000)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130345                      ', N'student', N'nguyen van A', CAST(N'1999-10-10' AS Date), 1, N'P102      ', 0, CAST(N'2019-11-10' AS Date), 2250000, 0)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130444                      ', N'tiennam', N'namAK', CAST(N'1999-10-10' AS Date), 1, N'P102      ', 0, CAST(N'2019-11-05' AS Date), 0, 0)
INSERT [dbo].[Student] ([stuID], [username], [name], [dob], [gender], [roomName], [bedNo], [bookingDate], [moneyAccount], [debt]) VALUES (N'he130555                      ', N'dd', N'Gold D.Roger', CAST(N'1999-10-10' AS Date), 1, N'P101      ', 0, CAST(N'2019-11-05' AS Date), 0, 55000)
ALTER TABLE [dbo].[Admin]  WITH CHECK ADD  CONSTRAINT [FK_Admin_Account] FOREIGN KEY([username])
REFERENCES [dbo].[Account] ([username])
GO
ALTER TABLE [dbo].[Admin] CHECK CONSTRAINT [FK_Admin_Account]
GO
ALTER TABLE [dbo].[AvailibleBookingTime]  WITH CHECK ADD  CONSTRAINT [FK_AvailibleBookingTime_Admin] FOREIGN KEY([adID])
REFERENCES [dbo].[Admin] ([id])
GO
ALTER TABLE [dbo].[AvailibleBookingTime] CHECK CONSTRAINT [FK_AvailibleBookingTime_Admin]
GO
ALTER TABLE [dbo].[Bed]  WITH CHECK ADD  CONSTRAINT [FK_Bed_Room] FOREIGN KEY([roomName])
REFERENCES [dbo].[Room] ([roomName])
GO
ALTER TABLE [dbo].[Bed] CHECK CONSTRAINT [FK_Bed_Room]
GO
ALTER TABLE [dbo].[ElectricityWaterBills]  WITH CHECK ADD  CONSTRAINT [FK_ElectricityWaterBills_Dom] FOREIGN KEY([roomName])
REFERENCES [dbo].[Room] ([roomName])
GO
ALTER TABLE [dbo].[ElectricityWaterBills] CHECK CONSTRAINT [FK_ElectricityWaterBills_Dom]
GO
ALTER TABLE [dbo].[HistoryBook]  WITH CHECK ADD  CONSTRAINT [FK_HistoryBook_Dom] FOREIGN KEY([roomName])
REFERENCES [dbo].[Room] ([roomName])
GO
ALTER TABLE [dbo].[HistoryBook] CHECK CONSTRAINT [FK_HistoryBook_Dom]
GO
ALTER TABLE [dbo].[HistoryBook]  WITH CHECK ADD  CONSTRAINT [FK_HistoryBook_Student] FOREIGN KEY([stuID])
REFERENCES [dbo].[Student] ([stuID])
GO
ALTER TABLE [dbo].[HistoryBook] CHECK CONSTRAINT [FK_HistoryBook_Student]
GO
ALTER TABLE [dbo].[HistoryPayment]  WITH CHECK ADD  CONSTRAINT [FK_HistoryPayment_Room] FOREIGN KEY([roomName])
REFERENCES [dbo].[Room] ([roomName])
GO
ALTER TABLE [dbo].[HistoryPayment] CHECK CONSTRAINT [FK_HistoryPayment_Room]
GO
ALTER TABLE [dbo].[HistoryPayment]  WITH CHECK ADD  CONSTRAINT [FK_HistoryPayment_Student] FOREIGN KEY([stuID])
REFERENCES [dbo].[Student] ([stuID])
GO
ALTER TABLE [dbo].[HistoryPayment] CHECK CONSTRAINT [FK_HistoryPayment_Student]
GO
ALTER TABLE [dbo].[Manager]  WITH CHECK ADD  CONSTRAINT [FK_Manager_AccountStudent] FOREIGN KEY([username])
REFERENCES [dbo].[Account] ([username])
GO
ALTER TABLE [dbo].[Manager] CHECK CONSTRAINT [FK_Manager_AccountStudent]
GO
ALTER TABLE [dbo].[Request]  WITH CHECK ADD  CONSTRAINT [FK_Request_Student] FOREIGN KEY([stuID])
REFERENCES [dbo].[Student] ([stuID])
GO
ALTER TABLE [dbo].[Request] CHECK CONSTRAINT [FK_Request_Student]
GO
ALTER TABLE [dbo].[Student]  WITH CHECK ADD  CONSTRAINT [FK_Student_AccountStudent] FOREIGN KEY([username])
REFERENCES [dbo].[Account] ([username])
GO
ALTER TABLE [dbo].[Student] CHECK CONSTRAINT [FK_Student_AccountStudent]
GO
ALTER TABLE [dbo].[Student]  WITH CHECK ADD  CONSTRAINT [FK_Student_Dom] FOREIGN KEY([roomName])
REFERENCES [dbo].[Room] ([roomName])
GO
ALTER TABLE [dbo].[Student] CHECK CONSTRAINT [FK_Student_Dom]
GO
