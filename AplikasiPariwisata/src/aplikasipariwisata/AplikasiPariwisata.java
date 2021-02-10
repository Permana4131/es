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

import java.util.Scanner;
public class AplikasiPariwisata {
 public String nimSaya = "11418028";
 public String namaSaya = "Permana";
 public int angkatanSaya = 2018;
    
  private String nama;
  private String versi;
  TourGuide guide[] = new TourGuide[3];
  Turis turis[] = new Turis[3];
  PaketWisata paket[] = new PaketWisata[20];
  
 
  //nested Class
//class Outer{
//      private int a;
//      
//   
   
  

  
    public static void main(String[] args) {
       AplikasiPariwisata app = new AplikasiPariwisata();
       
          Turis dd = new Turis();
        System.out.println(" Nested Class");
        
       dd.m1();
       //agar tidak terjadi pinternull
       for(int i = 0 ; i<app.paket.length;i++){
            app.paket[i] = app.addPaketWisata(0, null, null, null);
        }
       
        System.out.println("===overloading 1");
     
     
       dd.tambah(20, 3);
       dd.tambah(20, 3);
        System.out.println("overloading 2=========");
      String a= dd.about("Permana");
       
      String a2= dd.about("Ako", "Medan");
        System.out.println(a);
        System.out.println(a2);
//       
       // try catch finally
       try{
       app.turis[0] =  app.addTuris("3i3", "Jepang", "Permana", "Pasar Baru", "25-09-1999");
       app.turis[1] = app.addTuris("3r4", "Indonesia", "Panida", "Jakarta", "20-09-2000");
       app.turis[2] = app.addTuris("3s4", "Indonesia", "Sembiring", "Jakarta", "20-09-2002");
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Sometihing eror "+ e);
       }finally{
           System.out.println(" TERIMAKASIH :V ");
       }
       app.guide[0] =  app.addTourGuide("Tokyo", "Jepang", "Permana", "Pasar Baru", "25-09-199");
       app.guide[1] = app.addTourGuide("Medan", "Indonseia", "Ako", "Medan", "20-23-2000");
       app.guide[2] = app.addTourGuide("Jakarta", "Indonseia", "Ako", "Medan", "20-23-2000");
       
       app.paket[0] = app.addPaketWisata(1221, "Free to Tokyo", Akomodasi.Homestay, Kendaraan.Becak);
       app.paket[1] = app.addPaketWisata(1221, "Free to Fuji", Akomodasi.Homestay, Kendaraan.Becak);
       app.paket[2] = app.addPaketWisata(1221, "Medan Trans", Akomodasi.Homestay, Kendaraan.Becak);
       
        System.out.println("===============Turis==============");
        app.showAllTuris(app.turis);
        System.out.println("============TurGuide===============");
        app.showAllTuorGuide(app.guide);
        System.out.println("============Paket Wisata===========");
        app.showAllPaketWisata(app.paket);
        System.out.println("===========Detail Paket===========");
        app.showDetailPaketWisata(app.paket);
        
        int x;
        Scanner keyboard = new Scanner(System.in);
        do{
               
            System.out.println("\n\nSelamat siang\n" +
                                "Apakah Anda ingin: \n"
                    + "(1) menambah Paket Wisata, atau\n" +
                    "(2) mencari detil Paket Wisata\n" +
                    "(3) berhenti\n" +
                    "Ketikkan angka 1, 2 atau angka 3 untuk pilihan Anda dan diikuti tombol Enter");
            x =  keyboard.nextInt();
            //Terlanjur menambahkan data ke arry sebelmuny
            if(x==1){
                System.out.printf("id : ");
            int idPaket = keyboard.nextInt();
                System.out.print("Paket : ");
                keyboard.nextLine();
            String namePaketWisata = keyboard.nextLine();
            for(int i = 0; i <app.paket.length;i++){
                if(app.paket[i].getNamePaketWisata()== null){
                    app.paket[i] = app.addPaketWisata(idPaket, namePaketWisata, Akomodasi.Hotel, Kendaraan.SpedaMotor);
                        break;
                }
            }
           
           
            }else if(x ==2){
                System.out.printf("Masukkan Nama Paket Wisata : ");
                keyboard.nextLine();
                String cari = keyboard.nextLine();
                for(int i = 0 ; i<app.paket.length;i++){                 
                    if(cari.equals(app.paket[i].getNamePaketWisata())){
                       
                        System.out.println(app.paket[i].detailPaket());
                        
                    }
                }                
            }else break;
        }
        while(x !=0);
       System.out.println("Terimakasih sudah menggunakan Sistem Kepegawaian");
    }
  
    Turis addTuris(String noPassport, String kewarganegaraan, String nama, String tempatLahir, String tanggalLahir){
         Turis a = new Turis();
        a.Turis(noPassport, kewarganegaraan, nama, tempatLahir, tanggalLahir);
        return a;
    }
    TourGuide addTourGuide(String kotaAsal, String sertifikatKeahlian, String nama, String tempatLahir, String tanggalLahir){
         TourGuide a = new TourGuide();
        a.TourGuide(kotaAsal, sertifikatKeahlian, nama, tempatLahir, tanggalLahir);
        return a;
    }
    
    PaketWisata addPaketWisata(int idPaket, String namePaketWisata, Akomodasi akomodasi, Kendaraan Kendaraa){
        PaketWisata a = new PaketWisata();
        a.PaketWisata(idPaket, namePaketWisata, akomodasi, Kendaraa);
        return a;
    }

    public void showAllTuris(Turis turis[]){
        for(int i = 0 ; i<turis.length;i++){
            if(turis[i].getNama()!= null){
                System.out.println(i+1+"."+turis[i].cetakPerson());
                System.out.println("----------------");
            }
        }
    }
    
    
    void showAllTuorGuide(TourGuide tour[]){
        for(int i = 0 ;i < tour.length;i++){
            if(tour[i].getNama()!=null){
                System.out.println(i+1+"."+tour[i].cetakPerson());
                System.out.println("----------------");
            }
        }
    }
    
    void showAllPaketWisata( PaketWisata paket[]){
        for(int i = 0 ;i < paket.length;i++){
            if(paket[i].getIdPaket()!= 0){
                System.out.println(i+1+"."+paket[i].getNamePaketWisata());
                System.out.println("----------------");
            }
        }
    }
    
    void showDetailPaketWisata( PaketWisata paket[]){
        for(int i = 0 ;i < paket.length;i++){
            if(paket[i].getIdPaket()!= 0){
                System.out.println(i+1+"."+paket[i].detailPaket());
                System.out.println("----------------");
            }
        }
    }
    
    
      public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getVersi() {
        return versi;
    }

    public void setVersi(String versi) {
        this.versi = versi;
    }
    

    
   
     
}
