import java.util.Scanner;

public class PrintNumberOfDashes {

    private static char wCharLetter;
    private static char [] charArray ;
    private static int count =0;
    private static String input;

    public static void main(String [] args)
    {
        inputReader();


    }
    public static void calculateDashes()
    {
        for (int i = 0; i < input.length(); i++) {
            wCharLetter = charArray[i];
            switch (wCharLetter)
            {
                case '0':
                    count =count +6;
                    break;
                case '1':
                    count =count + 2;
                    break;
                case '2':
                    count =count + 5;
                    break;
                case '3':
                    count =count + 5;
                    break;
                case '4':
                    count =count + 4;
                    break;
                case '5':
                    count =count + 5;
                    break;
                case '6':
                    count = count + 6;
                    break;
                case '7':
                    count = count + 4;
                    break;
                case '8':
                    count =count + 7;
                    break;
                case '9':
                    count =count + 6;
                    break;
            }
        }
        System.out.println(count);
        count =0;
        inputReader();
    }
    private static void inputReader()
    {
        System.out.println("Enter Input : ");
        Scanner scanner =new Scanner(System.in);
        input =scanner.nextLine();
        charArray =input.toCharArray();
        calculateDashes();
    }
}
