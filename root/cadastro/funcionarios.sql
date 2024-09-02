-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 27-Ago-2024 às 00:25
-- Versão do servidor: 5.6.13
-- versão do PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `2dsm_24_2s`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionarios`
--

CREATE TABLE IF NOT EXISTS `funcionarios` (
  `registro` int(9) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `data_admissao` date NOT NULL,
  `cargo` varchar(50) NOT NULL,
  `qtde_salarios` int(9) NOT NULL,
  `salario_bruto` double NOT NULL,
  `inss` double NOT NULL,
  `salario_liquido` double NOT NULL,
  PRIMARY KEY (`registro`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=31 ;

--
-- Extraindo dados da tabela `funcionarios`
--

INSERT INTO `funcionarios` (`registro`, `nome`, `data_admissao`, `cargo`, `qtde_salarios`, `salario_bruto`, `inss`, `salario_liquido`) VALUES
(25, 'Henrique ', '2025-01-25', 'Desenvolvedor', 2147483647, 1.36964e18, 1.506604e17, 1.2189796e18),
(26, 'Enzo', '2023-02-11', 'Desenvolvedor', 564654, 797291448, 87702059.28, 709589388.72),
(27, 'Diogo', '2025-05-25', 'Desenvolvedor', 89563879, 126464197148, 13911061686.28, 112553135461.72),
(28, 'Giulia', '2024-09-15', 'Desenvolvedor', 654983, 924835996, 101731959.56, 823104036.44),
(29, 'Ellen', '2025-03-09', 'Desenvolvedor', 2147483647, 125030540350900, 13753359438599, 111277180912300),
(30, 'Hector', '2025-04-16', 'Desenvolvedor', 56454854, 79714253848, 8768567923.28, 70945685924.72);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
