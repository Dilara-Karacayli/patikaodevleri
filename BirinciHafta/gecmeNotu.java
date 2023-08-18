import java.util.Scanner;

public class gecmeNotu {

    public static void main(String[] args) {
        //Değişken tanımlama yapılır.
        double matematik , turkce, kimya ,fizik, muzik;
        double toplam,ort;
        
        //Kullanıcıdan bilgi almak için Scanner tanımlanır.
        Scanner not=new Scanner(System.in);

        //Kullanıcıdan notları girmesi istenir.
        System.out.print("Matematik notunuzu giriniz:");
        matematik=not.nextDouble();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce=not.nextDouble();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya=not.nextDouble();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik=not.nextDouble();

        System.out.print("Müzik notunuzu giriniz:");
        muzik=not.nextDouble();

        //Ortalama hesabı yapıyoruz.
        toplam=matematik+turkce+fizik+kimya+muzik;
        ort=toplam/5;

        //Kullanıcının geçtiğini mi kaldığını mı ifade eden kod bloğu.
        if(ort<=55){
            System.out.println("Sınıfta kaldınız.");
        }else{
            System.out.println("Sınıfı geçtiniz");

        }
        System.out.print("Ortalamanız: "+ ort);

    }
    
}
