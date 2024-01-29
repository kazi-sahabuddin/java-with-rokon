import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe{
	private static final char EMPTY_BOX = ' ';
	private static final char PLAYER_ONES_SYMBOL = 'X';
	private static final char PLAYER_TWOS_SYMBOL = 'O';
	
	private static final char[][] gameBoard = new char[3][3];
	
	private final Scanner scan = new Scanner(System.in);
	
	private String playerOne;
	private String playerTwo;
	private String currentPlayer;
	private String whoWonTheGame;
	
	public void startGame(){
		initializeBoard();
		askForUserNames();
		
		while(isGameNotOver()){
			drawBoard();
			printPlayerTurn();
			askForManeuver();
		}
		
		printGameOver();		
	}
	
	private void initializeBoard(){
		for(char[] chars : gameBoard){
			Arrays.fill(chars, EMPTY_BOX);
		}
	}
	
	private void askForUserNames(){
		System.out.println("Welcome to Tic Tac Toe!");
		System.out.println("What's your name? ");
		playerOne = scan.nextLine();
		
		System.out.println("Who are you playing with? ");
		playerTwo = scan.nextLine();
		
		System.out.println("Who is playing first? press" + "\n1 for "+ playerOne + "\n2 for "+ playerTwo);
		int player = scan.nextInt();
		
		currentPlayer = player == 1 ? playerOne : playerTwo;
	}
	
	private boolean isGameNotOver(){
		return !(isBoardIsFull() || hasAnyPlayerWon());
	}
	
	private void drawBoard(){
		System.out.println("|---|---|---|");
		for(char[] chars : gameBoard){
			System.out.println("| "+chars[0]+" | "+chars[1]+" | "+chars[2]+" |");
			System.out.println("|---|---|---|");
		}		
	}
	
	private void printPlayerTurn(){
		System.out.println(whoIsPlaying()+"'s turn");
	}
	
	private void askForManeuver(){
		int row;
		int col;
		
		do{
			System.out.print("Enter a row number (0, 1, or 2): ");
			row = scan.nextInt();
			System.out.print("Enter a column number (0, 1, or 2): ");
			col = scan.nextInt();
			
		} while(!validateInput(row, col));
		
		if(whoIsPlaying().equals(playerOne)){
			gameBoard[row][col] = PLAYER_ONES_SYMBOL;
			currentPlayer = playerTwo;
		}else{
			gameBoard[row][col] = PLAYER_TWOS_SYMBOL;
			currentPlayer = playerOne;
		}
	}
	
	private void printGameOver(){
		drawBoard();
		System.out.println("\uD83C\uDFAE Game over! \uD83C\uDFAE");
		
		if(whoWonTheGame != null){
			System.out.println(whoWonTheGame+" won the game, Congratulation! \uD83C\uDF8A \uD83C\uDF89");
		}else{
			System.out.println("Sounds like it's a tie! Play again!");
		}
	}
	
	private boolean isBoardIsFull(){
		boolean result = true;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(gameBoard[i][j] == EMPTY_BOX){
					result = false;
					break;
				}
			}
			if(!result){
				break;
			}
		}
		
		return result;
	}
	
	private boolean hasAnyPlayerWon(){
		char cross = ' ';
		
		//check each row
		for(int i = 0; i < 3; i++){
			if( gameBoard[i][0] != EMPTY_BOX && gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][1] == gameBoard[i][2]){
				cross = gameBoard[i][0];
			}
		}
		
		//check each column
		for(int j = 0; j < 3; j++){
			if( gameBoard[0][j] != EMPTY_BOX && gameBoard[0][j] == gameBoard[1][j] && gameBoard[1][j] == gameBoard[2][j]){
				cross = gameBoard[0][j];
			}
		}
		
		//check diagonals
		if( gameBoard[0][0] != EMPTY_BOX && gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2]){
			cross = gameBoard[0][0];
		}
		
		//check diagonals
		if( gameBoard[2][0] != EMPTY_BOX && gameBoard[2][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[0][2]){
			cross = gameBoard[2][0];
		}
		
		if(cross == PLAYER_ONES_SYMBOL){
			whoWonTheGame = playerOne;
		} else if(cross == PLAYER_TWOS_SYMBOL) {
			whoWonTheGame = playerTwo;
		}
		
		return whoWonTheGame != null;
	}
	
	private String whoIsPlaying(){
		return currentPlayer;
	}
	
	private boolean validateInput(int row, int col){
		boolean result = false;
		if(row < 0 || col < 0 || row > 2 || col > 2){
			System.out.println("The position is off the bounds of the board, try again");
		} else if( gameBoard[row][col] != EMPTY_BOX){
			System.out.println("Someone has already made a move at this position, try again");
		} else {
			result = true;
		}
		
		return result;
	}
	
	public static void main(String[] args){
		TicTacToe game = new TicTacToe();
		game.startGame();
	}
	
	
}
