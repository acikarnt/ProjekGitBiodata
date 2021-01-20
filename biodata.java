import java.util.Scanner;

public class biodata {

    public static void main(String[] args) {
  
      
      String nama;
      String nim;
      String kelas;
      String jurusan;
      
      Scanner input_bio=new Scanner (System.in);
        System.out.println("Biodata Siswa CCIT yang ikut seminar");
        System.out.println("----------------");
     
      System.out.print("Masukan Nama Anda:");
      nama=input_bio.nextLine();
     
      System.out.print("Masukan NIM Anda :");
      nim=input_bio.nextLine();
      
      System.out.print("Masukan Kelas Anda :");
      kelas=input_bio.nextLine();
      
      System.out.println("Masukan Jurusan Anda :");
      jurusan = input_bio.nextLine();
        System.out.println("    ");
        System.out.println("------Biodata Dicetak-----");
        
      
      System.out.println("Nama = "+nama);
      System.out.println("Nim = "+nim);
        System.out.println("Kelas = "+kelas);
        System.out.println("Jurusan = "+jurusan);
        System.out.println("---Silahkan ikut seminar----");
    }
    }
    