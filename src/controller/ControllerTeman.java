/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelTeman;
import util.koneksi;
/**
 *
 * @author Plaza
 */
public class ControllerTeman {
    koneksi koneksi = new koneksi();
    
    public void simpandata(ModelTeman mt){
        koneksi.koneksidatabase();
        String query = "insert into tbl_teman (id,nama,nope,email) values ('"+mt.getId()+"','"+mt.getNama()+"','"+mt.getNope()+"','"+mt.getEmail()+"')";
        try {
         koneksi.state.executeUpdate(query);
         JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan !!!");
        } catch (SQLException e) {
            System.err.println(""+e);
        }
    }
     public void hapusdata(ModelTeman mt){
         try {
         koneksi.koneksidatabase();
         String query = "delete from tbl_teman where id = ('"+mt.getId()+"')";
         koneksi.state.executeUpdate(query);
         JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus !!!");
         } catch (SQLException e) {
             System.err.println("Error "+e);
             JOptionPane.showMessageDialog(null, "Data Tidak Terhapus !!!");
         }
         
     }
    
     public void ubahdata(ModelTeman mt){
         koneksi.koneksidatabase();
         
         try {
             int id = mt.getId();
             String nama = mt.getNama();
             String nope = mt.getNope();
             String email = mt.getEmail();
             
             String query = "update tbl_teman set nama=('"+nama+"'),nope=('"+nope+"'),email=('"+email+"')where id=('"+id+"')";
             koneksi.state.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah !!!");
         } catch (SQLException e) {
             System.err.println("Error"+e);
             JOptionPane.showMessageDialog(null,"Data Tidak Terubah!!!");
         }
     }
    
}
