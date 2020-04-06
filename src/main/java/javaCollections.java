import java.util.HashMap;

public class javaCollections{

    public static int maxNum(int arr[], int p, int j)
    {
        int max = 0;

        for (int i = 0; i < p - j; i++) {
            int current = 0;

            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            for (int m = i; m < i + j; m++) {

                if (!map.containsKey(arr[m])) {
                    map.put(arr[i], 1);
                    current++;
                    continue;
                }
            }
            if (current > max)
                max = current;
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[] arr = { 3, 5, 3, 2, 4, 1 };
        int p = 3;
        int j = 2;

        System.out.println(maxNum(arr, p, j));
    }
}
