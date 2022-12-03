import java.util.Arrays;

public class Rucksack {

    char[] firstLine;
    char[] secondLine;
    char[] thirdLine;
    char repeating;
    int value;

    public Rucksack(String items){
        secondLine = items.substring(items.length()/2).toCharArray();
        firstLine = items.substring(0,items.length()/2).toCharArray();
    }

    public Rucksack(String first, String second, String third){
        firstLine = first.toCharArray();
        secondLine = second.toCharArray();
        thirdLine = third.toCharArray();
    }

    public void solve2(){
        for (char item1:firstLine) {
            if(contains(secondLine,item1) && contains(thirdLine,item1)){
                setValue(item1);
                break;
            }
        }
    }

    public void solve1(){

        for (char item1:firstLine) {
            if(contains(secondLine,item1)) {
                setValue(item1);
                break;
            }
        }
    }

    private void setValue(char item){
        if(Character.isUpperCase(item)){
            value = item - 38;
        }else{
            value = item - 96;
        }
    }

    private boolean contains(char[] array,char item1){
        boolean contains = false;
        for (char item2:array) {
            if(item1 == item2){
                contains = true;
                break;
            }
        }
        return contains;
    }

}
