import java.util.*;
class ProgramNilai{
    // Instansiasi class Scanner
    static Scanner scan = new Scanner(System.in);
    // Deklarasi ArrayList
    static ArrayList<Float> daftarNilai = new ArrayList<Float>();

    // Variable buat nerima data inputan inventaris
    static Float nilaiKu;

    // Deklarasi variable lainnya
    static String ask;
    static char pilMenu;
    static int iArray;

    static void clearScreen(){
        String osName = System.getProperty("os.name");
        try{
            if(osName.equals("Linux")){
                System.out.println("\033[H\033[2J");
            }else if(osName.equals("Windows")){
                Runtime.getRuntime().exec("cls");
            }
        }catch(final Exception e){
            System.out.println("Can't detect OS!");
        }
    }

    static void inputNilai(){
        do{
            clearScreen();
            System.out.println("=== 1. Input Nilai ===");
            // Inputin nama barang ke ArrayList
            System.out.print("Masukan nilai: ");
            nilaiKu = scan.nextFloat();
            daftarNilai.add(nilaiKu);

            System.out.println(" ");
            System.out.print("Lanjut input nilai(y/t)? ");
            ask = scan.next().toLowerCase();
            if(ask.equals("t")){
                System.out.println(" ");
                mainMenu();
            }
        }while(ask.equals("y"));
    }

    static void lihatNilai(){
        clearScreen();
        System.out.println("=== 2. Lihat Nilai ===");
        if(daftarNilai.size() == 0){
            System.out.println("Tidak ada data nilai.");
            System.out.println("Silahkan masukkan data nilai terlebih dahulu pada menu Tambah Data Nilai!");
            
            System.out.print("Tekan \"x\" kembali ke menu utama...");
            ask = scan.next().toLowerCase();
            if(ask.equals("x")){
                mainMenu();
            }
        }else{
            for(int i = 0; i < daftarNilai.size(); i++){
                if((i+1) % 5 == 0){
                    System.out.print(" " + daftarNilai.get(i) + " \n");
                }else{
                    System.out.print(" " + daftarNilai.get(i));
                }
            }
            System.out.println(" ");
        }

    }

    static float getMax(int paramRank){
        Collections.sort(daftarNilai, Collections.reverseOrder());
        float result = daftarNilai.get(paramRank-1);
        return result;
    }

    static float getMin(int paramRank){
        Collections.sort(daftarNilai);
        float result = daftarNilai.get(paramRank-1);
        return result;
    }

    static void nilaiTertinggi(){
        do{
            clearScreen();
            System.out.println("=== 3. Cari Nilai Tertinggi ===");
            System.out.print("Masukan peringkat: ");
            iArray = scan.nextInt();
            if((iArray <= 0) || (iArray > daftarNilai.size())){
                System.out.println("Peringkat yang diinputkan tidak valid");
            }else{
                System.out.println("Proses cari nilai tertinggi ke-"+iArray);;
                System.out.println("Nilai Tertinggi ke-"+iArray+" :" + getMax(iArray));
                System.out.println(" ");
            }
            System.out.print("Lanjut mencari nilai tertinggi(y/t)? ");
            ask = scan.next().toLowerCase();
            if(ask.equals("t")){
                System.out.println(" ");
                mainMenu();
            }
        }while(ask.equals("y"));
    }

    static void nilaiTerendah(){
        do{
            clearScreen();
            System.out.println("=== 4. Cari Nilai Terendah ===");
            System.out.print("Masukan peringkat: ");
            iArray = scan.nextInt();
            if((iArray <= 0) || (iArray > daftarNilai.size())){
                System.out.println("Peringkat yang diinputkan tidak valid");
            }else{
                System.out.println("Proses cari nilai terendah ke-"+iArray);;
                System.out.println("Nilai Terendah ke-"+iArray+" :" + getMin(iArray));
                System.out.println(" ");
            }
            System.out.print("Lanjut mencari nilai terendah(y/t)? ");
            ask = scan.next().toLowerCase();
            if(ask.equals("t")){
                System.out.println(" ");
                mainMenu();
            }
        }while(ask.equals("y"));
        
    }

    static void mainMenu(){
        System.out.println("### Program Nilai MaksMin ###");
        System.out.println("1. Input Nilai\n2. Lihat Nilai\n3. Cari Nilai Tertinggi\n4. Cari Nilai Terendah\n5. Keluar");
        System.out.print("Masukan pilihan: ");
        pilMenu = scan.next().charAt(0);
        switch(pilMenu){
            case '1':
                inputNilai();
                break;
            case '2':
                lihatNilai();
                break;
            case '3':
                nilaiTertinggi();
                break;
            case '4':
                nilaiTerendah();
                break;
            case '5':
                break;
            default:
                System.out.println("Menu tidak valid!");
        }
    }
    public static void main(String[] args){
        do{
            mainMenu();
        }while(pilMenu != '5');
    }
}