import java.util.Scanner;

public class cinzodyagi {
    public static void main(String[] args) {

        //Değişken tanımı yapıyoruz.
        int dogumyili,kalan;
        
        //Kullanıcıdan bilgi almak için Scanner tanımı yapıyoruz.
        Scanner zodyak= new Scanner(System.in);

        //Kullanıcıdan veri girişini istiyoruz.
        System.out.print("Doğum yılınızı giriniz: ");
        dogumyili=zodyak.nextInt();

        //Kalanı hesaplatıyoruz.
        kalan= dogumyili % 12;

        //Çin zodyağı'nı belirlemek için koşul tanımlıyoruz.
        switch(kalan){
            case 0:
            System.out.println("Çin Zodyağınız: Maymun");
            break;

            case 1:
            System.out.println("Çin Zodyağınız: Horoz");
            break;

            case 3:
            System.out.println("Çin Zodyağınız: Köpek");
            break;

            case 4:
            System.out.println("Çin Zodyağınız: Domuz");
            break;

            case 5:
            System.out.println("Çin Zodyağınız: Fare");
            break;

            case 6:
            System.out.println("Çin Zodyağınız: Öküz");
            break;

            case 7:
            System.out.println("Çin Zodyağınız: Kaplan");
            break;

            case 8:
            System.out.println("Çin Zodyağınız: Tavşan");
            break;

            case 9:
            System.out.println("Çin Zodyağınız: Ejderha");
            break;

            case 10:
            System.out.println("Çin Zodyağınız: Yılan");
            break;

            case 11:
            System.out.println("Çin Zodyağınız: At");
            break;

            case 12:
            System.out.println("Çin Zodyağınız: Koyun");
            break;
        }
        
    }
    
}
