package rapor;
import java.util.Scanner;
public class Rapor {
    static void nama() {
    System.out.println("Achmad Azhar Aldiansyah");}
    
    static void kelas() {
    System.out.println("X RPL 3");}
    
    static void absen() {
    System.out.println(" 01 ");}
    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char grade = 0;
    boolean keluar = true;
    int tugas1, tugas2, tugas3, nilaiPAS, nilaiAkhir, totalNilai;
        String ulang;
        
        nama();
        kelas();
        absen();
        
        System.out.println("\n");
        System.out.println("Nilai Rapor Anda");
        
        System.out.println("Masukkan nilai tugas 1 anda :");
        tugas1 = scan.nextInt();
        
        System.out.println("Masukkan nilai tugas 2 anda :");
        tugas2 = scan.nextInt();
        
        System.out.println("Masukkan nilai tugas 3 anda :");
        tugas3 = scan.nextInt();
        
        System.out.println("Masukkan nilai PAS anda");
        nilaiPAS = scan.nextInt();
        
        totalNilai = (tugas1 + tugas2 + tugas3 + nilaiPAS);
        nilaiAkhir = (totalNilai /4);
        System.out.println("Nilai rapor anda = " +nilaiAkhir );
        
        if (nilaiAkhir > 85 && nilaiAkhir <= 100){
        grade = 'A';}
        
        else if (nilaiAkhir >= 75 && nilaiAkhir <= 85) {
        grade = 'B';}
        
        else if (nilaiAkhir >= 70 && nilaiAkhir <= 75) {
        grade = 'C';}
        
        else if (nilaiAkhir <70) { 
        grade  = 'D';}
        
        
        switch(grade){
            case 'A':
                System.out.println("Anda memiliki nilai akhir "+nilaiAkhir+ " = ("+grade+")"+""
                + "\n Selamat anda Lulus");
                break;
            case 'B':
                System.out.println("Anda memiliki nilai akhir "+nilaiAkhir+ " = ("+grade+")"+""
                + "\n Selamat anda Lulus");
                break;
            case 'C':
                System.out.println("Anda memiliki nilai akhir "+nilaiAkhir+ " = ("+grade+")"+""
                + "\n Selamat anda Lulus");
                break;
            default:
                System.out.println("Anda mendapat nilai akhir "+nilaiAkhir+ " = ("+grade+")"+""
                + "\n Maaf anda Tidak Lulus");
                break;
           
            }
                while( keluar ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab Ya atau Tidak ");

            ulang = scan.nextLine();
           
            if (ulang.equalsIgnoreCase("ya") ){
                keluar = false;
        
           
            }
        
    }
    
    }
}


   