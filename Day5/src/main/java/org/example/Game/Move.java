package org.example.Game;

public class Move {

    public int count;
    public int from;
    public int to;

    public Move(int rowIndex,int moveFrom,int moveTo){
        this.from = moveFrom-1;
        this.count = rowIndex;
        this.to = moveTo-1;
    }

    @Override
    public String toString() {
        return count + " " + from + " " + to;
    }
}
