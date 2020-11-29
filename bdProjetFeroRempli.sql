-- phpMyAdmin SQL Dump
-- version 4.9.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Nov 28, 2020 at 10:06 PM
-- Server version: 5.7.26
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `projetFero`
--

-- --------------------------------------------------------

--
-- Table structure for table `achat`
--

CREATE TABLE `achat` (
  `idpersonne` int(11) NOT NULL,
  `idligne` int(11) NOT NULL,
  `prix_ticket` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `gare`
--

CREATE TABLE `gare` (
  `idgare` int(11) NOT NULL,
  `nom_gare` varchar(50) NOT NULL,
  `ville` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `gare`
--

INSERT INTO `gare` (`idgare`, `nom_gare`, `ville`) VALUES
(1, 'Blois Nord', 'Blois'),
(2, 'Paris Nord', 'Paris'),
(3, 'Colomiers Sud', 'Colomiers'),
(4, 'Châteauroux Nord', 'Châteauroux'),
(5, 'Sète Nord', 'Sète'),
(6, 'Colomiers Nord', 'Colomiers'),
(7, 'Marcq-en-Baroeul Sud', 'Marcq-en-Baroeul'),
(8, 'Montreuil Sud', 'Montreuil'),
(9, 'Dunkerque Nord', 'Dunkerque'),
(10, 'Le Puy-en-Velay Nord', 'Le Puy-en-Velay'),
(11, 'Joué-lès-Tours Sud', 'Joué-lès-Tours'),
(12, 'Chartres Nord', 'Chartres'),
(13, '', 'Aulnay-sous-Bois'),
(14, '', 'Saint-Médard-en-Jalles'),
(15, '', 'Laval'),
(16, '', 'Belfort'),
(17, '', 'Cholet'),
(18, '', 'Drancy'),
(19, '', 'Châlons-en-Champagne'),
(20, '', 'Béziers'),
(21, '', 'Amiens'),
(22, '', 'Valenciennes'),
(23, '', 'Perpignan'),
(24, '', 'Colomiers'),
(25, '', 'Champigny-sur-Marne'),
(26, '', 'Lille'),
(27, '', 'Roubaix'),
(28, '', 'Istres'),
(29, '', 'Istres'),
(30, '', 'Chartres'),
(31, '', 'Talence'),
(32, '', 'Vichy'),
(33, '', 'Arras'),
(34, '', 'Nevers'),
(35, '', 'Poitiers'),
(36, '', 'Aubagne'),
(37, '', 'La Roche-sur-Yon'),
(38, '', 'Marseille'),
(39, '', 'Lanester'),
(40, '', 'Troyes'),
(41, '', 'Saint-Malo'),
(42, '', 'Boulogne-Billancourt'),
(43, '', 'Albi'),
(44, '', 'Sarreguemines'),
(45, '', 'Angoulême'),
(46, '', 'Nantes'),
(47, '', 'Saint-Maur-des-Fossés'),
(48, '', 'Wattrelos'),
(49, '', 'Vitry-sur-Seine'),
(50, '', 'Perpignan'),
(51, '', 'Saint-Louis'),
(52, '', 'Hénin-Beaumont'),
(53, '', 'Colombes'),
(54, '', 'Versailles'),
(55, '', 'Rouen'),
(56, '', 'Douai'),
(57, '', 'Tourcoing'),
(58, '', 'Alençon'),
(59, '', 'Rennes'),
(60, '', 'Vierzon'),
(61, '', 'Montpellier'),
(62, '', 'Drancy'),
(63, '', 'Argenteuil'),
(64, '', 'Rezé'),
(65, '', 'Aulnay-sous-Bois'),
(66, '', 'La Seyne-sur-Mer'),
(67, '', 'Ajaccio'),
(68, '', 'Montigny-lès-Metz'),
(69, '', 'Brest'),
(70, '', 'Caen'),
(71, '', 'Toulon'),
(72, '', 'La Rochelle'),
(73, '', 'Cagnes-sur-Mer'),
(74, '', 'Hyères'),
(75, '', 'Montluçon'),
(76, '', 'Lorient'),
(77, '', 'Lille'),
(78, '', 'Narbonne'),
(79, '', 'Orléans'),
(80, '', 'Reims'),
(81, '', 'Béziers'),
(82, '', 'Tourcoing'),
(83, '', 'Sète'),
(84, '', 'Vertou'),
(85, '', 'Boulogne-Billancourt'),
(86, '', 'Maubeuge'),
(87, '', 'Hénin-Beaumont'),
(88, '', 'Montigny-lès-Metz'),
(89, '', 'La Seyne-sur-Mer'),
(90, '', 'Perpignan'),
(91, '', 'Saint-Denis'),
(92, '', 'Saint-Denis'),
(93, '', 'Grasse'),
(94, '', 'Forbach'),
(95, '', 'Narbonne'),
(96, '', 'Saint-Étienne-du-Rouvray'),
(97, '', 'Le Cannet'),
(98, '', 'Argenteuil'),
(99, '', 'Bergerac'),
(100, '', 'Saint-Denis'),
(101, '', 'Thionville'),
(102, '', 'Perpignan');

-- --------------------------------------------------------

--
-- Table structure for table `gare_ligne`
--

CREATE TABLE `gare_ligne` (
  `idgare` int(11) NOT NULL,
  `idligne` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `ligne`
--

CREATE TABLE `ligne` (
  `idligne` int(11) NOT NULL,
  `nom_ligne` varchar(50) NOT NULL,
  `gare_dep` int(11) NOT NULL,
  `gare_arr` int(11) NOT NULL,
  `distance` int(11) DEFAULT NULL,
  `date_dep` datetime NOT NULL,
  `datet_arriv` datetime NOT NULL,
  `place_Dispo` int(11) NOT NULL,
  `prix_billet` double NOT NULL,
  `place_vendu` int(11) NOT NULL,
  `idtrain` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ligne`
--

INSERT INTO `ligne` (`idligne`, `nom_ligne`, `gare_dep`, `gare_arr`, `distance`, `date_dep`, `datet_arriv`, `place_Dispo`, `prix_billet`, `place_vendu`, `idtrain`) VALUES
(1, 'Blois1', 1, 2, NULL, '2020-11-27 21:30:53', '2020-11-28 21:30:53', 28, 87, 12, 1),
(2, 'tellus.', 5, 27, NULL, '2021-01-23 18:22:03', '2021-02-10 16:06:59', 18, 71, 25, 33),
(3, 'eu', 39, 25, NULL, '2021-05-03 23:16:57', '2021-03-17 08:58:00', 13, 48, 5, 19),
(4, 'enim', 16, 13, NULL, '2020-12-15 20:51:15', '2021-04-24 01:51:57', 17, 35, 34, 45),
(5, 'tempus', 29, 44, NULL, '2021-02-11 18:51:19', '2021-04-26 07:13:11', 21, 80, 32, 44),
(6, 'magna', 53, 5, NULL, '2021-03-23 10:25:28', '2021-03-05 15:27:57', 29, 41, 12, 2),
(7, 'Mauris', 17, 45, NULL, '2021-03-01 01:01:43', '2021-04-26 13:46:40', 0, 50, 20, 40),
(8, 'parturient', 19, 10, NULL, '2020-12-20 17:33:59', '2020-11-30 13:32:44', 24, 47, 33, 44),
(9, 'lectus.', 6, 29, NULL, '2021-01-03 19:41:28', '2021-04-28 08:08:53', 22, 54, 33, 9),
(10, 'lobortis.', 15, 5, NULL, '2021-03-19 15:11:47', '2021-04-16 05:17:09', 5, 94, 38, 46),
(11, 'bibendum', 63, 54, NULL, '2021-05-06 13:59:49', '2021-02-20 22:06:43', 10, 73, 3, 39),
(12, 'et', 65, 11, NULL, '2021-04-24 22:35:33', '2021-03-02 22:20:02', 13, 96, 20, 3),
(13, 'nec', 13, 59, NULL, '2021-04-12 15:40:10', '2021-03-11 13:47:23', 29, 68, 31, 31),
(14, 'vitae', 7, 45, NULL, '2021-03-24 10:12:43', '2021-03-23 13:20:38', 4, 109, 22, 49),
(15, 'a', 60, 66, NULL, '2021-01-14 15:32:07', '2021-04-22 23:53:44', 23, 79, 10, 20),
(16, 'ut', 20, 67, NULL, '2021-02-20 10:12:40', '2021-04-11 21:29:28', 23, 49, 27, 19),
(17, 'elit', 19, 33, NULL, '2021-04-09 23:27:28', '2021-02-27 13:31:58', 8, 106, 26, 10),
(18, 'auctor,', 57, 15, NULL, '2020-12-05 06:14:38', '2021-04-14 16:54:43', 32, 116, 1, 28),
(19, 'ullamcorper.', 3, 31, NULL, '2021-04-26 03:52:16', '2021-05-14 16:23:43', 0, 62, 8, 48),
(20, 'magna', 22, 8, NULL, '2021-02-14 11:51:00', '2021-04-08 03:29:31', 12, 114, 16, 2),
(21, 'vel,', 20, 3, NULL, '2020-12-28 19:54:03', '2021-05-07 04:56:33', 30, 109, 19, 14),
(22, 'conubia', 52, 57, NULL, '2021-03-05 20:28:14', '2020-11-30 03:46:51', 17, 68, 24, 30),
(23, 'id', 37, 16, NULL, '2020-12-30 03:42:22', '2021-01-30 08:56:18', 36, 117, 37, 43),
(24, 'at,', 10, 6, NULL, '2021-02-11 20:33:14', '2021-03-15 16:18:15', 1, 117, 34, 43),
(25, 'adipiscing', 17, 5, NULL, '2020-12-10 10:33:59', '2021-04-23 03:31:06', 15, 87, 0, 44),
(26, 'at,', 27, 37, NULL, '2021-03-23 00:19:10', '2021-05-12 06:51:22', 23, 101, 29, 7),
(27, 'lacus.', 9, 56, NULL, '2020-12-02 15:08:41', '2020-12-11 20:36:16', 37, 116, 30, 26),
(28, 'in', 13, 41, NULL, '2021-04-11 12:29:50', '2021-04-06 09:52:15', 17, 67, 39, 10),
(29, 'ipsum.', 30, 21, NULL, '2020-12-07 16:50:25', '2021-01-28 17:32:18', 29, 71, 27, 7),
(30, 'Morbi', 26, 36, NULL, '2021-02-14 14:55:05', '2021-02-21 00:58:37', 24, 29, 28, 38),
(31, 'accumsan', 4, 2, NULL, '2021-02-28 12:21:34', '2021-04-08 18:55:18', 40, 102, 36, 20),
(32, 'magnis', 59, 50, NULL, '2020-12-13 11:59:14', '2021-02-19 15:31:04', 8, 18, 1, 40),
(33, 'Vivamus', 46, 1, NULL, '2021-01-16 15:21:40', '2020-12-25 15:26:27', 38, 59, 13, 2),
(34, 'quam', 43, 12, NULL, '2021-03-18 02:54:12', '2020-12-04 11:12:52', 35, 56, 30, 13),
(35, 'urna.', 3, 6, NULL, '2021-01-25 04:03:53', '2020-12-28 14:33:28', 27, 100, 6, 46),
(36, 'id', 40, 66, NULL, '2021-02-09 01:20:56', '2021-02-17 22:49:28', 15, 27, 1, 19),
(37, 'Mauris', 70, 42, NULL, '2021-04-01 04:35:39', '2021-03-12 12:08:07', 29, 15, 24, 49),
(38, 'vel', 22, 62, NULL, '2021-03-10 11:23:10', '2021-04-02 01:17:39', 19, 15, 32, 21),
(39, 'et,', 69, 1, NULL, '2021-03-18 01:41:38', '2021-03-08 16:11:10', 35, 71, 27, 50),
(40, 'diam.', 39, 47, NULL, '2020-12-23 16:17:56', '2021-03-06 21:00:33', 30, 92, 31, 19),
(41, 'justo.', 10, 25, NULL, '2021-05-09 04:01:11', '2021-03-09 06:45:18', 26, 75, 29, 25),
(42, 'Morbi', 22, 9, NULL, '2021-03-21 18:03:02', '2020-12-04 02:20:56', 40, 108, 38, 31),
(43, 'tincidunt', 12, 68, NULL, '2021-03-03 01:16:54', '2020-12-21 17:26:05', 18, 44, 23, 17),
(44, 'Integer', 20, 33, NULL, '2021-01-14 17:27:53', '2021-01-04 08:12:34', 21, 22, 33, 20),
(45, 'a,', 47, 21, NULL, '2021-02-15 13:28:44', '2021-02-20 21:39:35', 17, 79, 12, 26),
(46, 'natoque', 42, 50, NULL, '2021-03-09 10:05:15', '2020-12-25 12:22:03', 18, 71, 32, 2),
(47, 'lectus', 15, 20, NULL, '2021-04-02 16:13:03', '2020-12-03 11:21:22', 31, 34, 11, 4),
(48, 'ornare,', 32, 38, NULL, '2021-01-21 02:42:17', '2021-02-23 17:32:25', 30, 67, 12, 3),
(49, 'id', 29, 49, NULL, '2021-01-31 11:39:14', '2021-03-10 23:24:38', 7, 61, 11, 18),
(50, 'vel', 55, 2, NULL, '2021-01-19 21:46:53', '2021-02-04 06:31:56', 29, 23, 25, 41),
(51, 'condimentum', 54, 69, NULL, '2021-04-29 21:58:43', '2021-04-24 16:21:47', 8, 58, 6, 23),
(52, 'odio', 34, 18, NULL, '2021-03-24 20:00:08', '2020-12-23 02:28:00', 8, 117, 1, 12),
(53, 'ipsum', 18, 37, NULL, '2021-04-23 11:08:12', '2021-05-01 04:48:08', 40, 101, 8, 44),
(54, 'pede.', 24, 26, NULL, '2021-04-28 10:15:48', '2021-04-26 09:21:28', 17, 19, 10, 28),
(55, 'Etiam', 11, 3, NULL, '2021-03-31 21:36:10', '2020-12-29 05:10:56', 39, 107, 34, 21),
(56, 'Maecenas', 8, 1, NULL, '2021-01-01 23:30:29', '2021-01-25 20:11:25', 7, 82, 16, 6),
(57, 'Quisque', 10, 15, NULL, '2021-04-24 21:29:05', '2021-03-19 21:24:01', 17, 27, 20, 45),
(58, 'accumsan', 4, 21, NULL, '2021-02-21 20:34:26', '2021-03-03 17:40:14', 35, 82, 1, 14),
(59, 'Duis', 2, 4, NULL, '2021-03-10 18:22:12', '2021-04-16 21:49:36', 37, 74, 13, 20),
(60, 'vel', 38, 63, NULL, '2021-02-05 02:39:49', '2021-02-22 10:30:14', 8, 97, 18, 20),
(61, 'quis', 50, 17, NULL, '2021-02-03 21:56:55', '2021-01-23 00:42:36', 32, 65, 9, 35),
(62, 'felis', 1, 51, NULL, '2020-12-22 22:35:26', '2021-04-20 08:12:12', 38, 67, 25, 42),
(63, 'Sed', 26, 67, NULL, '2021-02-08 11:44:30', '2021-05-09 02:01:32', 18, 83, 30, 8),
(64, 'purus.', 65, 46, NULL, '2021-02-16 04:01:09', '2021-01-30 00:33:58', 16, 93, 12, 37),
(65, 'non', 43, 42, NULL, '2021-01-25 09:16:21', '2021-04-26 05:53:58', 40, 77, 8, 40),
(66, 'dolor', 15, 16, NULL, '2020-12-21 16:07:25', '2020-12-04 17:39:06', 5, 101, 14, 32),
(67, 'Duis', 70, 42, NULL, '2020-12-16 06:14:51', '2021-02-04 07:37:01', 39, 87, 33, 33),
(68, 'a,', 35, 2, NULL, '2020-12-07 14:15:04', '2021-03-23 09:53:10', 14, 86, 31, 28),
(69, 'non', 67, 63, NULL, '2021-01-11 14:34:58', '2020-11-28 11:41:17', 37, 44, 25, 25),
(70, 'Donec', 37, 30, NULL, '2021-01-16 08:33:25', '2020-12-28 09:22:02', 23, 24, 31, 15),
(71, 'dapibus', 50, 60, NULL, '2020-12-01 18:50:03', '2021-01-17 09:07:26', 26, 115, 0, 3),
(72, 'leo.', 19, 29, NULL, '2021-04-02 03:38:00', '2021-03-14 18:11:36', 39, 51, 22, 5),
(73, 'tellus', 41, 61, NULL, '2020-11-28 18:24:41', '2021-01-19 20:54:24', 20, 35, 31, 29),
(74, 'mauris', 62, 29, NULL, '2020-12-23 00:42:03', '2021-03-25 19:19:46', 30, 114, 29, 45),
(75, 'mauris', 19, 55, NULL, '2020-12-30 01:00:30', '2021-02-20 17:13:43', 13, 55, 16, 24),
(76, 'sagittis.', 57, 27, NULL, '2021-03-26 07:03:26', '2021-03-18 20:53:42', 17, 95, 19, 48),
(77, 'sem', 29, 2, NULL, '2020-12-18 22:58:59', '2021-03-29 03:19:49', 34, 29, 32, 19),
(78, 'per', 40, 64, NULL, '2021-04-04 03:55:06', '2021-05-12 11:34:15', 18, 60, 20, 15),
(79, 'libero.', 29, 21, NULL, '2021-04-08 09:38:23', '2021-01-27 03:33:05', 27, 19, 0, 2),
(80, 'eget', 16, 17, NULL, '2021-04-25 13:17:11', '2020-12-19 17:33:26', 39, 52, 31, 7),
(81, 'amet,', 58, 39, NULL, '2021-03-18 09:03:24', '2021-02-22 02:44:28', 9, 59, 24, 34),
(82, 'sit', 31, 2, NULL, '2021-01-17 08:18:12', '2020-12-19 21:57:56', 2, 111, 4, 42),
(83, 'ornare,', 23, 67, NULL, '2021-04-19 00:39:11', '2021-01-06 07:15:43', 8, 40, 29, 28),
(84, 'morbi', 22, 41, NULL, '2020-12-18 15:17:08', '2021-04-09 20:26:41', 14, 74, 21, 28),
(85, 'at,', 68, 43, NULL, '2021-04-28 14:27:38', '2021-04-29 01:14:44', 2, 99, 33, 46),
(86, 'Sed', 56, 62, NULL, '2021-01-20 10:03:04', '2020-12-10 10:52:11', 12, 96, 25, 28),
(87, 'vehicula.', 69, 42, NULL, '2020-12-30 23:02:26', '2021-03-12 16:55:59', 2, 52, 22, 37),
(88, 'ornare,', 69, 18, NULL, '2021-03-09 03:28:12', '2021-02-08 21:32:48', 25, 31, 34, 45),
(89, 'Aliquam', 21, 24, NULL, '2021-01-27 10:13:48', '2021-03-25 04:14:18', 16, 62, 31, 25),
(90, 'ullamcorper', 13, 60, NULL, '2021-02-21 09:16:00', '2021-02-13 21:44:42', 3, 56, 17, 32),
(91, 'lacus.', 68, 68, NULL, '2020-12-01 05:31:38', '2021-03-14 19:10:48', 7, 37, 4, 33),
(92, 'at', 59, 69, NULL, '2020-12-20 03:05:37', '2021-03-12 01:24:16', 7, 46, 19, 48),
(93, 'condimentum.', 14, 12, NULL, '2021-03-10 12:41:09', '2021-05-06 03:15:54', 17, 84, 26, 9),
(94, 'felis', 4, 19, NULL, '2021-02-27 12:57:37', '2021-01-25 08:02:12', 3, 50, 5, 45),
(95, 'et,', 42, 55, NULL, '2021-04-25 00:19:35', '2021-04-27 06:37:52', 31, 116, 21, 46),
(96, 'sapien', 56, 54, NULL, '2021-04-02 04:56:38', '2021-04-23 09:13:51', 14, 21, 14, 10),
(97, 'ipsum', 32, 33, NULL, '2021-04-28 12:08:23', '2020-12-30 22:12:42', 1, 50, 27, 33),
(98, 'magna', 48, 5, NULL, '2021-01-03 08:57:08', '2021-01-15 22:23:03', 34, 120, 24, 5),
(99, 'arcu', 20, 4, NULL, '2020-12-06 04:52:38', '2020-12-02 02:18:16', 25, 72, 1, 4),
(100, 'libero', 48, 6, NULL, '2021-04-19 08:54:42', '2021-04-23 17:38:15', 13, 80, 12, 46),
(101, 'sociosqu', 48, 66, NULL, '2021-01-04 11:48:04', '2021-05-13 19:31:46', 24, 110, 27, 22);

-- --------------------------------------------------------

--
-- Table structure for table `Personne2`
--

CREATE TABLE `Personne2` (
  `id_personne` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prénom` varchar(255) NOT NULL,
  `mdp` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `typeAbo` varchar(25) DEFAULT NULL,
  `admin` tinyint(1) DEFAULT NULL,
  `RecetteMonth` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Personne2`
--

INSERT INTO `Personne2` (`id_personne`, `nom`, `prénom`, `mdp`, `email`, `typeAbo`, `admin`, `RecetteMonth`) VALUES
(1, 'Leroy', 'geoffrey', '1234', 'geo@orange.fr', '0', 0, NULL),
(2, 'AA', 'aa', '12345', 'a', '0', 1, NULL),
(39, 'Bang', 'Niro', 'aaaaaaaaaaa', 'niro@orange.fr', NULL, NULL, NULL),
(45, 'admin1', 'adminS', 'admin', 'admin@orange.fr', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `train`
--

CREATE TABLE `train` (
  `idtrain` int(11) NOT NULL,
  `nom_train` varchar(50) NOT NULL,
  `cout_annuel` int(11) NOT NULL,
  `total_place` int(11) NOT NULL,
  `kilometrage` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `train`
--

INSERT INTO `train` (`idtrain`, `nom_train`, `cout_annuel`, `total_place`, `kilometrage`) VALUES
(1, 'Blo1', 12000, 28, 80000),
(2, 'libero.', 16904, 66, 335486),
(3, 'amet', 14952, 83, 496577),
(4, 'eget,', 17779, 74, 283397),
(5, 'nibh', 10069, 57, 535954),
(6, 'egestas.', 11999, 69, 464849),
(7, 'sit', 19620, 52, 544405),
(8, 'mi', 16138, 58, 404399),
(9, 'ut', 15057, 61, 103626),
(10, 'sapien,', 19430, 59, 332461),
(11, 'Duis', 18340, 76, 102021),
(12, 'risus.', 15580, 79, 493845),
(13, 'mauris', 17203, 62, 256978),
(14, 'Ut', 11911, 60, 175632),
(15, 'adipiscing', 10519, 65, 440227),
(16, 'Fusce', 12958, 51, 34424),
(17, 'elit,', 17222, 50, 446593),
(18, 'dis', 15559, 82, 46208),
(19, 'fringilla', 18315, 89, 436381),
(20, 'dolor.', 17935, 76, 440536),
(21, 'Phasellus', 10494, 53, 36170),
(22, 'nunc', 19346, 90, 458484),
(23, 'elit,', 14032, 56, 233173),
(24, 'auctor', 13331, 63, 444015),
(25, 'ut,', 19851, 58, 597936),
(26, 'sodales', 10374, 85, 571056),
(27, 'sit', 16728, 52, 298371),
(28, 'Nunc', 16482, 62, 93127),
(29, 'pede.', 18827, 60, 22398),
(30, 'Quisque', 14795, 59, 85626),
(31, 'Nunc', 18611, 85, 174004),
(32, 'amet,', 16621, 86, 460242),
(33, 'erat', 16315, 88, 452780),
(34, 'Morbi', 17590, 79, 110794),
(35, 'Etiam', 19482, 81, 414240),
(36, 'nisi', 11742, 68, 72419),
(37, 'nisl.', 17341, 75, 531366),
(38, 'Ut', 19828, 65, 555207),
(39, 'Ut', 14189, 55, 111570),
(40, 'Donec', 14220, 73, 487695),
(41, 'in,', 10608, 52, 575587),
(42, 'senectus', 13362, 67, 247798),
(43, 'eros.', 13143, 73, 93784),
(44, 'turpis', 17064, 65, 550421),
(45, 'Nunc', 11803, 50, 455338),
(46, 'interdum', 10644, 71, 455068),
(47, 'per', 18997, 62, 339463),
(48, 'faucibus.', 14488, 74, 16255),
(49, 'libero', 13199, 78, 397645),
(50, 'non,', 16796, 79, 66652),
(51, 'eu,', 18384, 57, 248077),
(52, 'enim', 11994, 85, 254715),
(53, 'nonummy', 11660, 77, 207617),
(54, 'pede.', 15718, 66, 288703),
(55, 'convallis', 10491, 90, 380902),
(56, 'nec', 18904, 81, 434076),
(57, 'nibh', 16438, 64, 67059),
(58, 'sit', 13179, 71, 316109),
(59, 'justo.', 14720, 57, 136701),
(60, 'et,', 15072, 78, 388044),
(61, 'condimentum.', 11788, 78, 590658),
(62, 'a', 15669, 80, 455288),
(63, 'purus,', 13502, 65, 360046),
(64, 'Pellentesque', 11503, 87, 206506),
(65, 'nulla', 16693, 53, 241862),
(66, 'Mauris', 10789, 85, 143340),
(67, 'eu', 17596, 61, 503533),
(68, 'fringilla', 12365, 90, 481380),
(69, 'mauris', 18444, 74, 13795),
(70, 'quam', 11491, 88, 492117),
(71, 'Sed', 11321, 55, 361929),
(72, 'mauris', 10141, 75, 142356),
(73, 'bibendum', 13357, 51, 312498),
(74, 'non,', 11482, 80, 135265),
(75, 'viverra.', 12927, 51, 388903),
(76, 'vehicula', 13579, 76, 322615),
(77, 'Nullam', 12404, 85, 133102),
(78, 'rhoncus.', 14360, 76, 306110),
(79, 'nisl.', 15606, 60, 232469),
(80, 'elit', 13840, 50, 567689),
(81, 'mollis', 13909, 63, 347365),
(82, 'justo', 17104, 70, 111574),
(83, 'Donec', 16406, 74, 524835),
(84, 'Sed', 15064, 65, 408406),
(85, 'Cras', 16035, 79, 275941),
(86, 'senectus', 11404, 70, 377427),
(87, 'auctor,', 17819, 74, 318579),
(88, 'non,', 19026, 69, 433836),
(89, 'consequat', 10484, 66, 115606),
(90, 'gravida', 19899, 50, 558043),
(91, 'eu', 12781, 85, 45327),
(92, 'luctus.', 14422, 52, 172824),
(93, 'Fusce', 17663, 85, 62305),
(94, 'Cras', 16592, 81, 305140),
(95, 'ligula.', 14038, 73, 427552),
(96, 'fames', 15635, 53, 193291),
(97, 'aliquet', 18996, 86, 333981),
(98, 'in,', 12036, 82, 518446),
(99, 'morbi', 14277, 76, 139080),
(100, 'dictum', 19767, 58, 247696);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `achat`
--
ALTER TABLE `achat`
  ADD PRIMARY KEY (`idpersonne`,`idligne`),
  ADD KEY `achat_ligne0_FK` (`idligne`);

--
-- Indexes for table `gare`
--
ALTER TABLE `gare`
  ADD PRIMARY KEY (`idgare`);

--
-- Indexes for table `gare_ligne`
--
ALTER TABLE `gare_ligne`
  ADD PRIMARY KEY (`idgare`,`idligne`),
  ADD KEY `gare_ligne_ligne0_FK` (`idligne`);

--
-- Indexes for table `ligne`
--
ALTER TABLE `ligne`
  ADD PRIMARY KEY (`idligne`),
  ADD KEY `ligne_train_FK` (`idtrain`);

--
-- Indexes for table `Personne2`
--
ALTER TABLE `Personne2`
  ADD PRIMARY KEY (`id_personne`);

--
-- Indexes for table `train`
--
ALTER TABLE `train`
  ADD PRIMARY KEY (`idtrain`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gare`
--
ALTER TABLE `gare`
  MODIFY `idgare` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;

--
-- AUTO_INCREMENT for table `ligne`
--
ALTER TABLE `ligne`
  MODIFY `idligne` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT for table `Personne2`
--
ALTER TABLE `Personne2`
  MODIFY `id_personne` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT for table `train`
--
ALTER TABLE `train`
  MODIFY `idtrain` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `achat`
--
ALTER TABLE `achat`
  ADD CONSTRAINT `achat_ligne0_FK` FOREIGN KEY (`idligne`) REFERENCES `ligne` (`idligne`),
  ADD CONSTRAINT `achat_personne_FK` FOREIGN KEY (`idpersonne`) REFERENCES `personne` (`idpersonne`);

--
-- Constraints for table `gare_ligne`
--
ALTER TABLE `gare_ligne`
  ADD CONSTRAINT `gare_ligne_gare_FK` FOREIGN KEY (`idgare`) REFERENCES `gare` (`idgare`),
  ADD CONSTRAINT `gare_ligne_ligne0_FK` FOREIGN KEY (`idligne`) REFERENCES `ligne` (`idligne`);

--
-- Constraints for table `ligne`
--
ALTER TABLE `ligne`
  ADD CONSTRAINT `ligne_train_FK` FOREIGN KEY (`idtrain`) REFERENCES `train` (`idtrain`);
