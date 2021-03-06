﻿use master
go
create database QLKHACHSAN1
go
use QLkhachsan1
go

create table chucvu(
MACHUCVU varchar (5) primary key,
TENCHUCVU nvarchar (30),
)
create table khachhang(
MAKHACHHANG varchar(5) primary key,
TENKHACHHANG nvarchar(30),
DIACHI nvarchar(50),
GIOITINH nvarchar(5),
CMND varchar(10),
SDT char(13),
QUOCTICH nvarchar(20),
)
create table loaiphong(
MALOAIPHONG varchar(2) primary key,
TENLOAIPHONG nvarchar(30),
TRANGBI nvarchar(100),
)
create table nhanvien(
MANHANVIEN varchar(5) primary key,
TENNHANVIEN nvarchar(30),
MACHUCVU varchar(5),
GIOITINH nvarchar(3),
NGAYSINH smalldatetime,
DIACHI nvarchar(50),
SDT char(15),
constraint fk_nhanvien_chucvu foreign key(MACHUCVU) references chucvu(MACHUCVU)
)
create table phong(
MAPHONG varchar(6) primary key,
TINHTRANG nvarchar(15),
MALOAIPHONG varchar(2),
GIAPHONGMOTGIO int,
GIAPHONGMOTNGAY int,
GIAPHONGQUADEM int,
DONVI varchar(10),
constraint fk_phong_loaiphong foreign key(MALOAIPHONG) references loaiphong(MALOAIPHONG)
)
create table hoadon(
MAHOADON varchar(5) primary key,
NGAYTHANHTOAN smalldatetime,
SOTIENTHANHTOAN int,
DONVI varchar(5),
MANHANVIEN varchar(5),
constraint fk_hoadon_nhanvien foreign key(MANHANVIEN) references nhanvien(MANHANVIEN)
)
create table phieudangky(
MAPHIEUDANGKY varchar(5) primary key,
MAKHACHHANG varchar(5),
MANHANVIEN varchar(5),
NGAYTHUE smalldatetime,
NGAYDI smalldatetime,
MAPHONG varchar(6),
MAPHIEUDICHVU varchar(5),
constraint fk_phieudangky_khachhang foreign key(MAKHACHHANG) references khachhang(MAKHACHHANG),
constraint fk_phieudangky_nhanvien foreign key(MANHANVIEN) references nhanvien(MANHANVIEN),
constraint fk_phieudangky_phong foreign key(MAPHONG) references phong(MAPHONG)
)
create table phieudichvu(
MAPHIEUDICHVU varchar(5) primary key,
MAPHIEUDANGKY varchar(5),
LOAIDICHVU nvarchar(50),
TENDICHVU nvarchar(50),
GIADICHVU int,
constraint fk_phieudichvu_phieudangky foreign key(MAPHIEUDANGKY) references phieudangky(MAPHIEUDANGKY)
)

--CHUC VU
insert into chucvu values ('QL',N'QUANLY')
insert into chucvu values ('NV',N'NHANVIEN')

-- NHAP DANH SACH NHAN VIEN
insert into nhanvien values ('QL001',N'TRẦN ANH MINH','QL',N'NAM','01/06/1988',N'245 NÚI THÀNH TP.ĐÀ NẴNG','0905476587')
insert into nhanvien values ('NV001',N'PHAN THỊ CÚC','NV',N'NỮ','09/07/1990',N'200 PHAN CHÂU TRINH TP.ĐÀ NẴNG','0123675846')
insert into nhanvien values ('NV002',N'LÊ PHI UẤN','NV',N'NAM','20/2/1989',N'2 NGUYỄN MINH KHAI TP.ĐÀ NẴNG','067264788')
insert into nhanvien values ('NV003',N'HỒ VĂN PHÚ','NV',N'NAM','22/4/1989',N'5 NGUYỄN ĐÌNH THI TP.ĐÀ NẴNG','045876546')
insert into nhanvien values ('NV004',N'NGUYỄN THỊ NHÂN','NV',N'NỮ','10/7/1987',N'35 NGUYỄN HUỆ TP.ĐÀ NẴNG','1348674653')
insert into nhanvien values ('NV005',N'ĐINH CÔNG MẠNH','NV',N'NAM','20/6/1989',N'7 NGUYỄN NHÀN TP.ĐÀ NẴNG','152646122')
insert into nhanvien values ('NV006',N'NGUYỄN THỊ HOA','NV',N'NỮ','09/12/1991',N'62 LÊ NỔ TP.ĐÀ NẴNG','068577473')
insert into nhanvien values ('NV007',N'ĐOÀN PHƯỚC TRUNG','NV',N'NAM','10/10/1986',N'HOÀNG CÁI TP.ĐÀ NẴNG','5828274755')

--HÓA ĐƠN
insert into hoadon values ('HD001','04/04/2014','400000','VND','NV001')
insert into hoadon values ('HD002','07/07/2017','777000','VND','NV002')
insert into hoadon values ('HD003','12/12/2012','120000','VND','QL001')
insert into hoadon values ('HD004','03/03/2013','300000','VND','NV004')
insert into hoadon values ('HD005','05/05/2015','500000','VND','NV005')
insert into hoadon values ('HD006','25/10/2000','600000','VND','NV006')
insert into hoadon values ('HD007','09/09/2009','999000','VND','NV007')

