/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connector;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLClientInfoException;
import com.mysql.cj.jdbc.MysqlDataSource;

/**
 *
 * @author Lab Informatika
 */
public class Connector {
    private static Connection connection = null;
    public static Connection getConnection() {
        if(Connector.connection == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("db_barang");
            data.setUser("root");
            data.setPassword("");
            try {
                Connector.connection = data.getConnection();
            } catch (SQLException exception) {
            }
        }
        return Connector.connection;
    }
}
