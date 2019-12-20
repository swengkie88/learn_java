import java.util.Scanner;

class Purchase {
    double amount, total;
    boolean taxable;
}

class ProcessData2 {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        Purchase Pemrosesan = new Purchase();

        System.out.print("Amount: ");
        Pemrosesan.amount = myScanner.nextDouble();
        System.out.print("Taxable? (true/false) ");
        taxable = myScanner.nextBoolean();
        if (Pemrosesan.taxable) {
            total = amount * 1.05;
        } else {
            total = amount;
        }
        System.out.print("Total: ");
        System.out.println(total);
    }
}