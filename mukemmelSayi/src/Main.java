public class Main {
    public static void main(String[] args) {
        int number = 5;
        int sum = 0;
        if(number<1){
            System.out.println("Geçersiz sayı girdiniz");
            return;
        }
        for (int i = 1; i < number; i++) {
            if ((number % i) == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println("Mükmmel sayı.");
        } else {
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}