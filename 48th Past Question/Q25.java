
class PC{}
class NoteBookPC extends PC{}

public class Q25 {

	public static void main(String[] args) {
		NoteBookPC pc = new NoteBookPC();
		
		if(pc instanceof PC) {
			System.out.print("pc is PC");
		}else if(pc instanceof NoteBookPC) {
			System.out.print("PC is NoteBookPC");
		}
	}

}
