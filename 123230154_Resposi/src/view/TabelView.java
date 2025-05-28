/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import object.Barang;


/**
 *
 * @author Lab Informatika
 */
public class TabelView extends AbstractTableModel {
    List<Barang> things = new ArrayList<Barang>();
    
    public void setThings(List<Barang> things) {
        this.things = things;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return this.things.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
