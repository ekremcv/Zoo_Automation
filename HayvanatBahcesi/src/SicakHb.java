public class SicakHb implements IHayvanatBahcesi{
        //"Deve","Antilop","Çöl Tilkisi","Kertenkele"
    int[] hayvanSayilar={5,4,3,10};
    int hayvansayi;
    String[] hayvanSes={"nmmnmnmn","möööö","rrrrr","tısss"};
    String ses;


    @Override
    public String sesGetir(int hayvan1) {
        for (int j = 0; j < 4; j++) {
            if (hayvan1 == j + 1) {
                ses=hayvanSes[j];
            }
        }
        return ses;
    }

    @Override
    public int hayvanSayiGetir(int hayvan2) {
        for (int j = 0; j < 4; j++) {
            if (hayvan2 == j + 1) {
                hayvansayi=hayvanSayilar[j];
            }
        }

        return hayvansayi;

    }

    @Override
    public void yeniHayvanEkle(int hayvan3) {
        for (int j = 0; j < 4; j++) {
            if (hayvan3 == j + 1) {
                hayvanSayilar[j]=hayvanSayilar[j]+1;
            }
        }
    }
}
