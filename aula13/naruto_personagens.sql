-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 04-Maio-2023 às 00:36
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
-- Banco de dados: `naruto_personagens`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `personagens`
--

DROP TABLE IF EXISTS `personagens`;
CREATE TABLE IF NOT EXISTS `personagens` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(250) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `aldeia` varchar(250) DEFAULT NULL,
  `status` varchar(250) DEFAULT NULL,
  `observacao` varchar(250) DEFAULT NULL,
  `blood` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `personagens`
--

INSERT INTO `personagens` (`id`, `nome`, `idade`, `aldeia`, `status`, `observacao`, `blood`) VALUES
(1, 'Kabuto', 22, 'Folha', 'Vivo', 'Lixo', 'O'),
(2, 'Kakuzu', 50, 'Pedra', 'Morto', 'Feio', 'A'),
(3, 'Naruto', 15, 'Folha', 'Vivo', 'Protagonista', 'A'),
(4, 'Sasuke', 16, 'Folha', 'Vivo', 'Cuzao', 'O'),
(5, 'Sakura', 19, 'FOLHA', 'Viva', 'Médica', 'O');

-- --------------------------------------------------------

--
-- Estrutura da tabela `relacao`
--

DROP TABLE IF EXISTS `relacao`;
CREATE TABLE IF NOT EXISTS `relacao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_personagem` int(11) DEFAULT NULL,
  `descricao` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_RELACAO_PERSONAGEM` (`id_personagem`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `relacao`
--

INSERT INTO `relacao` (`id`, `id_personagem`, `descricao`) VALUES
(1, 1, 'era orfão e quis o orochimaru');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
