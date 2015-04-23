package prototype01;

import java.io.IOException;

import prototype01.ifc.InputData;
import prototype01.ifc.Processer;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws Exception {

		SelectClassName selectClassName = new SelectClassName();
		selectClassName.readPropertieFile();

		// 入力処理をするクラス名を設定
		String inputDataName = selectClassName.getInputData();
		Class cls = Class.forName(inputDataName);
		InputData inputData = (InputData) cls.newInstance();

		// 情報入力処理を実行
		inputData.execute();

		// (テスト用コード)処理時間計測スタート
		long startTime = System.nanoTime();

		// 処理・出力処理をするクラス名を設定
		String processerName = selectClassName.getProcesser();
		cls = Class.forName(processerName);
		Processer processer = (Processer) cls.newInstance();

		// 文字処理を実行
		processer.execute(inputData,selectClassName);

		// (テスト用コード)処理時間計測エンド
		long endTime = System.nanoTime();

		// (テスト用コード)処理時間表示
		System.out.println("処理時間:" + (endTime - startTime) + " ns");
	}
}
