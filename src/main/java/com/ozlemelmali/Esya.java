//ESYA CLASSI
package com.ozlemelmali;
import java.util.Scanner;

public class Esya {

    static public int deneYanil(){//hatali girisleri yakalamak icin olusturdugumuz fonksiyon
        int donecekSayi = 0;
        boolean control = false;
        do {
            try{
                int sayi;
                sayi=Integer.parseInt(input.nextLine());
                control=true;
                donecekSayi=sayi;
            }catch (NumberFormatException err){
                System.out.println("Sayı giriniz!!!");
            }
        }while(!control);
        return donecekSayi;
    }

    public void duvarDegistir(){}
    static Scanner input = new Scanner(System.in);
    public class Kapi{

        //değişkenlerini tanımladik
        public String kapiOzellikleri = "Duvarın ortasında sırasıyla mavi, yeşil, kırmızı, pembe renklerinde 4 tane kilidi bulunan bir kapı var." ;
        private static boolean maviKilit=false;
        private static boolean yesilKilit=false;
        private static boolean kirmiziKilit=false;
        private static boolean pembeKilit=false;
        //metotlarini tanımladik

        public void setKirmiziKilit(boolean kirmiziKilit) {
            this.kirmiziKilit = kirmiziKilit;
        }

        public void setMaviKilit(boolean maviKilit) {
            this.maviKilit = maviKilit;
        }

        public void setPembeKilit(boolean pembeKilit) {
            this.pembeKilit = pembeKilit;
        }

        public void setYesilKilit(boolean yesilKilit) {
            this.yesilKilit = yesilKilit;
        }

        public boolean isKirmiziKilit() {
            return kirmiziKilit;
        }

        public boolean isMaviKilit() {
            return maviKilit;
        }

        public boolean isPembeKilit() {
            return pembeKilit;
        }

        public boolean isYesilKilit() {
            return yesilKilit;
        }

        public void acikKapali(){
            System.out.println("Kapıyı açmayı deniyorsun... ");
            if(isKirmiziKilit()==true && isMaviKilit()==true && isPembeKilit()==true && isYesilKilit()==true){
                System.out.println("Elindeki her anahtarı sırasıyla çeviriyorsun.");
                System.out.println("Kapıyı açtın, artık özgürsün...");
                Main.oyunBitti=1;
            }
            else{
                //duvara bakcak tekrardan
                System.out.println("Kapı anahtarların tam değil");
            }
        }
    }

    public class Cekmece{
        private static boolean cFlag=false;
        public String cekmeceOzellikleri = "İki çekmeceli bir komodin";//Ekarana yazdırmak için bir alan oluşturduk
        Vazo vazo = new Vazo();//Vazonun nesnesini tanımladık
        Kapi kapi = new Kapi();//Kapının nesnesini tanımladık
        private String cerceve = "Çekmecenin içinden bir çerçeve çıktı.Milattan öncesinden mi kalma bu? İçinde üzerindeki vazolarla bir masa fotoğrafı var.\n Vazolar yatay,puantiyeli ve dikey olarak sıralanmış.";

        public void cekmece1(){

            if(cFlag==true && vazo.cekmeceAnahtari==true){
                System.out.println("Daha önce bu çekmeceyi açmıştın.");//doldurulur
            }
            else if(vazo.cekmeceAnahtari==true){
                System.out.println(cerceve + " Bir tane de kırmızı anahtar buldun.");
                kapi.setKirmiziKilit(true);
                cFlag=true;
            }
            else{
                System.out.println("Çekmece kilitli .");
            }
        }
        public void cekmece2(){
            System.out.println("İşe yarar bir şey yok.");
        }

    }
    public class Vazo{//consturctor içine yazılabilir değerler
        Vazo(){}
        Vazo(int sayi){
            System.out.println("Üzerinde vazolarla bir masa (1)ve ");
        }
        private String vazo1 = "yatay çizgili bir vazo ve içinde üç yapraklı bir bitki bulunuyor.";
        private String vazo2 = "dikey çizgili ve içerisinde iki yaprağı kalmış bir gül bulunuyor.";
        private String vazo3 = "puantiye desenli ve içerisinde altı yapraklı tek bir çiçeği olan bir vazo bulunuyor.";
        private String saksi = "İçinde bodur bir bitki olan saksı";
        private static boolean vFlag=false;
        private static boolean  cekmeceAnahtari = false;

        public String getVazo1() {
            return vazo1;
        }

        public String getVazo2() {
            return vazo2;
        }

        public String getVazo3() {
            return vazo3;
        }

        public String getSaksi() {
            return saksi;
        }

