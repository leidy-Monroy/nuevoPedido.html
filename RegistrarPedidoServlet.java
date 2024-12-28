package com.floristeria;

import java.io.IOException;
import java.io.PrintWriter;
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

        // Configurar la respuesta
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Generar la respuesta HTML
        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Confirmación de Pedido</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Pedido Registrado Exitosamente</h1>");
        out.println("<p><strong>Nombre del Cliente:</strong> " + cliente + "</p>");
        out.println("<p><strong>Producto:</strong> " + producto + "</p>");
        out.println("<p><strong>Cantidad:</strong> " + cantidad + "</p>");
        out.println("<p><strong>Dirección:</strong> " + direccion + "</p>");
        out.println("<a href='nuevoPedido.html'>Registrar otro pedido</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
