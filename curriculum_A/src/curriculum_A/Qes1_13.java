package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		//		Q1
		//		下記9個をローカル変数として宣言のみしてください
		//		・バイト型・短整数型・整数型・長整数型
		//		・単精度浮動小数点数型・倍精度浮動小数点数型
		//		・文字型・文字列型
		//		・ブーリアン型
		byte b; // バイト型
		short s; // 短整数型
		int i; // 整数型
		long l; // 長整数型
		float f; // 単精度浮動小数点数型
		double d; // 倍精度浮動小数点数型
		char c; // 文字型
		String str; // 文字列型
		boolean bool; // ブーリアン型

		//		Q2
		//		それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		b = 0;
		s = 0;
		i = 0;
		l = 0;
		f = 0.f;
		d = 0.0;
		c = 0;
		str = null;
		bool = false;

		//		Q3
		//		初期化をしたそれぞれの変数に下記の値を代入してください		
		//		・バイト型		10
		//		・短整数型		100
		//		・整数型			1000
		//		・長整数型		10000
		//		・単精度浮動小数点数型	9.5
		//		・倍精度浮動小数点数型	10.5
		//		・文字型			a
		//		・文字列型		ハロー
		//		・ブーリアン型		true
		b = 10;
		s = 100;
		i = 1000;
		l = 10000;
		f = 9.5f;
		d = 10.5;
		c = 'a';
		str = "ハロー";
		bool = true;

		//		Q4
		//		下記の通りにコンソール出力されるようにしてください			
		//		上記で作成した変数を必ず使用すること			
		//		11110			11110	
		//		20				20	
		//		a ハロー true		a ハロー true	
		//		11130			11130			数字を全て足す
		//		10000000000		10000000000		小数点以外の数字を全てかける
		//		0.105			0.105			10.5割る100をする
		//		-90				-90				10引く100をする
		System.out.println("【Q4】");
		System.out.println(b + s + i + l); // 足す
		System.out.println(b * 2); // 掛ける
		System.out.println("a" + " " + str + " " + bool); // 文字列と空白を入れる
		System.out.println((long) (b + s + i + l + f + d)); // long型でキャストする
		System.out.println(b * s * i * l); // 掛ける
		System.out.println(d / s); // 割る
		System.out.println(b - s); // 引く
		System.out.println(); // 改行用


		//		Q5
		//		次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//		「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		//		String num="20";
		//		int num1=23;
		//		System.out.println("ハローJAVA"+(num+num1));
		int num = 20; // int型に直し、""を消す 「=」の左右に空白入れる
		int num1 = 23; // 「=」の左右に空白入れる
		System.out.println("【Q5】");
		System.out.println("ハローJAVA" + (num + num1));
		System.out.println(); // 改行用

		
//		Q6
//		『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
//		ローカル変数に代入し○○に入れてください
//		『山田太郎 18歳 170.5cm 62.2kg 寿司』
//		↓↓format↓↓
//		「初めまして○○です」
//		「年齢は○○歳です」
//		「身長は○○cmです」
//		「体重は○○kgです」
//		「好きな食べ物は○○です」
		String name = "山田太郎"; // 名前
		int age = 18; // 年齢
		double height = 170.5; // 身長
		double weight = 62.2; // 体重
		String food = "寿司"; // 食べ物
		System.out.println("【Q6】");
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println(); // 改行用

//		Q7
//		6で作成した自己紹介に続いてBMIが出力されるようにしてください
//		「BMIは○○です」
//		ただし計算は数値を直書きせず、全て変数を使ってすること
		double bmi = weight / (height * height) * 10000; // 体重÷(身長×身長)
		System.out.println("【Q7】");
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です"); // String.formatメソッドで小数点第2位以下四捨五入
		System.out.println(); // 改行用
		
//		Q8
//		6で宣言した変数に再代入し下記の通りコンソールに出力してください
//		　初めまして鈴木一郎です
//		　年齢は24歳です
//		　身長168.5cmです
//		　体重は64.2kgです
//		　好きな食べ物はオムライスです
//		　BMIは22.6です
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		bmi = weight / (height * height) * 10000; // 体重÷(身長×身長)
		System.out.println("【Q8】");
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		System.out.println(); // 改行用
		
//		Q9
//		8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
//		　初めまして鈴木一郎です
//		　年齢は48歳です
//		　身長337.0cmです
//		　体重は128.4kgです
//		　好きな食べ物はオムライスです
//		　BMIは11.31です
		age += 24;
		height += 168.5;
		weight += 64.2;
		bmi = weight / (height * height) * 10000; // 体重÷(身長×身長)
		System.out.println("【Q9】");
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.2f", bmi) + "です"); //小数点第2位まで表示
		System.out.println(); // 改行用
		
//		Q10
//		8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		boolean flg = age > 25; // ブーリアン型のflgを作成し式を代入
		System.out.println("【Q10】");
		System.out.println(flg); // ageが25以上ならtrue,ageが25未満ならfalseが表示
		System.out.println(); // 改行用
		
//		Q11
//		8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		String strAge = String.valueOf(age); // 年齢をString型に変換
		String strHeight = String.valueOf(height); // 身長をString型に変換
		String strWeight = String.valueOf(weight); // 体重をString型に変換
		System.out.println("Q11");
		System.out.println(strAge + strHeight + strWeight); // 繋げて表示 48337.0128.4
		System.out.println(); // 改行用
		
//		Q12
//		11で変換した【年齢・身長】を整数型に変換して出力してください
		int intAge = Integer.valueOf(strAge); // 年齢をint型に変換
		int intHeight = (int)Double.parseDouble(strHeight); // 身長をdouble型に変換し、int型にキャスト
		System.out.println("【Q12】");
		System.out.println(intAge); // 年齢を表示
		System.out.println(intHeight); // 身長を表示
		System.out.println(); // 改行用
		
//		Q13
//		12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
//		ただしif文は使わないでください
		boolean boolAge = intAge == 25; // 年齢が25
		boolean boolHeight = height > 160; // 身長が160以上
		System.out.println("【Q13】");
		System.out.println(boolAge || boolHeight); // 当てはまればtrue,当てはまらなければfalse
	}
}
