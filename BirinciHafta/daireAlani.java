import java.util.Scanner;

public class daireAlani {

    public static void main(String[] args) {
        
        //Değişken tanımı yapıyoruz.
       int r,a;
       double pi=3.14, cevre , alan, DaireAlan ;
       
       //Scanner tanımı yapıyoruz. Kullanıcıdan bilgi almak için.
       Scanner hesap=new Scanner(System.in);
       
       //Yarı çapı kullanıcının girmesini istiyoruz.
       System.out.println("Yarı çapı giriniz: ");
       r=hesap.nextInt();

       //Matematiksel hesaplamaları yaptırıyoruz.
        cevre=2*pi*r;
        System.out.println("Dairenin Çevresi: "+cevre);

        alan=pi*r*r;
        System.out.println("Dairenin Alanı: "+alan);

        //Daire diliminin alanını bulma.
        System.out.println("a değerini merkez açı ölçüsü olarak giriniz:  ");
        a=hesap.nextInt();
        
        DaireAlan=(pi*(r*r)*a)/360;
        System.out.println("Dairenin bir diliminin alanı: "+DaireAlan);


    }
    
}
