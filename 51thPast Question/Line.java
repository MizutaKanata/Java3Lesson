class Line {
	String text;
	Line(String text){
		this.text = text;
	}

}
class LengthLine extends Line{
	LengthLine(String text){
		text = text + ":" +  text.length();
		super(text);
	}
}
class Q19{
	public static void main(String[] args) {
		LengthLine line = new LengthLine("Cat");
	}
}
