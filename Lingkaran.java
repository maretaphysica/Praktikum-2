import java.util.Scanner;
public class Lingkaran{
    public static void main(String[]args){
        
        int jari;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Program Luas Lingkaran");
        System.out.println("\n\nMasukkan jari-jari\t: ");
        jari = keyboard.nextInt();
    
        float total = jari*jari*3.14F;
        System.out.println("\n\nLuas lingkaran adalah "+total);
    }
}