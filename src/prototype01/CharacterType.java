package prototype01;

import prototype01.ifc.DataType;

/**
 * 文字を格納・増加させるクラス
 * @author y_kusano
 */
public class CharacterType implements DataType {

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
	 * dataに初期値としてaを格納
	 */
	public CharacterType() {
		this.data = 'a';
	}

	public void incremetData(int i) {
		this.setData((char) ('a' + i % 26));
	}
}
