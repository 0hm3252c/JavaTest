package prototype01;

import java.io.FileInputStream;
import java.util.Properties;

public class SelectClassName {

	/** 使用する処理クラス名 */
	private String processer;
	/** 使用する入力クラス名 */
	private String inputData;
	/** 使用するデータクラス名 */
	private String dataType;
	/** 使用する処理結果クラス名 */
	private String resultData;
	/** 読み込むファイル名 */
	private String filePath;

	public String getProcesser() {
		return processer;
	}

	public String getInputData() {
		return inputData;
	}

	public String getDataType() {
		return dataType;
	}

	public String getResultData() {
		return resultData;
	}

	/**
	 * デフォルトコンストラクタ
	 * クラス名の初期値を設定
	 */
	public SelectClassName() {
		this.processer = "prototype01.AscendingProcesser";
		this.inputData = "prototype01.StandardInputData";
		this.dataType = "prototype01.CharacterType";
		this.resultData = "prototype01.ProcesserResultData";
	}

	public void readPropertieFile() {
		this.filePath = "bin/prototype01/prp/SelectClassName.properties";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(this.filePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.processer = prop.getProperty("processer");
		this.inputData = prop.getProperty("inputdata");
		this.dataType = prop.getProperty("datatype");
		this.resultData = prop.getProperty("resultdata");
	}
}
