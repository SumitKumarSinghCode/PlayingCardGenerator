import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Generate a random number between 1 and 13
        Random random = new Random();
        int randomNumber = random.nextInt(1,13);
        System.out.println("Random Number: " + randomNumber);

        String[] suits = {"club", "diamond", "heart", "spade"};
        int randindex = random.nextInt(suits.length);
        String randomstring = suits[randindex];
        System.out.println("Random String: "+randomstring);

        PrintCard p1= new PrintCard();
        p1.printCard(randomNumber,randomstring);
    }
}