package runlengthencoding;

public class RunLengthEncoding {

    public String encodeRunLength(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        char currentChar = chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (currentChar == chars[i]) {
                count++;
            } else {
                stringBuilder.append(currentChar).append(count);
                count = 1;
                currentChar = chars[i];
            }
        }
        stringBuilder.append(currentChar).append(count);
        return stringBuilder.toString();
    }
}

class Main {
    public static void main(String[] args) {
        String result = new RunLengthEncoding().encodeRunLength("aaabbbcaaad");
        System.out.println(result);
    }
}
