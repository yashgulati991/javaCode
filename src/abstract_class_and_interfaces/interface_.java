package abstract_class_and_interfaces;

interface bicycle {
	void applyBrake(int decrement);

	void speedUp(int increment);

	class AvonCycle {
		int speed = 7;

		void applyBrake(int decrement) {
			speed = speed - decrement;
		}

		void speedUp(int increment) {
			speed = speed + increment;
		}
	}
}

public class interface_ {

	public static void main(String[] args) {
		// in java interface is group of related methods with empty bodies

	}

}
