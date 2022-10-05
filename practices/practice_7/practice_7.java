import java.util.Stack;

public class Main {
    public static String work(int[] word) {
        StringBuilder res = new StringBuilder();
        Stack<Integer> wordArray = new Stack<>();
        for (int j =  0; j<word.length;  j++) {
            if (word[j] > 0) {
                wordArray.add(word[j]);
                res.append("0");
            } else if (word[j] == 0) {
                if (wordArray.isEmpty()) {
                    res.append("-1");
                } else {
                    res.append((int) wordArray.pop());
                }
            }
            if (word.length!=1 && j!=word.length-1)
                res.append(",");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int[] word = new int[]{0, 1, 8, 4, 0, 3, 0, 8, 8, 3, 7};
        System.out.println(work(word));
    }
}
