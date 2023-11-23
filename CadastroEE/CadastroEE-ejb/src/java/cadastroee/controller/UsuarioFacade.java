/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar este modelo
 */
package cadastroee.controller;

import cadastroee.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * Classe que realiza operações específicas para a entidade Usuario.
 * Esta classe é responsável por interagir com o banco de dados para realizar operações relacionadas a Usuario.
 * @author Andrey
 */
@jakarta.ejb.Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "CadastroEE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     * Construtor padrão da classe UsuarioFacade.
     * Inicializa a classe base com a entidade Usuario.
     */
    public UsuarioFacade() {
        super(Usuario.class);
    }
    
}
