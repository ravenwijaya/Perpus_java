-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 15 Jul 2020 pada 17.26
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbperpus`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_admin`
--

CREATE TABLE `tb_admin` (
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_admin`
--

INSERT INTO `tb_admin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_buku`
--

CREATE TABLE `tb_buku` (
  `idbuku` int(200) NOT NULL,
  `judul` varchar(25) NOT NULL,
  `jum` int(25) NOT NULL,
  `penulis` varchar(25) NOT NULL,
  `penerbit` varchar(25) NOT NULL,
  `tahunterbit` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_buku`
--

INSERT INTO `tb_buku` (`idbuku`, `judul`, `jum`, `penulis`, `penerbit`, `tahunterbit`) VALUES
(7, 'aku', 2, 'budi', 'sinar', '2009'),
(8, 'laut', 5, 'budi', 'gramedia', '2004'),
(9, 'laut', 5, 'lisa', 'gramedia', '2005'),
(10, 'lautmalam', 5, 'lisa', 'gramedia', '2005'),
(11, 'malamhari', 5, 'lisa', 'gramedia', '2005'),
(12, 'Jurang', 5, 'calvin', 'gramedia', '2004'),
(13, 'Jembatanku', 3, 'calvin', 'gramedia', '2004'),
(14, 'Jembatanmerah', 3, 'calvin', 'Buku', '2004'),
(15, 'rain', 3, 'bob', 'reins', '2002'),
(16, 'story', 2, 'ben', 'pustaka', '2002'),
(17, 'Hujan', 2, 'Tere Liye', 'Gagasmedia', '2015'),
(18, 'Twitvortiare', 2, 'Ilana Tan', 'Gramedia', '2014'),
(19, '7 Good Habits', 3, 'Sean J. Covey', 'Gagasmedia', '1998'),
(20, 'Winter in Tokyo', 1, 'Ilana Tan', 'Gramedia Pustaka', '2016'),
(21, 'Minimalism', 1, 'Haruka Maryumi', 'BIP', '2002'),
(22, 'How to win friends', 2, 'Adam Isaac', 'Gunung Agung', '2004'),
(23, 'GRIT', 2, 'Anna Landskick', 'Gramedia', '2010'),
(24, 'Bumi', 2, 'Tere Liye', 'BIP', '2017'),
(25, 'Sapporo to Niji', 2, 'Maeda Tomoyuki', 'Gramedia', '2012'),
(26, 'Blink', 1, 'Sean J. Covey', 'Gagas Media', '2012'),
(28, 'Theory of Everything', 3, 'Elon Musk', 'BIP', '2001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_karyawan`
--

CREATE TABLE `tb_karyawan` (
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `idkaryawan` int(200) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `tgllahir` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `nohp` varchar(25) NOT NULL,
  `jeniskel` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_karyawan`
--

INSERT INTO `tb_karyawan` (`username`, `password`, `idkaryawan`, `nama`, `tgllahir`, `alamat`, `nohp`, `jeniskel`) VALUES
('raven', 'raven', 11, 'raven', '25/06/2000', 'abcdefghijklmnop', '1234567891111', 'L'),
('rexy', 'rexy', 12, 'rexy', '16/05/2000', 'jl', '082323', 'P'),
('Santi', 'santi', 13, 'Christanti', 'Supit', 'Jl. Cungkup', '089552233441', 'P'),
('Rena', 'rena', 14, 'Rena', 'Sinaga', 'Jl. Blotongan', '0895335546', 'P'),
('Jajang', 'jajang', 15, 'Jajang', 'Sunandar', 'Jl. Tarutung', '0897765467', 'L'),
('Nadya', 'uksw', 16, 'Nadya', 'Cecilia', 'Jl. Blotongan', '0897788867', 'P'),
('Jessica', 'uksw', 17, 'Jessica', 'Sandra', 'Jl. Cungkup', '0897785321', 'P'),
('Nia', 'uksw', 18, 'Nia', 'Sihombing', 'Jl. Cungkup', '0897785980', 'P'),
('Lisa', 'uksw', 19, 'Lalisa', 'Manoban', 'Jl. Kemiri 2', '0897634627', 'P'),
('Samuel', 'uksw', 20, 'Samuel', 'Martin', 'Jl. Kemiri 1', '08134534627', 'L'),
('Marthin', 'uksw', 21, 'Marthin', 'Wahyu', 'Jl. Kemiri 1', '08134534627', 'L'),
('Januar', 'uksw', 23, 'Januar', 'Jabar', 'Jl. Harimau 1', '0892346382', 'L'),
('Natty', 'uksw', 24, 'Natty', 'Judge', 'Jl. Harimau 1', '0862346382', 'P'),
('Fadil', 'uksw', 25, 'Fadil', 'Jaidi', 'Jl. Diponegoro 1', '0856346382', 'L'),
('Nina', 'uksw', 26, 'Nina', 'Pratiwi', 'Jl. Diponegoro 1', '08934346382', 'P'),
('Rissa', 'uksw', 27, 'Rissa', 'Putri', 'Jl. Jatiasih', '08934346382', 'P'),
('Sandra', 'uksw', 28, 'Sandra', 'Lubis', 'Jl. Sari', '08736457378', 'P'),
('Gracia', 'uksw', 29, 'Gracia', 'Audrey', 'Jl. Kemiri B', '08006457378', 'P'),
('Ferguso', 'uksw', 30, 'Ferguso', 'Sitanggang', 'Jl. Kemiri 1', '08908876344', 'P');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_peminjam`
--

CREATE TABLE `tb_peminjam` (
  `idpeminjam` int(100) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `tgllahir` varchar(25) NOT NULL,
  `alamat` varchar(25) NOT NULL,
  `nohp` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_peminjam`
--

INSERT INTO `tb_peminjam` (`idpeminjam`, `nama`, `tgllahir`, `alamat`, `nohp`) VALUES
(6, 'sara', '24/05/2000', 'JLPatimura 23', '082558111245'),
(7, 'Adi', '24/08/2000', 'JLDipo24', '082454816245'),
(8, 'sera', '17/06/2001', 'jl mangga', '08923432543345'),
(9, 'Rulof Talane', '12/03/2000', 'Jl. Kemiri 1', '0892234127'),
(10, 'Nana', '02/08/2000', 'Jl. Cungkup 1', '089223412732'),
(11, 'Nessie', '20/07/1999', 'Jl. Kemiri 1', '08922389909'),
(12, 'Indah', '16/09/2001', 'Jl. Soekarno', '0812132773342'),
(13, 'Ineke', '16/09/2002', 'Jl. Pahlawan', '081213277213'),
(14, 'Aya', '08/02/2002', 'Jl. Blotongan 1', '081215678213'),
(15, 'Tono', '08/02/1998', 'Jl. Cendrawasih', '08193213456'),
(16, 'Doni', '12/12/1998', 'Jl. Cendrawasih 3', '081932136677'),
(17, 'Jennie', '12/12/1998', 'Jl. Kencana 2', '088882136677'),
(18, 'Lisa', '08/12/1997', 'Jl. Harimau', '08888213321'),
(19, 'Andi', '06/09/1997', 'Jl. Gajah', '0839283048'),
(20, 'Jimmy', '06/08/2000', 'Jl. Cendana', '08902132889'),
(21, 'asd', 'asd', 'asd', 'asd');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_pinjam`
--

CREATE TABLE `tb_pinjam` (
  `idpinjam` int(25) NOT NULL,
  `idpeminjam` int(25) NOT NULL,
  `tglpinjam` varchar(25) NOT NULL,
  `tglkembali` varchar(25) NOT NULL,
  `denda` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_buku`
--
ALTER TABLE `tb_buku`
  ADD PRIMARY KEY (`idbuku`);

--
-- Indeks untuk tabel `tb_karyawan`
--
ALTER TABLE `tb_karyawan`
  ADD PRIMARY KEY (`idkaryawan`);

--
-- Indeks untuk tabel `tb_peminjam`
--
ALTER TABLE `tb_peminjam`
  ADD PRIMARY KEY (`idpeminjam`);

--
-- Indeks untuk tabel `tb_pinjam`
--
ALTER TABLE `tb_pinjam`
  ADD PRIMARY KEY (`idpinjam`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_buku`
--
ALTER TABLE `tb_buku`
  MODIFY `idbuku` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT untuk tabel `tb_karyawan`
--
ALTER TABLE `tb_karyawan`
  MODIFY `idkaryawan` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT untuk tabel `tb_peminjam`
--
ALTER TABLE `tb_peminjam`
  MODIFY `idpeminjam` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT untuk tabel `tb_pinjam`
--
ALTER TABLE `tb_pinjam`
  MODIFY `idpinjam` int(25) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
