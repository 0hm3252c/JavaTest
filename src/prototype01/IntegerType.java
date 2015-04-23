package prototype01;

import prototype01.ifc.DataType;

/**
 * 数字を格納・増加させるクラス
 * @author y_kusano
 */
public class IntegerType implements DataType {

	/**増加させる文字*/
	private char data;

	public char getData() {
		return data;
	}

	/**
	 * 増加される文字のセッター
	 * @param data
	 */
	private void setData(char data) {
		this.data = data;
	}

	/**
	 * デフォルトコンストラクタ
	 * dataに初期値として1を格納
	 */
	public IntegerType() {
		this.data = '0';
	}

	public void incremetData(int i) {
		this.setData((char) ('0' + i % 10));
	}
}
