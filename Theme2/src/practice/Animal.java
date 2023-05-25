/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */

package practice;

import process.AnimalInfo;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//インスタンス化。
		AnimalInfo animal = new AnimalInfo();

		//Setterを使用し値を代入。
		animal.setName("ライオン");
		animal.setHeight(2.1);
		animal.setSpeed(80);

		//NULLチェック
		if (animal.getName() == null || animal.getHeight() == null || animal.getSpeed() == null) {
			System.out.println("値がNULLです。");
		} else {
			//Getterで出力。
			System.out.println(animal.getName());
			System.out.println(animal.getHeight());
			System.out.println(animal.getSpeed());
		}
	}

}
