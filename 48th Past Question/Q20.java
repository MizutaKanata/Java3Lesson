
public class Q20 {
	public static void main(String[] args) {
		double totalLength = 127,unitsCount = 0;
		
		//try-catch文（例外処理）
		//例外--実行時エラーのひとつ
		//try文の中で例外発生
		//catch文の（）内の例外と一致したら、catch文の処理を行う。
		//一致してないときは実行時エラーを出す
		try {
			double unitLength = totalLength / unitsCount;
			System.out.println(unitLength);
		}catch(Exception e){
			System.out.println("Division Error");
		}
	}
}
