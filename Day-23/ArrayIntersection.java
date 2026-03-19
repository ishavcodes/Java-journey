// Find common elements between two arrays --------------------

import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Arr1: ");
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for(int i=0; i<n1; i++) a1[i] = sc.nextInt();

        System.out.print("Size of Arr2: ");
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for(int i=0; i<n2; i++) a2[i] = sc.nextInt();

        System.out.print("Common elements: ");
        for(int i=0; i<n1; i++) {
            for(int j=0; j<n2; j++) {
                if(a1[i] == a2[j]) {
                    System.out.print(a1[i] + " ");
                    break;
                }
            }
        }
    }
}