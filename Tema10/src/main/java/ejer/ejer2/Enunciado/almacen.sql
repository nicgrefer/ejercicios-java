--
-- Base de datos: `almacen`
--
CREATE DATABASE `almacen` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `almacen`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE IF NOT EXISTS `productos` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(20) NOT NULL,
  `precio` decimal(4,2) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `tipo` int(11) NOT NULL,
  PRIMARY KEY (`idProducto`),
  KEY `tipo` (`tipo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`idProducto`, `descripcion`, `precio`, `cantidad`, `tipo`) VALUES
(1, 'producto1', '5.00', 25, 1),
(2, 'producto2', '0.50', 15, 1),
(3, 'producto3', '7.00', 5, 3),
(4, 'producto4', '35.00', 10, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiposproducto`
--

CREATE TABLE IF NOT EXISTS `tiposproducto` (
  `idTipo` int(11) NOT NULL,
  `tipo` char(1) NOT NULL,
  PRIMARY KEY (`idTipo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tiposproducto`
--

INSERT INTO `tiposproducto` (`idTipo`, `tipo`) VALUES
(1, 'A'),
(2, 'B'),
(3, 'C');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`tipo`) REFERENCES `tiposproducto` (`idTipo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
