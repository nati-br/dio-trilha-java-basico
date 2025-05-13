public class Sudoku {
    private int[][] board;
    private static final int SIZE = 9;
    private static final int EMPTY = 0;

    public Sudoku() {
        board = new int[SIZE][SIZE];
    }

    public void fillBoard(int[][] puzzle) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = puzzle[i][j];
            }
        }
    }

    private boolean isValid(int row, int col, int number) {

        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == number) return false;
        }


        for (int i = 0; i < SIZE; i++) {
            if (board[i][col] == number) return false;
        }


        int boxRow = row - row % 3;
        int boxCol = col - col % 3;

        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (board[i][j] == number) return false;
            }
        }

        return true;
    }

    public boolean solve() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == EMPTY) {
                    for (int number = 1; number <= SIZE; number++) {
                        if (isValid(row, col, number)) {
                            board[row][col] = number;

                            if (solve()) {
                                return true;
                            } else {
                                board[row][col] = EMPTY;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("-----------");
            }
            for (int j = 0; j < SIZE; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("|");
                }
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
