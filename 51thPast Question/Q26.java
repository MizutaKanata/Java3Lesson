
public interface Pushable {

}
class Text{
	
}
class Button extends Text implements Pushable{
	
}
class Q26{
	public static void main(String[] args) {
		Button obj = new Button();
		System.out.println(obj instanceof Pushable);
		System.out.println(obj instanceof Text);
		
	}
}
