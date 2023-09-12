import java.util.Scanner;
public class ciftvedordunkatlari {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int n ;
        int toplam=0;
        
        Scanner hesap= new Scanner(System.in);

        do{
            System.out.print("Sayı Giriniz: ");
            n=hesap.nextInt();

            if(n % 4 == 0){
                
               toplam+=n;
               
            }
        }while(n % 2 == 0);

        System.out.print("Toplam değerleri: " +toplam);
    }
    
}
