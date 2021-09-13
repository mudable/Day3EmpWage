package empwage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int NO_OF_WORKING_DAYS = 20;

		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		for (int day = 0; day < NO_OF_WORKING_DAYS; day++) {
			Random random = new Random();
			int empCheck = random.nextInt(3);
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;

			case IS_FULL_TIME:
				empHrs = 8;
				break;

			default:
				empHrs = 0;
				break;

			}

			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Emp Wage:" + empWage);
		}

		System.out.println("Total Emp Wage:" + totalEmpWage);
	}

}
