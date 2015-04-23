package prototype01;

import prototype01.ifc.DataType;
import prototype01.ifc.InputData;
import prototype01.ifc.Processer;
import prototype01.ifc.ResultData;

/**
 * 昇順に処理・結果を表示するクラス
 *
 * @author y_kusano
 *
 */
public class AscendingProcesser implements Processer {

	/** 入力された情報 */
	private InputData inputData;
	/** 処理対象の文字 */
	private DataType dataType;
	/** 処理結果の情報 */
	private ResultData resultData;

	private SelectClassName selectClassName;

	/**
	 * デフォルトコンストラクタ
	 */
	public AscendingProcesser() {
	}

	/**
	 * 文字の増加・生成処理
	 */
	private void process() {

		// 生成される文字列
		StringBuilder createString = new StringBuilder();
		// 指定文字番号のフラグ
		// (初期値:false,文字列数カウンタが指定文字数以上:true)
		boolean checkNumOfChar = false;
		// 文字列数カウンタ
		int countLengthCreateString = 0;

		// 指定された分、処理を繰り返す
		for (int i = 0; i < this.inputData.getNumOfLoop(); i++) {

			// 文字の増加処理
			this.dataType.incremetData(i);

			createString.append(this.dataType.getData());
			countLengthCreateString += createString.length();

			// 生成された文字列が文字番号以上あり、かつ、指定文字番号フラグがfalseの場合
			if (countLengthCreateString >= inputData.getNumOfIndex() && (!checkNumOfChar)) {

				// 文字番号を超えた文字数を取得
				int moreThanLength = createString.length() - (countLengthCreateString - inputData.getNumOfIndex());

				// 処理結果インスタンスにhoge文字目の文字をセット
				this.resultData.setNumOfChar(createString.toString().substring(moreThanLength - 1, moreThanLength + (inputData.getNumOfLength() - 1)));
				checkNumOfChar = true;
			}
		}
		if (!checkNumOfChar) {
			this.resultData.setNumOfChar("non");
		}
		this.resultData.setLastOfChar(createString.toString().substring(createString.length() - 1));
	}

	/**
	 * 結果の表示処理
	 */
	public void view() {
		System.out.println(inputData.getNumOfIndex() + "文字目：" + this.resultData.getNumOfChar());
		System.out.println("最後の文字：" + this.resultData.getLastOfChar());
	}

	@Override
	public void execute(InputData inputData,SelectClassName selectClassName) {

		this.inputData = inputData;
		this.selectClassName = selectClassName;

		Class cls;
		try {
			// 使用する文字種類のクラス名
			String dataTypeName = this.selectClassName.getDataType();
			cls = Class.forName(dataTypeName);
			this.dataType = (DataType) cls.newInstance();

			// 結果を取得するクラス名
			String resultDataName = selectClassName.getResultData();
			cls = Class.forName(resultDataName);
			this.resultData = (ResultData) cls.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 文字の増加・生成処理
		this.process();

		// 結果の表示処理
		this.view();
	}
}