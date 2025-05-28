/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccess;
import java.util.List;
import object.Barang;

/**
 *
 * @author Lab Informatika
 */
public interface BarangRepo {
    public List<Barang>getAll();
    public boolean insert(Barang barang);
    public boolean delete(int id);
    public boolean update(Barang barang);
    public Barang detById(int id);
    public List<Barang>getByColumn(String column, String key);
}
