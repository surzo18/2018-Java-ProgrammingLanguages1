package min.pong;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import min.pong.scene.AbstractScene;
import min.pong.scene.EndGameScene;
import min.pong.scene.WelcomeScene;

public class PongApplication extends Application {

	/** Rezolutions */
	public static final int RESOLUTION_WIDTH = 900;
	public static final int RESOLUTION_HEIGHT = 600;

	/** Font Setup */
	public static final String FONT_NAME = "Arial";
	public static final Font BIG_FONT = new Font(FONT_NAME, 32);
	public static final Font SMALL_FONT = new Font(FONT_NAME, 18);

	private Stage primaryStage;
	private AnimationTimer mainLoop;
	private PongContext context;

	@Override
	public void init() throws Exception {
		// ... something here?
		super.init();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		this.primaryStage = primaryStage;
		context = new PongContext();

		// nastavenie hlavnej sceny
		primaryStage.setTitle("Pong");
		primaryStage.setResizable(false);
		primaryStage.show();
		primaryStage.setScene(new WelcomeScene(this));

		// construct and start a trivial main loop for 60fps simulation.
		mainLoop = new AnimationTimer() {

			@Override
			public void handle(long now) {
				Scene scene = primaryStage.getScene();
				if (scene instanceof AbstractScene) {
					((AbstractScene) scene).tick();
				}
			}

		};
		mainLoop.start();

	}

	@Override
	public void stop() throws Exception {
		mainLoop.stop();
		super.stop();
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public PongContext getContext() {
		return context;
	}

	public static void main(String args[]) {
		launch(args);
	}

}
