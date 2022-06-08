package java0601;

public class Question {
	int num;
	String message;
	int yes;
	int no;
	
	//コンストラクタ
	Question(int num,String message,int yes,int no){
		this.num = num;
		this.message = message;
		this.yes = yes;
		this.no = no;
	}
	//メソッド
	//問題を表示する
	void printQue() {
		System.out.println();
	}

}
