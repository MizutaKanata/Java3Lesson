package java0601;

import java.util.Scanner;

/*
 * Array2_1クラスのmain()メソッドは、入力の際に
 * 「1」「2」以外を入力すると正しく動作しない。
 * 「1」「2」以外を入力したときは再入力を求めるよう
 * プログラムを修正しなさい。
 */

public class Array2_2 {

	public static void main(String[] args) {
		// 2問目の分岐まで作成する
		Scanner sc = new Scanner(System.in);
		
		//問題インスタンスを生成
		//que[0] = new Question(0,"勉強は読書が中心",1, 2);
		//que[1]  = new Question(1,"絵や図を描くのが好き",3, 4);
		
		
		
		// 問題文を配列に格納する
		String[] message = {
			"勉強は読書が中心",
			"絵や図を描くのが好き",
			"勉強する環境は「自宅でひとり」が多い",
			"マインドマップ",
			"アウトプット要約",
			"エアー授業",
			"付箋ノート"
		};
		
		// 選択肢の進行を多次元配列で示す
		// 1次元目は配列messageの問題に相当する添字、
		// 2次元目は次の問題にあたる配列messageの添字
		// はい→[0]側、いいえ→[1]側で示す
		
		// 2次元目の[0]に-1が格納されているものは「そこで終了」を示す
		int[][] nextMes = {{1, 2},{3, 4},{5, 6},{-1},{-1},{-1},{-1}};
		
		// 配列messageの添字を格納する変数を宣言
		// 初期値は1問目なので0を代入しておく
		int idx = 0;
		
		// 配列nextMesの2次元目[0]が-1になるまで
		// idxの値を変更しながら問題を出し続ける
		int input;
		while(nextMes[idx][0] != -1) {
			// 出題する
			
			// 【問題の解答】この部分をループにする
			// 1問目は必ず出題されるのでdo-whileで無限ループ
			// 途中でinputの値に応じてbreakさせればよい
			do {
				System.out.println(message[idx]);
				System.out.print(" 1:はい　2:いいえ > ");
				input = sc.nextInt() - 1;
				if(input == 0 || input == 1) {
					break;
				}
			}while(true);
			
			// 次の問題の添字をidxに格納する
			idx = nextMes[idx][input];
		}
		
		// Scannerインスタンスを閉じる
		sc.close();
		
		// 終了した時点の添字にあるmessageを表示
		System.out.print("あなたに合うアウトプットは");
		System.out.print("「" + message[idx] + "」");
		System.out.println("です。");

	}

}
