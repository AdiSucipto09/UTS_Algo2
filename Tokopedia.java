public class Tokopedia {
    
    public String Nama_Barang;
    public String Foto_Produk;
    public int Harga;
    public String Deskripsi_Barang;
    public String Asal_Barang;

    public Tokopedia (){

    }

    public Tokopedia (String nama,String foto, int harga, String deskripsi, String asal){
        this.Nama_Barang = nama;
        this.Foto_Produk = foto;
        this.Harga = harga;
        this.Deskripsi_Barang = deskripsi;
        this.Asal_Barang = asal;
    }

    public void CetakStatus (Stirng mystatus){
        switch (mystatus){
            case "Tersedia":
                System.out.println("Produk ini masih tersedia");
                break;
            case "Habis":
                System.out.println("Stok Habis");
                break;
            default:
                break;
        }
    }
}
