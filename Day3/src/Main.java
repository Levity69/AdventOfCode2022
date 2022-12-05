import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        game1();
        game2();
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + "ms");
    }

    private static void game1() throws IOException {
        List<String> lines = Files.readAllLines(Path.of("C:\\Users\\Tomas\\Desktop\\AdventOfCode\\Day3\\src\\input"));
        List<Rucksack> rucksacks = lines.stream().map(Rucksack::new).toList();
        rucksacks.forEach(Rucksack::solve1);
        System.out.println(rucksacks.stream().mapToInt(x -> x.value).sum());
    }

    private static void game2() throws IOException {
        List<String> lines = Files.readAllLines(Path.of("C:\\Users\\Tomas\\Desktop\\AdventOfCode\\Day3\\src\\input"));

        List<Rucksack> rucksacks = new ArrayList<>();
        for(int i=0;i<lines.size()/3;i++){
            rucksacks.add(new Rucksack(lines.get(i*3),lines.get(i*3+1),lines.get(i*3+2)));
        }
        rucksacks.forEach(Rucksack::solve2);
        System.out.println(rucksacks.stream().mapToInt(x -> x.value).sum());
    }
}