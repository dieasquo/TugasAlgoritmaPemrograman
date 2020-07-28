/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan11_Insert;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Insert {

    Koneksi konek = new Koneksi();

    public void insert(int nim, String nama, String alamat, String jk) {

        try {
            
            konek.koneksi();
            Statement statement = konek.con.createStatement();

            String sql = "insert into identitas (nim, nama, alamat, jenis)" + "values('" + nim + "', '" + nama + "','" + alamat + "','" + jk + "')";

            statement.executeUpdate(sql);
            statement.close();

// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
//            menampilkan.setText(mah_nim.getText() + "\n" + mah_nama.getText() + "\n" + mah_alamat.getText() + "\n" + mah_fak_id.getText() + "\n" + jenis);

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
