package student_manag;
public class Mock
{
	private String trainerName;
	private String sub;
	private String date;
	private String rating;

	public Mock(String trainerName,String sub,String date,String rating)
	{
		super();
		this.trainerName=trainerName;
		this.sub=sub;
		this.date=date;
		this.rating=rating;
	}

	public String getTrainerName()
	{
		return trainerName;
	}

	public void setTrainerName(String trainerName)
	{
		this.trainerName=trainerName;
	}
	public String getSub()
	{
		return sub;
	}
	public void displayMock()
	{
		System.out.println("implementing");
	}
}