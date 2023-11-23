/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java para editar este modelo
 */
package cadastroee.controller;

import cadastroee.model.PessoaJuridica;
import java.util.List;

/**
 * Interface que define operações específicas para a entidade Pessoa Jurídica.
 * Esta interface é utilizada para declarar métodos relacionados a Pessoa Jurídica.
 * @author Andrey
 */
@jakarta.ejb.Local
public interface PessoaJuridicaFacadeLocal {

    void create(PessoaJuridica pessoaJuridica);

    void edit(PessoaJuridica pessoaJuridica);

    void remove(PessoaJuridica pessoaJuridica);

    PessoaJuridica find(Object id);

    List<PessoaJuridica> findAll();

    List<PessoaJuridica> findRange(int[] range);

    int count();
    
}
