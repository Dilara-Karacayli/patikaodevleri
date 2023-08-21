import java.util.Scanner;
public class buyuktenkucuge {
    public static void main(String[] args) {
        //Değişken tanımı yapılıyor.
        int a ,b ,c;

        //Scanner tanımı yapılıyor.
        Scanner inp=new Scanner(System.in);

        System.out.print("a değerinizi giriniz:");
        a=inp.nextInt();

        System.out.print("b değerinizi giriniz:");
        b=inp.nextInt();

        System.out.print("c değerini giriniz: ");
        c=inp.nextInt();

       if((a>b) && (a>c)){
            if(b>c){
                System.out.print("a>b>c");
            }else{
                System.out.print("a>c>b");
            }
       }else if((b>a) && (b>c)){
            if(a>c){
                System.out.print("b>a>c");
            }else{
                System.out.print("b>c>a");
            }
       }else{
            if(a>b){
                System.out.print("c>a>b");
            }
            else{
                System.out.print("c>b>a");
            }

       }
    }
    
}
