package selenium.launch;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) 
	{
		launch("chrome");
		
		navigateUrl("https://www.amazon.in");
	}

}
