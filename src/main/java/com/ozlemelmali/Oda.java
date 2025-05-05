package com.ozlemelmali;
public class Oda extends Esya{
    Duvar1 duvar1 = new Duvar1();//ic ice siniflarin neslerini olusturudk
    Duvar2 duvar2 = new Duvar2();
    Duvar3 duvar3 = new Duvar3();
    Duvar4 duvar4 = new Duvar4();
    Kapi kapi = new Kapi();//kalitim aldigi sinifin nesnelerini olusturduk
    Cekmece cekmece = new Cekmece();
    Vazo vazo = new Vazo();

    Tablo tablo = new Tablo();
    Kasa kasa = new Kasa();
    Sandik sandik = new Sandik();
    Dolap dolap = new Dolap();


    @Override
    public void duvarDegistir() {//oyunun icindeki duvarlari gezen fonksiyon
        int secim;
        System.out.println("Hangi duvarı görüntülemek istiyorsun ? ");
        secim = deneYanil();//yanlis deger girilmemesini sagladik
        switch (secim) {
            case 1 -> {
                //birinci duvar
                duvar1.duvarGenel();
                duvar1.duvar();
            }
            case 2 -> {
                //ikinci duvar
                duvar2.duvarGenel();
                duvar2.duvar();
            }
            case 3 -> {
                //ucuncu duvar
                duvar3.duvarGenel();
                duvar3.duvar();
            }
            case 4 -> {
                //dorduncu duvar
                duvar4.duvarGenel();
                duvar4.duvar();
            }
            default -> {
                //1-2-3-4 ten farkli tam sayi girisi
                System.out.println("Yanlış giriş !!! ");
                duvarDegistir();//tekrar duvar numarasi sorma
            }
        }
    }



    class Duvar1 implements Duvar{//sablon olan iki fonksiyonu interface ile duvar dan aldik
        Duvar1(){}
        @Override
        public void duvarGenel() {//interface ile duvar genelini override ederek icerisini doldurduk
            System.out.println(kapi.kapiOzellikleri +"(1)"+"\n"+ cekmece.cekmeceOzellikleri + "(2)" + vazo.getSaksi() +"(3)");
            //birinci duvardaki esyalarin ozellikleri
        }

        @Override
        public void duvar() {//interface ile duvari override ederek icerisini doldurduk
            System.out.println("Hangi eşyayı incelemek istiyorsun ? (Parantezler icerisinde bulunan sayıları giriniz)");
            int secim = deneYanil();
            switch (secim) {

                case 1:
                    kapi.acikKapali();
                    break;
                case 2:
                    System.out.println("Çekmecelerden hangisini açacaksın?(İlk çekmece için 1'i, ikinci çekmece için 2'yi tuşlayınız:)");
                    secim = deneYanil();
                    if (secim == 1) {
                        cekmece.cekmece1();
                    }
                    else if (secim == 2) {
                        cekmece.cekmece2();
                    }
                    else
                        System.out.println("(Lütfen bir veya iki değerlerini tuşlayınız:)");
                    break;
                case 3:
                    vazo.toprakBak();
                    break;
                default:
                    System.out.println("(Parantez dışı bir sayı girmeyiniz!)");
            }
        }
    }
    class Duvar2 implements Duvar{//sablon olan iki fonksiyonu interface ile duvar dan aldik
        Duvar2(){}
        @Override
        public void duvarGenel() {
            new Vazo(1);
            new Tablo(1);//tablonun ozelliklerini yapici metodundan cektik
        }

        @Override
        public void duvar() {
            System.out.println("Hangi eşyayı incelemek istiyorsun ?(Parantezler içerisinde bulunan sayıları giriniz) ");
            int secim = deneYanil();
            switch (secim) {
                case 1:
                    System.out.println("Masanın üzerinde üç tane vazo bulunuyor.Bunlardan ilki "+vazo.getVazo1() +
                            "\nOrtadakinde ise "+ vazo.getVazo2() +
                            "\nEn sonda ise  "+ vazo.getVazo3());
                    break;
                case 2:
                    tablo.inceleTablo();
                    break;
                default:
                    System.out.println("(Parantez dışı bir sayı girmeyiniz!)");
            }
        }
    }
    class Duvar3 implements Duvar{//sablon olan iki fonksiyonu interface ile duvar dan aldik
        Duvar3(){}
        @Override
        public void duvarGenel() {
            new Kasa(1);
            new Sandik(1);
            System.out.println("Rafın üzerinde ulaşamdığın bir saat (3)görüyorsun. Zaman mı durdu yoksa bu saatte bir gariplik mi var? ");
            System.out.println("Aynı rafta bir kutu(4) dikkatini çekiyor. İçinde ne var ki acaba? Ulaşamıyorsun...");
        }

        @Override
        public void duvar() {
            System.out.println("Hangi eşyayı incelemek istiyorsun ? (Parantezler içerisinde bulunan sayıları giriniz)");
            int secim = deneYanil();
            switch (secim){
                case 1:
                    kasa.kasaAc();
                    break;
                case 2:
                    sandik.sandikKilit();
                    break;
                case 3:
                    System.out.println("Saate yakınlaşıyorsun. Saat tam olarak 19:22:07'yi gösteriyor.\n" +
                            "Ne kadar detaylı bir saat;saniyesine kadar gösteriyor.Ne yazık ki bozulmuş.");
                    break;
                case 4:
                    if(dolap.isSupurge()==false)
                        System.out.println("Ne kadar denesen de kutuya ulaşamıyorsun");
                    if(dolap.isSupurge()==true){
                        System.out.println("Kutuyu düşürdün. İçinden mavi anahtar çıktı!");
                        kapi.setMaviKilit(true);
                    }
                //default:
                //    System.out.println("(Parantez dışı bir sayı girmeyiniz!)");
            }
        }
    }

    class Duvar4 implements Duvar{//sablon olan iki fonksiyonu interface ile duvar dan aldik
        Duvar4(){}

        @Override
        public void duvarGenel() {
            new Dolap(1);
        }

        @Override
        public void duvar() {
            if(dolap.isDolapAnahtari()==false){
                System.out.println("Dolabı açacak herhangi bir şey yok.");
            }
            else {
                System.out.println("Sandıktan bulduğun anahtarla dolabın kilidini açtın.");
                System.out.println("Dolabın solunda eski bir çalı süpürgesi(1) ve bir adet kova var.Sağında ise rafta bir kutu(2),eskimiş birkaç kıyafet ve çekmeceler(3) var.");
                System.out.println("Hangi eşyayı incelemek istiyorsun ? (Parantezler içerisinde bulunan sayıları giriniz)");
                int secim = deneYanil();
                switch (secim){
                    case 1:
                        dolap.dolapAc();
                        break;
                    case 2:
                        dolap.kutuAc();
                        break;
                    case 3:
                        System.out.println("Gereksiz eşyalarla dolu.");
                        break;
                    default:
                        System.out.println("(Parantez dışı bir sayı girmeyiniz!)");
                }
            }
        }
    }
}