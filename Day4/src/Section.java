public class Section {

    int firstSubdivisionFrom;
    int firstSubdivisionTo;
    int secondSubdivisionFrom;
    int secondSubdivisionTo;

    boolean contains = false;

    public Section(String firstSubdivision, String secondSubdivision){

        String[] firstElements = firstSubdivision.split("-");
        String[] secondElements = secondSubdivision.split("-");

        this.firstSubdivisionFrom = Integer.parseInt(firstElements[0]);
        this.firstSubdivisionTo = Integer.parseInt(firstElements[1]);
        this.secondSubdivisionFrom = Integer.parseInt(secondElements[0]);
        this.secondSubdivisionTo = Integer.parseInt(secondElements[1]);
    }

    public void solve1(){
        if(firstContainsSecond() || secondContainsFirst()){
            contains = true;
        }
    }

    public void solve2(){
        if(firstPartlyContainsSecond() || secondPartlyContainsFirst()){
            contains = true;
        }
    }

    private boolean firstPartlyContainsSecond(){
        return partlyContains(secondSubdivisionFrom,secondSubdivisionTo,firstSubdivisionFrom,firstSubdivisionTo);
    }

    private boolean secondPartlyContainsFirst(){
        return partlyContains(firstSubdivisionFrom,firstSubdivisionTo,secondSubdivisionFrom,secondSubdivisionTo);
    }

    private boolean firstContainsSecond(){
        return contains(secondSubdivisionFrom,secondSubdivisionTo,firstSubdivisionFrom,firstSubdivisionTo);
    }

    private boolean secondContainsFirst(){
        return contains(firstSubdivisionFrom,firstSubdivisionTo,secondSubdivisionFrom,secondSubdivisionTo);
    }

    private boolean contains(int firstFrom,int firstTo,int secondFrom,int secondTo){
        return firstFrom >= secondFrom && firstTo <= secondTo;
    }

    private boolean partlyContains(int firstFrom,int firstTo,int secondFrom,int secondTo){
        if(firstTo >= secondFrom && firstTo <= secondTo){
            return true;
        }
        return firstFrom >= secondFrom && firstFrom <= secondTo;
    }
}
