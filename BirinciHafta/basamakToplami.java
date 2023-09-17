import java.util.Scanner;

public class basamakToplami {
    public static void main(String[] args) {
        
        
        int number;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        number=inp.nextInt();

        int toplam = 0;

        while(number != 0){
            toplam += number % 10;
            number /= 10;
        }

        System.out.print("Basamaklar toplamı: "+toplam);


    }
    
}
