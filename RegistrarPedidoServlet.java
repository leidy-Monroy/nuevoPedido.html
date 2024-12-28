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
        String cliente = request.getParameter("cliente");
        String producto = request.getParameter("producto");
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        String direccion = request.getParameter("direccion");

        // Simular el almacenamiento de datos (normalmente se haría en una base de datos)
        request.setAttribute("mensaje", "Pedido registrado exitosamente para el cliente: " + cliente);

        // Redirigir a una página JSP para confirmar el registro
        request.getRequestDispatcher("confirmacion.jsp").forward(request, response);
    }
}
