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
public interface PelatihDiving {
    int BIAYA_PER_SESI = 500000;
    int LEVEL_KEAHLIAN = 40;
    
    void mengajarDiving(String topik,int levelMateri);
    void melakukanPemanasan(int levelMateri);
    void menilai(String topik,int nilai);
}
