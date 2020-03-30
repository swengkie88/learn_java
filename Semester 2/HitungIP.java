import java.util.HashMap;
import java.util.Scanner;

class HitungIP{
    static HashMap<String, String> nilaiKu = new HashMap<String, String>();
    static Scanner input = new Scanner(System.in);
    static String inNilai;
    static double bobotNilai, totalBobot, IP;
    static char pilMenu;
    static boolean x, y;

    // Memasukan nilai mahasiswa
    static void inputNilai(){
        System.out.println("\033[H\033[2J");
        x = true;
        y = false;
        System.out.println("=== Input Nilai ===");
        do{
            System.out.print("Masukan mata kuliah(tanpa spasi): ");
            String matkul = input.next();
            System.out.print("Masukan nilai huruf: ");
            inNilai = input.next().toUpperCase();
            nilaiKu.put(matkul, inNilai);
            char ask;
            do{
                System.out.print("Ingin tambahkan nilai lagi?(y/t) ");
                ask = input.next().charAt(0);
                if(ask == 'y' || ask == 'Y'){
                    System.out.println(" ");
                    y = false;
                }else if(ask == 't' || ask == 'T'){
                    System.out.println("\033[H\033[2J");
                    y = false;
                }else{
                    System.out.println("Input tidak valid");
                    y = true;
                }
            }while(y == true);
            
            if(ask == 't' || ask == 'T'){
                break;
            }
            
        }while(true);
    }
    // Mencari bobot nilai akhir
    // setelah dikalikan dengan SKS
    static double getBobotNilai(String paramNilai){
        if(nilaiKu.get(paramNilai).equals("A")){
            bobotNilai = 4.00;
        }else if(nilaiKu.get(paramNilai).equals("A-")){
            bobotNilai = 3.67;
        }else if(nilaiKu.get(paramNilai).equals("B+")){
            bobotNilai = 3.33;
        }else if(nilaiKu.get(paramNilai).equals("B")){
            bobotNilai = 3.00;
        }else if(nilaiKu.get(paramNilai).equals("B-")){
            bobotNilai = 2.67;
        }else if(nilaiKu.get(paramNilai).equals("C+")){
            bobotNilai = 2.33;
        }else if(nilaiKu.get(paramNilai).equals("C")){
            bobotNilai = 2.00;
        }else if(nilaiKu.get(paramNilai).equals("D")){
            bobotNilai = 1.00;
        }else if(nilaiKu.get(paramNilai).equals("E")){
            bobotNilai = 0.00;
        }
        return (bobotNilai * 2);
    }
    // Mencari jumlah bobot
    // seluruh mata kuliah
    // static double getTotalBobot(){
    //     for(String i : nilaiKu.keySet()){
    //         totalBobot += getBobotNilai(i);
    //     }
    //     return totalBobot;
    // } 
    
    static double hitungIP(){
        // Jumlah SKS
        //Menyesuaikan SKS PTI 2019 Semester 1
        // double tb = getTotalBobot();
        return (totalBobot / 22.0);

    }

    static void lihatNilai(){
        System.out.println("\033[H\033[2J");
        System.out.println("=== Lihat Nilai ===");
        System.out.println("Nama: Angki Pranamukti");
        System.out.println("NIM: 19520241010");
        System.out.println("Total mata kuliah: " + nilaiKu.size());
        System.out.println("-------");
        totalBobot = 0;
        for(String i : nilaiKu.keySet()){
            System.out.println("Mata Kuliah: " + i);
            System.out.println("Nilai: " + nilaiKu.get(i));
            System.out.println("Bobot nilai: " + getBobotNilai(i));
            System.out.println("-------");
            totalBobot += getBobotNilai(i);
        }
        System.out.println("Total Bobot Nilai: " + totalBobot);
        System.out.println("IP: " + hitungIP());
        System.out.println(" ");
    }

    static void tiketKonser(){
        String tiketnya = "";
        if(hitungIP() >= 3.80 && hitungIP() <= 4.00){
            tiketnya = "Mythic";
        }else if(hitungIP() >= 3.50 && hitungIP() <= 3.79){
            tiketnya = "Epic";
        }else if(hitungIP() >= 3.00 && hitungIP() <= 3.49){
            tiketnya = "Grandmaster";
        }else if(hitungIP() >= 2.00 && hitungIP() <= 2.99){
            tiketnya = "Master";
        }else if(hitungIP() >= 0.00 && hitungIP() <= 1.99){
            tiketnya = "Elite";
        }
        System.out.println("\033[H\033[2J");
        System.out.println("=== Cek Tiket Konser ===");
        System.out.println("IP Anda: " + hitungIP());
        System.out.println("Anda mendapatkan tiket");
        System.out.println("\" "+ tiketnya +"\" ");
        System.out.println("Selamat menikmati konser Sheila on 7!\n");
    }

    static void menuProgram(){
        switch(pilMenu){
            case '1':
                inputNilai();
                break;
            case '2':
                lihatNilai();
                break;
            case '3':
                tiketKonser();
                break;
            case '4':
                x = false;
                break;
            default:

        }
    }

    public static void main(String[] args){
        x = true;
        do{
            System.out.println("=== Menu program ===");
            System.out.print("1.Input Nilai \n2.Lihat Nilai \n3.Tiket Konser Sheila on 7 \n4.Keluar\n");
            System.out.print("Pilih menu ke: " );
            pilMenu = input.next().charAt(0);
            menuProgram();
        }while(x == true);
    }

}