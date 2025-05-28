/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccess;

/**
 *
 * @author Lab Informatika
 */
public class BarangRepoFactory {
    private static BarangRepo barangRepo = null;
    
    public static BarangRepo getSingltone() {
        if(BarangRepoFactory.barangRepo == null){
            barangRepo = new BarangRepoQuery();
        }
        
        return BarangRepoFactory.barangRepo;
    }
}
