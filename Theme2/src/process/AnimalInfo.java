/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */

package process;

public class AnimalInfo {
	//フィールドの作成。
	private String name;
	private double height;
	private int speed;

	//name Getter
	public String getName() {
		return this.name;
	}
	//name Setter
	public void setName(String name) {
		this.name = name;
	}
	
	//height Getter
	public String getHeight() {
		return this.height + "m";
	}
	//height Setter
	public void setHeight(double height) {
		this.height = height;
	}
	
	//speed Getter
	public String getSpeed() {
		return this.speed + "km/h";
	}
	//speed Setter
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
