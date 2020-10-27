-- phpMyAdmin SQL Dump
-- version 4.9.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Oct 27, 2020 at 02:48 PM
-- Server version: 5.7.26
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `projetFero`
--

-- --------------------------------------------------------

--
-- Table structure for table `Achat`
--

CREATE TABLE `Achat` (
  `id_achat` int(11) NOT NULL,
  `id_personne` int(11) NOT NULL,
  `id_train` int(11) NOT NULL,
  `id_ligne` int(11) NOT NULL,
  `cout` double NOT NULL,
  `villeD` varchar(255) NOT NULL,
  `villeA` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Achat`
--

INSERT INTO `Achat` (`id_achat`, `id_personne`, `id_train`, `id_ligne`, `cout`, `villeD`, `villeA`) VALUES
(1, 1, 1, 1, 67, 'Blois', 'panam'),
(2, 2, 2, 2, -36, 'lyon', 'marseille');

-- --------------------------------------------------------

--
-- Table structure for table `Gare`
--

CREATE TABLE `Gare` (
  `id_gare` int(11) NOT NULL,
  `nom_gare` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Ligne`
--

CREATE TABLE `Ligne` (
  `id_Ligne` int(11) NOT NULL,
  `id_train` int(11) NOT NULL,
  `VilleD` varchar(255) NOT NULL,
  `VilleA` varchar(255) NOT NULL,
  `HeureD` time NOT NULL,
  `HeureA` time NOT NULL,
  `Distance` double NOT NULL,
  `Date` date NOT NULL,
  `Durée` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Personne`
--

CREATE TABLE `Personne` (
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
-- Dumping data for table `Personne`
--

INSERT INTO `Personne` (`id_personne`, `nom`, `prénom`, `mdp`, `email`, `typeAbo`, `admin`, `RecetteMonth`) VALUES
(1, 'Leroy', 'geoffrey', '1234', 'geo@orange.fr', '0', 0, NULL),
(2, 'AA', 'aa', '12345', 'a', '0', 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `RecetteBd`
--

CREATE TABLE `RecetteBd` (
  `id_recette` int(11) NOT NULL,
  `recetteWeek` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `RecetteBd`
--

INSERT INTO `RecetteBd` (`id_recette`, `recetteWeek`) VALUES
(1, 100);

-- --------------------------------------------------------

--
-- Table structure for table `Train`
--

CREATE TABLE `Train` (
  `id_train` int(11) NOT NULL,
  `nom_train` int(11) NOT NULL,
  `nb_placeMax` int(11) NOT NULL,
  `nb_placeDispo` int(11) NOT NULL,
  `kilometrage` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Train`
--

INSERT INTO `Train` (`id_train`, `nom_train`, `nb_placeMax`, `nb_placeDispo`, `kilometrage`) VALUES
(1, 0, 0, 0, 0),
(2, 0, 0, 0, 0),
(3, 0, 0, 0, 0),
(4, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `Wagon`
--

CREATE TABLE `Wagon` (
  `id_wagon` int(11) NOT NULL,
  `nb_place` int(11) NOT NULL,
  `id_train` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Wagon`
--

INSERT INTO `Wagon` (`id_wagon`, `nb_place`, `id_train`) VALUES
(1, 12, 1),
(2, 24, 1),
(3, 26, 1),
(4, 67, 1),
(5, 12, 2),
(6, 7, 2),
(7, 9, 2),
(8, 4, 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Achat`
--
ALTER TABLE `Achat`
  ADD PRIMARY KEY (`id_achat`);

--
-- Indexes for table `Ligne`
--
ALTER TABLE `Ligne`
  ADD PRIMARY KEY (`id_Ligne`);

--
-- Indexes for table `Personne`
--
ALTER TABLE `Personne`
  ADD PRIMARY KEY (`id_personne`);

--
-- Indexes for table `RecetteBd`
--
ALTER TABLE `RecetteBd`
  ADD PRIMARY KEY (`id_recette`);

--
-- Indexes for table `Train`
--
ALTER TABLE `Train`
  ADD PRIMARY KEY (`id_train`);

--
-- Indexes for table `Wagon`
--
ALTER TABLE `Wagon`
  ADD PRIMARY KEY (`id_wagon`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Personne`
--
ALTER TABLE `Personne`
  MODIFY `id_personne` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `Train`
--
ALTER TABLE `Train`
  MODIFY `id_train` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `Wagon`
--
ALTER TABLE `Wagon`
  MODIFY `id_wagon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
