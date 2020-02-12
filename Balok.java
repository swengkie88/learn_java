import java.util.Scanner;
class Balok{
        private double panjang, lebar, tinggi;
        Scanner input = new Scanner(System.in);
        
        public Balok(){
            System.out.print("Masukan Panjang = ");
            panjang = input.nextDouble();
            System.out.print("Masukan Lebar = ");
            lebar = input.nextDouble();
            System.out.print("Masukan Tinggi = ");
            tinggi = input.nextDouble();
        }

        public double hitungKeliling(){
            double keliling = 4*(panjang + lebar + tinggi);
            return keliling;
        }
        public double hitungLuas(){
            double luas = 2*(panjang*lebar + panjang*tinggi + panjang*tinggi);
            return luas;
        }
        public double hitungVolume(){
            double volume = panjang * lebar * tinggi;
            return volume;
        }

        public static void main(String[] args){
            System.out.println("Balok Kecil: ");
            Balok bk = new Balok();

            System.out.println("\nBalok Sedang: ");
            Balok bs = new Balok();

            System.out.println("\nBalok Besar: ");
            Balok bb = new Balok();

            System.out.println(" ");
            System.out.println("Hasil Operasi Balok Kecil");
            System.out.println(" - Kelilingnya = " + bk.hitungKeliling() );
            System.out.println(" - Luasnya = " + bk.hitungLuas() );
            System.out.println(" - Volumenya = " + bk.hitungVolume() );

            System.out.println(" ");
            System.out.println("Hasil Operasi Balok Sedang");
            System.out.println(" - Kelilingnya = " + bs.hitungKeliling() );
            System.out.println(" - Luasnya = " + bs.hitungLuas() );
            System.out.println(" - Volumenya = " + bs.hitungVolume() );

            System.out.println(" ");
            System.out.println("Hasil Operasi Balok Besar");
            System.out.println(" - Kelilingnya = " + bb.hitungKeliling() );
            System.out.println(" - Luasnya = " + bb.hitungLuas() );
            System.out.println(" - Volumenya = " + bb.hitungVolume() );
        }
}