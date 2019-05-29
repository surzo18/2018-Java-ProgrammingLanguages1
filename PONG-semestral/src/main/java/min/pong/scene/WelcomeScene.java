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

/**
Toto je úvodná scéna do hry slúži len ako spúšťač hry
 */
public class WelcomeScene extends AbstractScene {

	private final Text topicText;
	private final Text headerText;
	private final Text leftControlsText;
	private final Text rightControlsText;
	private final Text proceedInstructionsText;

	public WelcomeScene(PongApplication application) throws NullPointerException {
		super(new Group(), RESOLUTION_WIDTH, RESOLUTION_HEIGHT);

		requireNonNull(application, "The application cannot be null!");

		topicText = new Text("JavaFX Pong");
		topicText.setTextOrigin(VPos.CENTER);
		topicText.setFont(BIG_FONT);
		topicText.setLayoutX((RESOLUTION_WIDTH - topicText.prefWidth(-1)) / 2);
		topicText.setLayoutY(RESOLUTION_HEIGHT / 6);
		topicText.setFill(Color.RED);

		headerText = new Text("Controls for the players:");
		headerText.setTextOrigin(VPos.CENTER);
		headerText.setFont(SMALL_FONT);
		headerText.setLayoutX((RESOLUTION_WIDTH - headerText.prefWidth(-1)) / 2);
		headerText.setLayoutY(topicText.getLayoutY() + 100);
		headerText.setFill(Color.OLIVE);

		leftControlsText = new Text("W and S for left player");
		leftControlsText.setTextOrigin(VPos.CENTER);
		leftControlsText.setFont(SMALL_FONT);
		leftControlsText.setLayoutX((RESOLUTION_WIDTH - leftControlsText.prefWidth(-1)) / 2);
		leftControlsText.setLayoutY(headerText.getLayoutY() + 40);
		leftControlsText.setFill(Color.OLIVE);

		rightControlsText = new Text("UP and DOWN for right player");
		rightControlsText.setTextOrigin(VPos.CENTER);
		rightControlsText.setFont(SMALL_FONT);
		rightControlsText.setLayoutX((RESOLUTION_WIDTH - rightControlsText.prefWidth(-1)) / 2);
		rightControlsText.setLayoutY(leftControlsText.getLayoutY() + 40);
		rightControlsText.setFill(Color.OLIVE);

		proceedInstructionsText = new Text("Press [ENTER] to start the match");
		proceedInstructionsText.setTextOrigin(VPos.CENTER);
		proceedInstructionsText.setFont(SMALL_FONT);
		proceedInstructionsText.setLayoutX((RESOLUTION_WIDTH - proceedInstructionsText.prefWidth(-1)) / 2);
		proceedInstructionsText.setLayoutY(rightControlsText.getLayoutY() + 160);
		proceedInstructionsText.setFill(Color.DARKRED);

		Parent root = getRoot();
		if (!(root instanceof Group)) {
			throw new AssertionError("The scene root is not a Group instance!");
		}

		Group rootGroup = (Group) root;
		ObservableList<Node> children = rootGroup.getChildren();
		children.add(topicText);
		children.add(headerText);
		children.add(leftControlsText);
		children.add(rightControlsText);
		children.add(proceedInstructionsText);

		setOnKeyReleased(x -> {
			if (x.getCode() == KeyCode.ENTER) {
				// switch medzi scenami
				Stage primaryStage = application.getPrimaryStage();
				primaryStage.setScene(new CourtScene(application));
			}
		});

		setFill(Color.BLACK);
	}

	@Override
	public void tick() {
		// ... nothing to do ...
	}

}
