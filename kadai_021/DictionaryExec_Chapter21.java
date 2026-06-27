package kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//インスタンス化
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		
		//辞書の作成
		dic.addFruit();
		
		//検索単語の配列の作成
	      ArrayList<String> fruitList = new ArrayList<String>();
	      fruitList.add("apple");
	      fruitList.add("banana");
	      fruitList.add("grape");
	      fruitList.add("orange");
		
		//単語の検索
	    dic.checkFruit(fruitList);
	}

}
