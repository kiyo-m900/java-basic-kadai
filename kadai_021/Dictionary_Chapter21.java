package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	//HashMapの宣言
	HashMap<String,String> fruitMap = new HashMap<String,String>();
	
	//追加
	public void addFruit() {
		fruitMap.put("apple", "りんご");
		fruitMap.put("peach", "桃");
		fruitMap.put("banana", "バナナ");
		fruitMap.put("lemon", "レモン");
		fruitMap.put("pear", "梨");
		fruitMap.put("kiwi", "キウィ");
		fruitMap.put("strawberry", "いちご");
		fruitMap.put("grape", "ぶどう");
		fruitMap.put("muscat", "マスカット");
		fruitMap.put("cherry", "さくらんぼ");
	}
	
	//繰り返し処理による単語検索
	public void checkFruit(String word) {
		
		if(!fruitMap.containsKey(word)) {
			System.out.println(word + "は辞書に存在しません");
		}
		
		for(String key : fruitMap.keySet()) {
			if(key.equals(word)) {
				System.out.println(word + "の意味は" + fruitMap.get(word));
			}
		}
	}
}