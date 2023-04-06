public class Main {
    public static void main(String[] args) {
        String mesaj = sehirVer();
        String yeniMesaj = mesaj.substring(0, 2);
        int sayi = topla(15, 7);

        int toplam = topla2(2, 3, 4, 5, 6, 7);
        System.out.println(sayi);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("Eklendi.");
    }

    public static void sil() {
        System.out.println("Silindi.");
    }

    public static void güncelle() {
        System.out.println("Güncellendi.");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static String sehirVer() {
        return "Ankara";
    }

    // Variable Arguments aşağğıdaki methoda istediğimiz kadar sayı gönderebiliriz , parametre göndermeyedebiliriz
    // int array göndermiş gibi davranır, ama limitsiz bir array
    // arka planda kendi int dizisine çevirir.
    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam = toplam + sayi;
        }
        return toplam;
    }
}