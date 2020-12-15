import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Highscores {
	public static void Highscore(int arvo, String nimi) throws IOException {
        FileWriter writer = new FileWriter("Highscore.txt", true);
		writer.write(nimi + ": " + arvo + "\n");
		writer.close();
	}
	
	public boolean Leaderboard(String nimi) throws FileNotFoundException {
		Map<Integer, String> highestScores = new TreeMap<Integer, String>();


		BufferedReader reader = new BufferedReader(
		                        new FileReader(new File("Highscore.txt")));
		String line = null; {
		try {
			while ((line = reader.readLine()) != null) {
			    String[] playerScores = line.split(": ");
			    highestScores.put(Integer.valueOf(playerScores[1]), playerScores[0]);
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}	
		}
    	if (nimi.equals("leaderboard")) {															
			for (Integer score : ((TreeMap<Integer, String>) highestScores).descendingKeySet()) {	
			    System.out.println(highestScores.get(score) + ": " + "$"+ score);
				}
			}
		return false; 
		}
}
