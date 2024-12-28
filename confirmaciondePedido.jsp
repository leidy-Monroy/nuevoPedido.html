<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Confirmación de Pedido</title>
</head>
<body>
    <h1>Pedido Registrado Exitosamente</h1>
    <p><strong>Nombre del Cliente:</strong> ${cliente}</p>
    <p><strong>Producto:</strong> ${producto}</p>
    <p><strong>Cantidad:</strong> ${cantidad}</p>
    <p><strong>Dirección:</strong> ${direccion}</p>
    <a href="nuevoPedido.html">Registrar otro pedido</a>
</body>
</html>

package com.floristeria;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrarPedidoServlet")
public class RegistrarPedidoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los datos del formulario
        String cliente = request.getParameter("cliente");
        String producto = request.getParameter("producto");
        String cantidad = request.getParameter("cantidad");
        String direccion = request.getParameter("direccion");

        // Pasar los datos como atributos al JSP
        request.setAttribute("cliente", cliente);
        request.setAttribute("producto", producto);
        request.setAttribute("cantidad", cantidad);
        request.setAttribute("direccion", direccion);

        // Redirigir a la página JSP de confirmación
        request.getRequestDispatcher("confirmacionDePedido.jsp").forward(request, response);
    }
}


