/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar este modelo
 */
package cadastroee.controller;

import cadastroee.model.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * Classe que realiza operações específicas para a entidade Produto.
 * Esta classe é responsável por interagir com o banco de dados para realizar operações relacionadas a Produto.
 * @author Mari
 */
@jakarta.ejb.Stateless
public class ProdutoFacade extends AbstractFacade<Produto> implements ProdutoFacadeLocal {

    @PersistenceContext(unitName = "CadastroEE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     * Construtor padrão da classe ProdutoFacade.
     * Inicializa a classe base com a entidade Produto.
     */
    public ProdutoFacade() {
        super(Produto.class);
    }
    
}
