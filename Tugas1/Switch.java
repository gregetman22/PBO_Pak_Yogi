package Tugas1;

import java.util.Scanner;

/**
 *
 * @author ASUS X454Y
 */
public class Switch {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int tahun, bulan = 0;
        System.out.println("Masukan Tahun = ");
        tahun = angka.nextInt();
        System.out.println("Masukan Bulan = ");
        bulan = angka.nextInt();
        switch(bulan){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Jumlah hari pada bulan " + bulan +" pada tahun " + tahun +" sebanyak 31 hari");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Jumlah hari pada bulan " + bulan +" pada tahun " + tahun +" sebanyak 30 hari");
            case 2:
                if(tahun % 4 == 0){
                    System.out.println("Jumlah hari pada bulan " + bulan +" pada tahun " + tahun +" sebanyak 29 hari");
                } else {
                    System.out.println("Jumlah hari pada bulan " + bulan +" pada tahun " + tahun +" sebanyak 28 hari");
                }
            default :
                System.out.println("Salah input pasa tahun dan/atau bulan");
        } 
    }
}
