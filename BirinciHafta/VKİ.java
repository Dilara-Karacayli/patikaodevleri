import java.util.Scanner;

public class VKİ {

    public static void main(String[] args) {
        
        //Değişken tanımı yapma.
        double kilo,boy,vucutKitle;

        //Kullanıcıdan veri girişi almak için Scanner tanımı.
        Scanner kitle=new Scanner(System.in);
        
        //Kullanıcıdan boy ve kilosunun girilmesi istenir.

        System.out.println("Lütfen Boyunuzu (metre cinsinden) Giriniz: ");
        boy = kitle.nextDouble();

        System.out.println("Lütfen Kilonuzu Giriniz: ");
        kilo=kitle.nextDouble();

        vucutKitle=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksi: "+vucutKitle);


    }
    
}
