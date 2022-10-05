public class Main {
    public static void lol() {
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        x = scanner.nextInt();
        if (x == 0) return;
        System.out.println(x);
        x = scanner.nextInt();
        if (x == 0) return;
        lol();
    }

    public static void main(String[] args) {
        lol();
    }
}
