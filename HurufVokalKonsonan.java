import java.util.Scanner;
public class HurufVokalKonsonan{
    static String hapusHurufVokal(String textnya){
        // Manual method
        // String konsonan = "";

        // for(char karakter : textnya.toCharArray()){
        //     if( karakter != 'a' && karakter != 'i' &&
        //         karakter != 'u' && karakter != 'e' &&
        //         karakter != 'o' && karakter != ' ' 
        //     ){
        //         konsonan += karakter;
        //     }
        // }

        // Fast method;
        return textnya.replaceAll("[aiueo ]", "");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan teks: ");
        String textnya = scan.nextLine().toLowerCase();
        System.out.println("Teks tanpa huruf vokal = " + hapusHurufVokal(textnya));
    }
}