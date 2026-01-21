-- phpMyAdmin SQL Dump
-- version 5.2.3
-- https://www.phpmyadmin.net/
--
-- Hôte : mysql1
-- Généré le : lun. 19 jan. 2026 à 14:15
-- Version du serveur : 9.5.0
-- Version de PHP : 8.3.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `1BDD`
--

-- --------------------------------------------------------

--
-- Structure de la table `voiture_electrique`
--

CREATE TABLE `voiture_electrique` (
  `id` int NOT NULL,
  `marque` varchar(50) NOT NULL,
  `modele` varchar(50) NOT NULL,
  `vente` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `voiture_electrique`
--

INSERT INTO `voiture_electrique` (`id`, `marque`, `modele`, `vente`) VALUES
(1, 'renault', '5 E-Tech', 37997),
(2, 'Peugeot', 'e-2008', 8231),
(3, 'BMW', 'iX1', 8897),
(4, 'Citroen', 'e-C3', 16223),
(5, 'Tesla', 'Model 3', 6128),
(6, 'Dacia', 'Spring', 7428),
(7, 'Mini COOPER', 'E/SE', 11563),
(8, 'Audi ', 'Q- e-tron', 4342),
(9, 'BMW', 'iX2', 3924),
(10, 'Skoda', 'Enyaq', 4392);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `voiture_electrique`
--
ALTER TABLE `voiture_electrique`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `voiture_electrique`
--
ALTER TABLE `voiture_electrique`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
