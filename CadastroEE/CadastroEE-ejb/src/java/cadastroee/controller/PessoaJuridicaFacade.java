/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar este modelo
 */
package cadastroee.controller;

import cadastroee.model.PessoaJuridica;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * Classe que realiza operações específicas para a entidade Pessoa Jurídica.
 * Esta classe é responsável por interagir com o banco de dados para realizar operações relacionadas à Pessoa Jurídica.
 * @author Andrey
 */
@jakarta.ejb.Stateless
public class PessoaJuridicaFacade extends AbstractFacade<PessoaJuridica> implements PessoaJuridicaFacadeLocal {

    @PersistenceContext(unitName = "CadastroEE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     * Construtor padrão da classe PessoaJuridicaFacade.
     * Inicializa a classe base com a entidade Pessoa Jurídica.
     */
    public PessoaJuridicaFacade() {
        super(PessoaJuridica.class);
    }
    
}
