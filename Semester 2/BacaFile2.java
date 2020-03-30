/*
    Oleh Kelompok 6
    Thoriq Abiddin Z. 
    Angki Pranamukti
    Fatrah Ahmad Putra
*/
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class BacaFile2 {
    
    public static int hitungKalimat(String isiFile){
        int kalimat=0;
        if (!isiFile.equals(" ")){
            String[] arKalimat=isiFile.split("[.]");
            kalimat += arKalimat.length;
        }
        return kalimat;
    }

    public static int hitungKata(String isiFile){
        if(isiFile == null || isiFile.isEmpty()){
            return 0;
        }
        String hapusAngka = isiFile.replaceAll("[1234567890.,]", "");
        String[] words = hapusAngka.split("\\s+");
        return words.length;
    }

    public static int hitungBilangan(String isiFile){
        int bilangan=0;
        isiFile.replaceAll("[a-z,.]", " ");
        String[] arBilangan=isiFile.split("\\d+");
        bilangan += arBilangan.length;
        return bilangan-1;
    }

    public static Map<String, Integer> frekuensiKata(String isiFile){
        String hapusAngka = isiFile.replaceAll("[1234567890.,]", "");
        List <String> list = Stream.of(hapusAngka).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
        .collect(Collectors.toList());

        Map <String, Integer > wordCounter = list.stream()
        .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));

        return wordCounter;
    }

    public static void showWordFrequency(String isiFile){
        for(String key: frekuensiKata(isiFile).keySet()){
            System.out.println("-" + key + " : " + frekuensiKata(isiFile).get(key));
        }
    }

    public static void main(String[] args) throws Exception{
        File file = new File("survei.txt");
        Scanner scanf = new Scanner(file);
        String isiFile = scanf.nextLine();
        System.out.println("A. Jumlah kalimat secara keseluruhan: " + hitungKalimat(isiFile));
        System.out.println("B. Jumlah kata secara keseluruhan: " + hitungKata(isiFile));
        System.out.println("C. Frekuensi kemunculan kata ");
        showWordFrequency(isiFile);
        System.out.println(" ");
        System.out.println("D. Jumlah bilangan yang muncul: " + hitungBilangan(isiFile));
    }

}