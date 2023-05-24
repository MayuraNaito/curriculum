/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
	 	 メソッドのオーバーライドを使用してください
		 superクラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */

package QuestMain;
import java.util.Random;
import java.util.Scanner;

public class QuestInfo {
	//フィールドの作成。
	private String name;
	private int hp;
	private int mp;
	private int atk;
	private int speed;
	private int def;
	
	//ランダム数字
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	//コンストラクタの作成。
	public QuestInfo() {
		System.out.print("名前を入力：");
		setName(scanner.next());
		System.out.println(getName());
	}

	//name Setter
	public void setName(String name) {
		this.name = name;
	}

	//name Getter
	public String getName() {
		return "こんにちは　「" + this.name + "」　さん";
	}

	//hp Getter
	public String getHp() {
		this.hp = random.nextInt(1001) + 1;
		return "HP：" + this.hp;
	}

	//mp Getter
	public String getMp() {
		this.mp = random.nextInt(1001) + 1;
		return "MP：" + this.mp;
	}

	//atk Getter
	public String getAtk() {
		this.atk = random.nextInt(1001) + 1;
		return "攻撃力：" + this.atk;
	}
	
	//speed Getter
		public String getSpeed() {
			this.speed = random.nextInt(1001) + 1;
			return "素早さ：" + this.speed;
		}

	//def Getter
	public String getDef() {
		this.def = random.nextInt(1001) + 1;
		return "防御力：" + this.def;
	}
	
	public void status() {
		System.out.println("ステータス");
		System.out.println(getHp());
		System.out.println(getMp());
		System.out.println(getAtk());
		System.out.println(getSpeed());
		System.out.println(getDef());
		System.out.println("さあ冒険に出かけよう！");
	}
}
