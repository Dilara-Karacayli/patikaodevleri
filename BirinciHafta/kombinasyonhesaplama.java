import java.util.Scanner;

public class kombinasyonhesaplama {
    public static void main(String[] args) {
        
        //Değişken tanımı yapılıyor.
        int n , r , nfak = 1 , rfak=1 , faktoriyel=1;
        int carpim , kombinasyon;

       //Scanner tanımı yapıyoruz.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan veri girişi istiyoruz.
        System.out.println("Kombinasyonun n değerini giriniz: ");
        n=inp.nextInt();

        System.out.println("Kombinasyonun r değerini giriniz: ");
        r=inp.nextInt();

         int fark=n-r;
        
         //Koşul tanımı yapıyor ve faktöriyel hesabından Kombinasyona ulaşıyoruz.
        if(n>r){
        for(int i=1; i>n; n--){
            
            nfak*=i;
            
        }
        
        for(int k=1; k>r; k--){

            rfak*=k;
        }
        for(int j=1; j>fark; j--){
            faktoriyel*=j;
        }

        //Kombinasyon işlemi yapıyoruz ve sonucu ekrana yazdırıyoruz.
        carpim= rfak*faktoriyel;
        kombinasyon=nfak/carpim;
        System.out.print("Kombinasyon Sonucu: " +kombinasyon);

        }else{
            System.out.print("n değeri r değerinden küçük olamaz.");
        }

    }
    
}
