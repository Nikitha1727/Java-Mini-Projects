// javac Demo2.java
// java Demo2

public class Demo2 {
    public static void main(String[] args) {

        int[][] marks = new int[3][3]; 


        int x = 10;
        for(int i = 0; i < marks.length; i++){
            for(int j = 0; j < marks[i].length; j++){
                marks[i][j] = x;
                x++;
            }
        }
        
        for(int i = 0; i < marks.length; i++){
            for(int j = 0; j < marks[i].length; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
