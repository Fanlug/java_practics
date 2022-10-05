import java.util.Scanner;

public class Main {
    static long factorial(int number){
        long result = 1;
        for (int i = 1; i < number; i++) {
            result*=i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(scanner.nextInt()));
    }

}