        public void toprakBak(){
            if(cekmeceAnahtari == true &&  vFlag == true){
                System.out.println("Daha önce buraya gelmiştin.");//doldurulur
            }
            else if (cekmeceAnahtari==false){
                System.out.println("Topraktaki şişkinliği fark edip eşelemeye başlıyorsun; bir anahtar buldun!");
                cekmeceAnahtari = true;
                vFlag=true;
            }
            else{
                System.out.println("Zaten toprağı eşelemiştin.");
            }
        }
    }
    public class Tablo{
        public Tablo(int sayi){
            System.out.println("Van Gogh'un yıldızlı gece tablosu (2) görünüyor.");
        }
        public Tablo(){}
        public void inceleTablo(){
            System.out.println("Sanki bu tabloda bir terslik var.Sebebi görebilmek için yakından bakmaya karar veriyorsun."+
                    "\nKahverengi dağın tam ortasında kıpkırmızı bir üçgen, gökyüzünü aydınlatan sarı yıldızların tam ortasına yerleşmiş iki mor kare,"+
                    "\ntarlaların ve köyün olduğu noktada ise sekiz mavi daire bulunuyor.Ne ifade ediyor acaba?");
        }
    }
    public class Sandik{
        private static boolean sFlag=false;
        int sifre2;
        Dolap dolap = new Dolap();
        Sandik(int sayi){
            System.out.println("Tahtakurularının bile yüzüne bakmadığı eskilikte bir sandık.(2)\nÜstündeki tozları üfleyip dağıtıyorsun.\nO da ne!Bu kadar eski bir sandığa kim asma kilit takar ki?");
        }
        Sandik(){}
        private int sandikSifre = 362;

        public int getSandikSifre() {
            return sandikSifre;
        }
        public void sandikKilit(){
            if(sFlag==false){
                System.out.println("Üzerinde oyma yaprak desenleriyle ne kadar göz alıcı bir kilit.Üç haneli bir şifre girişi var.Yapraklar ve üç hane, hmmm..?");
                sifre2 = deneYanil();
                if(sifre2==getSandikSifre()){
                    System.out.println("Ufak metal bir anahtar var. Anahtarı aldın.");
                    dolap.setDolapAnahtari(true);
                    sFlag=true;
                }
                else{
                    System.out.println("Yanlış şifre!");
                }
            }
            else if(sFlag==true)
            {
                System.out.println("Sandığı açmıştın.");
            }
        }

    }
    public class Kasa{
        boolean control = false;
        int sifre;
        private static boolean kFlag=false;
        Kapi kapi = new Kapi();
        Kasa(int sayi){
            System.out.println("Duvara gömülü rakam girişli çelik dijital kasa (1) var.");
        }
        Kasa(){

        }
        public void kasaAc(){


            if (kFlag==false){
                System.out.println("Kasanın üzerinde sırasıyla kırmızı bir üçgen, mor bir kare ve mavi bir daire var.(3 haneli sifreyi giriniz:)");
                sifre = deneYanil();
                if (sifre == 128){
                    System.out.println("Pembe bir anahtar buldun!");
                    kapi.setPembeKilit(true);
                    kFlag=true;
                }
                else {
                    System.out.println("Şifre yanlış!");
                }
            }
            else if (kFlag==true){
                System.out.println("Kasayı açtın.");
            }
        }
    }
    public class Dolap{
        int sifre ;
        private static boolean dFlag=false;
        private static boolean kuFlag=false;
        Kapi kapi = new Kapi();
        Dolap(int sayi){
            System.out.println("Tüm duvarı boydan boya kaplayan bir gömme dolap.");
        }
        Dolap(){
              }
        private static boolean dolapAnahtari = false;
        private boolean supurge = false;

        public boolean isSupurge(){
            return supurge;
        }

        public void setSupurge(boolean supurge) {
            this.supurge = supurge;
        }

        public void setDolapAnahtari(boolean dolapAnahtari) {
            this.dolapAnahtari = dolapAnahtari;
        }

        public boolean isDolapAnahtari() {
            return dolapAnahtari;
        }
        public void dolapAc(){
            if(dFlag==false){
                if(isDolapAnahtari()==true){
                    System.out.println("Süpürgeyi aldın.");
                    setSupurge(true);
                    dFlag=true;
                }
            }
            else if(dFlag==true){
                System.out.println("Alacak başka bir şey kalmadı.");
            }
        }
        public void kutuAc(){
            if(kuFlag==false){
                System.out.println("Saat desenleriyle kaplanmış altı haneli şifre girişi bulunan bir kutu.(6 haneli şifreyi girin:)");
                sifre = deneYanil();
                if(sifre==192207){
                    System.out.println("Yeşil bir anahtar buldun!");
                    kapi.setYesilKilit(true);
                    kuFlag=true;
                }
                else {
                    System.out.println("Yanlış şifre!");
                }
            }
            else if(kuFlag==true){
                System.out.println("Kutuyu açmıştın.");
            }
        }
    }
}
