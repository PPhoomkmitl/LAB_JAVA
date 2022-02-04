class Dicreate1_1 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 5, 5, 6, 9, 9, 9 };
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (j != 10 && arr[i] == arr[j]) {
                    count++;
                    result = arr[j];
                    if (count > 1) {
                        System.out.println(count + " " + result);
                    } // else if (i >= 2 && arr[i] != arr[i - 2] && arr[i] == arr[i - 1])
                      // System.out.println(count + " " + result);
                }
            }
        }

    }
}
