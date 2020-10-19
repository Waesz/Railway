-- phpMyAdmin SQL Dump
-- version 4.9.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Oct 19, 2020 at 04:27 PM
-- Server version: 5.7.26
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `projetFero`
--

-- --------------------------------------------------------

--
-- Table structure for table `Personne`
--

CREATE TABLE `Personne` (
  `id_personne` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prénom` varchar(255) DEFAULT NULL,
  `mdp` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `typeAbo` int(11) DEFAULT '0',
  `admin` tinyint(1) DEFAULT NULL,
  `RecetteMonth` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Personne`
--

INSERT INTO `Personne` (`id_personne`, `nom`, `prénom`, `mdp`, `email`, `typeAbo`, `admin`, `RecetteMonth`) VALUES
(1, 'Leroy', 'geoffrey', '1234', 'geo@orange.fr', 0, 0, NULL),
(2, 'AA', 'aa', '12345', 'a', 0, 1, NULL),
(3, 'Durand', 'Eric', '123456', NULL, 1, NULL, NULL),
(13, 'LAMY', 'JESSICA', 'aaa', NULL, 3, NULL, NULL),
(14, 'AMIK', 'take', 'aaa', NULL, 3, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Personne`
--
ALTER TABLE `Personne`
  ADD PRIMARY KEY (`id_personne`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Personne`
--
ALTER TABLE `Personne`
  MODIFY `id_personne` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
