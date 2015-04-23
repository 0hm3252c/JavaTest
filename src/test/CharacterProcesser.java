package test;

public class CharacterProcesser {


	/**
	 * 必要な結果を表示
	 *
	 * @param input
	 * @return
	 */
	public String create(int input) {

		// 100(指定)文字目の文字
		String numOfChar = "";
		// 最初・最後(指定)の文字
		String lastOfChar = "";
		// 追加して作成された文字列
		StringBuilder createString = new StringBuilder();
		// 追加対象の文字
		char addChar = 0;
		// 文字列長のカウンタ
		int countLengthCreateString = 0;
		// 文字列長が100文字以上あればtrue
		boolean checkNumOfChar = false;

		for (int i = 0; i < input; i++) {
			addChar = ((char) ('a' + i % 26));

			// 文字列の追加
			createString.append(addChar);
			countLengthCreateString += createString.length();

			if (countLengthCreateString >= 100 && (! checkNumOfChar)) {

				int moreThanLength = createString.length() - (countLengthCreateString - 100);
				numOfChar = createString.toString().substring(moreThanLength-1, moreThanLength);
				checkNumOfChar = true;
			}
		}
		lastOfChar = createString.toString().substring(createString.length() - 1);
		if (checkNumOfChar) {
			System.out.println("100文字目：" + numOfChar);
		} else {
			System.out.println("100文字目：non");
		}
		System.out.println("最後の文字：" + lastOfChar);

		return "";
	}
	/**
	 * 結合させた文字列を返す
	 *
	 * @param input
	 * @return
	 */
	// public String createOld(int input) {
	// StringBuilder result = new StringBuilder();
	// StringBuilder lastResult = new StringBuilder();
	// char addChar = 0;
	//
	// for (int i = 0; i < input; i++) {
	// addChar = ((char) ('a' + i % 26));
	//
	// // 文字列の追加
	// lastResult.append(addChar);
	//
	// // 結果に格納
	// result.append(lastResult.toString());
	//
	// // if (result.length() >= 100 ) {
	// // System.out.println("lastResult : " + lastResult.toString());
	// // System.out.println("lastResult.toString() : " +
	// // lastResult.toString().substring(100,101));
	// // }
	// }
	// return result.toString();
	//	}

}