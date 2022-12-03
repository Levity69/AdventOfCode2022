import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Path.of("C:\\Users\\Tomas\\Desktop\\AdventOfCode\\Day2Reset\\src\\input"));
        List<Round> game = getRounds(lines);
        Game1(game);
        Game2(game);
    }

    private static void Game1(List<Round> game) {
        game.forEach(Round::solveRound1);
        int sum = game.stream().mapToInt(x -> x.points).sum();
        System.out.println(sum);
    }
    private static void Game2(List<Round> game) {
        game.forEach(Round::solveRound2);
        int sum = game.stream().mapToInt(x -> x.points).sum();
        System.out.println(sum);
    }
    private static List<Round> getRounds(List<String> lines) {
        List<Round> game = new ArrayList<>();
        for (var line: lines) {
            String[] characters =  line.split(" ");
            game.add(new Round(characters[0],characters[1]));
        }
        return game;
    }


}