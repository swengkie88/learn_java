import java.util.Scanner;

class Purchase {
    double amount;
    double total;
    boolean taxable;

    public double getAmount(){
        return amount;
    }

    public double getTotal(){
        return total;
    }

    public double hitungTax(){
        if (taxable) {
            return total = amount * 1.05;
        } else {
            total = amount;
        }
        return total;
    }

}

public class ProcessData2 {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        Purchase Pemrosesan = new Purchase();

        System.out.print("Amount: ");
        Pemrosesan.amount = myScanner.nextDouble();
        System.out.print("Taxable? (true/false) ");
        Pemrosesan.taxable = myScanner.nextBoolean();
        System.out.print("Total: " + Pemrosesan.hitungTax());
    }
}