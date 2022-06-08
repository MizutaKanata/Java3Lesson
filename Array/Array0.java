import java.util.Scanner;

public class Array0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 準備
		String[] a = {
			"勉強は読書が中心",
			"絵や図を描くのが好き",
			"勉強する環境は自宅で一人が多い",
			"マインドマップ",
			"エアー授業",
			"付箋ノート"
		};
		
		// 回答により問題番号を指定
		// 問題がnext[0]番目ならば、
		//次の問題がnext[0][0]またnext
		int[][] next = {{1,2,},{3,4},{5,6}};
		// 標準入力（キーボードから）
		int que = 0; // 問題文の文字列の添字
		while(next[que][0] >= 1) {
		//　問題文を表示
		System.out.println(a[que]);
		
		// 選択される文章
		System.out.print("1:はい　2:いいえ >");
		
		//　入力された数値を受け取る
		int answer = sc.nextInt();
		que = next[que][answer - 1];
		}
		
		// 処理
		//int idx = answer -1;	// 表示する配列aの添字
		
		// 出力（ディスプレイ）
		System.out.println("あなたのアウトプット方法：" + a[que]);
		
		//sc.close();

	}

}
