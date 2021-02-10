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
public class Turis extends Warga implements PelatihDiving{

     private String noPassport;
     private String kewarganegaraan;
   
     public void m1(){
      
        class Inner{
            public void display(String kewarganegaraan){
                System.out.println("Kewarganegaraan : "+kewarganegaraan);
                    }
                    }
                Inner in=new Inner();
            in.display("Jepang");
           
 
    }
     
     
    public Turis() {
    }

    public void Turis(String noPassport, String kewarganegaraan, String nama, String tempatLahir, String tanggalLahir) {
        setTempatLahir(tempatLahir);
        setNama(nama);
        setTanggalLahir(tanggalLahir);
        this.noPassport = noPassport;
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getNoPassport() {
        return noPassport;
    }

    public void setNoPassport(String noPassport) {
        this.noPassport = noPassport;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

         public void tambah(int a ,int b){
            System.out.println(a+b);
    }
    
    public void tambah(int a, int b, int c){
        System.out.println(a+b+c);
    }
    
    public String about(String nama){
       return" nama :"+nama;
    }
    
    public String about(String nama, String alamat){
            return "nama :"+ nama+" alamat : "+alamat;
    }
     
     
    @Override
    public String cetakPerson() {
        return "Nama : "+getNama()
                + "\nNo Passport : "+getNoPassport()
                + "\nKewarga Negaraan : "+getKewarganegaraan()
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
