import java.util.regex.Pattern;


public class FunWithRegex
{	
	
	public static void main(String[] args)
	{
		String withSteve = "Music [DigitalVersion]";
		
		String withoutSteve = steveBeGone(withSteve);
		
		System.out.println(withoutSteve + "L");
	}
	
	public static String steveBeGone(String withSteve)
	{
		Pattern pattern = Pattern.compile ( "(\\[.*?\\])|(\\(.*?\\))" );
		
		return pattern.matcher(withSteve)
				.replaceAll("");
	}
	
}
