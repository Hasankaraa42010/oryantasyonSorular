
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hasan kara
 */
public class Main {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Dizi dizi = new Dizi();
       
        //      System.out.println("Lütfen dizinizin kaç elemanlı olacağını soyleyin:");
        //      int eleman=scanner.nextInt();
        //      System.out.println("Lütfen kaça bolunmesini istediğiniz ilk sayıyı soyleyin:");
        //      int bolum1=scanner.nextInt();
        //      System.out.println("Lütfen kaça bolunmesini istediğiniz ilk sayıyı soyleyin:");
        //        int bolum2=scanner.nextInt();
        //      dizi.bolunme(eleman, bolum1, bolum2);
       // int diziii[] = new int[7];
      //  for (int i = 0; i < diziii.length; i++) {
       //     diziii[i] = i;
      //  }
       // dizi.diziToplam(2, 2, 2, 2);
        
        
        
        
        
        
        
        
        Scanner scanner=new Scanner(System.in);
        
        
        //1.sorunun
        //sesli harf sayısısnı bulan
        System.out.println("Lütfen kaç tane sesli harf olduğunu bulmam için bana kelimeyi yada cümleyi giriniz:");
        String kelime=scanner.nextLine();
        dizi.sesli(kelime);
       
       
        //2.soru
        //tersten yazdıran
        //System.out.println("Lütfen tersten yazılacak olan kelimeyi bana yazın:");
        //String kelime=scanner.nextLine();
        //dizi.tersten(kelime);
        
        //3.soru
        //öğrencileri ders notu verip çıktı alan
        //System.out.println("Lütfen öğrenci sayısını girin");
       // int ogrenciSayisi=scanner.nextInt();
        //dizi.dersNotu(ogrenciSayisi);
        
        //4.soru
        //girilen sayıyı istenilen bolenlere uygun olup olmadığını gosteren
        //System.out.println("Lüten dizinin eleman sayısını giriniz:");
        //int elemanSayisi=scanner.nextInt();
        //System.out.println("Lütfen istenilen birincii bölümü giriniz:");
        //int bolum1=scanner.nextInt();
       // System.out.println("Lütfen istenilen ikinci bölümü giriniz:");
        //int bolum2=scanner.nextInt();
        //dizi.bolunme(elemanSayisi, bolum1, bolum2);
        
        
        
        //5.soru
    //girilen kelimede istenilen harften kac tane var arayan program
    //dizisiz olan
    //System.out.println("Lütfen   kelimeyi bana yazın:");
      //  String kelime=scanner.nextLine();
     //  System.out.println("Lütfen  istenilen harfi bana yazın:");
      //  String harf=scanner.nextLine();
    //dizi.arama1(kelime, harf);
   
   //6.soru
   //dizi donuşturme
   //dizi.diziDonusturme();
   
   //7.soru
   //iki diziyi tplama
    //  System.out.println("Lütfen birinci dizinin satırını girin:  ");
    //    int birinciSatir=scanner.nextInt();
     //  System.out.println("Lütfen birinci dizinin sutununu girin:  ");
    //   int birinciSutun=scanner.nextInt();
    //   System.out.println("Lütfen ikinci dizinin satırını girin:  ");
    //    int ikinciSatir=scanner.nextInt();
   //   System.out.println("Lütfen ikinci dizinin sutununu girin:  ");
     //  int ikinciSutun=scanner.nextInt();
   // dizi.diziToplam(birinciSatir, birinciSutun, ikinciSatir, ikinciSutun);
   
   
     //8.soru
      // System.out.println("Lütfen faktoriyeni almak istediğiniz sayıyı girin");
   //  int faktoriyel=scanner.nextInt();
    //dizi.faktoriyel(faktoriyel);
    
   // 9.soru
       //System.out.println("Lütfen sayıyı girin:");
      //  int sayi=scanner.nextInt();
      //  dizi.basamak(sayi);
        
        
        //10.soru
        
        //System.out.println("Lütfen üçgrenin bir kenarını girin:");
        //int kenar1=scanner.nextInt();
       // System.out.println("Lütfen üçgrenin bir kenarını girin:");
      //  int kenar2=scanner.nextInt();
      //  System.out.println("Lütfen üçgrenin  açısını girin:");
       // int aci=scanner.nextInt();
      //  dizi.ucgenAlan(kenar1,kenar2, aci);
    }
    
    
    
    

}
