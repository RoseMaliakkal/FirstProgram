package Oops.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestArray {

    public void getArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    public void findMin(int[] ar) {
        int min = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (min > ar[i]) {
                min = ar[i];
            }
        }
        System.out.println("Minimum of array is:" + min);
    }

    public static void main(String[] args) throws IOException {
        int ar1[] = new int[10];
        System.out.println("Enter values to array");
        for (int i = 0; i < ar1.length; i++) {
            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(read);
            ar1[i] = Integer.parseInt(in.readLine());
        }
        TestArray obj = new TestArray();
        obj.getArray(ar1);
        obj.findMin(ar1);
    }
}
