public class Main {
    public static void main(String[] args) {

        //For döngüsü ile çalışmak
        for(int i=2;i<=10;i+=2){
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        //While döngüsü ile çalışmak
        int i=2;
        while (i<10){
            System.out.println("i");
            i+=2;
        }
        System.out.println("While Döngüsü Bitti");

        //Do-While ile çalışmak
        //do-while dönügülerinde şart sağlanmasa bile bir kere çalışır.
        int j=1;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-while Döngüsü Bitti");
    }

}
