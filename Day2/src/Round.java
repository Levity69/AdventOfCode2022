public class Round {

    String opponent;
    String you;

    int points;

    public Round(String a, String b){
        this.opponent = a;
        this.you = b;
        this.points = 0;
    }

    public void solveRound2(){
        switch (you){
            case "X":
                points = 0;
                if(opponent.equals("A")) points += 3;
                else if (opponent.equals("B")) points += 1;
                else if (opponent.equals("C")) points += 2;
                break;
            case "Y":
                points = 3;
                if(opponent.equals("A")) points += 1;
                else if (opponent.equals("B")) points += 2;
                else if (opponent.equals("C")) points += 3;
                break;
            case "Z":
                points = 6;
                if(opponent.equals("A")) points += 2;
                else if (opponent.equals("B")) points += 3;
                else if (opponent.equals("C")) points += 1;
                break;
        }
    }

    public void solveRound1(){
        switch (you){
            case "X":
                points = 1;
                if(opponent.equals("A")) points += 3;
                else if (opponent.equals("C")) points += 6;
                break;
            case "Y":
                points = 2;
                if(opponent.equals("B")) points += 3;
                else if (opponent.equals("A")) points += 6;
                break;
            case "Z":
                points = 3;
                if(opponent.equals("C")) points += 3;
                else if (opponent.equals("B")) points += 6;
                break;
        }
    }

    @Override
    public String toString() {
        return opponent + " " + you;
    }
}
