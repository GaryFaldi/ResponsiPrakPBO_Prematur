/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import object.Barang;
import dataaccess.BarangRepo;
import view.MainView;

/**
 *
 * @author Lab Informatika
 */
public class BarangController {
    private BarangRepo barangRepo;
    private MainView mainView;
    
    public BarangController(BarangRepo barangRepo, MainView mainView){
        this.barangRepo = barangRepo;
        this.mainView = mainView;
        
        this.initListener();
    }
    
    private void initListener(){
        this.mainView.setDataBarangTable(this.barangRepo.getAll());
        this.mainView.setBarangTableClickListener(e -> this.onBarangTableClicked());
        this.mainView.addClearListener(e -> this.clearForm());
        this.mainView.addSimpanListener(e -> this.onSimpan());
        this.mainView.addHapusListener(e -> this.onHapus());
        this.mainView.addUpdateListener(e -> this.onUpdate());
        this.mainView.addCariListener(e -> this.onCari()); 
        this.mainView.addTampilSemuaListener(e -> this.onTampilSemua()); 
    }
    private void onTampilSemua(){
        this.mainView.setDataBarangTabel(this.barangRepo.getAll());
    }
    
    private void onCari(){
        if(this.mainView.getSearchByComboBox().isEmpty()){
            String searchColumn = this.mainView.getSearchByComboBox();
            String searchInput = this.mainView.getSearchTextField();
            
            if(searchInput.isEmpty()){
                return;
            }
            
            List<Barang> things = new ArrayList<>();
            
            if(searchColumn.equals("id")) {
                Barang thing = this.barangRepo.getById(Integer.parseInt(searchInput))
            };
            if(thing.id != 0) {
                things.add(thing);
            } else {
                things = this.barangRepo.getByColumn(searchColumn, searchInput);
            }
            
            this.mainView.setDataBukuTable(things);
        }
    }
    
    private void onSimpan(){
        if
    }
}
