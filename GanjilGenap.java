import java.util.Scanner;
class GanjilGenap{
    static int bilangan;
    
    static int apakahGanjil(int bilangan){
        if(bilangan % 2 == 1){
            System.out.println("Bilangan anda = " + bilangan + " Nilainya ganjil");
        }else{
            System.out.println("Bilangan anda = " + bilangan + " Nilainya genap");
        }
        return bilangan;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangganya...");
        apakahGanjil(input.nextInt());
    }
}