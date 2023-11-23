/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java para editar este modelo
 */
package cadastroee.controller;

import cadastroee.model.Produto;
import java.util.List;

/**
 * Interface que define as operações disponíveis para a entidade Produto.
 * Essa interface lista os métodos CRUD (Create, Read, Update, Delete) para a entidade Produto.
 * @author Andrey
 */
@jakarta.ejb.Local
public interface ProdutoFacadeLocal {

    void create(Produto produto);

    void edit(Produto produto);

    void remove(Produto produto);

    Produto find(Object id);

    List<Produto> findAll();

    List<Produto> findRange(int[] range);

    int count();
    
}
