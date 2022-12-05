import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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

    public static void game1() throws IOException {
        List<String> lines = Files.readAllLines(Path.of("C:\\Users\\Tomas\\Desktop\\AdventOfCode\\Day4\\src\\input"));
        List<Section> sections = lines.stream().map(x -> {
            String[] subdicisions = x.split(",");
            return new Section(subdicisions[0], subdicisions[1]);
        }).toList();
        sections.forEach(Section::solve1);
        long count = sections.stream().filter(x -> x.contains).count();
        System.out.println(count);
    }

    public static void game2() throws IOException {
        List<String> lines = Files.readAllLines(Path.of("C:\\Users\\Tomas\\Desktop\\AdventOfCode\\Day4\\src\\input"));
        List<Section> sections = lines.stream().map(x -> {
            String[] subdicisions = x.split(",");
            return new Section(subdicisions[0], subdicisions[1]);
        }).toList();
        sections.forEach(Section::solve2);
        long count = sections.stream().filter(x -> x.contains).count();
        System.out.println(count);
    }
}