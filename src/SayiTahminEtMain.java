
import java.util.Random;
import java.util.Scanner;

public class SayiTahminEtMain {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomSayi = random.nextInt(100)+1;
        
        int tahminHakki = 5;
        
        System.out.println("****Doğru sayıyı tahmin etme oyununa hoş geldiniz****");
        System.out.println("Doğru sayıyı bulmak için 5 hakkınız var...");
        System.out.println("Lütfen 0-100 arası bir sayı giriniz : ");
        int guess = scanner.nextInt();
        if(randomSayi == guess){
            System.out.println("Tebrikler ilk denemede bildiniz ..");
        }else {
            tahminHakki --;
            System.out.println("Kalan tahmin hakkınız => " + tahminHakki);
            if( randomSayi > guess ){
                System.out.println("Çok yaklaştın doğru sayı biraz daha yukarıda..");
            }else{
                System.out.println("Çok yaklaştın doğru sayı biraz aşağıda..");
            }
        }
        System.out.println("Lütfen yeni tahmininizi girin..");
        int guess2 = scanner.nextInt();
        if(randomSayi == guess2){
            System.out.println("Tebrikler ikinci denemede bildiniz ..");
        }else {
            tahminHakki --;
            System.out.println("Kalan tahmin hakkınız => " + tahminHakki);
            if( randomSayi > guess2 ){
                System.out.println("Çok yaklaştın doğru sayı biraz daha yukarıda..");
            }else{
                System.out.println("Çok yaklaştın doğru sayı biraz aşağıda..");
            }
        }
        System.out.println("Lütfen yeni tahmininizi girin..");
        int guess3 = scanner.nextInt();
        if(randomSayi == guess3){
            System.out.println("Tebrikler üçüncü denemede bildiniz ..");
        }else {
            tahminHakki --;
            System.out.println("Kalan tahmin hakkınız => " + tahminHakki);
            if( randomSayi > guess3 ){
                System.out.println("Çok yaklaştın doğru sayı biraz daha yukarıda..");
            }else{
                System.out.println("Çok yaklaştın doğru sayı biraz aşağıda..");
            }
        }
        System.out.println("Lütfen yeni tahmininizi girin..");
        int guess4 = scanner.nextInt();
        if(randomSayi == guess4){
            System.out.println("Tebrikler dördüncü denemede bildiniz ..");
        }else {
            tahminHakki --;
            System.out.println("Kalan tahmin hakkınız => " + tahminHakki);
            if( randomSayi > guess4 ){
                System.out.println("Çok yaklaştın doğru sayı biraz daha yukarıda..");
            }else{
                System.out.println("Çok yaklaştın doğru sayı biraz aşağıda..");
            }
        }
        System.out.println("Lütfen yeni tahmininizi girin..");
        int guess5 = scanner.nextInt();
        if(randomSayi == guess5){
            System.out.println("Tebrikler son denemenizde bildiniz ..");
        }else {
            tahminHakki --;
            System.out.println("Kalan tahmin hakkınız => " + tahminHakki);
            if(tahminHakki == 0){
                System.out.println("Başka hakkınız kalmadı..");
                System.out.println("Doğru sayı => " + randomSayi + " idi.");
            }
            
        }
        
    }
    
}
