package Tourism_Management_Company;

public class WinterPackage extends TourPackage{
	
	private String season;
	
	public WinterPackage()
	{
		super();
	}
	
	public void inputSeasonName()
	{
		System.out.println("Please enter season name");
		season = myscanner.next();
	}
	
	public String getSeasonName()
	{
		return season;
	}

}
