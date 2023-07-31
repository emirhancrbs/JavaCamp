public class Main {
    public static void main(String[] args) {
       int[] sayilar = new int[]{1,2,5,7,9,0};
       int aranacak =6;
       boolean varMi=false;
       for(int sayi:sayilar){
           if(aranacak==sayi){
               varMi=true;
               break;
           }
       }
       if (varMi){
           System.out.println("Sayı bulundu");
       }else {
           System.out.println("Sayı bulunamadı");
       }
    }
}