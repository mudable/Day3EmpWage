package empwage;

import java.util.Random;

public class EmployeeWage {
 public static void main(String[] args) {
		final int IS_PART_TIME = 1;
		  final int IS_FULL_TIME = 2;
		     int EMP_RATE_PER_HOUR = 20;
	 int empHrs = 0;
            int empWage = 0;
            Random random = new Random();
            int empCheck = random.nextInt(3);
            switch (empCheck)
            {
                case IS_PART_TIME:
                    empHrs = 8;
                    System.out.println("Employee is present part time");
                    break;

                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Employee is present full time");
                    break;

                default:
                    empHrs = 0;
                    System.out.println("Employee is absent");
                    break;
            }

            empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Emp Wage:" + empWage);
	}

}
