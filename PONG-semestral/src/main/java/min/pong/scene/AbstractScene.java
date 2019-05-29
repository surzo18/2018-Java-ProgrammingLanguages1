package min.pong.scene;

import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 Všetky scény dedia abstraktnú triedu pre jednoduché prepínanie medzi scénami
 */
public abstract class AbstractScene extends Scene {

	public AbstractScene(Parent root, int width, int height) {
		super(root, width, height);
	}

	/**
	 * Tick je volaná v kazdom main loope
	 */
	public abstract void tick();

}
