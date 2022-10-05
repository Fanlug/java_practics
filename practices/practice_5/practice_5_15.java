import java.util.Scanner;

public class Main {
    static long num = 0;

    public static void lol() {
        if(num==0){
            return;
        }
        System.out.print(num%10+" ");
        num = num / 10;
        lol();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num  = scanner.nextInt();
        lol();
    }
}
