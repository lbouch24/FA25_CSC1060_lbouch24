import java.util.Scanner;
public class TicTacToe {
	public static void main(String[] args) {
		int rows = 3;
		int cols = 3;
		String[][] board = new String[rows][cols];
		int player = 1;
		int winner = 0;
		int moves = 0;
		fillBoard(board);
		drawBoard(board);
		while(winner == 0 && moves < 9)
		{
			moves++;
			makeMove(player, board);
			drawBoard(board);
			winner = checkWinner(player, board);
			player = player % 2+1;
		}
		if(winner == 0)
		{
			System.out.println("TIE!!!");
		}else if(winner == 1)
		{
			System.out.println("Player 1 wins!!!");
		}else if(winner == 2)
		{
			System.out.println("Player 2 wins!!!");
		}
	}
	private static int checkWinner(int player, String[][] board) {
		String line = "";
		for(int i = 0; i < 8; i++) {
			switch(i)
			{
			case 0:
				line = board[0][0] + board[0][1]+board[0][2];
				break;
			case 1:
				line = board[1][0] + board[1][1]+board[1][2];
				break;
			case 2:
				line = board[2][0] + board[2][1]+board[2][2];
				break;
			case 3:
				line = board[0][0] + board[1][0]+board[2][0];
				break;
			case 4:
				line = board[0][1] + board[1][1]+board[2][1];
				break;
			case 5:
				line = board[0][2] + board[1][2]+board[2][2];
				break;
			case 6:
				line = board[0][0] + board[1][1]+board[2][2];
				break;
			case 7:
				line = board[0][2] + board[1][1]+board[2][0];
				break;
			}
			if(line.equals("XXX") || line.equals("OOO")) return player;
		}
		return 0;
	}
	private static void makeMove(int player, String[][] board) {
		Scanner input = new Scanner(System.in);
		int row = -1;
		int cols = -1;
		String marker = "X";
		if(player == 2)marker = "O";
		do{
			System.out.println("Player " + player + " make your move: ");
			int move = input.nextInt();
			switch(move)
			{
			case 0:
				row = 0;
				cols = 0;
				break;
			case 1:
				row = 0;
				cols = 1;
				break;
			case 2:
				row = 0;
				cols = 2;
				break;
			case 3:
				row = 1;
				cols = 0;
				break;
			case 4:
				row = 1;
				cols = 1;
				break;
			case 5:
				row = 1;
				cols = 2;
				break;
			case 6:
				row = 2;
				cols = 0;
				break;
			case 7:
				row = 2;
				cols = 1;
				break;
			case 8:
				row = 2;
				cols = 2;
				break;
			}
		}while(!Character.isDigit(board[row][cols].charAt(0)));
		board[row][cols] = marker;
		input.close();
	}
	private static void drawBoard(String[][] board) {
		for(int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]);
				if(j<2) System.out.print("|");
			}
			System.out.println();
			if(i<2)System.out.println("-----");
		}
	}
	private static void fillBoard(String[][] board) {
		int index = 0;
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				board[i][j] = Integer.toString(index);
				index++;
			}
		}
	}
}
