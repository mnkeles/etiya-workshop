public abstract class GameCalculator {
    public abstract void hesapla();  // her class kendi için doldurmalı
    public final void gameOver(){ //hiç bir zaman değişmez
        System.out.println("Oyun bitti");
    }

}