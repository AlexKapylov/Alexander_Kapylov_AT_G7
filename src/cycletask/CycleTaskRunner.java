package cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        System.out.println("------------------WhileCycle---------------------");
        new WhileCycle().whileNumbers();
        System.out.println("------------------ForCycle---------------------");
        new ForCycle().forNumbers();
        System.out.println("------------------Creation + ShowArrayItems---------------------");
        TrainArray ta = new TrainArray();
        ta.startRandom();
        ta.showItems();
        System.out.println("------------------ReverseArrayItems---------------------");
        ta.reverseItems();
        System.out.println("------------------MultArrayItems_x5---------------------");
        ta.multItems();
        System.out.println("------------------SquareArrayItems---------------------");
        ta.squareItems();
        System.out.println("------------------MinItem---------------------");
        ta.minItem();
        System.out.println("------------------Replace_F_L_Items---------------------");
        ta.replace();
        System.out.println("------------------SortArrayItems---------------------");
        ta.sortItems();

    }
}
