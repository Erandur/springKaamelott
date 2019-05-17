-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Ven 17 Mai 2019 à 09:37
-- Version du serveur: 5.6.13
-- Version de PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `stock`
--

-- --------------------------------------------------------

--
-- Structure de la table `kaamelott`
--

CREATE TABLE IF NOT EXISTS `kaamelott` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prenom` varchar(50) NOT NULL,
  `role` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

--
-- Contenu de la table `kaamelott`
--

INSERT INTO `kaamelott` (`id`, `prenom`, `role`) VALUES
(1, 'Perceval', 'Conseiller du Roi'),
(2, 'Lancelot', 'Chevalier solitaire'),
(3, 'Leodagan', 'Roi'),
(5, 'Karadoc', 'Garde manger'),
(7, 'Guillaume', 'Roi de Carmélide'),
(9, 'Anthony', 'Le rajout');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
