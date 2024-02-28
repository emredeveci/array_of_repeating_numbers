import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {4, 5, 4, 3, 0, 0, 7, 9, 9, 9, 18, 6, 84, 86, 18, 4, 6};
        int[] duplicate = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] % 2 == 0 && list[i] == list[j]) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(duplicate));
    }
}