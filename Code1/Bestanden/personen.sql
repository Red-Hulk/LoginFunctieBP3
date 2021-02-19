
--
-- Database: `registratiepersonen`
--
-- --------------------------------------------------------

CREATE DATABASE registratie;
USE registratie;
--
-- Table structure for table `personen`
--

CREATE TABLE `personen` (
  `gebruikersnaam` varchar(50) NOT NULL,
  `wachtwoord` varchar(50) NOT NULL,
  `naam` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  `diploma` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

