package waroeng;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author indra
 */
public class DaftarBarangDB extends DaftarDB<Barang> {
    
    public DaftarBarangDB(Connection connection){
        super(connection);
    }
    
    /**
     * Menambahkan barang ke tabel barang di basis data
     * @param namaBarang
     * @param harga
     * @param persediaan
     * @return true -- jika berhasil, false -- jika gagal (muncul exception)
     */
    @Override
    public boolean tambah(Barang barang){
        return false;
    }
    
    @Override
    public void ubah(Barang barang){
        
    }
    
    @Override
    public void hapus(String key){
        
    }
    
    public ResultSet ambilDaftar(){
        return super.ambilDaftar("barang");
    }
}
