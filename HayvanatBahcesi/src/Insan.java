import java.util.Scanner;

public class Insan {

    IHayvanatBahcesi hayvanatBahcesi;
    int hayvan;
    boolean check;

    Scanner scanner = new Scanner(System.in);

    public void bahceSec() {

        System.out.println("Lütfen aşağıdan seçmek istediğiniz hayvanat bahçesinin numarasını girin:");
        System.out.println("1-Kutup Hayvanat Bahçesi");
        System.out.println("2-Çöl Hayvanat Bahçesi");
        System.out.println("3-Orman Hayvanat Bahçesi");


    }

    public void hayvanSayisiGoruntule(int sayi2) {
        if (sayi2 == 1) {
            hayvanatBahcesi = new SogukHB();
            System.out.println("Bahçemizdeki Hayvanlar: 1-Kutup Ayısı 2-Penguen 3-Kutup Tilkisi 4-Fok balığı");
            System.out.println("Sayısını görüntülemek istediğiniz hayvanın numarasını giriniz:");
            hayvan = scanner.nextInt();
            System.out.println("Bahçemizde seçtiğiniz hayvandan " + hayvanatBahcesi.hayvanSayiGetir(hayvan) + " tane bulunmaktadır");
        } else if (sayi2 == 2) {
            hayvanatBahcesi = new SicakHb();
            System.out.println("Bahçemizdeki Hayvanlar: 1-Deve 2-Antilop 3-Çöl Tilkisi 4-Kertenkele");
            System.out.println("Sayısını görüntülemek istediğiniz hayvanın numarasını giriniz:");
            hayvan = scanner.nextInt();
            System.out.println("Bahçemizde seçtiğiniz hayvandan " + hayvanatBahcesi.hayvanSayiGetir(hayvan) + " tane bulunmaktadır");
        } else if (sayi2 == 3) {
            hayvanatBahcesi = new OrmanHb();
            System.out.println("Bahçemizdeki Hayvanlar: 1-Aslan 2-Yılan 3-Maymun 4-Geyik");
            System.out.println("Sayısını görüntülemek istediğiniz hayvanın numarasını giriniz:");
            hayvan = scanner.nextInt();
            System.out.println("Bahçemizde seçtiğiniz hayvandan " + hayvanatBahcesi.hayvanSayiGetir(hayvan) + " tane bulunmaktadır");
        } else {
            System.out.println("Hatalı seçim yaptınız.Lütfen tekrar giriş yapınız.");
        }


    }

    public void sesCikarttir(int sayi2) {

        if (sayi2 == 1) {
            hayvanatBahcesi = new SogukHB();
            System.out.println("Bahçemizdeki Hayvanlar: 1-Kutup Ayısı 2-Penguen 3-Kutup Tilkisi 4-Fok balığı");
            System.out.println("Ses cıkarmasını istediğiniz hayvanın numarasını giriniz:");
            hayvan = scanner.nextInt();
            System.out.println(hayvanatBahcesi.sesGetir(hayvan));
        } else if (sayi2 == 2) {
            hayvanatBahcesi = new SicakHb();
            System.out.println("Bahçemizdeki Hayvanlar: 1-Deve 2-Antilop 3-Çöl Tilkisi 4-Kertenkele");
            System.out.println("Ses cıkarmasını istediğiniz hayvanın numarasını giriniz:");
            hayvan = scanner.nextInt();
            System.out.println(hayvanatBahcesi.sesGetir(hayvan));
        } else if (sayi2 == 3) {
            hayvanatBahcesi = new OrmanHb();
            System.out.println("Bahçemizdeki Hayvanlar: 1-Aslan 2-Yılan 3-Maymun 4-Geyik");
            System.out.println("Ses cıkarmasını istediğiniz hayvanın numarasını giriniz:");
            hayvan = scanner.nextInt();
            System.out.println(hayvanatBahcesi.sesGetir(hayvan));
        } else {
            System.out.println("Hatalı seçim yaptınız.Lütfen tekrar giriş yapınız.");
        }


    }
    public void degerControl(){
        do{

        }while(check);
    }



    }

