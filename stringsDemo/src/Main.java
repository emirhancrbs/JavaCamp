import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";


       System.out.println(mesaj);
       /*  System.out.println("Eleman sayısı : " + mesaj.length());//mesajın uzunluk değerini bulma
        System.out.println("5. Eleman : " + mesaj.charAt(5));//karakterin değerini getirme
        System.out.println(mesaj.concat(" Yaşasın!"));//mesaj birleştirme fonksiyonu
        System.out.println(mesaj.startsWith("A"));//mesajın hangi karakterle başlayıp başlamadığını döndüren fonksiyon true/fasle döndürür
        System.out.println(mesaj.endsWith("."));//mesajın hangi karakterle bittiğini döndüren fonksiyon true/fasle döndürür
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("av"));//belirtilen karakterin veya string değerin mesajın içinde kaçıncı eleman olduğunu bulmaya yarar
        System.out.println(mesaj.lastIndexOf('e'));//indexof fonksiyonunun tam tersi aramaya sondan başlar
*/

        System.out.println(mesaj.replace(' ','-'));//mesajın içindeki belirtilen karakterleri değiştirmeye yarar
        System.out.println(mesaj.substring(2,5));//mesajın içinde belirttiğimiz indexten itibaren mesajımızı parçalar
        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());

    }
}