/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java para editar este modelo
 */
package cadastroee.controller;

import cadastroee.model.PessoaFisica;
import java.util.List;

/**
 * Interface que define operações específicas para a entidade Pessoa Física.
 * Esta interface descreve métodos para interagir com o banco de dados e realizar operações relacionadas à Pessoa Física.
 * @author Andrey
 */
@jakarta.ejb.Local
public interface PessoaFisicaFacadeLocal {

    void create(PessoaFisica pessoaFisica);

    void edit(PessoaFisica pessoaFisica);

    void remove(PessoaFisica pessoaFisica);

    PessoaFisica find(Object id);

    List<PessoaFisica> findAll();

    List<PessoaFisica> findRange(int[] range);

    int count();
    
}
