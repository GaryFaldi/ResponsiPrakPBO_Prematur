/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package view;

import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.event.ListSelectionListener;
import object.Barang;

/**
 *
 * @author Lab Informatika
 */
public interface MainView {
    public void setDataBarangTable(List<Barang>things);
    
    public void setIdTextField(String id);
    public String getIdTextField();
    
    public void setNamaCustTextField(String namaCust);
    public String geNamaCustTextField();
    
    public void setBarangTextField(String barang);
    public String getBarangTextField();
    
    public void setHargaTextField(String harga);
    public String getHargaTextField();
    
    public void setCicilanTextField(String cicilan);
    public String getCicilanTextField();
    
    public void setBungaTextField(String bunga);
    public String getBungaTextField();
    
    public void setAngsuranTextField(String angsuran);
    public String getAngsuranTextField();
    
    public void setTotalTextField(String total);
    public String getTotalTextField();
    
    public void setSearchTextField(String search);
    public String getSearchTextField();
    
    public String getSearchByComboBox();
    
    public void setBarangTableClickListener(ListSelectionListener listener);
    public int getSelectedRowIndex();
    public Barang getBarangByRow(int row);
    
}
