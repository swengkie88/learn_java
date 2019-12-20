import java.util.Scanner;
class Truk{
    double muatan, muatanmaks;

    Truk(double beratmaks){
        this.muatanmaks = beratmaks;
    }
    double getMuatan(){
        return muatan;
    }
    double getMuatanMaks(){ 
        return muatanmaks;    
    }
    double tambahMuatan(double berat)  {
        this.muatan = berat;
        return berat;
    }
}
class DemoTruk{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Truk truk = new Truk(1000);
        System.out.print("Muatan maksimal : ");
        System.out.print(truk.getMuatanMaks());
         
        System.out.print("\n");
        double total;
        total = 0;
        
        for(int i = 1; i<=4; i++){
            System.out.print("Tambah Muatan : ");
            truk.muatan = input.nextDouble();
            total += truk.muatan;
            if(total > truk.muatanmaks){
                break;
            }
        }
        System.out.print("\n");
        System.out.print("Muatan sekarang = " + total);
        if(total > truk.muatanmaks){
            System.out.print("\n");
            System.out.print("Anda sudah melebihi muatan maksimal");
        }

    }
}