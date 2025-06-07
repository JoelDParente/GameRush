/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jo3ld
 */
public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/gamerush?useSSL=false&serverTimezone=GMT";
    private static final String USER = "root";
    private static final String PASSWORD = "K1@d357*h_/.";

    // Método para obter conexão
     public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco de dados: ", e);
        }
    }
}
