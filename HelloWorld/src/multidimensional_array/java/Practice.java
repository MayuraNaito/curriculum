/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package multidimensional_array.java;

public class Practice {

	public static void main(String[] args) {
		int[][] test = {
				{64, 58, 86, 72},
				{73, 81, 68, 55},
				{69, 75, 79, 80}
				};
		
		System.out.println("生徒1：国語" + test[0][0] + "点、" + "数学" + test[1][0] + "点、" + "英語" + test[2][0] + "点");
		System.out.println("生徒2：国語" + test[0][1] + "点、" + "数学" + test[1][1] + "点、" + "英語" + test[2][1] + "点");
		System.out.println("生徒3：国語" + test[0][2] + "点、" + "数学" + test[1][2] + "点、" + "英語" + test[2][2] + "点");
		System.out.println("生徒4：国語" + test[0][3] + "点、" + "数学" + test[1][3] + "点、" + "英語" + test[2][3] + "点");
		System.out.println("");
//		全教科の合計点数と平均点数を入れる配列の初期値。
		int[] allTotal = {0, 0, 0};
		int[] avg = {0, 0, 0};
//		全教科の合計点数と平均点数を配列に入れるループ処理。
		for (int i = 0; i < test.length; i++) {
			int total = 0;
			for (int j = 0; j < test[i].length; j++) {
				total += test[i][j];
			}
//			合計点数の計算。
			allTotal[i] += total;
//			平均点数の計算。
			avg[i] = allTotal[i] / 4;
		}
		
		System.out.println("国語の平均点は" + avg[0] + "点です。");
		System.out.println("数学の平均点は" + avg[1] + "点です。");
		System.out.println("英語の平均点は" + avg[2] + "点です。");
	}
}
