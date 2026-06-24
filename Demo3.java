// import java.util.Scanner;
// public class Demo3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int arr[] = new int[5];

//         //take input from user:
//         for(int i=0; i<arr.length; i++){
//             System.out.println("enter the value: ");
//             arr[i] = scan.nextInt();
//         }

//         System.out.println("First Five Values are : ");

//         //for printing those values:
//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//      }
//     }


// 2d arrays:
// import java.util.Scanner;
// public class Demo3{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int arr [][] = new int[3][3];

//         //taking input:
//         for(int i=0; i<arr.length;i++){
//             for(int j=0; j<arr.length;j++){
//                 System.out.println("Enter the values: ");
//                 arr[i][j] = scan.nextInt();
//             }
//         }

//         //output:
//         System.out.println("the values are:");
//        for(int i=0; i<arr.length;i++){
//             for(int j=0; j<arr.length;j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//sum of arrays:
// import java.util.Scanner;
// public class Demo3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter number of Elements: ");
//         int n = scan.nextInt();

//         int arr[] = new int[n];
//         int sum = 0;

//         for(int i = 0; i < arr.length; i++){
//             System.out.print("Enter value: ");
//             arr[i] = scan.nextInt();
//             sum += arr[i];
//         }

//         System.out.println("Sum is: " + sum);
//      }
// }



//max of an array:
// import java.util.Scanner;
// public class Demo3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter number of Elements: ");
//         int n = scan.nextInt();

//         int arr[] = new int[n];
//         int max = Integer.MIN_VALUE;

//         for(int i = 0; i < arr.length; i++){
//             System.out.println("Enter the values: ");
//             arr[i] = scan.nextInt();
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
//         System.out.println("max element is: " + max);
//      }
// }















