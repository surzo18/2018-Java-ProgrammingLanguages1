package min.pong.scene;

import static java.util.Objects.requireNonNull;
import static min.pong.PongApplication.BIG_FONT;
import static min.pong.PongApplication.RESOLUTION_HEIGHT;
import static min.pong.PongApplication.RESOLUTION_WIDTH;
import static min.pong.PongApplication.SMALL_FONT;

import javafx.collections.ObservableList;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import min.pong.PongApplication;
import min.pong.PongContext;

/**
Koncova scena... obsahuje možnosť začať novu hru a score z predchadzajucej hry
 */
public class EndGameScene extends AbstractScene {

	private final Text topicText;
	private final Text gameHasEndedText;
	private final Text winnerText;
	private final Text resultsTopicText;
	private final Text resultsText;
	private final Text proceedInstructionsText;

	public EndGameScene(PongApplication application) throws NullPointerException {
		super(new Group(), RESOLUTION_WIDTH, RESOLUTION_HEIGHT);

		requireNonNull(application, "The application cannot be null!");

		// Ziskanie Score z PongContext
		PongContext ctx = requireNonNull(application.getContext(), "The context cannot be null!");
		int p1Score = ctx.getPlayer1Score();
		int p2Score = ctx.getPlayer2Score();

		topicText = new Text("Pong - Results");
		topicText.setTextOrigin(VPos.CENTER);
		topicText.setFont(BIG_FONT);
		topicText.setLayoutX((RESOLUTION_WIDTH - topicText.prefWidth(-1)) / 2);
		topicText.setLayoutY(RESOLUTION_HEIGHT / 6);
		topicText.setFill(Color.DARKGRAY);

		gameHasEndedText = new Text("Game has ended");
		gameHasEndedText.setTextOrigin(VPos.CENTER);
		gameHasEndedText.setFont(SMALL_FONT);
		gameHasEndedText.setLayoutX((RESOLUTION_WIDTH - gameHasEndedText.prefWidth(-1)) / 2);
		gameHasEndedText.setLayoutY(topicText.getLayoutY() + 100);
		gameHasEndedText.setFill(Color.WHITE);

		winnerText = new Text((p1Score > p2Score ? "Right" : "Left") + " player won the game!");
		winnerText.setTextOrigin(VPos.CENTER);
		winnerText.setFont(SMALL_FONT);
		winnerText.setLayoutX((RESOLUTION_WIDTH - winnerText.prefWidth(-1)) / 2);
		winnerText.setLayoutY(gameHasEndedText.getLayoutY() + 40);
		winnerText.setFill(Color.DARKRED);

		resultsTopicText = new Text("End results:");
		resultsTopicText.setTextOrigin(VPos.CENTER);
		resultsTopicText.setFont(SMALL_FONT);
		resultsTopicText.setLayoutX((RESOLUTION_WIDTH - resultsTopicText.prefWidth(-1)) / 2);
		resultsTopicText.setLayoutY(winnerText.getLayoutY() + 40);
		resultsTopicText.setFill(Color.WHITE);

		resultsText = new Text("" + ctx.getPlayer2Score() + " - " + ctx.getPlayer1Score());
		resultsText.setTextOrigin(VPos.CENTER);
		resultsText.setFont(SMALL_FONT);
		resultsText.setLayoutX((RESOLUTION_WIDTH - resultsText.prefWidth(-1)) / 2);
		resultsText.setLayoutY(resultsTopicText.getLayoutY() + 40);
		resultsText.setFill(Color.WHITE);

		proceedInstructionsText = new Text("Press [ENTER] to proceed");
		proceedInstructionsText.setTextOrigin(VPos.CENTER);
		proceedInstructionsText.setFont(SMALL_FONT);
		proceedInstructionsText.setLayoutX((RESOLUTION_WIDTH - proceedInstructionsText.prefWidth(-1)) / 2);
		proceedInstructionsText.setLayoutY(resultsText.getLayoutY() + 160);
		proceedInstructionsText.setFill(Color.DARKRED);

		Parent root = getRoot();
		if (!(root instanceof Group)) {
			throw new AssertionError("The scene root is not a Group instance!");
		}

		Group rootGroup = (Group) root;
		ObservableList<Node> children = rootGroup.getChildren();
		children.add(topicText);
		children.add(gameHasEndedText);
		children.add(winnerText);
		children.add(resultsTopicText);
		children.add(resultsText);
		children.add(proceedInstructionsText);

		setOnKeyReleased(x -> {
			if (x.getCode() == KeyCode.ENTER) {
				// reset hry a zapnutie novej hry
				ctx.reset();
				Stage primaryStage = application.getPrimaryStage();
				primaryStage.setScene(new WelcomeScene(application));
			}
		});

		setFill(Color.BLACK);
	}

	@Override
	public void tick() {
		// ... nothing to do ...
	}

}
