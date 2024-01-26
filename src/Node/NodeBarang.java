package Node;


public class NodeBarang {
    String NamaBarang;
    double Harga;
    int Stok;
    public NodeBarang(String namaBarang, double harga, int stok){
        this.NamaBarang = namaBarang;
        this.Harga = harga;
        this.Stok = stok;
    }
    
    public String getBarang(){
        return NamaBarang;
    }
    public void TambahBarang(String namaBarang, double harga, int stok){
        this.NamaBarang = namaBarang;
        this.Harga = harga;
        this.Stok += stok;
    }
    public void cetakBarang(){
        System.out.println("----------------------------------------------");
        System.out.println("Nama Barang  : "+NamaBarang);
        System.out.println("Harga Barang : "+Harga);
        System.out.println("Stok Barang  : "+Stok);
    }
    public void updateStok(String nama, double newHarga, int newStok) {
        this.NamaBarang = nama;
        this.Harga = newHarga;
        this.Stok = this.Stok + newStok;
    }
    public String getNama_Barang() {
        return NamaBarang;
    }
    public String findBarang(String barangName) {
        if (this.NamaBarang != null && this.NamaBarang.equalsIgnoreCase(barangName)) {
            return this.NamaBarang;
        } else {
            return null;
        }
    }
    public void Edit(){

    }
    public void Delete(){

    }
}
