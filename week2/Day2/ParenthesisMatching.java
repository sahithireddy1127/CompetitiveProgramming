import java.util.Scanner;

public class ParenthesisMatching {
    public Integer matchingParenthesis(String input, int paramIndex){
        if (paramIndex > input.length() || paramIndex < 0 || input.charAt(paramIndex) != '(') {
            System.out.println("Given index is not valid for given string");
        }
        int paramCount = 1;
        for (int i = paramIndex+1; i<input.length(); i++) {
            if (input.charAt(i)=='(') {
                paramCount++;
            }
            if (input.charAt(i)==')') {
                paramCount--;
            }
            if (paramCount==0) {
                return i;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sc.nextLine();
        System.out.println("Enter Open Parenthesis index in the given string : ");
        int paramIndex = sc.nextInt();

        ParenthesisMatching obj = new ParenthesisMatching();

        System.out.println(obj.matchingParenthesis(input,paramIndex));
    }
}
