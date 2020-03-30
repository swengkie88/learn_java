import java.util.Scanner;
class ContohMenu{ 
    static String pilihMenu;
    static boolean x, y;
    static void inputNilai(){
        System.out.println("Ini  menu inputkan nilai\n");
    }
    static void tampilkanNilai(){
        System.out.println("Ini menu tampilkan nilai\n");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        x = true;
        do{
            System.out.println("\nSilahkan pilih menu");
            System.out.println("1. Inputkan nilai");
            System.out.println("2. Tampilkan nilai");
            System.out.println("3. Keluar");
            System.out.print("Masukan pilihan anda...");
            pilihMenu = input.next(); 
            switch(pilihMenu){
                case "1":
                    inputNilai();
                    y = true;
                    break;
                case "2":
                    tampilkanNilai();
                    y = true;
                    break;
                case "3":
                    System.out.println("Anda keluar dari program");
                    y = false;
                    break;
                default:
                    System.out.println("Menu anda tidak valid");
                    break;
            }
        }while(x == y);
    }

}