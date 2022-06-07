import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        String[] sections = operation.split(" ");

        int firstNum = Integer.parseInt(sections[0]);
        int secondNum = Integer.parseInt(sections[2]);
        String charExpr = String.valueOf(sections[1]);
        try {
            if ((firstNum > 0 && secondNum > 0) && (firstNum <= 10 && secondNum <= 10)) {
                switch (charExpr) {
                    case "+" -> firstNum += secondNum;
                    case "-" -> firstNum -= secondNum;
                    case "/" -> firstNum /= secondNum;
                    case "*" -> firstNum *= secondNum;
                }
                System.out.println(firstNum);
            }
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
