package snowpack;

public class SnowPack {

    public int calculate(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = arr[0];
        right[arr.length - 1] = arr[arr.length -1];
        for (int i = 1; i < arr.length; i++) {
            int j = arr.length -1 - i;
            left[i] = Math.max(left[i-1], arr[i]);
            right[j] = Math.max(right[j+1], arr[j]);
        }
        int snow = 0;
        for (int i = 0; i < arr.length; i++) {
            snow += Math.min(left[i], right[i]) - arr[i];
        }
        return snow;
    }

}

class Main {
    public static void main(String[] args) {
        System.out.println(new SnowPack().calculate(new int[]{1,2,3,4,5,6,7,8,0,8}));
    }
}
