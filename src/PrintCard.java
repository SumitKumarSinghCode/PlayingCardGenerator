class PrintCard {
    String[] rankArray={" ","A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public void printCard(int rank, String suit) {

        String inputRank; // to store input rank as an string
        if(rank>0 && rank<=13){
            inputRank = this.rankArray[rank];
        }else{
            inputRank=this.rankArray[0];
        }

        String suitSymbol;
        switch (suit.toLowerCase()){
            case "club":
                suitSymbol ="♣";
                break;

            case "diamond":
                suitSymbol ="♦";
                break;

            case "heart":
                suitSymbol ="♥";
                break;

            case "spade":
                suitSymbol ="♠";
                break;

            default:
                suitSymbol =" ";
        }

        // Printing the card using a loop
        for (int i = 0; i < 9; i++) {
            switch (i) {
                case 0:
                    System.out.println("╔═════════╗");
                    break;
                case 1:
                    // Handle the top left rank (special handling for "10")
                    if (inputRank.equals("10")) {
                        System.out.println("║ " + inputRank + "      ║");
                    } else {
                        System.out.println("║ " + inputRank + "       ║");
                    }
                    break;
                case 4:
                    // Middle row for the suit
                    System.out.println("║    " + suitSymbol + "    ║");
                    break;
                case 7:
                    // Bottom right rank (special handling for "10")
                    if (inputRank.equals("10")) {
                        System.out.println("║      " + inputRank + " ║");
                    } else {
                        System.out.println("║       " + inputRank + " ║");
                    }
                    break;
                case 8:
                    System.out.println("╚═════════╝");
                    break;
                default:
                    // Rows with blank spaces
                    System.out.println("║         ║");
                    break;
            }
        }
    }
}
