
public class Sentence {

	public static void main (String[]args)
	{
		System.out.println("I dislike programming" );
		String sentence=null;
		int position=sentence.indexOf("dislike");
		sentence = sentence.substring(0, position)+ "like" + sentence.substring(position+7);
	}
	
}
