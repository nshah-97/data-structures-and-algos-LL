package nonrepeatingcharacter;

public class NonRepeatingCharacter {
    public char find(String s) {
        int[] firstIndex = new int[256];

        for (int i = 0; i < firstIndex.length; i++) {
            firstIndex[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (firstIndex[currentChar] == -1) {
                firstIndex[currentChar] = i;
            } else {
                firstIndex[currentChar] = -2;
            }
        }

        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < firstIndex.length; i++) {
            int curIndex = firstIndex[i];
            if (curIndex >= 0 && curIndex < minIndex) {
                minIndex = curIndex;
            }
        }

        if (minIndex !=Integer.MAX_VALUE) {
            return s.charAt(minIndex);
        } else {
            return ' ';
        }

    }
}

class Main {
    public static void main(String[] args) {
        System.out.println( new NonRepeatingCharacter().find("geekforgeek"));
    }
}