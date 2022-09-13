import java.util.Scanner;
public class SentenceFreq {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word or sentence: ");

        String str = reader.nextLine();

        System.out.print("Now choose a letter which frequency you would like to check: ");
        char ch = reader.next().charAt(0);
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of letter " + ch + " = " + frequency);
    }
}