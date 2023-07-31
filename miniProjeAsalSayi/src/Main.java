public class Main {
    public static void main(String[] args) {
        int sayi =6;
        boolean asalmi=true;
        if (sayi==1){
            System.out.println("sayı asal değil");
            return;
        }
        if (sayi<1){
            System.out.println("Geçersiz sayı");
            return;
        }

        for (int i=2;i<sayi;i++){
            if (sayi%i==0){
                asalmi=false;
            }
        }
        if (asalmi){
            System.out.println("sayı asal");
        }else {
            System.out.println("sayı asal değil");
        }

    }
}