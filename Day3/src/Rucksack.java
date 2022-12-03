import java.util.Arrays;

public class Rucksack {

    char[] firstCompartment;
    char[] secondCompartment;
    char repeating;

    int value;
    String line;

    public Rucksack(String items){
        line = items;
        secondCompartment = items.substring(items.length()/2).toCharArray();
        firstCompartment = items.substring(0,items.length()/2).toCharArray();
    }


    public void solve(){

        for (char item1:firstCompartment) {
            boolean contains = false;
            for (char item2:secondCompartment) {
                if(item1 == item2){
                    contains = true;
                    break;
                }
            }
            if(contains){
                repeating = item1;
                break;
            }
        }

        if(Character.isUpperCase(repeating)){
            value = repeating - 38;
        }else{
            value = repeating - 96;
        }
    }

    @Override
    public String toString() {

        return repeating +  " " + value + " " + line + " " + Arrays.toString(firstCompartment) +  " " + Arrays.toString(secondCompartment) + "\n";
    }
}
