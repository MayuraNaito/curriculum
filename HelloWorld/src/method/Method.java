package method;
import java.util.Random;

public class Method {

	public static void main(String[] args) {
	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
		hello();
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
		sum(1);
	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
		mlut(2,2);
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
		mlut2(2.5, 2.5);
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
		int index[] = random(2);
		System.out.print("Q5 = ");
		for (int i = 0; i < index.length; i++) {
			System.out.print(index[i] + " ");
		}
		System.out.println();
	// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
	//     配列の要素の平均値を返すメソッド（関数）を作成してください。
		avg(2);
	}
	
//	Q1
	public static void hello() {
		System.out.println("Q1 = " + "Hello Java");
	}
//	Q2
	public static void sum(int num) {
		System.out.println("Q2 = " + num + 1);
	}
//	Q3
	public static void mlut(int num, int  num1) {
		System.out.println("Q3 = " + num * num1);
	}
//	Q4
	public static void mlut2(double num, double num1) {
		System.out.println("Q4 = " + num * num1);
	}
//	Q5
	public static int[] random(int num) {
		Random random = new Random();
		int[] num1 = new int[num];
		for (int i = 0; i < num; i++) {
			num1[i] = random.nextInt(100 + 1);
		}
		return num1;
	}
//	Q6
	public static double avg(int num) {
		double avg = 0;
		int[] rnd = random(num);
		double sum = 0;
		for (int i = 0; i < num; i++) {
			sum += rnd[i];
		}
		System.out.println("Q6 = " + rnd[0] + " " + rnd[1]);
		avg = sum / num;
		System.out.println("Q6 = " + avg);
		return avg;
		
	}
}
