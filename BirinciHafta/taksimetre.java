import java.util.Scanner;


public class taksimetre {

    public static void main(String[] args) {
        
        //Değişken tanımı yapılıyor.
        int km;
        double perkm=2.20,total=10.0;
         
        //Kullanıcıdan veri almak için Scanner tanımlanıyor.
        Scanner yol=new Scanner(System.in);
        
        //Katedilecek mesafenin yazılması isteniyor.
        System.out.println("Mesafeyi KM cinsinden giriniz: ");
        km=yol.nextInt();
        

        //Hesaplama işlemleri yapılıyor.
        total=total+(perkm*km);
        total=(total<20) ? 20 : total;
        
        //Ekrana toplam tutar yazdırma işlemi yapılıyor.Ğ
        System.out.println("Toplam Tutar: "+total);


    }
    
}
