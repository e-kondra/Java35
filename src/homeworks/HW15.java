package homeworks;

import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {

        String[] answers = new String[2];
        for( int i = 1; i <= 2; i++ ) {
            answers[i-1] = getAnswer(i);
        }
        System.out.println(rockPaperScissors(answers[0], answers[1]));

    }
    //Method getAnswer
    public static String getAnswer(int numberPlayer){
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.printf("Player %d, please choose rock, paper or scissors \n", numberPlayer);
            answer = scanner.nextLine().toLowerCase().trim();
            if (!valueValidation(answer)) {
                System.out.println("Incorrect data, please, try again");
            }
        } while (!valueValidation(answer));
        return answer;
    }
    //Method valueValidation
    public static Boolean valueValidation(String answer){
        return answer.matches("paper|rock|scissor");
    }
    //Method rockPaperScissors
    public static String rockPaperScissors(String answer1, String answer2){
        String result;
        if (answer1.equals(answer2)) {
            result = "TIE";
        } else {
            if (answer1.equals("paper") && answer2.equals("rock")
                    || answer1.equals("scissor") && answer2.equals("paper")
                    || answer1.equals("rock") && answer2.equals("scissor")){
                result = "Player 1 wins";
            } else{
                result = "Player 2 wins";
            }
        }
        return result;
    }
}
