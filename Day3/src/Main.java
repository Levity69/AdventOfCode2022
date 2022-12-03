import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //Game1();
        Game2();
    }

    private static void Game1() throws IOException {
        List<String> lines = Files.readAllLines(Path.of("C:\\Users\\Tomas\\Desktop\\AdventOfCode\\Day3\\src\\input"));
        List<Rucksack> rucksacks = lines.stream().map(Rucksack::new).toList();
        rucksacks.forEach(Rucksack::solve);
        System.out.println(rucksacks.stream().mapToInt(x -> x.value).sum());
    }

    private static void Game2() throws IOException {
        List<String> lines = Files.readAllLines(Path.of("C:\\Users\\Tomas\\Desktop\\AdventOfCode\\Day3\\src\\input"));
        List<Rucksack> rucksacks = lines.stream().map(Rucksack::new).toList();
        rucksacks.forEach(Rucksack::solve);
        System.out.println(rucksacks.stream().mapToInt(x -> x.value).sum());
    }
}