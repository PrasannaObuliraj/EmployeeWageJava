public class EmployeeWage
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to employee wage problem");
		int fullTime=1;
		int partTime=2;
		int empHrs=0;
		int empWage=0;
		int wagePerHour=20;

		int randomCheck=(int) (Math.random()*10)%3;

		if(randomCheck==fullTime)
		{
			empHrs=8;
		}
		else if(randomCheck==partTime)
		{
			empHrs=4;
		}
		empWage=wagePerHour*empHrs;
		System.out.println("Employee daily wage:" + empWage);
	}
}
