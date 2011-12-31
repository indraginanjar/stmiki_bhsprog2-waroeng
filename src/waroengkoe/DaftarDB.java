/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package waroengkoe;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author indra
 */
public abstract class DaftarDB<T> {
    Connection connection;    
    public DaftarDB(Connection connection){
        this.connection = connection;
    }
    
    /**
     * Menambahkan barang ke tabel barang di basis data
     * @param namaBarang
     * @param harga
     * @param persediaan
     * @return true -- jika berhasil, false -- jika gagal (muncul exception)
     */
    public abstract boolean tambah(T item);
    
    public abstract void ubah(T item);
    
    public abstract void hapus(String key);
    
    /**
     * Mengambil daftar dari basis data
     * @param namaTabel
     * @return ResulSet berisi isi tabel, null jika gagal/ terjadi kesalahan
     */
    protected ResultSet ambilDaftar(String namaTabel){
        ResultSet resultSet = null;
        try{
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM " + namaTabel);
            
        }catch(SQLException ex){
            System.err.println("DaftarDB.ambilDaftar():\n" 
                    + ex.getMessage());
        }
        return resultSet;
    }    
}
