import java.util.Scanner;
class ProgramParkir{
    static Scanner scan = new Scanner(System.in);
    static char pilMenu, loop;
    static int durasiParkir, hari, sisaJam;
    static double biayaDasar ,biayaParkir, denda;

    static void hitungBiayaParkir(){
        System.out.print("Durasi Parkir: ");
        durasiParkir = scan.nextInt();
        denda = 0;

        sisaJam = durasiParkir % 24;
        hari = durasiParkir / 24;

        // buat nentuin jumlah hari
        if(sisaJam >= 12 && sisaJam <= 24){
            if(durasiParkir > 24){
                ++hari;
            }else if(durasiParkir >= 0 && durasiParkir <= 24){
                hari = 0;
            }
        }

        // Buat ngitung dendane
        if(durasiParkir > 24){
            if(sisaJam > 0 && sisaJam < 12){
                denda = 100000 * hari;
            }else if(sisaJam >= 12 && sisaJam <= 23){
                denda = 100000 * (hari-1);
            }else if(sisaJam == 0){
                denda = 100000 * (hari-1);
            }
        }else if(durasiParkir >= 0 && durasiParkir <= 24){
            denda = 0;
        }
        
        if(pilMenu == '1'){
            biayaDasar = 2000;
        }else if(pilMenu == '2'){
            biayaDasar = 4000;
        }

        if(durasiParkir == 1){
            biayaParkir = 1500;
        }
        if(durasiParkir == 2){
            biayaParkir = 3000;
        }else if(durasiParkir > 2 && durasiParkir <= 24){
            biayaParkir = ((durasiParkir-2) * biayaDasar) + 3000;
        }else if(durasiParkir == 0){
            System.out.println("Durasi parkir tidak boleh nol");
            biayaParkir = 0;
        }else if(durasiParkir > 24){
            biayaParkir = ((durasiParkir - (2*hari)) * biayaDasar) + (3000 * hari) + denda;
        }
        
        System.out.println("Biaya Parkir : Rp " + biayaParkir);
        System.out.print("Apakah admin perlu menghitung biaya parkir pelanggan lainnya (y/t)? ");
        loop = scan.next().charAt(0);
        System.out.println(" ");
    }
    static void mainMenu(){
        System.out.println("# Program Parkir Sederhana #");
        System.out.println("1. Parkir Motor\n2. Parkir Mobil");
        
        do{
            System.out.print("Pilih Jenis Kendaraaan (1/2): ");
            pilMenu = scan.next().charAt(0);
            if(pilMenu != '1' && pilMenu != '2'){
                System.out.println("Jenis kendaraan tidak valid");
            }
        }while(pilMenu != '1' && pilMenu != '2');
    }
    public static void main(String[] args){
        do{
            mainMenu();
            hitungBiayaParkir();
        }while(loop == 'y');
    }
}