package com.ozlemelmali;
public class Main extends Oda {
    public static int oyunBitti = 0;//sadece kapi acildiginda 1 olacak statik deger
    public static void main(String[] args) {
        String hosgeldinEkrani = "\nUyandın... Hiç tanıdık gelmeyen bir odadasın. Sahi neresi burası? Kapı da kilitli. Önünde dört duvar var.\n";
        oyunOyna(hosgeldinEkrani);
    }
    
    public static void oyunOyna(String hosgeldinEkrani){
        System.out.println(hosgeldinEkrani);//oyun basladiginda ilk yazilacak stringi ekrana yazar
        Oda oda = new Oda();//odanin fonksiyonlarini kullanabilmek icin nesne olusturduk
        do{
            oda.duvarDegistir();//oyundaki duvarlara bakma fonksiyonu
        } while(Main.oyunBitti==0);
    }
}

