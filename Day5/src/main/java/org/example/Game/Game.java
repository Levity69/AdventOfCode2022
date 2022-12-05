package org.example.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Game {
    Board board;
    List<Move> moves;

    public Game(Board board,List<Move> moves){
        this.board = board;
        this.moves = moves;
    }

    public void solve1(){
        for (Move move:moves) {
            for(int i=0;i<move.count;i++){
                if(!board.gameboard[move.from].empty()){
                    char character = board.gameboard[move.from].pop();
                    board.gameboard[move.to].push(character);
                }
            }
        }
        printResult();
    }

    public void solve2(){
        for (Move move:moves) {
            List<Character> characters =  new ArrayList<>();
            for(int i=0;i<move.count;i++){
                if(!board.gameboard[move.from].empty()){
                    char character = board.gameboard[move.from].pop();
                    characters.add(character);
                }
            }
            for(int i=characters.size()-1;i>=0;i--){
                board.gameboard[move.to].push(characters.get(i));
            }
        }
        printResult();
    }

    private void printResult() {
        for(Stack stack: board.gameboard){
            if(!stack.isEmpty())
                System.out.print(stack.pop());
        }
        System.out.println();
    }
}
