/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan13_UpdateDelete;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Delete {

    Koneksi konek = new Koneksi();

    public void delete(int nim) {

        try {
            
            konek.koneksi();
            Statement statement = konek.con.createStatement();

            String sql = "delete from identitas where nim = '" + nim + "'";

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
