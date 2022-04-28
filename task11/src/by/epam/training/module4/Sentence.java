package by.epam.training.module4;

import java.util.List;

public class Sentence {
	private String sentence;
	
	public Sentence() {
		sentence = "empty"; 
	}
	
	public Sentence(List<Word> words) {
		setSentence(words);
	}
	
	public Sentence(String sentence) {
		this.sentence = sentence;
	}
	
	public String getSentence(){
		return sentence;
	}
	
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	public void setSentence(List<Word> words) {
		editSentence(words);
	}
	
	private String join(List<Word> words) {
		String result = "";
		for(int i = 0; i<words.size()-1; i++) {
			result+=words.get(i);
			result+=" ";
		}
		result += words.get(words.size()-1);
		return result;
	}
	
	public void editSentence(List<Word> words) {
		sentence = join(words);
		sentence = sentence.toLowerCase();
		sentence = Character.toUpperCase(sentence.charAt(0))+sentence.substring(1)+". ";
		
	}
	
	@Override
	public String toString() {
		return sentence;
	}
}
