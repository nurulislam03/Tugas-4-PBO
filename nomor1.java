
import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        String kataAsli, kataBalik = "";
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Inputkan Kata untuk Mengecek Palindrome : ");
        kataAsli = inputUser.nextLine();
        int panjang = kataAsli.length();
        
        for(int index = panjang -1; index>=0; index--){
            kataBalik = kataBalik + kataAsli.charAt(index);
        }
        
        if(kataAsli.equals(kataBalik)){
            System.out.println("Kata termasuk Palindrome");
        }
        else{
            System.out.println("Kata bukan termasuk Palindrome");
        }
    }
}
