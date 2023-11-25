<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Produto - Dados</title>
</head>
<body>

    <h1>Dados do Produto</h1>

    <form action="ServletProdutoFC" method="post">
        <input type="hidden" name="acao" value="incluir">
        <c:if test="${not empty produto}">
            <input type="hidden" name="idProduto" value="${produto.idProduto}">
        </c:if>
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" value="${empty produto ? '' : produto.nomeProduto}" required>

        <label for="quantidade">Quantidade:</label>
        <input type="number" id="quantidade" name="quantidade" value="${empty produto ? '' : produto.quantidadeProduto}" required>

        <label for="precoVendaProduto">Preço de Venda:</label>
        <input type="text" id="precoVendaProduto" name="precoVendaProduto" value="${empty produto ? '' : produto.precoVendaProduto}" required>

        <br> <!-- Quebra de linha para mover o botão para a linha de baixo -->

        <input type="submit" value="${empty produto ? 'Adicionar Produto' : 'Alterar'}">
    </form>

</body>
</html>
