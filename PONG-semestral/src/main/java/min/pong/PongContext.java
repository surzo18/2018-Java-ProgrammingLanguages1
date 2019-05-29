package min.pong;

/**
Herne session v tomto pripade sem ukladam len Score hracov
 */
public class PongContext {

	private int player1Score = 0;
	private int player2Score = 0;

	public PongContext() {
		// ...
	}

	public void reset() {
		player1Score = 0;
		player2Score = 0;
	}

	public int getPlayer1Score() {
		return player1Score;
	}


	public int incPlayer1Score() {
		player1Score++;
		return player1Score;
	}

	public int getPlayer2Score() {
		return player2Score;
	}


	public int incPlayer2Score() {
		player2Score++;
		return player2Score;
	}

}
