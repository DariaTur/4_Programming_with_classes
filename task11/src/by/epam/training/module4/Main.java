package by.epam.training.module4;

import java.util.ArrayList;
import java.util.List;
/*
 * 1.Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на 
 *	 консоль текст, заголовок текста.  
 */
public class Main {

	public static void main(String[] args) {
		List<Word> words = new ArrayList<Word>();
		
		words.add(new Word("haPpiNess"));
		words.add(new Word("iS"));
		words.add(new Word("a"));
		words.add(new Word("buTTerFly"));
		
		Sentence sent = new Sentence(words) ;
		Text text = new Text(sent, new Word("My favorite song"));
		text.addSentence(new Sentence("Try to catch it like every night."));
		text.addSentence(new Sentence("It escapes from my hands into moonlight."));
		
		text.showHeader();
		text.showText();

	}

}
