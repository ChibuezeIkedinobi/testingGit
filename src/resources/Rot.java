package resources;

public class Rot {
        public static void main(String[] args) {
            int[] a = {1, 2, 3, 4, 5};
            int d = 4;
            int[] rotatedArray = rotLeft(a, d);
            printArray(rotatedArray);
        }

        public static int[] rotLeft(int[] a, int d) {
            int n = a.length;
            int[] rotated = new int[n];
            for (int i = 0; i < n; i++) {
                int newIndex = (i + (n - d)) % n;
                rotated[newIndex] = a[i];
            }
            return rotated;
        }

        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
}
