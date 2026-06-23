//Leaders in an array
//Given an array of N Integer, find all the leaders in the array
//an element is called a leader if it's greater than or equal
//to all the elements to its right side
//the rightmost element is always considered a leader
//return or print all the leaders in the ordeer in which they appear in the array.
//Example 1;
//Input
//   N = 6
//   arr[] = {16, 17, 4, 3, 5, 2}
//Output
//   17 5 2
//Explanation:
// 17 is greater than {4, 3, 5, 2} 
// 5 is greater than {2} 
// 2 is the last element so it is always a leader
// 16 is not a leader because 17 is greater than 16




import java.util.*;
public class QUE_1_SOL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = Integer.MIN_VALUE;

        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.print(leaders.get(i));
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
