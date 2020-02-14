import java.util.Scanner;

public class showPrime {
    public static void main(String[] args) {
        int count = 0;
        int number = 0;
        Scanner num=new Scanner(System.in);
        int x=num.nextInt();
        System.out.println("cac so nguyen to");
        while (count < x) {
            if (isPrime(number)) {
                System.out.printf("%d ,", number);
                count++;
            }
            number++;
        }
    }

    private static boolean isPrime(int number) {

        if (number == 2) {
            return true;
        }
        if (number > 2) {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0)
                    return false;
            }
            return true;
        } // end if number >= 2
        return false;
    }

}

