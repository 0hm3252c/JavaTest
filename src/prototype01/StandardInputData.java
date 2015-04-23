package prototype01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import prototype01.ifc.InputData;

public class StandardInputData implements InputData {

	// 表示したい文字の桁番号
	private int numOfIndex;
	// 表示したい文字の桁番号からの文字数
	private int numOfLength;
	//最初・最後の文字を選択(0:最初の文字,1:最後の文字,2:両方の文字)
	private int beginOrLast;
	// 繰り返したい数
	private int numOfLoop;

	public int getNumOfIndex() {
		return this.numOfIndex;
	}

	public int getNumOfLength() {
		return this.numOfLength;
	}

	public int getBeginOrLast() {
		return this.beginOrLast;
	}

	public int getNumOfLoop() {
		return this.numOfLoop;
	}

	public StandardInputData() {}

	@Override
	public void execute() {
		System.out.println("数字を入力してください");

		// 入力要求処理
		try {
			this.numOfLoop = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// デフォルト値の設定
		this.numOfIndex = 100;
		this.numOfLength = 1;
		this.beginOrLast = 1;
	}
}
