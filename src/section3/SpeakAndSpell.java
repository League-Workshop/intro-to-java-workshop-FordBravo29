package section3;

import javax.swing.JOptionPane;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak(" spell pneumonoultramicroscopicsilicovolcanoconiosis");
		// 2. Catch the user's answer in a String
		String sentence = JOptionPane.showInputDialog("now spell it");
		// 3. If the user spelled the word correctly, speak "correct"
		if (sentence.equalsIgnoreCase("pneumonoultramicroscopicsilicovolcanoconiosis")) {
			speak("correct");
		} else {

		}

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
