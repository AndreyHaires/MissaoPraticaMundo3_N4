/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java para editar este modelo
 */
package cadastroee.controller;

import cadastroee.model.Movimento;
import java.util.List;

/**
 * Interface que define os métodos para manipulação da entidade Movimento.
 * Essa interface é utilizada pelas classes que implementam operações específicas para a entidade Movimento.
 * @author Andrey
 */
@jakarta.ejb.Local
public interface MovimentoFacadeLocal {

    /**
     * Cria um novo registro de movimento.
     * @param movimento O movimento a ser criado
     */
    void create(Movimento movimento);

    /**
     * Atualiza um registro de movimento existente.
     * @param movimento O movimento a ser atualizado
     */
    void edit(Movimento movimento);

    /**
     * Remove um registro de movimento.
     * @param movimento O movimento a ser removido
     */
    void remove(Movimento movimento);

    /**
     * Busca um movimento pelo ID.
     * @param id O ID do movimento a ser encontrado
     * @return O movimento encontrado, ou null se não existir
     */
    Movimento find(Object id);

    /**
     * Obtém todos os registros de movimento.
     * @return Uma lista contendo todos os movimentos
     */
    List<Movimento> findAll();

    /**
     * Obtém uma faixa específica de registros de movimento.
     * @param range Um array de inteiros representando a faixa desejada
     * @return Uma lista contendo os movimentos na faixa especificada
     */
    List<Movimento> findRange(int[] range);

    /**
     * Conta o número total de registros de movimento.
     * @return O número total de movimentos
     */
    int count();
    
}
