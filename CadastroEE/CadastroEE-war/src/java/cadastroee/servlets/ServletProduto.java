package cadastroee.servlets;

import cadastroee.model.Produto;
import cadastroee.controller.ProdutoFacadeLocal;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ServletProduto", urlPatterns = {"/ServletProduto"})
public class ServletProduto extends HttpServlet {

    @EJB
    private ProdutoFacadeLocal facade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletProduto</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<h1>Servlet ServletProduto at /CadastroEE-war</h1>");
            out.println("<p>Banana</p>");
            // Use o facade para obter a lista de produtos
            List<Produto> produtos = facade.findAll();

            // Apresente os produtos na forma de lista HTML
            out.println("<ul>");
            for (Produto produto : produtos) {
                out.println("<li>" + formatProduto(produto) + "</li>");
            }
            out.println("</ul>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    // Método para formatar as informações do produto
    private String formatProduto(Produto produto) {
        // Ajuste conforme os métodos reais na classe Produto
        return produto.getNomeProduto() + " - R$" + produto.getPrecoVendaProduto();
    }

    // Remova o método processRequest, pois não está sendo usado
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Se necessário, adicione lógica para processar solicitações POST
    }

    @Override
    public String getServletInfo() {
        return "Servlet para listar produtos";
    }
}
