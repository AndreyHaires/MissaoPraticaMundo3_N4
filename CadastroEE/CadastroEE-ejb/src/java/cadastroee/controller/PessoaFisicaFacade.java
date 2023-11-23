/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar este modelo
 */
package cadastroee.controller;

import cadastroee.model.PessoaFisica;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * Classe responsável por operações específicas para a entidade Pessoa Física.
 * Esta classe interage com o banco de dados para realizar operações relacionadas à Pessoa Física.
 * @author Andrey
 */
@jakarta.ejb.Stateless
public class PessoaFisicaFacade extends AbstractFacade<PessoaFisica> implements PessoaFisicaFacadeLocal {

    @PersistenceContext(unitName = "CadastroEE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     * Construtor padrão da classe PessoaFisicaFacade.
     * Inicializa a classe base com a entidade Pessoa Física.
     */
    public PessoaFisicaFacade() {
        super(PessoaFisica.class);
    }
    
}
