package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Validate {
	public Boolean validateStringLength(String[][] input) {
		boolean status = true;
		for (int x = 0; x < 15; x++) {
			for (int y = 0; y < 15; y++) {
				if (input[x][y].length() > 1) {
					Alert tries = new Alert(AlertType.ERROR);
					tries.setTitle("Notification");
					tries.setHeaderText("Invalid input");
					tries.setContentText("Enter only one LETTER");
					tries.showAndWait();
					status = false;
				}
			}
		}

		return status;

	}

	public boolean validateUserLetters(String word, String[] dis) {
		boolean status2 = false;
		for (int x = 0; x < word.length(); x++) {
			boolean status = true;
			for (int y = 0; y < 7; y++) {
				//System.out.println(dis[y]);
				if (Character.toString(word.charAt(x)).equalsIgnoreCase(dis[y])) {
					dis[y] = "";
					status = false;
				}
			}
			if (status) {
				Alert tries = new Alert(AlertType.ERROR);
				tries.setTitle("Notification");
				tries.setHeaderText("Invalid input");
				tries.setContentText("Enter only Letters avalable");
				tries.showAndWait();
				status2 = true;
				break;
			}
		}
		return status2;
	}

}
