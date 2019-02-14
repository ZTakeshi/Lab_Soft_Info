-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 14-Fev-2019 às 11:33
-- Versão do servidor: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `concessionaria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `controlfuncionario`
--

CREATE TABLE `controlfuncionario` (
  `idcontrolfuncionario` int(11) NOT NULL,
  `alterardadosclientes` varchar(100) DEFAULT NULL,
  `buscarveiculos` varchar(100) DEFAULT NULL,
  `buscarclientes` varchar(100) DEFAULT NULL,
  `cadastrarclientes` varchar(100) DEFAULT NULL,
  `consultarpromocoes` varchar(100) DEFAULT NULL,
  `fecharvenda` varchar(100) DEFAULT NULL,
  `efetuarlogin` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `controlgerente`
--

CREATE TABLE `controlgerente` (
  `idcontrolgerente` int(11) NOT NULL,
  `gerarrelatorio` varchar(100) DEFAULT NULL,
  `aterardadosveiculos` varchar(100) DEFAULT NULL,
  `gerarcomissaofunc` varchar(100) DEFAULT NULL,
  `cadastrapromocoes` varchar(100) DEFAULT NULL,
  `cadastrafuncionario` varchar(100) DEFAULT NULL,
  `cadastraveiculos` varchar(100) DEFAULT NULL,
  `efetuarlogin` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `idfuncionario` int(11) NOT NULL,
  `numeroPIS` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `gerente`
--

CREATE TABLE `gerente` (
  `idgerente` int(11) NOT NULL,
  `senhaExtra` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL,
  `nome` int(100) NOT NULL,
  `email` int(100) NOT NULL,
  `CPF` int(14) NOT NULL,
  `telefone` varchar(30) NOT NULL,
  `RG` int(12) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `login` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculos`
--

CREATE TABLE `veiculos` (
  `idveiculos` int(11) NOT NULL,
  `modelo` varchar(100) NOT NULL,
  `faricante` varchar(100) NOT NULL,
  `cor` varchar(100) NOT NULL,
  `ano` int(4) NOT NULL,
  `preco` double NOT NULL,
  `chassi` int(17) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE `vendas` (
  `idvendas` int(11) NOT NULL,
  `formapagamento` varchar(100) NOT NULL,
  `sevicosadicionais` varchar(100) NOT NULL,
  `desconto` double NOT NULL,
  `valortotal` double NOT NULL,
  `chassi` int(17) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `controlfuncionario`
--
ALTER TABLE `controlfuncionario`
  ADD PRIMARY KEY (`idcontrolfuncionario`);

--
-- Indexes for table `controlgerente`
--
ALTER TABLE `controlgerente`
  ADD PRIMARY KEY (`idcontrolgerente`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`idfuncionario`);

--
-- Indexes for table `gerente`
--
ALTER TABLE `gerente`
  ADD PRIMARY KEY (`idgerente`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`);

--
-- Indexes for table `veiculos`
--
ALTER TABLE `veiculos`
  ADD PRIMARY KEY (`idveiculos`);

--
-- Indexes for table `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`idvendas`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `controlfuncionario`
--
ALTER TABLE `controlfuncionario`
  MODIFY `idcontrolfuncionario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `controlgerente`
--
ALTER TABLE `controlgerente`
  MODIFY `idcontrolgerente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `idfuncionario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `gerente`
--
ALTER TABLE `gerente`
  MODIFY `idgerente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `veiculos`
--
ALTER TABLE `veiculos`
  MODIFY `idveiculos` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `vendas`
--
ALTER TABLE `vendas`
  MODIFY `idvendas` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
