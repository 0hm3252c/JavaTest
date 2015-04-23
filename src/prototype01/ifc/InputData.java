package prototype01.ifc;

/**
 * 処理に必要な情報入力IF
 * @author y_kusano
 *
 */
public interface InputData {

	/**
	 * 文字番号のゲッター(何番目の文字を取得)
	 * @return
	 */
	abstract int getNumOfIndex();

	/**
	 * 取得文字数ゲッター(hoge番目から何文字を取得)
	 * @return
	 */
	abstract int getNumOfLength();


	/**
	 * 取得位置(最初・最後)ゲッター
	 * @return
	 */
	abstract int getBeginOrLast();

	/**
	 * 処理ループ数ゲッター
	 * @return
	 */
	abstract int getNumOfLoop();

	abstract void execute();
}
