/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author jo3ld
 */
public class TestaConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try (Connection conn = ConnectionFactory.getConnection()) {
            System.out.println("Conectado com sucesso!");

            // Exemplo: listar tabelas do banco
            ResultSet rs = conn.getMetaData().getTables(null, null, "%", null);
            while (rs.next()) {
                System.out.println("Tabela: " + rs.getString(3));
            }

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
