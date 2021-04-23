package Tugas1;

/**
 *
 * @author ASUS X454Y
 */
public class IfElse2 {
    public static void main(String[] args) {
        int HealPoint_Musuh = 100, serangan = 30;
        
        System.out.println("HP musuh : " + HealPoint_Musuh);
        System.out.println("Atk Point : " + serangan);
        
        if(HealPoint_Musuh > serangan) {
            System.out.println("HIT!! sisa HP musuh : " + (HealPoint_Musuh - serangan));
        } else if (HealPoint_Musuh < serangan){
            System.out.println("OVERKILL!!!");
        } else {
            System.out.println("Musuh terkalahkan, beralih ke stage selanjutnya");
        }
    }
}
