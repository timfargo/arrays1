package sky.pro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Задание 1
        int[] weight = new int[]{1, 2, 3};

        for (int i = 0; i <= weight.length - 1; i++) {
            System.out.println(weight[i]);
            if (i != weight.length - 1) System.out.println(",");

            float[] arr = new float[]{1.57f, 7.654f, 9.986f};

            for (int j = 0; j <= arr.length - 1; j++) {
                System.out.println(arr[j]);
                if (j != arr.length - 1) System.out.println(",");

                int[] arrays = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

                for (int s = 0; s <= arrays.length - 1; s++) {
                    System.out.println(arrays[s]);
                    if (s != arrays.length - 1) System.out.println(",");
                }
            }
            // Задание 2

            int[] weight1 = new int[3];
            weight1[0] = 1;
            weight1[1] = 2;
            weight1[2] = 3;

            for (int i1 = 0; i < weight1.length; i++) {
                if (i != weight1.length - 1)
                    System.out.print(weight1[i] + ",");
                else
                    System.out.print(weight1[i]);
            }
            System.out.println();


            float[] arr1 = new float[]{1.57f, 7.654f, 9.986f};

            for (int j = 0; j < arr1.length - 1; j++) {
                if (j != arr1.length - 1)
                    System.out.print(arr1[j] + ",");
                else
                    System.out.print(arr1[j]);
            }
            System.out.println();

            int[] arrays1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

            for (int s = 0; s < arrays1.length - 1; s++) {
                if (s != arrays1.length - 1)
                    System.out.print(arrays1[s] + ",");
                else
                    System.out.print(arrays1[s]);
            }
            System.out.println();

            // Задание 3
            int[] weight2 = new int[3];
            weight2[0] = 1;
            weight2[1] = 2;
            weight2[2] = 3;

            for (int a = weight2.length - 1; a >= 0; a--) {
                if (a != 0)
                    System.out.print(weight2[a] + ",");
                else
                    System.out.print(weight2[a]);
            }
            System.out.println();

            float[] arr2 = new float[]{1.57f, 7.654f, 9.986f};

            for (int j = arr2.length - 1; j >= 0; j--) {
                if (j != 0)
                    System.out.print(arr2[j] + ",");
                else
                    System.out.print(arr2[j]);
            }
            System.out.println();

            int[] arrays2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

            for (int s = arrays2.length - 1; s >= 0; s--) {
                if (s != 0)
                    System.out.print(arrays2[s] + ",");
                else
                    System.out.print(arrays2[s]);
            }
            System.out.println();

            // Задание 4
            int[] weight3 = new int[3];
            weight3[0] = 1;
            weight3[1] = 2;
            weight3[2] = 3;

            for (int i1 = 0; i1 < weight3.length; i1++) {
                if (weight3[i1] % 2 != 0) {
                    weight3[i1]++;
                }
                if (i1 != weight3.length)
                    System.out.print(weight3[i1] + ",");
                else
                    System.out.print(weight3[i1]);
            }
            System.out.println();
            System.out.println(Arrays.toString(weight3));

            float[] arr3 = new float[]{1.57f, 7.654f, 9.986f};

            for (int j = 0; j < arr3.length; j++) {
                if (arr3[j] % 2 != 0) {
                    arr3[j]++;
                }
                if (j != arr3.length)
                    System.out.print(arr3[j] + ",");
                else
                    System.out.print(arr3[j]);
            }
            System.out.println();
            System.out.println(Arrays.toString(arr3));

            int[] arrays3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

            for (int s = 0; s<arrays3.length; s++) {
                if (arrays3[s] % 2 != 0) {
                    arrays3[s]++;
                }
                if (s != arr3.length)
                    System.out.print(arrays3[s] + ",");
                else
                    System.out.print(arrays3[s]);
            }
            System.out.println();
            System.out.println(Arrays.toString(arrays3));
                }
            }

        }








































