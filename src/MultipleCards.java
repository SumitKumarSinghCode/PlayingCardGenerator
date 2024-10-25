public class MultipleCards extends PrintCard{
    public void printMultipleCards(int[] rank, String[] suit) {

        int inputrank; //int variable for storing rank
        String inputsuit; //String variable for storing the suit

        //loop for passing the values to the function from the input array of ranksInputArray and suitsInputArray
        for (int i = 0; i < suit.length; i++) {
            for (int j=0;j<rank.length;j++) {
                inputrank = rank[j]; //accessing the rank from the ranksInputArray
                inputsuit = suit[i]; // accessing the suit from the suitsInputArray
                printCard(inputrank, inputsuit); //Passing the inputrank and inputsuit
            }
        }
    }
}
