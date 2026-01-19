-- phpMyAdmin SQL Dump
-- version 5.2.3
-- https://www.phpmyadmin.net/
--
-- Host: mysql1
-- Generation Time: Jan 18, 2026 at 10:09 AM
-- Server version: 9.5.0
-- PHP Version: 8.3.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tpvoiture`
--

-- --------------------------------------------------------

--
-- Table structure for table `voiture_electrique`
--

CREATE TABLE `voiture_electrique` (
  `id` int NOT NULL,
  `marque` varchar(50) NOT NULL,
  `modele` varchar(50) NOT NULL,
  `vente` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `voiture_electrique`
--

INSERT INTO `voiture_electrique` (`id`, `marque`, `modele`, `vente`) VALUES
(2, 'Peugeot', 'e-2008', 8231),
(3, 'Tesla', 'Model Y', 19207),
(4, 'Voldkswagen', 'ID 3', 8415),
(5, 'Citroën', 'ë-C3', 16223),
(6, 'Renault', 'Mégane E-Tech', 8752),
(7, 'Renault', 'Scénic E-Tech', 16128),
(9, 'BMW', 'iX1', 8897),
(10, 'Skoda', 'Enyaq', 4392);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `voiture_electrique`
--
ALTER TABLE `voiture_electrique`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `voiture_electrique`
--
ALTER TABLE `voiture_electrique`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
