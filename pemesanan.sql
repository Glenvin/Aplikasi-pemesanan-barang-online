-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 20, 2021 at 07:23 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 7.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pemesanan`
--

-- --------------------------------------------------------

--
-- Table structure for table `dtbrg`
--

CREATE TABLE `dtbrg` (
  `kode_barang` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `jumlah` int(10) NOT NULL,
  `pembelian` int(10) NOT NULL,
  `penjualan` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dtbrg`
--

INSERT INTO `dtbrg` (`kode_barang`, `nama_barang`, `jenis`, `jumlah`, `pembelian`, `penjualan`) VALUES
('01', 'PS5', 'Cair', 300, 1000000, 1200000),
('112', 'Baygon', 'Cair', 50, 15000, 30000),
('1234', 'Sabun ', 'Padat', 10, 2000, 20000000),
('14045', 'Ayam', 'Padat', 50000, 10, 15),
('7751', 'Coca-Cola', 'Cair', 100, 5, 7),
('9090', 'Mobil-Mobilan', 'Padat', 500, 20000, 25000);

-- --------------------------------------------------------

--
-- Table structure for table `dtpjl`
--

CREATE TABLE `dtpjl` (
  `kode_nota` varchar(50) NOT NULL,
  `kode_barang` varchar(50) NOT NULL,
  `tanggal` varchar(50) NOT NULL,
  `total_bayar` int(10) NOT NULL,
  `bayar` int(10) NOT NULL,
  `jumlah_beli` int(10) NOT NULL,
  `potongan` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dtpjl`
--

INSERT INTO `dtpjl` (`kode_nota`, `kode_barang`, `tanggal`, `total_bayar`, `bayar`, `jumlah_beli`, `potongan`) VALUES
('12344', '90099', 'Oct 9, 2021', 120, 150, 10, 30),
('898989', '1234', 'Nov 5, 2021', -180000000, 2000000, 1, 200000000),
('123', '8898', 'Nov 10, 2021', -180000000, 300000, 1, 200000000),
('123', '1234', 'Nov 5, 2021', 20000000, 300000, 1, 0),
('1234', '123', 'Nov 18, 2021', -160000000, 90000000, 2, 200000000),
('222', '80909', 'Nov 19, 2021', 40000000, 51000000, 2, 0),
('12324', '1111', 'Nov 20, 2021', 18000000, 1000000, 1, 2000000),
('123444', '111234', 'Nov 20, 2021', 18000000, 90000000, 1, 2000000),
('444444', '1234444', 'Nov 5, 2021', 18000000, 3000000, 1, 2000000),
('000000', '989800', 'Nov 20, 2021', 80000000, 60000000, 2, 12000000),
('1234444444', '989800', 'Nov 20, 2021', 80000000, 60000000, 3, 12000000),
('9910', '001', 'Nov 21, 2021', 18000000, 20000000, 1, 2000000),
('8080', '005', 'Nov 20, 2021', 36000000, 40000000, 2, 4000000),
('8080123', '1123', 'Nov 20, 2021', 48000, 50000, 2, 12000);

-- --------------------------------------------------------

--
-- Table structure for table `dtsplr`
--

CREATE TABLE `dtsplr` (
  `kode_supplier` varchar(50) NOT NULL,
  `nama_supplier` varchar(50) NOT NULL,
  `telp` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `tanggal_pengiriman_barang` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dtsplr`
--

INSERT INTO `dtsplr` (`kode_supplier`, `nama_supplier`, `telp`, `alamat`, `tanggal_pengiriman_barang`) VALUES
('123', 'Ipul', '08129199231', 'Jl.senang', 'Nov 18, 2021'),
('1232', 'sepuh', '+61 920312333', 'Jl.UPIN IPIN NO 1', 'Nov 20, 2021'),
('12334', 'KEVIN', '081281817583', 'JL.METRO', 'Oct 2, 2021');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin'),
('bebas123', '123'),
('kevin', '123'),
('kpn', '123'),
('user', '123'),
('user123', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dtbrg`
--
ALTER TABLE `dtbrg`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indexes for table `dtsplr`
--
ALTER TABLE `dtsplr`
  ADD PRIMARY KEY (`kode_supplier`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
