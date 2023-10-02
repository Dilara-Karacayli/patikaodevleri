import java.util.Scanner;

public class gelismisHesapMakinesi {

    static int sum(int a, int b){
        int resualt = a + b;
        System.out.println("Toplam: "+resualt );
        return resualt;
    }

    static int minus(int a , int b){
      int resualt = a - b;
      System.out.println("Farkı: "+resualt);
      
        return resualt;
    }

    static int multi(int a , int b){
        int resualt = a*b;
        System.out.println("Çarpım: "+resualt);
        return resualt;
    }

    static int diveded(int a , int b){
        if(b == 0){
            System.out.println("b değeri 0'dan büyük olmalıdır.");
            return 0;
        }
        int resualt = a/b ;
        System.out.println("Bölme: "+ resualt);
        return resualt;
    }

    static int power(int a , int b){
        int resualt = 1;
        for(int i =1 ; i<= b ; i++){
            resualt *= a;
        }

        return resualt;
    }

    static void calc(int a , int b){
        System.out.println("Çevresi: "+ (2*(a+b)));
        System.out.println("Alan: "+ (a*b));
    }

    static int mod(int a , int b){
        return a % b;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int select;

        
        String menu = "1-Toplama İşlemi \n" 
                    + "2- Çıkarma İşlemi \n"
                    + "3- Çarpma İşlemi \n"
                    + "4- Bölme İşlemi \n"
                    + "5- Üs Alma İşlemi\n"
                    + "6- Mod Alma İşlemi \n"
                    + "7- Dikdörtgen Alan-Çevre Hesaplama \n"
                    + "0- Çıkış \n";

            
            System.out.print(menu);
            
            while(true){
            
            System.out.print("Bir işlem seçiniz: ");
            select = inp.nextInt();

            if(select == 0){
                break;
            }

            System.out.print("İlk sayıyı giriniz: ");
            int a = inp.nextInt(); 
            System.out.print("İkinci sayıyı giriniz: ");
            int b = inp.nextInt();

            switch(select){
                case 1:
                    sum(a,b);
                break;
                
                case 2:
                    minus(a, b);
                break;

                case 3:
                    multi(a, b);
                break;

                case 4:
                    diveded(a, b);
                break;

                case 5:
                    System.out.println("Üs Hesabı "+ power(a, b));
                break;

                case 6: 
                    mod(a, b);
                break;

                case 7:
                    calc(a, b);
                break;

                default:
                System.out.print("Geçersiz bir işlem girdiniz.");

                
            }

            }
    }
}
