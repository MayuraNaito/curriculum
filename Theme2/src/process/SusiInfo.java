/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */

package process;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SusiInfo {
	//カレンダークラスを取得しシステム日時を取得。
	Calendar cal = Calendar.getInstance();
	//フォーマットクラスでフォーマット処理。
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
	//出力用のテキストフィールドを作成し格納。
	public String text1 = "こんにちは！ここは日本です！";
	public String text2 = "この寿司はうまい";
	public String text3 = "寿司は和食です";

	//テキストを表示するメソッド。
	public void text() {
		//NULLチェック
		if (this.text1 == null || this.text2 == null || this.text3 == null) {
			System.out.println("値がNULLです。");
		} else {
			System.out.println(this.text1);
			System.out.println(this.text2);
			System.out.println(this.text3);
		}
	}

	//日時を表示するメソッド。
	public void date() {
		//NULLチェック
		if (this.cal == null) {
			System.out.println("値がNULLです。");
		} else {
			//現在のシステム日時をフォーマットして表示する処理。
			System.out.println(this.sdf.format(this.cal.getTime()));
		}
	}
}
