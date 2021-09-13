package empwage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HOUR = 100;
		int NO_OF_WORKING_DAYS = 20;
		int MAX_HRS_IN_THE_MONTH = 10;
		{
			int empHrs = 0;
			int totalEmpHrs = 0;
			int totalWorkingDays = 0;
			while (totalEmpHrs <= MAX_HRS_IN_THE_MONTH && totalWorkingDays < NO_OF_WORKING_DAYS) {
				totalWorkingDays++;
				Random random = new Random();
				int empCheck = random.nextInt(3);
				switch (empCheck) {
				case IS_PART_TIME:
					empHrs = 8;
					break;

				case IS_FULL_TIME:
					empHrs = 12;
					break;

				default:
					empHrs = 0;
					break;

				}

				totalEmpHrs += empHrs;
				System.out.println("Days#" + totalWorkingDays + "EmpHrs :" + empHrs);
			}
			int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
			System.out.println("Total Emp Wage:" + totalEmpWage);

		}
	}

}
