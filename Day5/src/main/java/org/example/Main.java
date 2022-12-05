package org.example;

import org.example.Game.Board;
import org.example.Game.Game;
import org.example.Game.Move;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static final Path path = Path.of("C:\\Users\\Tomas Lukosevicius\\Desktop\\AdeventOfCode\\AdventOfCode2022\\Day5\\src\\main\\java\\org\\example\\input");

    public static void main(String[] args) throws IOException {
        long begin = System.currentTimeMillis();
        game1();
        game2();
        long end = System.currentTimeMillis();
        System.out.println(end-begin + "ms");
    }

    private static void game1() throws IOException {
        List<String> lines = Files.readAllLines(path);
        lines.removeIf(String::isEmpty);
        Game game = parseLines(lines);
        game.solve1();
    }

    private static void game2() throws IOException {
        List<String> lines = Files.readAllLines(path);
        lines.removeIf(String::isEmpty);
        Game game = parseLines(lines);
        game.solve2();
    }

    public static Game parseLines(List<String> lines){

        int lastBoardIndex = -1;
        List<Move> moves = new ArrayList<>();
        for (String line:lines) {
            switch (line.charAt(0)){
                case '[',' ':
                    lastBoardIndex++;
                    break;
                case 'm':
                    addToMovesList(moves,line);
                    break;
            }
        }

        editMapLines(lines, lastBoardIndex);
        Board board = parseMap(lines, lastBoardIndex);
        return new Game(board,moves);
    }

    private static Board parseMap(List<String> lines, int lastBoardIndex) {

        int length = lines.get(lastBoardIndex).length()/2;
        Board board = new Board(length);
        for(int i = lastBoardIndex; i>=0; i--){
            char[] line = lines.get(i).toCharArray();
            for(int x=0;x<line.length;x++){
                if(x % 2 == 0 && line[x] != ' '){
                    board.gameboard[x/2].push(line[x]);
                }
            }
        }
        return board;
    }

    private static void editMapLines(List<String> lines, int lastBoardIndex) {
        for(int i = lastBoardIndex; i>=0; i--){
            lines.set(i, lines.get(i)
                    .replace("[","")
                    .replace("]","")
                    .replace("    ","  "));
        }
    }

    public static void addToMovesList(List<Move> moves,String move){
        String[] steps = move.split(" ");
        int index = Integer.parseInt(steps[1]);
        int from = Integer.parseInt(steps[3]);
        int to = Integer.parseInt(steps[5]);
        moves.add(new Move(index,from,to));
    }
}