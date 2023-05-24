-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 24-Maio-2023 às 23:40
-- Versão do servidor: 5.7.36
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `projeto_quarta`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `personagens`
--

DROP TABLE IF EXISTS `personagens`;
CREATE TABLE IF NOT EXISTS `personagens` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `idade` varchar(10) DEFAULT NULL,
  `aldeia` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `descendencia` varchar(50) DEFAULT NULL,
  `sangue` varchar(50) DEFAULT NULL,
  `numero_ninjabook` varchar(50) DEFAULT NULL,
  `cor_olhos` varchar(50) DEFAULT NULL,
  `cor_cabelo` varchar(50) DEFAULT NULL,
  `tamanho_roupa` varchar(50) DEFAULT NULL,
  `filhos` varchar(50) DEFAULT NULL,
  `observacao` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `personagens`
--

INSERT INTO `personagens` (`id`, `nome`, `idade`, `aldeia`, `status`, `descendencia`, `sangue`, `numero_ninjabook`, `cor_olhos`, `cor_cabelo`, `tamanho_roupa`, `filhos`, `observacao`) VALUES
(1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(6, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
