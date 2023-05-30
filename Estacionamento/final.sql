-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 30-Maio-2023 às 03:06
-- Versão do servidor: 8.0.32
-- versão do PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `final`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `personagens`
--

DROP TABLE IF EXISTS `personagens`;
CREATE TABLE IF NOT EXISTS `personagens` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) DEFAULT NULL,
  `idade` varchar(10) DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  `descendencia` varchar(20) DEFAULT NULL,
  `sangue` varchar(15) DEFAULT NULL,
  `numero_ninjabook` varchar(15) DEFAULT NULL,
  `cor_olhos` varchar(15) DEFAULT NULL,
  `cor_cabelo` varchar(15) DEFAULT NULL,
  `filhos` varchar(20) DEFAULT NULL,
  `observacao` varchar(400) DEFAULT NULL,
  `aldeia` varchar(20) DEFAULT NULL,
  `tamanho_roupa` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
