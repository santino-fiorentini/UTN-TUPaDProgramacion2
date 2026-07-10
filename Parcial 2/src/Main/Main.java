package Main;

import Entities.*;
import Enums.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        
        // Creación de categorias
        Categoria bebidas =
                new Categoria(
                        1L,
                        false,
                        LocalDateTime.now(),
                        "Bebidas",
                        "Bebidas frias y calientes"
                );

        Categoria comidas =
                new Categoria(
                        2L,
                        false,
                        LocalDateTime.now(),
                        "Comidas",
                        "Comidas principales"
                );

        Categoria postres =
                new Categoria(
                        3L,
                        false,
                        LocalDateTime.now(),
                        "Postres",
                        "Postres dulces"
                );
        
        // Creación de productos
        Producto coca =
                new Producto(
                        1L,
                        false,
                        LocalDateTime.now(),
                        "Coca Cola",
                        2500.0,
                        "Gaseosa",
                        100,
                        "coca.jpg",
                        true,
                        bebidas
                );

        Producto agua =
                new Producto(
                        2L,
                        false,
                        LocalDateTime.now(),
                        "Agua",
                        1800.0,
                        "Agua mineral",
                        100,
                        "agua.jpg",
                        true,
                        bebidas
                );

        Producto hamburguesa =
                new Producto(
                        3L,
                        false,
                        LocalDateTime.now(),
                        "Hamburguesa",
                        8000.0,
                        "Hamburguesa completa",
                        50,
                        "hamburguesa.jpg",
                        true,
                        comidas
                );

        Producto pizza =
                new Producto(
                        4L,
                        false,
                        LocalDateTime.now(),
                        "Pizza",
                        9500.0,
                        "Pizza mozzarella",
                        50,
                        "pizza.jpg",
                        true,
                        comidas
                );

        Producto helado =
                new Producto(
                        5L,
                        false,
                        LocalDateTime.now(),
                        "Helado",
                        3500.0,
                        "Helado artesanal",
                        50,
                        "helado.jpg",
                        true,
                        postres
                );

        Producto flan =
                new Producto(
                        6L,
                        false,
                        LocalDateTime.now(),
                        "Flan",
                        3000.0,
                        "Flan casero",
                        50,
                        "flan.jpg",
                        true,
                        postres
                );
        
        // Asociación de la categoria con el producto
        bebidas.agregarProducto(coca);
        bebidas.agregarProducto(agua);

        comidas.agregarProducto(hamburguesa);
        comidas.agregarProducto(pizza);

        postres.agregarProducto(helado);
        postres.agregarProducto(flan);
        
        // Creación de usuarios
        Usuario admin =
                new Usuario(
                        1L,
                        false,
                        LocalDateTime.now(),
                        "Santino",
                        "Fiorentini",
                        "s.fiorentini@gmail.com",
                        "3464123456",
                        "1234",
                        Rol.ADMIN
                );

        Usuario usuario =
                new Usuario(
                        2L,
                        false,
                        LocalDateTime.now(),
                        "Maria",
                        "Fiorentini",
                        "m.fiorentini@gmail.com",
                        "3464567890",
                        "1234",
                        Rol.USUARIO
                );
        
        // Creacion de pedidos
        Pedido pedido1 =
                new Pedido(
                        1L,
                        false,
                        LocalDateTime.now(),
                        LocalDate.now(),
                        Estado.CONFIRMADO,
                        0.0,
                        FormaPago.TARJETA,
                        admin
                );

        Pedido pedido2 =
                new Pedido(
                        2L,
                        false,
                        LocalDateTime.now(),
                        LocalDate.now(),
                        Estado.PENDIENTE,
                        0.0,
                        FormaPago.EFECTIVO,
                        admin
                );

        Pedido pedido3 =
                new Pedido(
                        3L,
                        false,
                        LocalDateTime.now(),
                        LocalDate.now(),
                        Estado.TERMINADO,
                        0.0,
                        FormaPago.TRANSFERENCIA,
                        usuario
                );

        Pedido pedido4 =
                new Pedido(
                        4L,
                        false,
                        LocalDateTime.now(),
                        LocalDate.now(),
                        Estado.CONFIRMADO,
                        0.0,
                        FormaPago.TARJETA,
                        usuario
                );
        
        // Asociacion del usuario con el pedido
        admin.agregarPedido(pedido1);
        admin.agregarPedido(pedido2);

        usuario.agregarPedido(pedido3);
        usuario.agregarPedido(pedido4);
        
        // Detalles de pedidos
        pedido1.addDetallePedido(2, coca);
        pedido1.addDetallePedido(1, pizza);
        pedido1.addDetallePedido(2, helado);

        pedido2.addDetallePedido(3, agua);
        pedido2.addDetallePedido(1, hamburguesa);
        pedido2.addDetallePedido(1, flan);

        pedido3.addDetallePedido(2, pizza);
        pedido3.addDetallePedido(2, coca);
        pedido3.addDetallePedido(1, helado);

        pedido4.addDetallePedido(1, hamburguesa);
        pedido4.addDetallePedido(2, flan);
        pedido4.addDetallePedido(3, agua);

        // Usuarios del sistema
        Usuario[] usuarios = {admin, usuario};
        
        // Reporte final
        for (Usuario u : usuarios) {

            System.out.println(
                    "\n======================================================"
            );

            System.out.println(
                    "USUARIO: "
                            + u.getNombre()
                            + " "
                            + u.getApellido()
                            + " | Mail: "
                            + u.getMail()
                            + " | Rol: "
                            + u.getRol()
            );

            System.out.println(
                    "======================================================"
            );

            double totalUsuario = 0;

            for (Pedido pedido : u.getPedidos()) {

                System.out.println(
                        "\nPedido #"
                                + pedido.getId()
                                + " | Fecha: "
                                + pedido.getFecha()
                                + " | Estado: "
                                + pedido.getEstado()
                                + " | FormaPago: "
                                + pedido.getFormaPago()
                );

                for (DetallePedido detalle :
                        pedido.getDetalles()) {

                    System.out.println(
                            "DetallePedido #"
                                    + detalle.getId()
                                    + ": "
                                    + detalle.getProducto().getNombre()
                                    + " x "
                                    + detalle.getCantidad()
                                    + " => Subtotal: $"
                                    + detalle.getSubtotal()
                    );
                }

                System.out.println(
                        "TOTAL DEL PEDIDO: $"
                                + pedido.getTotal()
                );

                totalUsuario += pedido.getTotal();
            }

            System.out.println(
                    "\nTOTAL ACUMULADO DEL USUARIO: $"
                            + totalUsuario
            );

            System.out.println(
                    "======================================================"
            );
        }
    }
}
