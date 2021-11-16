package recursion;

public class TowerOfHanoi {
    public int depth = 0;
    public void move(int numberOfDiscs, char from, char to, char inter) {
        depth++;
        if (numberOfDiscs == 1) {
            System.out.println("Moving disc " + numberOfDiscs + " from " + from + " to " + to);
        } else {
            move(numberOfDiscs - 1, from, inter, to);
            System.out.println("Moving disc " + numberOfDiscs + " from " + from + " to " + to);
            move(numberOfDiscs - 1, inter, to, from);
        }
    }

    public static void main(String[] args) {
        TowerOfHanoi toh = new TowerOfHanoi();
        toh.move(6, 'A', 'C', 'B');
        System.out.println("Depth: " + toh.depth);
    }
}
