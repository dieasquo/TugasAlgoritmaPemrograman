/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan10_KoneksiDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Koneksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Koneksi tesDatabase = new Koneksi();
        tesDatabase.koneksi();
    }

    Connection con = null;

    String statusKoneksi;

    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost/mahasiswa";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);

            JOptionPane.showMessageDialog(null, "Sukses Terhubung");

            statusKoneksi = "Terhubung";
        } catch (Exception e) {
            statusKoneksi = "Gagal Terhubung";
            System.exit(0);
        }
    }

}
