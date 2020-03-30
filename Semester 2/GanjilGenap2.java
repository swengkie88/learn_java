import java.util.Scanner;
class GanjilGenap2{
    
    static String apakahGanjil(int paramBil){
        String hasil = "";
        if(paramBil % 2 != 0){
            hasil = "ganjil";
        }else{
            hasil = "genap";
        }
        return hasil;
    }   
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangganya...");
        int bilangan = input.nextInt();
        System.out.println(bilangan + " Merupakan angka " + apakahGanjil(bilangan));
       
    }
}