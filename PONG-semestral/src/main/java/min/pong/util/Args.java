package min.pong.util;

/**
Správa argumentov
 */
public final class Args {
	private Args() {
		throw new AssertionError("No Args instances for you!");
	}

	/**
	Ak je hodnota vačsia ako limit vyhod exception
	 */
	public static int isLte(int value, int limit, String message) throws IllegalArgumentException {
		if (value > limit) {
			throw new IllegalArgumentException(message);
		}
		return value;
	}

	/**
	 Ak je hodnota menšia ako limit vyhod exception
	 */
	public static int isGte(int value, int limit, String message) throws IllegalArgumentException {
		if (value < limit) {
			throw new IllegalArgumentException(message);
		}
		return value;
	}

	/**
	 Ak je hodnota menšia ako limit vyhod exception
	 */
	public static double isGte(double value, double limit, String message) throws IllegalArgumentException {
		if (value < limit) {
			throw new IllegalArgumentException(message);
		}
		return value;
	}

	/**
	 Ak je hodnota medzi (vratane) min a max vyhod exception
	 */
	public static int isBetween(int value, int min, int max, String message) throws IllegalArgumentException {
		if (value < min || value > max) {
			throw new IllegalArgumentException(message);
		}
		return value;
	}
}
