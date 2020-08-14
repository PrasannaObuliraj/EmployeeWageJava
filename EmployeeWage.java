public class EmployeeWage
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to employee wage problem");
		int fullTime=1;
		int empHrs=0;
		int empWage=0;
		int wagePerHour=20;

		int randomCheck=(int) (Math.random()*10)%2;

		if(randomCheck==fullTime)
		{
			empHrs=8;
		}
		empWage=wagePerHour*empHrs;
		System.out.println("Employee daily wage:" + empWage);
	}
}
