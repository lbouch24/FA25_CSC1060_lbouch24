import java.util.Scanner;
public class ConnectFour {
	private static final int rows = 6;
	private static final int cols = 7;
    private static char[][] board = new char[rows][cols];
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int player = 1;
        int winner = 0;
        int moves = 0;
        final int max = rows * cols;
        fillBoard(board);
        drawBoard(board);
        while (winner == 0 && moves < max) {
            if (makeMove(player, board)) {
                moves++;
                drawBoard(board);
                winner = checkWinner(player, board);
                player = player % 2+1;   
            	}
        }
        if (winner == 0) {
            System.out.println("TIE!!!");
        } else if (winner == 1) {
            System.out.println("Player 1 WINS!!!");
        } else if (winner == 2) {
            System.out.println("Player 2 WINS!!!");
        }
    }
    private static int checkWinner(int player, char[][] board) {
        char marker = (player == 1) ? 'X' : 'O';
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (checkDirection(r, c, 0, 1, marker, board)) return player;  
                if (checkDirection(r, c, 1, 0, marker, board)) return player;  
                if (checkDirection(r, c, 1, 1, marker, board)) return player;  
                if (checkDirection(r, c, 1, -1, marker, board)) return player; 
            }
        }
        return 0;
    }
    private static boolean makeMove(int player, char[][] board) {
        char marker = (player == 1) ? 'X' : 'O';
        int col = -1;
        boolean realMove = false;
        while (!realMove) {
            System.out.print("Player " + player + ", enter column between 1 and 7\n");
            if (in.hasNextInt()) {
                col = in.nextInt() -1;
                if (col >= 0 && col < cols) {
                    int row = -1;
                    for (int i = rows - 1; i >= 0; i--) {
                        if (board[i][col] == '.') {
                            row = i;
                            break;
                        }
                    }
                    if (row != -1) {
                        board[row][col] = marker;
                        realMove = true;
                    } else {
                        System.out.println("Column " + col + " is full. Enter another one.");
                    }
                } else {
                    System.out.println("Invalid column number, input between 1 and 7");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                in.next();
            }
        }
        return realMove;
    }
    private static void fillBoard(char[][] board) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '.';
            }
        }
    }
    private static void drawBoard(char[][] board) {
        System.out.println("-----------------------------");
        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + board[i][j] + " |");
            }
            System.out.println();
            System.out.println("-----------------------------");
        }
        System.out.println("  1   2   3   4   5   6   7  ");
    }
    private static boolean checkDirection(int r, int c, int dr, int dc, char marker, char[][] board) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int nr = r + i * dr;
            int nc = c + i * dc;
            if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && board[nr][nc] == marker) {
                count++;
            } else {
                break; 
            }
        }
        return count >= 4;
    }
}

