public class EmployeeWage
{
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static void main(String[] args)
	{
		System.out.println("Welcome to employee wage problem");
		int empHrs=0;
		int empWage=0;
		int wagePerHour=20;

		int randomCheck=(int) (Math.random()*10)%3;

		switch(randomCheck)
		{
			case FULL_TIME:
				empHrs=8;
				break;
			case PART_TIME:
				empHrs=4;
				break;
		}
		empWage=wagePerHour*empHrs;
		System.out.println("Employee daily wage:" + empWage);
	}
}
