import java.util.Scanner;

public class Bakici extends Insan{
    IHayvanatBahcesi hayvanatBahcesi;
    int hayvan;

    Scanner scanner=new Scanner(System.in);



    public void hayvanEkle(int sayi2){

        if (sayi2 == 1) {
            hayvanatBahcesi = new SogukHB();
            System.out.println("Bahçemizdeki Hayvanlar: 1-Kutup Ayısı 2-Penguen 3-Kutup Tilkisi 4-Fok balığı");
            System.out.println("Yeni hayvan eklemek istediğiniz hayvanın numarasını giriniz:");
            hayvan =scanner.nextInt();
            hayvanatBahcesi.yeniHayvanEkle(hayvan);
            System.out.println("Hayvan ekleme işlemi başarıyla gerçekleşti.Yeni hayvan sayısı: "+hayvanatBahcesi.hayvanSayiGetir(hayvan));
        } else if (sayi2 == 2) {
            hayvanatBahcesi = new SicakHb();
            System.out.println("Bahçemizdeki Hayvanlar: 1-Deve 2-Antilop 3-Çöl Tilkisi 4-Kertenkele");
            System.out.println("Yeni hayvan eklemek istediğiniz hayvanın numarasını giriniz:");
            hayvan =scanner.nextInt();
            hayvanatBahcesi.yeniHayvanEkle(hayvan);
            System.out.println("Hayvan ekleme işlemi başarıyla gerçekleşti.Yeni hayvan sayısı: "+hayvanatBahcesi.hayvanSayiGetir(hayvan));
        } else if (sayi2 == 3) {
            hayvanatBahcesi = new OrmanHb();
            System.out.println("Bahçemizdeki Hayvanlar: 1-Aslan 2-Yılan 3-Maymun 4-Geyik");
            System.out.println("Yeni hayvan eklemek istediğiniz hayvanın numarasını giriniz:");
            hayvan =scanner.nextInt();
            hayvanatBahcesi.yeniHayvanEkle(hayvan);
            System.out.println("Hayvan ekleme işlemi başarıyla gerçekleşti.Yeni hayvan sayısı: "+hayvanatBahcesi.hayvanSayiGetir(hayvan));
        } else {
            System.out.println("Hatalı seçim yaptınız.Lütfen tekrar giriş yapınız.");
        }
    }
    public void hayvanBesle(int sayi2){
        if (sayi2 == 1) {
            hayvanatBahcesi = new SogukHB();
            System.out.println("Bahçemizdeki Hayvanlar: 1-Kutup Ayısı 2-Penguen 3-Kutup Tilkisi 4-Fok balığı");
            System.out.println("Lütfen beslemek istediğiniz hayvan kategorisini seçiniz");
            hayvan =scanner.nextInt();
            System.out.println(hayvan+" nolu kategorideki hayvan beslendi.");
        } else if (sayi2 == 2) {
            hayvanatBahcesi = new SicakHb();
            System.out.println("Bahçemizdeki Hayvanlar: 1-Deve 2-Antilop 3-Çöl Tilkisi 4-Kertenkele");
            System.out.println("Lütfen beslemek istediğiniz hayvan kategorisini seçiniz");
            hayvan =scanner.nextInt();
            System.out.println(hayvan+" nolu kategorideki hayvan beslendi.");

        } else if (sayi2 == 3) {
            hayvanatBahcesi = new OrmanHb();
            System.out.println("Bahçemizdeki Hayvanlar: 1-Aslan 2-Yılan 3-Maymun 4-Geyik");
            System.out.println("Yeni hayvan eklemek istediğiniz hayvanın numarasını giriniz:");
            hayvan =scanner.nextInt();
            System.out.println(hayvan+" nolu kategorideki hayvan beslendi.");

        } else {
            System.out.println("Hatalı seçim yaptınız.Lütfen tekrar giriş yapınız.");
        }
    }

}

