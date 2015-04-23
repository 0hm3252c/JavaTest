package prototype01.ifc;

/**
 * 増加させる文字の格納・文字種類IF
 * @author y_kusano
 *
 */
public interface DataType {

	/**
	 * 増加させる文字のゲッター
	 * @return
	 */
	abstract char getData();

	/**
	 * 文字を増加してセット
	 * @param i 増分させる値
	 */
	abstract void incremetData(int i);
}
