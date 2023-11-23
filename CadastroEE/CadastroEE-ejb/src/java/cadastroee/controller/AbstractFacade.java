/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar este modelo
 */
package cadastroee.controller;

import java.util.List;
import jakarta.persistence.EntityManager;

/**
 * Classe abstrata que fornece métodos comuns para operações CRUD.
 * @param <T> Tipo da entidade
 * @author Andrey
 */
public abstract class AbstractFacade<T> {

    private final Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    /**
     * Cria uma nova entidade no banco de dados.
     * @param entity A entidade a ser criada
     */
    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    /**
     * Atualiza uma entidade no banco de dados.
     * @param entity A entidade a ser atualizada
     */
    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    /**
     * Remove uma entidade do banco de dados.
     * @param entity A entidade a ser removida
     */
    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    /**
     * Retorna uma entidade com base no ID fornecido.
     * @param id O ID da entidade
     * @return A entidade encontrada ou null se não encontrada
     */
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    /**
     * Retorna todas as entidades do banco de dados.
     * @return Uma lista de todas as entidades
     */
    public List<T> findAll() {
        jakarta.persistence.criteria.CriteriaQuery<T> cq = getEntityManager().getCriteriaBuilder().createQuery(entityClass);
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    /**
     * Retorna uma lista de entidades dentro de um intervalo especificado.
     * @param range Um array de dois elementos representando o intervalo
     * @return Uma lista de entidades no intervalo especificado
     */
    public List<T> findRange(int[] range) {
        jakarta.persistence.criteria.CriteriaQuery<T> cq = getEntityManager().getCriteriaBuilder().createQuery(entityClass);
        cq.select(cq.from(entityClass));
        jakarta.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    /**
     * Retorna o número total de entidades no banco de dados.
     * @return O número total de entidades
     */
    public int count() {
        jakarta.persistence.criteria.CriteriaQuery<Long> cq = getEntityManager().getCriteriaBuilder().createQuery(Long.class);
        jakarta.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        jakarta.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    
}
