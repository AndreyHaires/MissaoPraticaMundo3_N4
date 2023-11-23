/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar este modelo
 */
package cadastroee.controller;

import cadastroee.model.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * Classe responsável por operações específicas relacionadas à entidade Pessoa.
 * Esta classe interage com o banco de dados para executar operações relacionadas a Pessoa.
 * @author Andrey
 */
@jakarta.ejb.Stateless
public class PessoaFacade extends AbstractFacade<Pessoa> implements PessoaFacadeLocal {

    @PersistenceContext(unitName = "CadastroEE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     * Construtor padrão da classe PessoaFacade.
     * Inicializa a classe base com a entidade Pessoa.
     */
    public PessoaFacade() {
        super(Pessoa.class);
    }
    
}
