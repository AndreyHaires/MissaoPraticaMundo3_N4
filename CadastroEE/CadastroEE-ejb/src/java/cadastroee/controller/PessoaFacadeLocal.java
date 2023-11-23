/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java para editar este modelo
 */
package cadastroee.controller;

import cadastroee.model.Pessoa;
import java.util.List;

/**
 * Interface responsável por definir métodos para operações relacionadas à entidade Pessoa.
 * Esta interface é utilizada para garantir a implementação padrão dos métodos em classes que realizam operações com a entidade Pessoa.
 * @author Andrey
 */
@jakarta.ejb.Local
public interface PessoaFacadeLocal {

    /**
     * Cria uma nova entidade Pessoa no banco de dados.
     * @param pessoa A entidade Pessoa a ser criada.
     */
    void create(Pessoa pessoa);

    /**
     * Edita uma entidade Pessoa existente no banco de dados.
     * @param pessoa A entidade Pessoa a ser editada.
     */
    void edit(Pessoa pessoa);

    /**
     * Remove uma entidade Pessoa do banco de dados.
     * @param pessoa A entidade Pessoa a ser removida.
     */
    void remove(Pessoa pessoa);

    /**
     * Encontra uma entidade Pessoa no banco de dados com base no ID.
     * @param id O ID da entidade Pessoa a ser encontrada.
     * @return A entidade Pessoa encontrada, ou null se não encontrada.
     */
    Pessoa find(Object id);

    /**
     * Obtém todas as entidades Pessoa do banco de dados.
     * @return Uma lista contendo todas as entidades Pessoa.
     */
    List<Pessoa> findAll();

    /**
     * Obtém uma lista de entidades Pessoa dentro de uma faixa específica no banco de dados.
     * @param range Um array de inteiros representando a faixa de resultados desejada.
     * @return Uma lista contendo entidades Pessoa dentro da faixa especificada.
     */
    List<Pessoa> findRange(int[] range);

    /**
     * Obtém o número total de entidades Pessoa no banco de dados.
     * @return O número total de entidades Pessoa.
     */
    int count();
    
}
