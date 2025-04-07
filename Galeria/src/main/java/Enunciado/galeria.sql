-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-04-2025 a las 18:40:58
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

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
(1, 'https://images.unsplash.com/photo-1561037404-61cd46aa615b?w=300'),
(2, 'https://images.unsplash.com/photo-1514888286974-6c03e2ca1dba?w=300'),
(3, 'https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Rabbit_in_montana.jpg/300px-Rabbit_in_montana.jpg'),
(4, 'https://th.bing.com/th/id/R.587095a8a4db4a957e339cd59f3b85d1?rik=qIAk5waVy4dnxw&riu=http%3a%2f%2fwww.recreoviral.com%2fwp-content%2fuploads%2f2015%2f08%2fFotograf%c3%adas-de-caballos-hermosos-1.jpg&ehk=lDc16oSEHaa2WxGD32w4MdJMNGDe13bMYd7sJbl1zqM%3d&risl=&pid=ImgRaw&r=0'),
(5, 'https://th.bing.com/th/id/R.ea754954d98a22226e91037dce77b7b5?rik=qa3nwJNVJpeHKQ&pid=ImgRaw&r=0');

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
