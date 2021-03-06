import java.util.Scanner;
class Truk{
    private double muatan, muatanmaks;

    public Truk(double beratmaks){
        this.muatanmaks = beratmaks;
    }
    public double getMuatan(){
        return muatan;
    }
    public double getMuatanMaks(){ 
        return muatanmaks;    
    }
    public double tambahMuatan(double berat)  {
        return this.muatan += berat;
    }
    public double hitungKelebihan(){
        return muatan-muatanmaks;
    }
}
public class DemoTruk{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Truk truk = new Truk(1000);
        System.out.print("Muatan maksimal : " + truk.getMuatanMaks() + "\n");
        
        for(int i = 1; i<=4; i++){
            System.out.print("Tambah Muatan : ");
            // double muatan2 = truk.getMuatan();
            double jumlahMuatan = input.nextDouble();
            truk.tambahMuatan(jumlahMuatan);
            if(truk.getMuatan() > truk.getMuatanMaks()){
                System.out.println("=====================================");
                System.out.println("Anda telah melebihi muatan maksimal");
                break;
            }
        }
        System.out.println("Muatan sekarang = " + truk.getMuatan());
        System.out.println("Muatan berlebih sejumlah = " + truk.hitungKelebihan());

    }
}