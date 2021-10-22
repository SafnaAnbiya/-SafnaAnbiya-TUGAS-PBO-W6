package Dependency;

import java.math.BigDecimal;
import java.sql.Connection;

public class ProdukCRUD {
	public void create(Produk p) throws Exception {
        String sql = "insert into produk (kode, nama, harga) ";
        sql += "(?,?,?)";
        Connection databaseConnection = dataSource.getConnection();
        PreparedStatement ps = databaseConnection.prepareStatement(sql);
        ps.setString(1, p.getKode());
        ps.setString(2, p.getNama());
        ps.setBigDecimal(3, p.getHarga());
        ps.executeUpdate();
        databaseConnection.close();
	}
	
	public static void main(String[] xx){
        Produk p = new Produk();
        p.setKode("P-001");
        p.setNama("Produk 001");
        p.setHarga(new BigDecimal(10000.00));
        
        ProdukDao pd = new ProdukDao();
        pd.create(p);
    }
}
