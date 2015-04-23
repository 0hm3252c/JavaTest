package test;

public class NewCharacterProcesser {

	public void create(int input) {

		char c = 'a';
		StringBuilder allStr = new StringBuilder();
		StringBuilder singleStr = new StringBuilder();

		for(int i = 0 ; i < input ; i++){
			singleStr.append(c);
			System.out.println(singleStr.toString());
			c++;
		}
		System.out.println(allStr.toString());
	}
}
