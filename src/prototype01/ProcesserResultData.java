package prototype01;

import prototype01.ifc.ResultData;

public class ProcesserResultData implements ResultData{

	/**hoge文字目の文字*/
	private String numOfChar;
	/**最後の文字のゲッター*/
	private String lastOfChar;
	/**最初の文字*/
	private String beginOfChar;

	public String getNumOfChar() {
		return numOfChar;
	}
	public String getLastOfChar() {
		return lastOfChar;
	}
	public String getBeginOfChar() {
		return beginOfChar;
	}
	public void setNumOfChar(String numOfChar) {
		this.numOfChar = numOfChar;
	}
	public void setLastOfChar(String lastOfChar) {
		this.lastOfChar = lastOfChar;
	}
	public void setBeginOfChar(String beginOfChar) {
		this.beginOfChar = beginOfChar;
	}
}
