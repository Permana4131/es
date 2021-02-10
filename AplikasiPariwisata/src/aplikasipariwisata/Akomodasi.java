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
public enum Akomodasi {
     Homestay,Losmen,PenginapanMelati,Hotel;
    
    public String toString(){
        switch(this)
        {
            case Homestay:
                return "Homestay";
            case Losmen:
                return "Losmen";
            case PenginapanMelati:
               return "PenginapanMelait";
            case Hotel:
                return "Hotel";
            default:return "KOS";
        }
    }
}
