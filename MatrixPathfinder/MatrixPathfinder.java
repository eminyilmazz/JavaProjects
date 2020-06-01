package Lab10;
//Muhammed Emin Yılmaz 090150303
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class MatrixPathfinder {
    static class Pair {
        private int x;
        private int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
    }
    public static boolean hasPath(int[][] arr, int[][] visited, Stack<String> path, Stack<Pair> stack, int i, int j) {
        int rowLength = arr.length;
        int columnLength = arr[0].length;
        //if it's the last element, output the path
        if(i == rowLength - 1 && j == columnLength - 1) {
            System.out.println(path);
            return true;
        }
        //Go right if path available
        if(i >= 0 && i < rowLength && j + 1 >= 0 && j + 1 < columnLength && arr[i][j+1] != 0 && visited[i][j + 1] != 1) {
            stack.push(new Pair(i,j));
            path.push("R");
            visited[i][j + 1] = 1;
            hasPath(arr, visited, path, stack, i, j + 1);
        }
        //Go down if path available
        else if(i + 1 >= 0 && i + 1 < rowLength && j >= 0 && j < columnLength && arr[i+1][j] != 0 && visited[i + 1][j] != 1) {
            stack.push(new Pair(i,j));
            path.push("D");
            visited[i + 1][j] = 1;
            hasPath(arr, visited, path, stack, i + 1, j);
        }
        //if non above satisfied, go back previous point to find another direction
        else {
            if(stack.size() == 0) {
                System.out.println("Path not found");
                return false;
            }
            path.pop();
            i = stack.peek().getX();
            j = stack.peek().getY();
            stack.pop();
            hasPath(arr, visited, path, stack, i, j);
    }
        return false;
    }
    public static void main(String[] args) {
        Stack<Pair> stack = new Stack<Pair>();
        Stack<String> path = new Stack<String>();
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the matrix");
        int n = input.nextInt();
        int[][] visited = new int [n][n];
        int[][] arr = new int[n][n];
        for (int[] row : visited) {
            Arrays.fill(row, -1);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = random.nextInt(2);
            }
        }
        //making sure the starting and destination points are valid path points
        arr[0][0] = 1;
        arr[n-1][n-1] = 1;
        visited[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        hasPath(arr, visited, path, stack, 0, 0);
    }
}