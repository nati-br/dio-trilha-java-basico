import java.util.Scanner;

public class SodokuGame {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        Scanner scanner = new Scanner(System.in);

        int[][] puzzle = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        sudoku.fillBoard(puzzle);

        System.out.println("Tabuleiro inicial:");
        sudoku.printBoard();

        System.out.println("\nResolvendo...");
        if (sudoku.solve()) {
            System.out.println("Solução encontrada:");
            sudoku.printBoard();
        } else {
            System.out.println("Não há solução para este tabuleiro.");
        }
    }
}