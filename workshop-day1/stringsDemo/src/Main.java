public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        /*
        System.out.println("Eleman sayısı :"+mesaj.length());
        System.out.println("5. eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler=new char[5];
        //sonuncuyu dahil etmez, 5. eleman
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("ava"));
        System.out.println(mesaj.lastIndexOf("a"));
        */

        String YeniMesaj = mesaj.replace(' ', '-');
        System.out.println(YeniMesaj);
        //2 den başla 5 e kadar devam et anlamına gelir, 5 dahil değil.
        System.out.println(mesaj.substring(2, 5)); //-->gün

        for(String kelime : mesaj.split(" ")){ // " "  boşluk karakteri ile string i ayrırır,kelime kelime ayırır
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase()); // her karakteri küçük yapar
        System.out.println(mesaj.toUpperCase()); // her karakteri büyük yapar
        System.out.println(mesaj.trim()); // stringin başındaki ve sonundaki boşlukları atar.


    }
}