/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar este modelo
 */
package cadastroee.controller;

import cadastroee.model.Movimento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * Facade para a entidade Movimento, fornece métodos específicos além das operações CRUD genéricas.
 * @author Andrey
 */
@jakarta.ejb.Stateless
public class MovimentoFacade extends AbstractFacade<Movimento> implements MovimentoFacadeLocal {

    @PersistenceContext(unitName = "CadastroEE-ejbPU")
    private EntityManager entityManager;

    /**
     * Obtém o gerenciador de entidades associado a esta classe.
     * @return O gerenciador de entidades
     */
    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    /**
     * Construtor padrão que define a classe da entidade para Movimento.
     */
    public MovimentoFacade() {
        super(Movimento.class);
    }
    
}
