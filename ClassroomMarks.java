/*
// 1D array
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of students:");
        int n = sc.nextInt();   
        
        int[] marks = new int[n];  
        
      
        System.out.println("Enter marks:");
        for(int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        
       
        System.out.println("Marks are:");
        for(int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }
        
        return; 
    }
} 
    */


//2D ARRAY:
import java.util.Scanner;

public class ClassroomMarks {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // take classrooms from user
        System.out.println("Enter number of classrooms:");
        int rows = sc.nextInt();
        
        // take students from user
        System.out.println("Enter number of students in each classroom:");
        int cols = sc.nextInt();
        
        int[][] marks = new int[rows][cols];
        
        // input marks
        System.out.println("Enter marks:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
        
        // print marks
        System.out.println("Marks are:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        
        return;
    }
}