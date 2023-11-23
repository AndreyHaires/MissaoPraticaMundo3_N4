/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java para editar este modelo
 */
package cadastroee.controller;

import cadastroee.model.Usuario;
import java.util.List;

/**
 * Interface que define as operações disponíveis para a entidade Usuario.
 * Esta interface lista os métodos para criar, editar, remover, encontrar, listar todos, listar em um intervalo e contar Usuarios.
 * @author Andrey
 */
@jakarta.ejb.Local
public interface UsuarioFacadeLocal {

    void create(Usuario usuario);

    void edit(Usuario usuario);

    void remove(Usuario usuario);

    Usuario find(Object id);

    List<Usuario> findAll();

    List<Usuario> findRange(int[] range);

    int count();
    
}
