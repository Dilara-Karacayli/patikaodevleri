import java.util.Scanner;

public class ucgenHesabi {

    public static void main(String[] args) {

        //Değişken tanımlama işlemi.
        int a , b  ;
        double c,u , cevre, alan;

      //Kullanıcıdan değer almak için Scanner tanımı yapıyoruz.

      Scanner inp=new Scanner(System.in);
      
      //Kullanıcıdan değerleri girmesini istiyoruz.

      System.out.println("a değerini giriniz: ");
      a=inp.nextInt();

      System.out.println("b değerini giriniz: ");
      b=inp.nextInt();

      //Hipotenüs hesaplatıyoruz.
      c=Math.sqrt((a*a)+(b*b));

      System.out.println("Hipotenüs: "+ c);
      
      //Ücgen çevre hesabı.
      u=(a+b+c)/2;
      System.out.println("u: "+u);

      cevre=2*u;
      System.out.println("Çevre: "+cevre);

      //Üçgen alanı hesabı.
      alan=u*(u-a)*(u-b)*(u-c);
      System.out.println("Alan: "+alan);
      

    }
    
    
}
