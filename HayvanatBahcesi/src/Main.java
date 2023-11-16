import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int sayi1 = 0;
        int menuSec = 0;
        boolean check;
        boolean check1;
        boolean check3;
        boolean check2;
        Bakici bakici = new Bakici();
        int sayi2 = 0;
        Insan insan;


        System.out.println("--------------Hayvanat Bahçesi Sistemine Hoşgeldiniz--------------");

        do {


            do {

                System.out.println("Seyirci İnsan girişi için 1'e,Hayvan Bakıcısı girişi için 2 ye basınız: ");

                try {
                    sayi1 = scanner.nextInt();
                    check1 = false;
                } catch (Exception e) {
                    System.out.println("Hatalı seçim yaptınız.Lütfen tekrar giriş yapınız." + e);
                    scanner.nextLine();
                    check1 = true;
                }
            } while (check1);

            if (sayi1 == 1) {
                insan = new SeyirciInsan();
                System.out.println("Seyirci İnsan olarak giris yaptınız.");


                do {

    insan.bahceSec();
    try {
        sayi2 = scanner.nextInt();
        check2=false;

    } catch (Exception e) {
        System.out.println("Hatalı seçim yaptınız.Lütfen tekrar giriş yapınız." + e);
        scanner.nextLine();
        check2=true;
    }

                }while (check2);


                if (sayi2 == 1) {
                    System.out.println("Kutup Hayvanat Bahçesine hoşgeldiniz. ");
                }
                if (sayi2 == 2) {
                    System.out.println("Çöl Hayvanat Bahçesine hoşgeldiniz. ");
                }
                if (sayi2 == 3) {
                    System.out.println("Orman Hayvanat Bahçesine hoşgeldiniz. ");
                }


                do {
                    do {
                    menu();
                    System.out.println("Hayvanat bahçesi seçimine dönmek için 0'a basınız.");



                        try {
                            menuSec = scanner.nextInt();
                            check3=false;

                        } catch (Exception e) {
                            System.out.println("Hatalı seçim yaptınız.Lütfen tekrar giriş yapınız." + e);
                            scanner.nextLine();
                            check3=true;
                        }
                    }while (check3);


                    if (menuSec == 1) {
                        insan.hayvanSayisiGoruntule(sayi2);

                    }
                    if (menuSec == 2) {
                        insan.sesCikarttir(sayi2);
                    }
                    System.out.println("Menüye geri dönmek için 0'ı,çıkış yapmak için 1'i seçiniz.");
                    menuSec = scanner.nextInt();
                } while (menuSec == 0);
                    check=false;





            } else if (sayi1 == 2) {
                insan = new Bakici();

                System.out.println("Hayvan Bakıcısı olarak giris yaptınız.");
                do{
                insan.bahceSec();
                try {
                    sayi2 = scanner.nextInt();
                    check2=false;

                } catch (Exception e) {
                    System.out.println("Hatalı seçim yaptınız.Lütfen tekrar giriş yapınız." + e);
                    scanner.nextLine();
                    check2=true;
                }
            }while (check2);

                if (sayi2 == 1) {
                    System.out.println("Kutup Hayvanat Bahçesine hoşgeldiniz. ");
                }
                if (sayi2 == 2) {
                    System.out.println("Çöl Hayvanat Bahçesine hoşgeldiniz. ");
                }
                if (sayi2 == 3) {
                    System.out.println("Orman Hayvanat Bahçesine hoşgeldiniz. ");
                }
                do {
                    menu();
                    System.out.println("3-Hayvan Ekle ");
                    System.out.println("4-Hayvan Besle ");
                    do {


                        try {
                            menuSec = scanner.nextInt();
                            check3=false;

                        } catch (Exception e) {
                            System.out.println("Hatalı seçim yaptınız.Lütfen tekrar giriş yapınız." + e);
                            scanner.nextLine();
                            check3=true;
                        }
                    }while (check3);
                    if (menuSec == 1) {
                        insan.hayvanSayisiGoruntule(sayi2);
                    }
                    if (menuSec == 2) {
                        insan.sesCikarttir(sayi2);
                    }
                    if (menuSec == 3) {
                        bakici.hayvanEkle(sayi2);
                    }
                    if (menuSec == 4) {
                        bakici.hayvanBesle(sayi2);
                    }

                    System.out.println("Menüye geri dönmek için 0'ı,çıkış yapmak için 1'i seçiniz.");
                    menuSec = scanner.nextInt();
                } while (menuSec == 0);
                check = false;


            } else {
                System.out.println("Hatalı seçim yaptınız.Lütfen tekrar giriş yapınız.");
                check = true;
            }
        } while (check);

    }

    public static void menu() {
        System.out.println("Lütfen menüden yapmak istediğiniz işlemin numarasını giriniz: ");
        System.out.println("---------Menü-------");
        System.out.println("1-Hayvan Sayısı Görüntüle ");
        System.out.println("2-Hayvana Ses Çıkarttır ");
    }
}


