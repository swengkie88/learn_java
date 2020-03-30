import java.util.Scanner;

public class KonverterSuhu{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean x, y;
        x = true;
        y = true;
        double suhuAsal, hasilSuhu;
        suhuAsal = 0;
        hasilSuhu = 0;
        
        do{
            System.out.print("\033[H\033[2J");
            System.out.println("Software Konverter Suhu Sederhana");
            System.out.println("1. Celsius >> Fahrenheit");
            System.out.println("2. Fahrenheit >> Celsius");
            System.out.println("3. Celsius >> Kelvin");
            System.out.println("4. Fahrenheit >> Kelvin");
            System.out.println("5. Kelvin >> Celsius");
            System.out.println("6. Kelvin >> Fahrenheit\n");
            
            System.out.print("Silahkan pilih menunya... ");
            String pilihMenu = scan.next();
            System.out.println(" ");
            
            System.out.print("\033[H\033[2J");
            if(pilihMenu.equals("1")){
                System.out.println("=========Celsius >> Fahrenheit===========");
                System.out.print("Masukan suhu asal... ");

                if(scan.hasNextDouble()){
                    suhuAsal = scan.nextDouble();
                    hasilSuhu = suhuAsal * 9/5 + 32;
                    System.out.println("Hasil konversinya = " + hasilSuhu);
                }else{
                    System.out.println("Inputan anda bukan angka");
                }

    
            }else if(pilihMenu.equals("2")){
                System.out.println("=========Fahrenheit >> Celsius===========");
                System.out.print("Masukan suhu asal... ");
                suhuAsal = scan.nextDouble();
                hasilSuhu = (suhuAsal - 32) * 5/9;
                System.out.println("Hasil konversinya = " + hasilSuhu);
    
            }else if(pilihMenu.equals("3")){
                System.out.println("=========Celsius >> Kelvin===========");
                System.out.print("Masukan suhu asal... ");
                suhuAsal = scan.nextDouble();
                hasilSuhu = suhuAsal + 273.15;
                System.out.println("Hasil konversinya = " + hasilSuhu);
            }else if(pilihMenu.equals("4")){
                System.out.println("=========Fahrenheit >> Kelvin===========");
                System.out.print("Masukan suhu asal... ");
                suhuAsal = scan.nextDouble();
                hasilSuhu = (suhuAsal - 32) * 5/9 + 273.15;
                System.out.println("Hasil konversinya = " + hasilSuhu);
            }else if(pilihMenu.equals("5")){
                System.out.println("=========Kelvin >> Celsius===========");
                System.out.print("Masukan suhu asal... ");
                suhuAsal = scan.nextDouble();
                hasilSuhu = suhuAsal - 273.15;
                System.out.println("Hasil konversinya = " + hasilSuhu);
    
            }else if(pilihMenu.equals("6")){
                System.out.println("=========Kelvin >> Fahrenheit===========");
                System.out.print("Masukan suhu asal... ");
                suhuAsal = scan.nextDouble();
                hasilSuhu = (suhuAsal - 273.15) * 9/5 + 32 ;
                System.out.println("Hasil konversinya = " + hasilSuhu);
            }else{
                System.out.println("Menu yang anda masukan tidak ada");
            }
            System.out.println(" ");
            String loop;
            loop = "";
            
            do{
                System.out.println("Apakah anda ingin mengulangi programnya? (y/n)...");
                loop = scan.next();
                if(loop.equals("y") || loop.equals("y")){
                    y = true;
                }else if(loop.equals("n") || loop.equals("N")){
                    y = true;
                }else{
                    y = false;
                }
            }while(x != y);
            
            if(loop.equals("y") || loop.equals("y")){
                y = true;
            }else if(loop.equals("n") || loop.equals("N")){
                y = false;
            }

        }while(x == y);
    }

}