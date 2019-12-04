package Code;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MorseDictionary {
	
	
	
	public static void translateMorse(){
		
		
		
		
		  HashMap<String, Character> morseMap = new HashMap<String, Character>();
		    
		    
          morseMap.put(".-", 'a');
          morseMap.put("-...", 'b');
          morseMap.put("-.-.", 'c');
          morseMap.put("-..", 'd');
          morseMap.put(".", 'e');
          morseMap.put("..-.", 'f');
          morseMap.put("--.", 'g');
          morseMap.put("....", 'h');
          morseMap.put("..", 'i');
          morseMap.put(".---", 'j');
          morseMap.put("-.-", 'k');
          morseMap.put(".-..", 'l');
          morseMap.put("--", 'm');
          morseMap.put("-.", 'n');
          morseMap.put("---", 'o');
          morseMap.put(".--.", 'p');
          morseMap.put("--.-", 'q');
          morseMap.put(".-.", 'r');
          morseMap.put("...", 's');
          morseMap.put("-", 't');
          morseMap.put("..-", 'u');
          morseMap.put("...-", 'v');
          morseMap.put(".--", 'w');
          morseMap.put("-..-", 'x');
          morseMap.put("-.--", 'y');
          morseMap.put("--..", 'z');
          morseMap.put(".----", '1');
          morseMap.put("..---", '2');
          morseMap.put("...--", '3');
          morseMap.put("....-", '4');
          morseMap.put(".....", '5');
          morseMap.put("-....", '6');
          morseMap.put("--...", '7');
          morseMap.put("---..", '8');
          morseMap.put("----.", '9');
          morseMap.put("-----", '0');
          morseMap.put("/", ' ');
          
      
  		String morse = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--"; 
  		String[] words = morse.split(" ");
  		
  		for (String word: words) {
  			String[] letters = word.split(" ");
  			for (String letter : letters) {
  				System.out.print(morseMap.get(letter));
  			}
  		}

}

    
}


