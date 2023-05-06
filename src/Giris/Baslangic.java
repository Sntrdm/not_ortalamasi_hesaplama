package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {

        //değişkenleri tanımla
      int mat,fizik,kimya,turkce,tarih,muzik;
       //scanner sınıfı tanımla
      Scanner inp = new Scanner(System.in);
       //kullanıcıdan veri al
        System.out.println("Matematik Notunu Giriniz");
        mat = inp.nextInt();
        System.out.println("Fizik Notunu Giriniz");
        fizik = inp.nextInt();
        System.out.println("Kimya Notunu Giriniz");
        kimya = inp.nextInt();
        System.out.println("Türkçe Notunu Giriniz");
        turkce = inp.nextInt();
        System.out.println("Tarih Notunu Giriniz");
        tarih = inp.nextInt();
        System.out.println("Müzik Notunu Giriniz");
        muzik = inp.nextInt();
        //ortalama hesapla
        double result = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println(result);
    }
}
