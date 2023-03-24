package homeworks;


import java.util.Scanner;

class PlayersAnswer{
    //Fields
    private String answer;
    //Get
    public String getAnswer() {
        return answer;
    }
    //Constructor
    public PlayersAnswer(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please choose rock, paper, scissors, spock or lizard");
            this.answer = scanner.nextLine().toLowerCase().trim();
            if (!valueValidation(this.answer)) {
                System.out.println("Incorrect input data, please, try again");
            }
        } while (!valueValidation(this.answer));
    }

    private static Boolean valueValidation(String answer){
        return answer.matches("paper|rock|scissors|spock|lizard");
    }

}
public class HW15_OOP {
    public static void main(String[] args) {
        System.out.println("Player 1");
        PlayersAnswer playersAnswer1 = new PlayersAnswer();
        System.out.println("Player 2");
        PlayersAnswer playersAnswer2 = new PlayersAnswer();
        //System.out.println(rockPaperScissors(playersAnswer1.getAnswer(), playersAnswer2.getAnswer()));
        System.out.println(rockPaperScissorsLizardSpock(playersAnswer1.getAnswer(), playersAnswer2.getAnswer()));
    }

    public static String rockPaperScissors(String answer1, String answer2){
        String result;
        if (answer1.equals(answer2)) {
            result = "TIE";
        } else {
            if (answer1.equals("paper") && answer2.equals("rock")
                    || answer1.equals("scissors") && answer2.equals("paper")
                    || answer1.equals("rock") && answer2.equals("scissors")){
                result = "Player 1 wins";
            } else{
                result = "Player 2 wins";
            }
        }
        return result;
    }

    public static String rockPaperScissorsLizardSpock(String answer1, String answer2){
        String result;
        if (answer1.equals(answer2)) {
            result = "TIE";
        } else {
            if (answer1.equals("paper") && answer2.matches("rock|spock")
            || answer1.equals("rock") && answer2.matches("scissors|lizard")
            || answer1.equals("scissors") && answer2.matches("paper|lizard")
            || answer1.equals("lizard") && answer2.matches("paper|spock")
            || answer1.equals("spock") && answer2.matches("rock|scissors")){
                result = "Player 1 wins";
            } else {
                result = "Player 2 wins";
            }
        }
        return result;
    }

}
