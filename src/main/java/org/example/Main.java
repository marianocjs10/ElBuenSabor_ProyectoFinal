package org.example;

import org.example.config.DataBaseConnection;
import org.example.entidades.*;
import org.example.enumerables.EstadoPedido;
import org.example.enumerables.EstadoPedido;
import org.example.enumerables.FormaPago;
import org.example.enumerables.TipoEnvio;
import org.example.enumerables.TipoPromocion;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        /*Conexion a la Base de Datos*/
        /*
        try(Connection conn = DataBaseConnection.getConnection()){
            if(conn != null){
                System.out.println("Conexión establecida con éxito.");
                System.out.println();
            }
            else{
                System.out.println("No se pudo establecer la conexión.");
            }
        }catch(SQLException e){
            //Manejo de errores en la conexión a la base de datos
            System.err.println("Error al conectar a la base de datos: "+e.getMessage());
            e.printStackTrace();//Imprime el stack trace completo para depuración
        }*/
        /*------------------------------------------------------------------*/

        Empresa empresa = Empresa.builder()
                //.id(1L)
                //.estado(true)
                .nombre("McHamburg")
                .razonSocial("mchamburgSA")
                .cuil(123456789)
                .build();

        Pais argentina = Pais.builder()
                //.id(2L)
                //.estado(true)
                .nombre("Argentina")
                .build();
        Provincia mendoza = Provincia.builder()
                //.id(3L)
                //.estado(true)
                .nombre("Mendoza")
                .pais(argentina)
                .build();
        Localidad ciudad = Localidad.builder()
                //.id(4L)
                //.estado(true)
                .nombre("Ciudad")
                .provincia(mendoza)
                .build();
        Localidad godoyCruz = Localidad.builder()
                //.id(5L)
                //.estado(true)
                .nombre("Godoy Cruz")
                .provincia(mendoza)
                .build();
        Domicilio domicilio1 = Domicilio.builder()
                //.id(6L)
                //.estado(true)
                .calle("San Martin")
                .numero(123)
                .cp(5500)
                .localidad(ciudad)
                .build();
        Domicilio domicilio2 = Domicilio.builder()
                //.id(7L)
                //.estado(true)
                .calle("Balcarce")
                .numero(456)
                .cp(5501)
                .localidad(godoyCruz)
                .build();

        Sucursal sucursal1 = Sucursal.builder()
                //.id(8L)
                //.estado(true)
                .nombre("Hamburg 1")
                .horarioApertura(LocalTime.now())
                .horarioCierre(LocalTime.now())
                .domicilio(domicilio1)
                .build();
        Sucursal sucursal2 = Sucursal.builder()
                //.id(9L)
                //.estado(true)
                .nombre("Hamburg 2")
                .horarioApertura(LocalTime.now())
                .horarioCierre(LocalTime.now())
                .domicilio(domicilio2)
                .build();



        /*---------------------------------------------------*/

        UnidadMedida gramos = UnidadMedida.builder()
                //.id(10L)
                //.estado(true)
                .denominacion("gramos")
                .build();
        ArticuloInsumo carne = ArticuloInsumo.builder()
                //.id(11L)
                //.estado(true)
                .denominacion("Carne")
                .precioVenta(15.00)
                .precioCompra(10.00)
                .stockActual(10000)
                .stockMaximo(20000)
                .esParaElaborar(true)
                .unidadMedida(gramos)
                .build();
        Imagen imagenCarne = Imagen.builder()
                //.id(12L)
                //.estado(true)
                .denominacion("Imagen de carne")
                .build();
        carne.addImagen(imagenCarne);
        ArticuloInsumo tomate = ArticuloInsumo.builder()
                //.id(13L)
                //.estado(true)
                .denominacion("Tomate")
                .precioVenta(3.00)
                .precioCompra(2.5)
                .stockActual(5000)
                .stockMaximo(10000)
                .esParaElaborar(true)
                .unidadMedida(gramos)
                .build();
        Imagen imagenTomate = Imagen.builder()
                //.id(14L)
                //.estado(true)
                .denominacion("Imagen de tomate")
                .build();
        tomate.addImagen(imagenTomate);
        ArticuloInsumo huevo = ArticuloInsumo.builder()
                //.id(15L)
                //.estado(true)
                .denominacion("Huevo")
                .precioVenta(5.5)
                .precioCompra(5.00)
                .stockActual(6000)
                .stockMaximo(12000)
                .esParaElaborar(true)
                .unidadMedida(gramos)
                .build();
        Imagen imagenHuevo = Imagen.builder()
                // .id(16L)
                //.estado(true)
                .denominacion("Imagen de huevo")
                .build();
        huevo.addImagen(imagenHuevo);
        ArticuloInsumo mayonesa = ArticuloInsumo.builder()
                // .id(17L)
                // .estado(true)
                .denominacion("Mayonesa")
                .precioVenta(5.0)
                .precioCompra(4.5)
                .stockActual(5000)
                .stockMaximo(10000)
                .esParaElaborar(true)
                .unidadMedida(gramos)
                .build();
        Imagen imagenMayonesa = Imagen.builder()
                // .id(18L)
                //.estado(true)
                .denominacion("Imagen de mayonesa")
                .build();
        mayonesa.addImagen(imagenMayonesa);
        ArticuloInsumo pan = ArticuloInsumo.builder()
                // .id(19L)
                // .estado(true)
                .denominacion("Pan")
                .precioVenta(15.0)
                .precioCompra(13.0)
                .stockActual(5000)
                .stockMaximo(10000)
                .esParaElaborar(true)
                .unidadMedida(gramos)
                .build();
        Imagen imagenPan = Imagen.builder()
                // .id(20L)
                // .estado(true)
                .denominacion("Imagen de pan")
                .build();
        pan.addImagen(imagenPan);

        ArticuloManufacturado hamburgMediana = ArticuloManufacturado.builder()
                // .id(21L)
                // .estado(true)
                .denominacion("Mc Hamburg M")
                .precioVenta(10000.00)
                .descripcion("Hamburgesa mediana simple")
                .tiempoEstimadoMinutos(10)
                .preparacion("Completa")
                .unidadMedida(gramos)
                .build();
        ArticuloManufacturado hamburgGrande = ArticuloManufacturado.builder()
                //.id(22L)
                // .estado(true)
                .denominacion("Mc Hamburg G")
                .precioVenta(18000.00)
                .descripcion("Hamburgesa Grande")
                .tiempoEstimadoMinutos(15)
                .preparacion("Completa")
                .unidadMedida(gramos)
                .build();

        ArticuloManufacturadoDetalle carneDetalleM = ArticuloManufacturadoDetalle.builder()
                // .id(23L)
                // .estado(true)
                .cantidad(150)
                .articuloInsumo(carne)
                .build();
        ArticuloManufacturadoDetalle carneDetalleG = ArticuloManufacturadoDetalle.builder()
                //.id(24L)
                //.estado(true)
                .cantidad(300)
                .articuloInsumo(carne)
                .build();
        ArticuloManufacturadoDetalle tomateDetalleM = ArticuloManufacturadoDetalle.builder()
                //.id(25L)
                //.estado(true)
                .cantidad(100)
                .articuloInsumo(tomate)
                .build();
        ArticuloManufacturadoDetalle tomateDetalleG = ArticuloManufacturadoDetalle.builder()
                //.id(26L)
                //.estado(true)
                .cantidad(200)
                .articuloInsumo(tomate)
                .build();
        ArticuloManufacturadoDetalle huevoDetalleM = ArticuloManufacturadoDetalle.builder()
                //.id(27L)
                //.estado(true)
                .cantidad(50)
                .articuloInsumo(huevo)
                .build();
        ArticuloManufacturadoDetalle huevoDetalleG = ArticuloManufacturadoDetalle.builder()
                //.id(28L)
                //.estado(true)
                .cantidad(100)
                .articuloInsumo(huevo)
                .build();
        ArticuloManufacturadoDetalle mayonesaDetalleM = ArticuloManufacturadoDetalle.builder()
                //.id(29L)
                //.estado(true)
                .cantidad(80)
                .articuloInsumo(mayonesa)
                .build();
        ArticuloManufacturadoDetalle mayonesaDetalleG = ArticuloManufacturadoDetalle.builder()
                //.id(30L)
                //.estado(true)
                .cantidad(160)
                .articuloInsumo(mayonesa)
                .build();
        ArticuloManufacturadoDetalle panDetalleM = ArticuloManufacturadoDetalle.builder()
                //.id(31L)
                //.estado(true)
                .cantidad(200)
                .articuloInsumo(pan)
                .build();
        ArticuloManufacturadoDetalle panDetalleG = ArticuloManufacturadoDetalle.builder()
                //.id(32L)
                //.estado(true)
                .cantidad(300)
                .articuloInsumo(pan)
                .build();

        hamburgMediana.addDetalle(carneDetalleM);
        hamburgMediana.addDetalle(tomateDetalleM);
        hamburgMediana.addDetalle(huevoDetalleM);
        hamburgMediana.addDetalle(mayonesaDetalleM);
        hamburgMediana.addDetalle(panDetalleM);
        Imagen imagenHamburgM = Imagen.builder()
                //.id(33L)
                //.estado(true)
                .denominacion("Imagen Mc Hamburg Mediana")
                .build();
        hamburgMediana.addImagen(imagenHamburgM);

        hamburgGrande.addDetalle(carneDetalleG);
        hamburgGrande.addDetalle(tomateDetalleG);
        hamburgGrande.addDetalle(huevoDetalleG);
        hamburgGrande.addDetalle(mayonesaDetalleG);
        hamburgGrande.addDetalle(panDetalleG);
        Imagen imagenHamburgG = Imagen.builder()
                //.id(34L)
                //.estado(true)
                .denominacion("Imagen Mc Hamburg Grande")
                .build();
        hamburgGrande.addImagen(imagenHamburgG);

        Promocion promo1 = Promocion.builder()
                //.id(35L)
                //.estado(true)
                .denominacion("Dos Mc Hamburg - 1 Mediana + 1 Grande")
                .fechaDesde(LocalDate.now())
                .fechaHasta(LocalDate.of(2025, 6, 30))
                .horaDesde(LocalTime.of(20, 0, 0))
                .horaHasta(LocalTime.of(23, 59, 59))
                .descripcionDescuento("10% Off")
                .precioPromocional(9000.00)
                .tipoPromocion(TipoPromocion.PROMOCION1)
                .build();
        Imagen imagenPromo1 = Imagen.builder()
                //.id(36L)
                //.estado(true)
                .denominacion("Imagen de la promo1")
                .build();
        promo1.addImagen(imagenPromo1);
        DetallePromocion promo1Detalle = DetallePromocion.builder()
                //.id(37L)
                //.estado(true)
                .cantidad(1)
                .subTotal(10000.00)
                .articulo(hamburgMediana)
                .build();
        promo1.addDetallePromocion(promo1Detalle);

        sucursal1.addPromocion(promo1);

        Categoria hamburguesas = Categoria.builder()
                //.id(38L)
                //.estado(true)
                .denominacion("Cat.: Hamburguesa")
                .build();
        Categoria hamburguesaMediana = Categoria.builder()
                // .id(39L)
                //.estado(true)
                .denominacion("Cat.: Hamburguesa Mediana")
                .build();
        hamburguesaMediana.addArticulo(hamburgMediana);//Solo la subCategoria tiene Articulo
        Categoria hamburguesaGrande = Categoria.builder()
                //.id(40L)
                // .estado(true)
                .denominacion("Cat.: Hamburguesa Grande")
                .build();
        hamburguesaGrande.addArticulo(hamburgGrande);//Solo la subCategoria tiene Articulo
        Categoria subHamburguesaMediana1 = Categoria.builder()
                //.id(41L)
                //.estado(true)
                .denominacion("Cat.: Hamburguesa con condimentos")
                .build();
        Categoria subHamburguesaMediana2 = Categoria.builder()
                //.id(42L)
                //.estado(true)
                .denominacion("Cat.: Hamburguesa sin condimentos")
                .build();

        hamburguesaGrande.addSubCategoria(subHamburguesaMediana1);
        hamburguesaGrande.addSubCategoria(subHamburguesaMediana2);
        hamburguesaMediana.addSubCategoria(subHamburguesaMediana1);
        hamburguesaMediana.addSubCategoria(subHamburguesaMediana2);
        hamburguesas.addSubCategoria(hamburguesaGrande);
        hamburguesas.addSubCategoria(hamburguesaMediana);
        sucursal1.addCategoria(hamburguesas);

        empresa.addSucursal(sucursal1);
        empresa.addSucursal(sucursal2);
        /* -------------------------------------------------------- */
        DetallePedido detallePedido1 = DetallePedido.builder()
                //.id(43L)
                //.estado(true)
                .cantidad(2)
                .articuloPedido(hamburgGrande)
                .build();
        detallePedido1.calcularSubTotal();
        Factura factura1 = Factura.builder()
                //.id(44L)
                //.estado(true)
                .fechaFacturacion(LocalDate.now())
                .mpPaymentId(321)
                .mpMerchantOrderId(12)
                .mpPreferenceId("asd")
                .mpPaymentType("A12")
                .formaPago(FormaPago.EFECTIVO)
                .build();
        Pedido pedido1 = Pedido.builder()
                //.id(45L)
                //.estado(true)
                .horaEstimadaFinalizacion(LocalTime.now())
                .totalCosto(9000.0)
                .estadoPedido(EstadoPedido.PREPARACION)
                .tipoEnvio(TipoEnvio.DELIVERY)
                .formaPago(FormaPago.EFECTIVO)
                .fechaPedido(LocalDate.now())
                .domicilio(domicilio1)
                .sucursal(sucursal1)
                .factura(factura1)
                .build();
        pedido1.addDetallePedido(detallePedido1);

        Usuario usuario1= Usuario.builder()
                //.id(46L)
                //.estado(true)
                .autoId("mdv")
                .username("Mariano_mdv")
                .build();
        ImagenCliente imagenCliente1 = ImagenCliente.builder()
                //.id(47L)
                //.estado(true)
                .denominacion("Imagen del cliente1")
                .build();
        Localidad maipu = Localidad.builder()
                //.id(48L)
                //.estado(true)
                .nombre("Maipu")
                .provincia(mendoza)
                .build();
        Domicilio domicilioCliente1 = Domicilio.builder()
                //.id(49L)
                //.estado(true)
                .calle("Capetillo")
                .numero(null)
                .cp(5515)
                .localidad(maipu)
                .build();
        Cliente cliente1 = Cliente.builder()
                //.id(50L)
                //.estado(true)
                .nombre("Mariano")
                .apellido("Videla")
                .telefono("2613057839")
                .email("marianobtc2@gmail.com")
                .fechaNacimiento(LocalDate.of(1988,8,9))
                .usuario(usuario1)
                .imagenCliente(imagenCliente1)
                .build();
        cliente1.addDomicilio(domicilioCliente1);
        cliente1.addPedido(pedido1);
        /*-------------------------------------------------------------------*/
        System.out.println(empresa);
        System.out.println("----------------------");
        System.out.println(cliente1);
    }
}