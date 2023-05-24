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

public class Info {
	//カレンダークラスを取得しシステム日時を取得。
	Calendar cal = Calendar.getInstance();
	//フォーマットクラスでフォーマット処理。
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
	//出力用のテキストを格納。
	String[] text = {
			"こんにちは！ここは日本です！",
			"この寿司はうまい",
			"寿司は和食です"
	};

	//テキストを表示するメソッド。
	public void text() {
		//NULLチェック
		if (text == null) {
			System.out.println("値がNULLです。");
		} else {
			//text配列の値を1行ずつ表示する処理。
			for (int i = 0; i < text.length; i++) {
				System.out.println(text[i]);
			}
		}
	}

	//日時を表示するメソッド。
	public void date() {
		//NULLチェック
		if (cal == null) {
			System.out.println("値がNULLです。");
		} else {
			//現在のシステム日時をフォーマットして表示する処理。
			System.out.println(sdf.format(cal.getTime()));
		}
	}
}
