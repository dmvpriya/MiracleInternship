-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: company
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `EmpID` varchar(45) NOT NULL,
  `EmpFname` varchar(45) DEFAULT NULL,
  `EmpLname` varchar(45) DEFAULT NULL,
  `EmpCountry` varchar(45) DEFAULT NULL,
  `EmpPhNo` varchar(45) DEFAULT NULL,
  `EmpRole` varchar(45) DEFAULT NULL,
  `EmpEmailID` varchar(45) DEFAULT NULL,
  `EmpUname` varchar(45) DEFAULT NULL,
  `EmpUpassword` varchar(45) DEFAULT NULL,
  `AddBy` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`EmpID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('H23M61','Dimple','Killo','India','+91  7845968415','HR','DKillo@Miracle.com','DKillo','Dilo@63215',' '),('H23M79','Mohanaa','Durla','America','+4  9856321475','HR','MDurla@Miracle.com','MDurla','Mola@21475',' '),('H23M90','Priya','Durla','America','+4  9687541238','HR','PDurla@Miracle.com','PDurla','Prla@41238',' '),('I23M44','Radha','Killo','India','+91 8659741258','Trainee','RKillo@Miracle.com','RKillo','Ralo@63215','Dimple'),('I23M56','Vishnu','','India','+91 7854123695','Trainee','VDurla@Miracle.com','VDurla','Vila@23695','Priya'),('T23M13','Deekshika','Robba','India','+91 6798541236','Trainer','DRobba@Miracle.com','DRobba','Deba@41236','Dimple'),('T23M27','Sharada','Palli','America','+4 5467897124','Trainer','SPalli@MiracleSSEmployee.com','SPalli','Shli897124','Dimple'),('T23M56','Sangeetha','Robba','India','+91 9874563215','Trainer','SRobba@Miracle.com','SRobba','Saba@63215','Priya');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-18 17:43:01
