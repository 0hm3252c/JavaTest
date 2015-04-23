package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author y_kusano
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		System.out.println("数字を入力してください");

		String input = new BufferedReader(new InputStreamReader(System.in)).readLine();

		// TODO:不正入力チェック

		long startTime = System.nanoTime();

		NewCharacterProcesser scp = new NewCharacterProcesser();
		scp.create(Integer.parseInt(input));
//		CharacterProcesser scp = new CharacterProcesser();
//		String result = scp.create(Integer.parseInt(input));
		// System.out.println("100文字目：" + result.substring(100, 101));
		// System.out.println("最後の文字：" +
		// result.substring(result.length()-1));

		long endTime = System.nanoTime();

		System.out.println("処理時間:" + (endTime - startTime) + " ns");

	}
}

