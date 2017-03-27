package application;

public class lock {
	public boolean[][] lockField(String[][] data, boolean[][] fieldData, String word) {
		for (int x = 0; x < word.length(); x++) {
			for (int y = 0; y < 15; y++) {
				for (int z = 0; z < 16; z++) {
					if (Character.toString(word.charAt(x)).equalsIgnoreCase(data[y][z])) {
						if(fieldData[y][z]){
							fieldData[y][z]=false;
						}
					}
				}
			}
		}
		return fieldData;
	}
}
