import java.util.Arrays;
import java.util.function.Predicate;

public class Abbreviation {


    public void abbreviation(String a, String b) {
        System.out.println(abbreviation(toCharacterArray(a.toCharArray()) , toCharacterArray(b.toCharArray()), false));
    }

    private boolean abbreviation(Character[] a, Character[] b, boolean possible) {
        if (possible || a.length < b.length) return possible; //Already found solution or this isnt a solution
        if (b.length == 0) {
            if (allOf(a, Character::isLowerCase)) return true;
        }
        Character firstChar = a[0];
        Character[] aWithoutFirst = Arrays.copyOfRange(a, 1, a.length);
        Character[] bWithoutFirst = Arrays.copyOfRange(b, 1, b.length);
        if (Character.isLowerCase(firstChar)) abbreviation(aWithoutFirst, b, possible);
        if (Character.toUpperCase(firstChar) != b[0]) return possible;
        return abbreviation(aWithoutFirst, bWithoutFirst, possible);
    }

    private <T> boolean allOf(T[] arr, Predicate<T> pred) {
        for (T it : arr) {
            if (!pred.test(it)) return false;
        }
        return true;
    }

    private Character[] toCharacterArray(char[] arr) {
        Character[] characters = new Character[arr.length];
        for (int i = 0; i < arr.length; i++) {
            characters[i] = arr[i];
        }
        return characters;
    }

}

class Main {
    public static void main(String[] args) {
        new Abbreviation().abbreviation("aaBC", "ABC");
    }
}
