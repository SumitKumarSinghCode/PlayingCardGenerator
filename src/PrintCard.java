class PrintCard {

    public void printCard(int num, String suit) {
        String inputrank;
        String[] rank={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        if(num>0 && num<=13){
            inputrank=rank[num-1];
        }else{
            System.out.println(num);
            inputrank=" ";
        }

        String symbol;
        switch (suit.toLowerCase()){
            case "club":
                symbol ="♣";
                break;

            case "diamond":
                symbol ="♦";
                break;

            case "heart":
                symbol ="♥";
                break;

            case "spade":
                symbol ="♠";
                break;

            default:
                symbol =" ";
        }

        String[] cardbox = {
                "╔═════════╗",
                "║ "+inputrank
                +"       ║",
                "║         ║",
                "║         ║",
                "║    "+symbol+"    ║",
                "║         ║",
                "║         ║",
                "║       "+inputrank
                +" ║",
                "╚═════════╝"};
        for(String x:cardbox){
            System.out.println(x);
        }
    }
}
