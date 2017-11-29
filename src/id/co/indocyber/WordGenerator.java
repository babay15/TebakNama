package id.co.indocyber;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WordGenerator {     
     public static List<WordModel> createQuestionInCollection() {
         List<WordModel> bankSoal = new ArrayList<>();
         try {
             Scanner scan = new Scanner(new File("C:/Java/Catatan/tebakNama.txt"));
             while(scan.hasNextLine()){
                 String kataDanHint = scan.nextLine();
                 String[] data = kataDanHint.split(",");
                 String kataSoal = data[0].trim();
                 String kataHint = data[1].trim();
                 WordModel wm = new WordModel(kataSoal, kataHint);
                 bankSoal.add(wm);
             }
         } catch (FileNotFoundException ex) {
             Logger.getLogger(WordGenerator.class.getName()).log(Level.SEVERE, null, ex);
         }
         return bankSoal;
    }
    public static List<WordModel> createQuestionInCollection2() {
         List<WordModel> bankSoal = new ArrayList<>();
         try {
             Scanner scan = new Scanner(new File("C:/Java/Catatan/namaNaruto.txt"));
             while(scan.hasNextLine()){
                 String kataDanHint = scan.nextLine();
                 String[] data = kataDanHint.split(",");
                 String kataSoal = data[0].trim();
                 String kataHint = data[1].trim();
                 WordModel wm = new WordModel(kataSoal, kataHint);
                 bankSoal.add(wm);
             }
         } catch (FileNotFoundException ex) {
             Logger.getLogger(WordGenerator.class.getName()).log(Level.SEVERE, null, ex);
         }
         return bankSoal;
    }
    
    public static List<WordModel> createQuestionInCollection3() {
         List<WordModel> bankSoal = new ArrayList<>();
         try {
             Scanner scan = new Scanner(new File("C:/Java/Catatan/namaSetan.txt"));
             while(scan.hasNextLine()){
                 String kataDanHint = scan.nextLine();
                 String[] data = kataDanHint.split(",");
                 String kataSoal = data[0].trim();
                 String kataHint = data[1].trim();
                 WordModel wm = new WordModel(kataSoal, kataHint);
                 bankSoal.add(wm);
             }
         } catch (FileNotFoundException ex) {
             Logger.getLogger(WordGenerator.class.getName()).log(Level.SEVERE, null, ex);
         }
         return bankSoal;
    }
}
