/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cliente;
import Model.Usuario;
import ModelDAO.UsuarioDAO;

/**
 *
 * @author jo3ld
 */
public class ControlUsuario {
   
    public void cadastrarUsuario(Cliente usuario){
        UsuarioDAO dao = new UsuarioDAO();
        dao.inserir(usuario);
    }
    public void consultarUsuario(String cpf){
        
    }
    public void alterarDadosUsuario(Usuario usuario){
        
    }
    public void excluirUsuario(){
        
    }
}
