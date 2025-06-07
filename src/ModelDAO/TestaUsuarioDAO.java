/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ModelDAO;


/**
 *
 * @author jo3ld
 */
import Model.Cliente;

public class TestaUsuarioDAO {

    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        // Inserir um cliente novo
        Cliente novo = new Cliente();
        novo.setUsername("Rainha_Candy");
        novo.setSenha("b7#09146gr");
        novo.setNome("Rebeca");
        novo.setEmail("teste@exemplo.com");
        novo.setCpf("12345678998");
        novo.setTelefone("123456789");
        dao.inserir(novo);
        System.out.println("Cliente inserido!");

        // Listar todos os clientes e mostrar no console
        System.out.println("Lista de clientes:");
        for (Cliente c : dao.listar()) {
            System.out.println(c.getId() + " | " + c.getUsername()+ " | " + c.getSenha()+ " | " + c.getNome()+ " | "+ c.getEmail()+ " | "+ c.getCpf()+ " | " + c.getTelefone()+ " | ");
        }
    }
}
