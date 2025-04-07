-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-04-2025 a las 12:23:31
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `galeria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `imagenes`
--

CREATE TABLE `imagenes` (
  `id` int(11) NOT NULL COMMENT 'PK_imagenes',
  `url` varchar(10000) NOT NULL COMMENT 'Enlace de la localización de la imagen'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `imagenes`
--

INSERT INTO `imagenes` (`id`, `url`) VALUES
(1, 'https://www.google.es/imgres?q=perro&imgurl=https%3A%2F%2Fwww.veterinariadrbrenes.com%2Fwp-content%2Fuploads%2F2019%2F10%2FC%25C3%25B3mo-seleccionar-a-un-perro-dentro-de-una-camada-blog-1000x500.jpg%3Fx42009&imgrefurl=https%3A%2F%2Fwww.veterinariadrbrenes.com%2Fnoticias%2Fcomo-seleccionar-a-un-perro-dentro-de-una-camada%2F&docid=DklsFuYtyw5OfM&tbnid=Ieww1bleJTyMWM&vet=12ahUKEwjXk7aqvsWMAxUtRKQEHfnrAesQM3oECGUQAA..i&w=1000&h=500&hcb=2&ved=2ahUKEwjXk7aqvsWMAxUtRKQEHfnrAesQM3oECGUQAA'),
(2, 'https://www.google.es/url?sa=i&url=https%3A%2F%2Fhospitalveterinariodonostia.com%2Ftodo-sobre-el-caracter-y-personalidad-de-los-gatos%2F&psig=AOvVaw2FZkc6jqbrqdX-LLPiXrLT&ust=1744100434187000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMif4Mq-xYwDFQAAAAAdAAAAABAE'),
(3, 'https://www.google.es/url?sa=i&url=https%3A%2F%2Fes.wikipedia.org%2Fwiki%2FOryctolagus_cuniculus&psig=AOvVaw2hfBE0bq3Qdv8fRUW5lZM2&ust=1744100455668000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCJCf6tK-xYwDFQAAAAAdAAAAABAE'),
(4, 'https://www.google.es/url?sa=i&url=https%3A%2F%2Fwww.masquesaludanimal.es%2Fposts%2Frazas-ovejas-curiosas.aspx&psig=AOvVaw0Vzf0jkjOhyGQeutuZiMZA&ust=1744100481499000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCKCAkeC-xYwDFQAAAAAdAAAAABAJ'),
(5, 'https://www.google.es/url?sa=i&url=https%3A%2F%2Ftenor.com%2Fes%2Fview%2Fminecraft-minecraft-movie-bee-png-gif-7426016964241706941&psig=AOvVaw1l2eKK6-4su9n8znQa4Fu4&ust=1744100518750000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNiy0vG-xYwDFQAAAAAdAAAAABAE');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `imagenes`
--
ALTER TABLE `imagenes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `imagenes`
--
ALTER TABLE `imagenes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'PK_imagenes', AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