--NHAP DANH SACH LOAI PHONG
insert into loaiphong values ('01','VIP1',N'MÁY LẠNH,TIVI,TỦ ĐỒ,BÀN,TỦ LẠNH,KARAOKE,GIƯỜNG NGỦ')
insert into loaiphong values ('02','VIP2',N'MÁY LẠNH,TIVI,TỦ ĐỒ,BÀN,TỦ LẠNH,KARAOKE,GIƯỜNG NGỦ')
insert into loaiphong values ('03',N'THƯỜNG',N'MÁY LẠNH,TIVI,TỦ ĐỒ,BÀN,TỦ LẠNH,GIƯỜNG NGỦ')
insert into loaiphong values ('04','VIP3',N'MÁY LẠNH,TIVI,TỦ ĐỒ,BÀN,TỦ LẠNH,KARAOKE,GIƯỜNG NGỦ')
insert into loaiphong values ('05',N'THƯỜNG',N'MÁY LẠNH,TIVI,TỦ ĐỒ,BÀN,TỦ LẠNH,GIƯỜNG NGỦ')
insert into loaiphong values ('06',N'THƯỜNG',N'MÁY LẠNH,TIVI,TỦ ĐỒ,BÀN,TỦ LẠNH,GIƯỜNG NGỦ')
insert into loaiphong values ('07',N'THƯỜNG',N'MÁY LẠNH,TIVI,TỦ ĐỒ,BÀN,TỦ LẠNH,GIƯỜNG NGỦ')

--NHAP DANH SACH PHONG
insert into phong values ('SS001',N'TRỐNG','01','150000','400000','300000','VND')
insert into phong values ('SS002',N'ĐÃ ĐẶT','02','150000','400000','300000','VND')
insert into phong values ('BT003',N'ĐANG SỮ DỤNG','03','100000','300000','200000','VND')
insert into phong values ('SS004',N'ĐANG SỮ DỤNG','04','150000','400000','300000','VND')
insert into phong values ('BT005',N'TRỐNG','05','100000','300000','200000','VND')
insert into phong values ('BT006',N'ĐANG SỬ DỤNG','06','100000','300000','200000','VND')
insert into phong values ('BT007',N'ĐÃ ĐẶT','07','100000','300000','200000','VND')

--NHAP DANH SACH KHACH HANG
insert into khachhang values ('KH001',N'TẠ THỊ THANH TÂM',N'THỪA THIÊN HUẾ',N'NỮ','485727573','0913967465',N'VIETNAM')
insert into khachhang values ('KH002',N'NGUYỄN THỊ NHÀN',N'HỘI AN',N'NỮ','786578904','17565564',N'VIETNAM')
insert into khachhang values ('KH003',N'Robert Lewandowski',N'Warszawa',N'NAM','94847265','978857474',N'BA LAN')
insert into khachhang values ('KH004',N'Alexis Sánchez',N'Tocopilla',N'NAM','675627573','255196565',N'CHILE')
insert into khachhang values ('KH005',N'Romelu Lukaku',N'Antwerpen',N'NAM','653637573','654637465',N'BỈ')
insert into khachhang values ('KH006',N'Cristiano Ronaldo',N'Funchal',N'NAM','423472773','0654627457',N'BỒ ĐÀO NHA')
insert into khachhang values ('KH007',N'Lionel Messi',N'Rosario',N'NAM','534532423','7735342435',N'Argentina')

--PHIEU DANG KY
insert into phieudangky values ('PDK01','KH001','NV001','01/01/2011','02/01/2011','SS001','PDV01')
insert into phieudangky values ('PDK02','KH002','NV002','02/11/2010','03/11/2010','SS002','PDV02')
insert into phieudangky values ('PDK03','KH003','NV003','10/04/2012','11/04/2012','BT003','PDV03')
insert into phieudangky values ('PDK04','KH004','NV004','11/02/2013','12/02/2013','SS004','PDV04')
insert into phieudangky values ('PDK05','KH005','NV005','31/04/2011','01/05/2014','BT005','PDV05')
insert into phieudangky values ('PDK06','KH006','NV006','06/06/2015','07/06/2015','BT006','PDV06')
insert into phieudangky values ('PDK07','KH007','QL001','21/07/2016','22/07/2016','BT007','PDV07')

--PHIEU DICH VU
insert into  phieudichvu values ('PDV01','PDK01',N'Massage',N'Massage body','200000')
insert into  phieudichvu values ('PDV02','PDK02',N'giặt ủi',N'giặt ủi khô','100000')
insert into  phieudichvu values ('PDV03','PDK03',N'make up',N'trang điểm khuôn mặt','250000')
insert into  phieudichvu values ('PDV04','PDK04',N'xông hơi',N'xông hơi thảo dược','150000')
insert into  phieudichvu values ('PDV05','PDK05',N'đấm bóp',N'đấm bóp toàn thân','100000')
insert into  phieudichvu values ('PDV06','PDK06',N'đồ ăn',N'cơm sườn','50000')
insert into  phieudichvu values ('PDV07','PDK07',N'giặt ủi',N'giặt ủi nhanh','100000')
insert into  phieudichvu values ('PDV08','PDK08',N'thức uống',N'cafe đen','50000')

