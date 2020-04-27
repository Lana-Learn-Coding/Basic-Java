package labnew.lab03;

import util.Menu;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMenu {
    private static final Scanner sc = new Scanner(System.in);
    private static int[][] matrix;

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setEntry("1", "enter numbers for matrix", MatrixMenu::inputMatrix);
        menu.setEntry("2", "print whole matrix", MatrixMenu::printMatrix);
        menu.setEntry("3", "print matrix edges", MatrixMenu::printMatrixEdges);
        menu.setEntry("4", "calculate sum of element on each diagonals", MatrixMenu::printSumOfDiagonal);
        menu.setEntry("5", "sort cell in each row from smaller to bigger", MatrixMenu::sortCellInRow);
        menu.setEntry("7", "exit", MatrixMenu::exit);

        while (true) {
            System.out.println();
            System.out.println("Matrix array menu:");
            menu.run();
        }
    }

    public static void inputMatrix() {
        System.out.print("enter matrix size (rows x cols): ");
        String[] sizes = sc.nextLine().replaceAll("\\s+", "").split("x");
        int rowLength = Integer.parseInt(sizes[0]);
        int colLength = Integer.parseInt(sizes[1]);
        if (rowLength <= 0 || colLength <= 0) {
            throw new IllegalArgumentException("invalid size, size must > 0");
        }
        matrix = new int[rowLength][colLength];
        System.out.println("enter integers for each row, separate by space:");
        System.out.println("  *if number of integers smaller than number of cols, col will be filled by 0");
        System.out.println("  *if number of integers larger than number of cols, excess integers will be removed");
        System.out.println("enter rows (total: " + rowLength + ") (cols size: " + colLength + "):");
        for (int i = 0; i < rowLength; i++) {
            System.out.print("[" + (i + 1) + "]? ");
            int[] rowNumbers = Arrays
                    .stream(sc.nextLine().split(" "))
                    .filter((s) -> !s.isEmpty())
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = Arrays.copyOf(rowNumbers, colLength);
        }
    }

    public static void printMatrix() {
        if (matrix == null) {
            inputMatrix();
        }
        System.out.println("matrix:");
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.printf("%-3d ", cell);
            }
            System.out.println();
        }
    }

    public static void printMatrixEdges() {
        if (matrix == null) {
            inputMatrix();
        }
        System.out.println("matrix (edges only):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                boolean isEdge = i == 0 || i == matrix.length - 1 || j == 0 || j == matrix[i].length - 1;
                System.out.printf("%-3s ", isEdge ? matrix[i][j] : " ");
            }
            System.out.println();
        }

    }

    public static void printSumOfDiagonal() {
        if (matrix == null) {
            inputMatrix();
        }
        if (matrix.length != matrix[0].length) {
            System.out.println("this is not a square matrix");
            System.out.println("a square matrix is required to perform this action");
            return;
        }

        int mainDiagonalSum = 0;
        int subDiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonalSum += matrix[i][i];
            subDiagonalSum += matrix[i][matrix.length - 1 - i];
        }
        System.out.println("main diagonal: " + mainDiagonalSum + ", sub diagonal: " + subDiagonalSum);
    }

    public static void sortCellInRow() {
        if (matrix == null) {
            inputMatrix();
        }
        System.out.println("matrix (sorted):");
        Arrays.stream(matrix)
                .forEach((row) -> {
                    Arrays.stream(row)
                            .sorted()
                            .forEach((cell) -> System.out.printf("%-3d ", cell));
                    System.out.println();
                });
    }

    private static void exit() {
        System.exit(0);
    }
}
