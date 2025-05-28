/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccess;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import connector.Connector;
import object.Barang;

/**
 *
 * @author Lab Informatika
 */
public class BarangRepoQuery implements BarangRepo{

    @Override
    public List<Barang> getAll() {
        List<Barang>things = new ArrayList<Barang>();
        Connection conn  = Connector.getConnection();
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM barang");
            
            while(rs.next()){
                Barang things;
                things = new Barang();
                things.id = rs.getInt("id");
                things.namaCust = rs.getString("namaCust");
                things.barang = rs.getString("barang");
                things.harga = rs.getInt("harga");
                things.cicilan = rs.getInt("cicilan");
                things.bunga = rs.getInt("bunga");
                things.angsuran = rs.getInt("angsuran");
                things.total = rs.getInt("total");
            }
            return things;
        } catch (SQLException e){
            return things;
        }
        return things;
    }

    @Override
    public boolean insert(Barang barang) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Barang barang) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Barang detById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Barang> getByColumn(String column, String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
