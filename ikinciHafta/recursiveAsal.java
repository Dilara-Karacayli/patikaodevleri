import java.util.Scanner;

public class recursiveAsal {

    static int asal(){
        Scanner inp= new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = inp.nextInt();
        int sayac=0;

        if(sayi<= 1){
            System.out.print("En küçük asal sayi 2'dir.");
        }

        else{
            for(int i=2; i<= sayi; i++){
                int kalan=sayi%i;
                if(kalan==0){
                    sayac++;
                }
            }

            if(sayac==2){
                System.out.print("Sayi ASALDIR!");
            }

            else{
                System.out.print("Sayi ASAL DEĞİLDİR!");
            }
        }
        
        return sayac;
    }

   public static void main(String[] args) {

    System.out.print(asal());
    
   }

    
}
