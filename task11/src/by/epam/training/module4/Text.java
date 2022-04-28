package by.epam.training.module4;

public class Text {
	private String text;
	private Word header;
	
	public Text() {
		text = "empty";
		header = new Word("no title");
	}
	
	public Text(String text, Word header) {
		this.text = text ;
		this.header = header;
	}
	
	public Text(Sentence sentence, Word header) {
		this.text = sentence.getSentence();
		this.header = header;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void setText(Sentence sentence) {
		this.text = sentence.getSentence();
	}

	public Word getHeader() {
		return header;
	}

	public void setHeader(Word header) {
		this.header = header;
	}
	
	public void setHeader(String header) {
		this.header = new Word(header);
	}
	
	public void addSentence(Sentence sentence) {
		text+="\n"+sentence.getSentence();
	}
	
	public void showText() {
		System.out.println(text);
	}
	
	public void showHeader() {
		System.out.println(header);
	}
}
