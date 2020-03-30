import java.util.*;
class ChallengeUnliData{
    static Scanner scan = new Scanner(System.in);
    static String pilMenu;
    static ArrayList<Float> myScore = new ArrayList<Float>();
    static boolean x,y;
    static float nilaiku;
    static int iArray;

    static void menuProgram(){
        System.out.println("\nMenu: ");
        System.out.println("1. Masukkan Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Perbarui Data");
        System.out.println("4. Hapus Data");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
        pilMenu = scan.next();
    }

    static void inpuArrayData(){
        int i = 1;
        do{
            System.out.print("\nMasukan data ke-" + i + ": ");
            nilaiku = scan.nextFloat();
            myScore.add(nilaiku);
            System.out.print("Apakah anda mau input data lagi(y/t)?");
            String ask  = scan.next();
            if(ask.equals("y") || ask.equals("Y")){
                y = true;
            }else if(ask.equals("t") || ask.equals("T")){
                y = false;
            }
            i++;
        }while(x == y);
    }

    static void showArrayData(){
        System.out.println("\nIsi arraynya: ");
        for(int i = 0; i < myScore.size(); i++){
            System.out.println("Data ke-" + (i+1) + " : " + myScore.get(i));
        }
    }

    static void updateArrayData(){
        showArrayData();
        System.out.println("\nUpdate arraynya: ");
        System.out.print("Pilih array yang mau diubah: ");
        iArray = scan.nextInt()-1;
        if(iArray >= myScore.size()){
            System.out.println("Data tidak ada!");
        }else{
            System.out.print("Isi data barunya: ");
            nilaiku = scan.nextFloat();
            myScore.set(iArray, nilaiku);
            System.out.println("Data berhasil diupdate!");
        }
    }

    static void deleteArrayData(){
        showArrayData();
        System.out.println("\nHapus isi arraynya: ");
        System.out.print("Pilih array yang mau dihapus: ");
        iArray = scan.nextInt()-1;
        if(iArray >= myScore.size()){
            System.out.println("Data tidak ada!");
        }else{
            myScore.remove(iArray);
            System.out.println("Data berhasil dihapus!");
        }
    }

    public static void main(String[] args){
        x = true;
        do{
            menuProgram();
            switch(pilMenu){
                case "1":
                    System.out.println("\033[H\033[2J");
                    inpuArrayData();
                    break;
                case "2":
                    System.out.println("\033[H\033[2J");
                    showArrayData();
                    break;
                case "3":
                    System.out.println("\033[H\033[2J");
                    updateArrayData();
                    break;
                case "4":
                    System.out.println("\033[H\033[2J");
                    deleteArrayData();
                    break;
                case "5":
                    System.out.println("\033[H\033[2J");
                    System.out.println("Anda keluar dari program, bye bye...");
                    y = true;
                    break;
                default:
                    System.out.println("Menu tidak valid!");
                    y = true;
            }
        }while(x != y);
        
    }
}