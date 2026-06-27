package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//インスタンス化
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		
		//辞書の作成
		dic.addFruit();
		
		//検索単語の配列の作成
		String[] fruitList = {"apple", "banana", "grape", "orange"};

		//単語の検索
	    dic.checkFruit(fruitList);
	}

}
