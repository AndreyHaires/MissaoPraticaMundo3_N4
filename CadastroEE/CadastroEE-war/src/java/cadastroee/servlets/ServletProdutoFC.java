package cadastroee.servlets;

import cadastroee.controller.ProdutoFacadeLocal;
import cadastroee.model.Produto;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletProdutoFC extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(ServletProdutoFC.class.getName());

    @EJB
    private ProdutoFacadeLocal facade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acao = request.getParameter("acao");
        String destino = "ProdutoLista.jsp";

        if ("listar".equals(acao)) {
            try {
                List<Produto> produtos = facade.findAll();
                request.setAttribute("listaProdutos", produtos);
                LOGGER.log(Level.INFO, "Lista de produtos recuperada com sucesso: {0}", produtos.size());
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "Erro ao recuperar a lista de produtos", e);
            }
        } else if ("formIncluir".equals(acao) || "formAlterar".equals(acao)) {
            destino = "ProdutoDados.jsp";
            LOGGER.log(Level.INFO, "Chamando a função de inclusão...");
            String nomeProduto = request.getParameter("nome");
            String quantidadeProduto = request.getParameter("quantidade");
            String precoVendaProduto = request.getParameter("precoVenda");

            LOGGER.log(Level.INFO, "Dados do formulário - Nome: {0}, Quantidade: {1}, Preço de Venda: {2}", new Object[]{nomeProduto, quantidadeProduto, precoVendaProduto});

            if ("incluir".equals(acao)) {
                try {
                    Produto novoProduto = new Produto();
                    novoProduto.setIdProduto(100); // Adiciona o ID fixo de 100
                    novoProduto.setNomeProduto(request.getParameter("nome"));
                    novoProduto.setQuantidadeProduto(Integer.parseInt(request.getParameter("quantidade")));
                    novoProduto.setPrecoVendaProduto((float) Double.parseDouble(request.getParameter("precoVenda")));

                    facade.create(novoProduto);

                    LOGGER.log(Level.INFO, "Produto incluído com sucesso.");
                    destino = "ServletProdutoFC?acao=listar";
                } catch (Exception e) {
                    LOGGER.log(Level.SEVERE, "Erro ao incluir o produto", e);
                    request.setAttribute("erroInclusao", "Erro ao incluir o produto. Verifique os dados e tente novamente.");
                }
            }

            request.setAttribute("produto", null);
        }

        RequestDispatcher rd = request.getRequestDispatcher(destino);
        rd.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
