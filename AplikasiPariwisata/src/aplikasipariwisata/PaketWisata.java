/*
* NIM : Permana
* NAMA : 11418028
* KELEAS : 42TRPL1
*/
package aplikasipariwisata;

/**
 *
 * @author Win10
 */
public class PaketWisata {
    private int idPaket;
    private String namePaketWisata;
    private Akomodasi akomodasi;
    private Kendaraan Kendaraan;

    public PaketWisata() {
       
    }

    public void PaketWisata(int idPaket, String namePaketWisata, Akomodasi akomodasi, Kendaraan Kendaraan) {
        this.idPaket = idPaket;
        this.namePaketWisata = namePaketWisata;
        this.akomodasi = akomodasi;
        this.Kendaraan = Kendaraan;
    }
    
    

    public int getIdPaket() {
        return idPaket;
    }

    public void setIdPaket(int idPaket) {
        this.idPaket = idPaket;
    }

    public String getNamePaketWisata() {
        return namePaketWisata;
    }

    public void setNamePaketWisata(String namePaketWisata) {
        this.namePaketWisata = namePaketWisata;
    }

    public Akomodasi getAkomodasi() {
        return akomodasi;
    }

    public void setAkomodasi(Akomodasi akomodasi) {
        this.akomodasi = akomodasi;
    }

    public Kendaraan getKendaraan() {
        return Kendaraan;
    }

    public void setKendaraan(Kendaraan Kendaraan) {
        this.Kendaraan = Kendaraan;
    }
    
    public String detailPaket(){
        return "Id Paket : "+getIdPaket()
                + "\n" 
                 +"Nama Paket Wisata :" +getNamePaketWisata()
                + "\n" +
                "Akomodasi : " +getAkomodasi()
                + "\n" +
                "Kendaraan : " +getKendaraan();
    }
    
    
    
    
}
