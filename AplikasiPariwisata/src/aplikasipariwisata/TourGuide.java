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
public class TourGuide extends Warga implements PelatihDiving{

    private String kotaAsal;
    private String sertifikatKeahlian;
    
    public TourGuide() {
    }
    
    public void TourGuide(String kotaAsal, String sertifikatKeahlian, String nama, String tempatLahir, String tanggalLahir){
        setTempatLahir(tempatLahir);
        setNama(nama);
        setTanggalLahir(tanggalLahir);
        setKotaAsal(kotaAsal);
        setSertifikatKeahlian(sertifikatKeahlian);
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public void setKotaAsal(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    public String getSertifikatKeahlian() {
        return sertifikatKeahlian;
    }

    public void setSertifikatKeahlian(String sertifikatKeahlian) {
        this.sertifikatKeahlian = sertifikatKeahlian;
    }
    
    
    
    
      @Override
    public String cetakPerson() {
     return "Nama : "+getNama()
                + "\nKota Asal : "+getKotaAsal()
                + "\nSertifikat Keahlian : "+getSertifikatKeahlian()
                + "\nNama : " +getNama()
                + "\nTempat Lahir : "+getTempatLahir()
                + "\nTanggal Lahir : "+getTanggalLahir();
    }

    @Override
    public void mengajarDiving(String topik, int levelMateri) {
            System.out.println("Topik : "+topik+"Level Materi : "+levelMateri );
    }

    @Override
    public void melakukanPemanasan(int levelMateri) {
        System.out.println("Levetl Materi : " +levelMateri);
    }

    @Override
    public void menilai(String topik, int nilai) {
        System.out.println("Topik : "+topik+" Nilai : "+nilai);
    }
    
    
}
