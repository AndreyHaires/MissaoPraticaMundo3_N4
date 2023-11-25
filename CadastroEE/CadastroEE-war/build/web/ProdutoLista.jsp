<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <h1>Listagem de Produtos</h1>

    <a href="ServletProdutoFC?acao=formIncluir">Novo Produto</a>

    <table>
        <tr>
            <td>#</td>
            <td>Nome</td>
            <td>Quantidade</td>
            <td>Preço de Venda</td>
            <td>Opções</td>
        </tr>
       
        <c:forEach var="produto" items="${listaProdutos}">
            <tr>
                <td>${produto.idProduto}</td>
                <td>${produto.nomeProduto}</td>
                <td>${produto.quantidadeProduto}</td>
                <td>${produto.precoVendaProduto}</td>
                <td>
                    <!-- Adicione links "Alterar" e "Excluir" para cada produto -->
                    <a href="ServletProdutoFC?acao=alterar&idProduto=${produto.idProduto}">Alterar</a>
                    <a href="ServletProdutoFC?acao=excluir&idProduto=${produto.idProduto}">Excluir</a>
                </td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
