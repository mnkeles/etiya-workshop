public  class ProductValidator {
    // genel class  static olamaz, Ide hata verir

    static{
        System.out.println("Static yapıcı blok çalıştı");
    }

    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }

    public static boolean isValid(Product product) { //kullan bırak araçlar static yapılabilir sıfırlanmıyor.
        if (product.price > 0 && !product.name.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    //Inner class
    public static class BaskaBirClass {
        public static void Sil() {
        }
    }

}