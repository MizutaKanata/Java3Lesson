import java.io.FileReader;
import java.io.IOException;

public class Q24 {

	public static void main(String[] args) {
		int ch;
		try {
			FileReader fr = new FileReader("memo.txt");
			ch = fr.read();
			fr.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
