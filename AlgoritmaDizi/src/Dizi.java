
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

public class Dizi {
    Scanner scanner=new Scanner(System.in);
    //10 elemanlı bir dizi girişi
    public void dizi(int[] dizi){
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Lütfen "+(i+1)+" .sayıyı girin:");
             dizi[i]=scanner.nextInt();
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Dizinin "+(i+1)+". elmanı:"+dizi[i]);
        }
    }
    //girilen bir kelimenın her harfini yazdıran bulan
    public void uzunluk(String kelime){
        System.out.println(kelime.length());
        for (int i = 0; i < kelime.length(); i++) {
            System.out.println((i+1)+".harf="+kelime.substring(i,i+1));
        }
        
    }
    //2.soru
    // girilen kelimeyi tersten yazdıran
    public void tersten(String kelime){
        String ters="";
        for (int i = 0; i < kelime.length(); i++) {
            String harf=kelime.substring(i, (i+1));
            ters=harf+ters;
        }
        System.out.println(ters);
        
    }
    //kelimeyi evirip çeviren program
    public void donusurme(String kelime){
        String fake="";
        String dizi[] =new String[kelime.length()];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=kelime.substring(i, (i+1));
        }
        for (int i = 0; i < dizi.length; i++) {
            String kelimee="";
            for (int j = 0; j < dizi.length; j++) {
                kelimee=kelimee+dizi[j];
            }
            System.out.println(kelimee);
            for (int j = 0; j < dizi.length; j++) {
                if (j==0) {
                     fake=dizi[dizi.length-1];
                    dizi[dizi.length-1]=dizi[0];
                    dizi[j]=dizi[j+1];
                }
                else if (j==dizi.length-1) {
                    
                }
                else if(j==dizi.length-2){
                    dizi[j]=fake;
                }
                else{
                    dizi[j]=dizi[j+1];
                }
            }
        }
    }
    //3.soru
    //Öğrencilerin notlarını giren ve gosteren
    public void dersNotu(int ogrenciSayisi){
        int dizi[]=new int[ogrenciSayisi];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Lütfen "+(i+1)+".öğrencinin notunu girin:");
            dizi[i]=scanner.nextInt();
            
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i+1)+". numaralı öğrencinin notu:"+dizi[i]);
        }
    }
    
    //bir sayı dizisinin ortalmasını bulup o ortalmaya eşit olan kac
    //tane eleman var soyleyen algoritma
    public void ortalama(int eleman){
        int ortEsitler=0;
        int toplam=0;
         int dizi[]=new int[eleman];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Lütfen "+(i+1)+".sayıyı girin:");
            dizi[i]=scanner.nextInt();
            toplam=toplam+dizi[i];
        }
        int ortalama=toplam/eleman;
        if (ortalama%1==0) {
            for (int sayilar: dizi) {
                if (sayilar==ortalama) {
                    ortEsitler++;
                }
            }
            System.out.println("Ortalamaya eşit olan sayı adedi:"+ortEsitler);
        }
        else {
            System.out.println("Hesaplannamadı.");
        }
    }
    //4.soru
    //bir dizinin içinde verilen elemanların istenilen değerlere bölünen 
    //sayılrınn adedi
    public void bolunme(int diziElemanSayisi,int bolum1,int bolum2){
        
        int dizi[]=new int[diziElemanSayisi];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Lütfen "+(i+1)+".elemanı girin:");
            dizi[i]=scanner.nextInt();
            
        }
        for (int  sayialr: dizi) {
            if (sayialr%bolum1==0) {
                if (sayialr%bolum2==0) {
                    System.out.println(sayialr+"Sayısı hem"+bolum1+" hemde "+bolum2+"  sayısına tam bolunuyor.");
                }
            }
        }
        
    }
    //Dizinin elemanlarını baştan sona değiştiren
    public void degistirme(int[] dizi){
        for (int elemanlar : dizi) {
            System.out.println(elemanlar);
            System.out.println("---------------");
        }
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[dizi.length-1-i]);
            System.out.println("---------");
        }
       
    }
    //5.soru
    //girilen kelimede istenilen harften kac tane var arayan program
    //dizisiz olan
    public void arama1(String kelime,String harf){
        int toplam=0;
        for (int i = 0; i < kelime.length(); i++) {
            String fake=kelime.substring(i, (i+1));
            if (fake.equals(harf)) {
                toplam++;
            }
            
        }
        System.out.println(kelime+" kelimesinde "+harf+" harfi toplamda "+toplam+" kadar geçmektedir");
    }
    //girilen kelimede istenilen harften kac tane var arayan program
    //dizili olan
    public void arama2(String kelime,String harf){
        int toplam=0;
        String dizi[]=new String[kelime.length()];
        for (int i = 0; i < kelime.length(); i++) {
             dizi[i]=kelime.substring(i, (i+1));
             
        }
        for (String harfler : dizi) {
            if (harfler.equals(harf)) {
                toplam++;
            }
        }
                System.out.println(kelime+" kelimesinde "+harf+" harfi toplamda "+toplam+" kadar geçmektedir");

    }
    //1.soru
    //girilen bir kelimede sesli harflerin sayısı
    //sesli harfler aeıioöuü
    public void sesli(String kelime){
        String dizi[]=new String[8];
        int toplam=0;
        dizi[0]="a";
        dizi[1]="e";
        dizi[2]="i";
        dizi[3]="ı";
        dizi[4]="u";
        dizi[5]="ü";
        dizi[6]="o";
        dizi[7]="ö";
        for (int i = 0; i < kelime.length(); i++) {
            String harf=kelime.substring(i, i+1);
            for (String harfler : dizi) {
                if (harfler.equals(harf)) {
                    toplam++;
                }
            }
        }
        System.out.println(kelime+" kelimesinde toplam "+toplam+" tane sesli harf vardır");
    }
    public void ikiboyutluDizi(int birinciBoyut,int ikinciBoyut){
        int dizi[][]=new int[birinciBoyut][ikinciBoyut];
        for (int i = 0; i < birinciBoyut; i++) {
            for (int j = 0; j < ikinciBoyut; j++) {
                System.out.println("değer gir");dizi[i][j]=scanner.nextInt();
            }
        }
        for (int i = 0; i < birinciBoyut; i++) {
            for (int j = 0; j < ikinciBoyut; j++) {
                System.out.println(dizi[i][j]);
            }
        }
    }
    //6.soru
    //iki boyutlu bir diziyi bir boyutlu bir diziye donusturn 
    public void diziDonusturme(){
        System.out.println("Lütfen dizinizin kac satır olacagını girin");
        int satir=scanner.nextInt();
        System.out.println("Lütfen dizinizin kac sutun olacagını girin");
        int sutun=scanner.nextInt();
        String toplam="";
        int dizi[][]=new int[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println("Lütfen "+(i+1)+". satır "+(j+1)+". sütünü girin");
                dizi[i][j]=scanner.nextInt();
                toplam=toplam+ dizi[i][j];
            }
        }
        String dizi2[]=new String[toplam.length()];
        for (int i = 0; i < dizi2.length; i++) {
            dizi2[i]=toplam.substring(i, i+1);
        } 
        System.out.println("//");
        for (String i : dizi2) {
            System.out.println(i);
        }
    }
    //iki dizi toplamı
    //7.soru
    public void diziToplam(int birinciDiziSatır,int birinciDiziSutun,int ikinciDiziSatır,int ikinciDiziSutun){
        int dizi[][]=new int[birinciDiziSatır][birinciDiziSutun];
  int dizi2[][]=new int[ikinciDiziSatır][ikinciDiziSutun];
  int dizi3[][]=new int[ikinciDiziSatır][ikinciDiziSutun];
        for (int i = 0; i < birinciDiziSatır; i++) {
            for (int j = 0; j < birinciDiziSutun; j++) {
                System.out.print(i+1+".Satır "+(j+1)+". sutunu girin:");
                dizi[i][j]=scanner.nextInt();
                
                
            }
        }
        System.out.println("Şimdi de ikinci diziye geçelim");
        for (int i = 0; i < birinciDiziSatır; i++) {
            for (int j = 0; j < birinciDiziSutun; j++) {
                System.out.print(i+1+".Satır "+(j+1)+". sutunu girin:");
                dizi2[i][j]=scanner.nextInt();
                
                dizi3[i][j]=dizi2[i][j]+dizi[i][j];
            }
        }
        for (int i = 0; i < ikinciDiziSatır; i++) {
            for (int j = 0; j < ikinciDiziSutun; j++) {
                System.out.println("Dizi["+(i+1)+"]["+(j+1)+"]="+dizi3[i][j]);
            }
        }
    }
    //rastegele diziyi sıralayıp kacıncı oldugunu bulan
    public void diziOyunu(){
        System.out.println("Lütfen dizinizin adı ne olsun girin:");
        String diziAdı=scanner.nextLine();
        System.out.print("Lütfen kaç  eleman gireçeğini soylermisin:");
        int eleman=scanner.nextInt();
        int dizi[]=new int[eleman];
        System.out.println("Şimdi sayıları girmeye başlayalım");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Lütfen "+(i+1)+". sayıyı girin:");
            dizi[i]=scanner.nextInt();
        }
        System.out.println("Tamam şu anda bitti");
        System.out.println("Kartları şimdi karıştırıyorum");
        int dizi2[]=new int[eleman];
        
        for (int i = 0; i < dizi.length; i++) {
           dizi2[i]=dizi[dizi.length-i-1];
        }
        
        boolean a=true;
        int sayac=0;
        int k=0;
        System.out.println("Hadi tahmin etmeye başlayalım");
        while(a){
            for (int i = 0; i < dizi.length; i++) {
                System.out.println((i+1)+".sayı:"+dizi[i]);
            }
            System.out.println("Hangi sayıyı tahmin edeğini soyle:");
            int sayi=scanner.nextInt();
            for (int i = 0; i < dizi2.length; i++) {
                if (sayi==dizi2[i]) {
                    k=i+1;
                }
            }
            System.out.println("Kaçıncı sırada sence");
            int tahmin=scanner.nextInt();
            if (tahmin==k) {
                System.out.println("Doğru bildin");
                System.out.println((sayac+1)+". defa da bildin");
                
                a=false;
            }
            else{
                System.out.println("Yanlış cevap");
                sayac++;
                System.out.println("Tekrar sayı seç");
            }
        }
            System.out.println("Oyun bitti");
    }
    
    
    //8.soru
    //faktoryel hesaplayan
    public void faktoriyel(int faktoriyel){
        int toplam1=1;
        for (int i = 1; i < faktoriyel+1; i++) {
            toplam1=toplam1*i;
        }
        System.out.println(toplam1);
    }
    //9.soru 
    //basamak sayısını hesaplayan
    public void basamak(int sayi){
        int basamak=0;
        while (sayi!=0) {            
            sayi=sayi/10;
            basamak++;
        }
        System.out.println(basamak);
    }
    //10.soru ucgen alanı
    public void ucgenAlan(int kenar1,int kenar2,int acı){
        double alan=((kenar1*kenar2*Math.sin(acı))/2);
        System.out.println(alan);
    }

}
