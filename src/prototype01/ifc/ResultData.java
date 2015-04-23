package prototype01.ifc;

/**
 * 処理結果IF
 * @author y_kusano
 *
 */
public interface ResultData {

	/**
	 * hoge文字目の文字のゲッター
	 * @return
	 */
	abstract String getNumOfChar();

	/**
	 * 最後の文字のゲッター
	 * @return
	 */
	abstract String getLastOfChar();

	/**
	 * 最初の文字のゲッター
	 * @return
	 */
	abstract String getBeginOfChar();

	/**
	 * hoge文字目の文字のセッター
	 * @param numOfChar
	 */
	abstract void setNumOfChar(String numOfChar);

	/**
	 * 最後の文字のセッター
	 * @param lastOfChar
	 */
	abstract void setLastOfChar(String lastOfChar);

	/**
	 * 最初の文字のセッター
	 * @param beginOfChar
	 */
	abstract void setBeginOfChar(String beginOfChar);
}
