import java.util.Scanner;


public class notOrtalama
{
    public static void main(String[] args) {
        
        //Notların alınacağı derslerin tanımlanması.
       int mat, turkce,fizik,kimya,tarih,muzik;
       
       //Scanner sınıfının tanımı.
       Scanner inp = new Scanner(System.in);

       //Öğrenciden notların alınması.
       System.out.println("Matematik Notunuzu Giriniz:");
       mat=inp.nextInt();

       System.out.println("Türkçe notunuzu giriniz: ");
       turkce=inp.nextInt();

       System.out.println("Fizik notunuzu giriniz: ");
       fizik=inp.nextInt();

       System.out.println("Kimya notunuzu giriniz: ");
       kimya=inp.nextInt();

       System.out.println("Tarih notunuzu giriniz: ");
       tarih=inp.nextInt();
       
       System.out.println("Müzik notunuzu giriniz: ");
       muzik=inp.nextInt();
      
       //Not ortalamasının hesaplanması.
       int toplam ;

       toplam=(mat+turkce+kimya+fizik+tarih+muzik);

       double sonuc;

       sonuc=toplam/6.0;
       System.out.println("Not Ortalamaniz:"+sonuc);

       //Sınıfı geçip geçmediğinin sonucunun karar verilip ekrana yazılması.
        String str = (sonuc<60) ? "Sınıfta Kaldınız" : "Sınıfı Geçtiniz";

        System.out.println(str);
       




    }
    
}
