import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scannerSys = new Scanner(System.in);
        File file = new File(scannerSys.next());
        Scanner scannerFile = new Scanner(file);
        while (scannerFile.hasNextLine())
            System.out.println(scannerFile.nextLine());
    }
}
