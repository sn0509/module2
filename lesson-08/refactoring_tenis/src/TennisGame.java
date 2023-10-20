public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1_score, int player2_score) {
        String score = "";
        int tempScore=0;
        final int noScore=0;
        final int fifteenScore=1;
        final int thirtyScore=2;
        final int fortyScore=3;

        if (player1_score==player2_score)
        {
            switch (player1_score)
            {
                case noScore:
                    score = "Love-All";
                    break;
                case fifteenScore:
                    score = "Fifteen-All";
                    break;
                case thirtyScore:
                    score = "Thirty-All";
                    break;
                case fortyScore:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (player1_score>=4 || player2_score>=4)
        {
            int minusResult = player1_score-player2_score;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1_score;
                else { score+="-"; tempScore = player2_score;}
                switch(tempScore)
                {
                    case noScore:
                        score+="Love";
                        break;
                    case fifteenScore:
                        score+="Fifteen";
                        break;
                    case thirtyScore:
                        score+="Thirty";
                        break;
                    case fortyScore:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}