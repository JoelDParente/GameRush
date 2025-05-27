/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Usuario;
import ModelDAO.UsuarioDAO;
import java.sql.Connection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
/**
 *
 * @author jo3ld
 */
public class ControlUsuario {
    
    private EntityManagerFactory emf;

    public ControlUsuario() {
        this.emf = Persistence.createEntityManagerFactory("GameRushPU");
    }
    
    
    public void cadastrarUsuario(UsuarioDAO usuario){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Funcionou");
        } catch (Exception e) {
           if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário: " + e.getMessage());
        } finally {
            em.close();
        }
    }
    public void consultarUsuario(String cpf){
        
    }
    public void alterarDadosUsuario(Usuario usuario){
        
    }
    public void excluirUsuario(){
        
    }
}
