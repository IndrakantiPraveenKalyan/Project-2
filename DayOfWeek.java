package Assignment2;
import java.util.*;
import java.text.*;
import java.io.*;
public class DayOfWeek {
private int leapArr[] = {
	      1900, 1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944,
	      1948, 1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992,
	      1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040,
	      2044, 2048, 2052, 2056, 2060, 2064, 2068, 2072, 2076, 2080, 2084, 2088,
	      2092, 2096, 2100};
	  private int monthDaysArr[] = {
	      31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  private int userYear = 0;
	  private int userMonth = 0;
	  private int userDay = 0;
	  private int userMonthDays = 0;
	  private String str = new String();
	  private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	  private InputStreamReader isr = new InputStreamReader(System.in);
	  private BufferedReader br = new BufferedReader(isr);

	  public static void main(String[] args) {
	    DayOfWeek dw = new DayOfWeek();
	    try {
	      dw.calculateDayOfTheWeek();
	    }
	    catch (Exception ex) {
	      System.out.println(ex.getMessage());
	    }
	  }

	  public void getUserInput() {
	    boolean valid = false;
	    try {
	      do {
	        System.out.println("Enter a Date to get its Day Of The Week");
	        System.out.print("In range of Mar 1900 to Feb 2100 (eg: 2016/12/14): ");
	        str = new String();
	        str = br.readLine();
	        valid = validateInput(str);
	      }
	      while (valid == false);
	    }
	    catch (Exception ex) {
	      System.out.println(ex.getMessage());
	    }
	  }

	  public boolean validateInput(String str) {
	    try {
	      sdf.parse(str);
	      return true;
	    }
	    catch (Exception ex) {
	      return false;
	    }
	  }

	  public void calculateDayOfTheWeek() throws Exception {
	    int daysTotal = 0;
	    int weekDay;
	    String weekDayStr = new String();
	    boolean flag = true;

	    getUserInput();
	    while (flag == true) {
	      try {
	        StringTokenizer st = new StringTokenizer(str, "/");
	        userYear = Integer.parseInt(st.nextToken());
	        userMonth = Integer.parseInt(st.nextToken());
	        userDay = Integer.parseInt(st.nextToken());
	        daysTotal = (userYear - 1900) * 365;
	        daysTotal = daysTotal + ( (userYear - 1900) / 4);
	        if ( (isLeapYear() == true) && (isJanFeb() == true)) {
	          daysTotal = daysTotal - 1;
	        }
	        int temp = userMonth - 1;
	        for (int j = 0; j < temp; j++) {
	          userMonthDays = userMonthDays + monthDaysArr[j];
	        }
	        userMonthDays = userMonthDays + userDay;
	        daysTotal = daysTotal + userMonthDays;
	        weekDay = daysTotal % 7;
	        switch (weekDay) {
	          case 0:
	            weekDayStr = "Sunday";
	            break;
	          case 1:
	            weekDayStr = "Monday";
	            break;
	          case 2:
	            weekDayStr = "Tuesday";
	            break;
	          case 3:
	            weekDayStr = "Wednesday";
	            break;
	          case 4:
	            weekDayStr = "Thursday";
	            break;
	          case 5:
	            weekDayStr = "Friday";
	            break;
	          case 6:
	            weekDayStr = "Saturday";
	            break;
	        }
	        System.out.println(weekDayStr + " is the Day of the Week for " + str + "\n\n");
	        userMonthDays = 0;
	        weekDay = 0;
	      }
	      catch (Exception ex) {
	        System.out.println(ex.getMessage());
	      }
	      System.out.print("Type Q to Quit or press any key to continue . .  . ");
	      str = new String();
	      str = br.readLine();
	      if (str.equalsIgnoreCase("Q") == true) {
	        System.exit(0);
	      }
	      else {
	        getUserInput();
	      }
	    }
	  }

	  public boolean isLeapYear() {
	    boolean leap = false;
	    for (int i = 0; i < leapArr.length; i++) {
	      if (leapArr[i] == userYear) {
	        leap = true;
	      }
	    }
	    return leap;
	  }

	  public boolean isJanFeb() {
	    boolean janFeb = false;
	    if ( (userMonth == 1) || (userMonth == 2)) {
	      janFeb = true;
	    }
	    return janFeb;
	  }

	}

