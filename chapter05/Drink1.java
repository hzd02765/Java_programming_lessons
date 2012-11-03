import java.io.*;

public class Drink{
    public static void main(String[] args){
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    System.out.println("飲み物は何が好きですか？");
	    System.out.println("１　オレンジージュース");
	    System.out.println("２　コーヒー");
	    System.out.println("３　どちらでもない");
	    System.out.println("１、２、３のどれかを選んでください。");
	    String line = reader.readLine();
	    int n  = Integer.parseInt(line);
	    switch (n){
	    case 1:
		System.out.println("オレンジジュースです。");
		break;
	    case 2:
		System.out.println("コーヒーです。");
		break;
	    default:
		System.out.println("どちらでもありません。");
		break;
	    }
	} catch (IOException e){
	    System.out.println(e);
	} catch (NumberFormatException e){
	    System.out.println("数字の形式が正しくありません。");
	}
    }
}
