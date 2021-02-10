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
public enum Kendaraan {
     Becak,Mobil,Speda,SpedaMotor;
    
    public String toString(){
        switch(this){
            case Becak:
                return "Becak";
            case Mobil:
                return "Mobil";
            case Speda:
                return "Speda";
            case SpedaMotor:
                return "Spedamtor";
            default:return "null";
        }
    }
}
