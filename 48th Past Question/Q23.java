
public class Q23 {
	public static void main(String[] args) {
		try {
			System.out.print("try");
			int[] array = new int[20];
			array[20] = 20;
			return;
		}catch(Exception e){
				System.out.print("Catch");
		}finally {
			System.out.print("Finally");
		}
	}
}
