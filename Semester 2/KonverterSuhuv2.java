import java.util.Scanner;
class KonverterSuhuv2{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double suhuAsal, hasilKonversi;
        String loop, kodeSuhuAsal, kodeSuhuTujuan;
        Boolean x,y;
        
        suhuAsal = 0;
        hasilKonversi = 0;
        loop = "0";
        kodeSuhuAsal = "x";
        kodeSuhuTujuan = "x";
        x = true;
        y = true;

        do{
            System.out.print("\033[H\033[2J");
            System.out.println("Software Konversi Suhu");
            System.out.println("Satuan Suhu : ");
            System.out.println("[C] Celsius\n[F] Fahrenheit\n[K] Kelvin\n");
            do{
                System.out.print("Masukan kode satuan suhu asal(C/F/K)...");
                kodeSuhuAsal = scan.next().toUpperCase();
                if(!(kodeSuhuAsal.equals("C")) && !(kodeSuhuAsal.equals("F")) && !(kodeSuhuAsal.equals("K"))){
                    System.out.println("Kode yang anda masukan tidak valid");
                    y = false;
                }else{
                    y = true;
                }
            }while( x != y);
            do{
                System.out.print("Masukan kode satuan suhu tujuan(C/F/K)...");
                kodeSuhuTujuan = scan.next().toUpperCase();
                if(!(kodeSuhuTujuan.equals("C")) && !(kodeSuhuTujuan.equals("F")) && !(kodeSuhuTujuan.equals("K"))){
                    System.out.println("Kode yang anda masukan tidak valid");
                    y = false;
                }else{
                    y = true;
                }
            }while( x != y);
            System.out.println("");
            do{
                System.out.print("Masukan suhu awal... ");
                while(!scan.hasNextDouble()){
                    System.out.println("Masukan anda tidak valid");
                    System.out.print("Masukan suhu awal... ");
                    scan.next();
                    y = false;
                }
                suhuAsal = scan.nextDouble();
                y = true;
            }while(x != y);
            
            if(kodeSuhuAsal.equals("C") && kodeSuhuTujuan.equals("F")){
                hasilKonversi = suhuAsal * 9/5 + 32;
            }else if(kodeSuhuAsal.equals("F") && kodeSuhuTujuan.equals("C")){
                hasilKonversi = (suhuAsal - 32) * 5/9;
            }else if(kodeSuhuAsal.equals("C") && kodeSuhuTujuan.equals("K")){
                hasilKonversi = suhuAsal + 273.15;
            }else if(kodeSuhuAsal.equals("K") && kodeSuhuTujuan.equals("C")){
                hasilKonversi = suhuAsal - 273.15;
            }else if(kodeSuhuAsal.equals("F") && kodeSuhuTujuan.equals("K")){
                hasilKonversi = (suhuAsal - 32) * 5/9 + 273.15;
            }else if(kodeSuhuAsal.equals("K") && kodeSuhuTujuan.equals("F")){
                hasilKonversi = (suhuAsal - 273.15) * 9/5 + 32 ;
            }
            System.out.println("Hasil konversi = " + hasilKonversi);
            int number = 0;
            do{
                System.out.print("Apakah ingin mengulangi program? (y/t)... ");
                loop = scan.next();
                if(loop.equals("y") || loop.equals("Y")){
                    y = true;
                    number = 1;
                }else if(loop.equals("t") || loop.equals("T")){
                    y = false;
                    number = 1;
                }else{
                    number = 0;
                }
            }while(number == 0);

        }while(x == y);
    }
}