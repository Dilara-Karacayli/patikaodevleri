public class palindromsayilar {

    static boolean isPalindrom(int number){
        int temp=number , reverNumber = 0 , lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverNumber = (reverNumber * 10) + lastNumber;
            temp /= 10;
        }

        if(number == reverNumber)
            return true;

        else
            return false;
    }
    public static void main(String[] args) {
        
        System.out.print(isPalindrom(101));
    }
    
    
}
