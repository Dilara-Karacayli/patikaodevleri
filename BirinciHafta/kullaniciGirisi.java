import java.util.Scanner;

public class kullaniciGirisi {

    public static void main(String[] args) {
        
        //Değiştekn tanımlama yapıyoruz.
         String userName,password,select,newPassword;

        //Kullanıcıdan değer almak için Scanner sınıfı tanımlıyoruz.
         Scanner kullanici=new Scanner(System.in);

         //Kullanıcıdan verileri girmesini istiyoruz.
         System.out.print("Kullanıcı adınızı giriniz: ");
         userName=kullanici.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        password=kullanici.nextLine();
        
        //Kullanıcı bilgilerinin kontrolü. Tüm bilgiler doğru 
        if(userName.equals("patika")&&password.equals("java123")){
            System.out.println("Giriş Yaptınız.");

        }
         
        //Kullanıcı adi yanlış girildiği zaman.a
        else if(!(userName.equals("patika")))
        {
            System.out.print("Kullanıcı adınız yanlış. Lütfen yeniden giriniz.");
        }

        //Şifre hatalı girildiği zaman.
        else if(userName.equals("patika") && !(password.equals("java123")))
        {
            System.out.print("Şifreniz hatalıdır. \n  ");
            System.out.print("Şifrenizi sısfırlamak ister misiniz ?");
            System.out.print("Seçiminiz \n 1-Evet 'E' \n 2-Hayır 'H' ");
            select=kullanici.nextLine();

            //Seçime Göre İşlemler.
            if(select.equals("E")||select.equals("e"))
                 {
                    System.out.print("Lütfen yeni Bir şifre giriniz.");
                    newPassword=kullanici.nextLine();

                    //Doğru bir güncellemede.
             if(!(newPassword.equals("java123")))
                {
                    System.out.print("Şifreniz başarılı bir şekilde değiştirildi.");
                }
                else {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                 }

                 //Kullanıcı şifreyi değiştirmek istemez ise.
            else if(userName.equals("H")|| (userName.equals("h")))
            {
                System.out.print("Kullanıcı adi ve şifrenizi yeniden giriniz.");
            }
            else {
                System.out.print("Lütfen geçerli bir tercih yapınız.");
            }
           
        }

        

        


    }
    
}
