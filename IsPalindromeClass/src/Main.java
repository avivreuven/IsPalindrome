public class Main {

    public static void main(String[] args) {
        int num = 1221;
        if (IsPalindrome(num)) {
            System.out.println("The Number "+num+" is Palindrome");
        }
        else {
            System.out.println("The Number "+num+" is not Palindrome");
        }
    }

    public static boolean IsPalindrome(int num){
        int tempNum = num;
        int digitDiv = 1;
        if (num<10) {
            return true;
        }
        while (tempNum != 0) {
            tempNum = tempNum/10;
            digitDiv = digitDiv*10;
        }
        digitDiv=digitDiv/10;
        while (num>9){
            if (num%10 != num/digitDiv){
                return false;
            }
            num=num/10;
            digitDiv=digitDiv/10;
            num=num - num/digitDiv*digitDiv;
            digitDiv=digitDiv/10;
        }
        return true;
    }
}