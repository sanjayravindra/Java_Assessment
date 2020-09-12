package com.JavaLang;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MallParking {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date current = format.parse("29/10/2019 20:10");
		System.out.println("In-time");
		String inTime = sc.nextLine();
		try {
			Date in = format.parse(inTime);
			if (in.compareTo(current) < 0) {
				System.out.println("Out-time");
				String outTime = sc.nextLine();
				try {
					Date out = format.parse(outTime);
					if (out.compareTo(in) > 0) {
						long diff = out.getTime() - in.getTime();
						long hours = TimeUnit.MILLISECONDS.toHours(diff);
						long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);
						if (minutes > 0)
							hours = hours + 1;
						long result = hours * 10;
						System.out.println(result + " Rupees");
					} else
						System.out.println(outTime + " is an Invalid Out-Time");
				} catch (Exception e) {
					System.out.println(outTime + " is an Invalid Out-Time");
				}
			} else
				System.out.println(inTime + " is an Invalid In-Time");
		} catch (Exception e) {
			System.out.println(inTime + " is an Invalid In-Time");
		}
	}

	public static boolean isValidDate(String date) {
		String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/\\d\\d\\d\\d [012]{0,1}[0-9]:[0-6][0-9]$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher((CharSequence) date);
		return matcher.matches();
	}
}
// if(matcher.matches())
// {
// matcher.reset();
// if(matcher.find())
// {
// String day = matcher.group(1);
// String month = matcher.group(2);
// String[] a = matcher.group(3).split(" ");
// int year = Integer.parseInt(a[0]);
//
// if(day.equals("31")&&(month.equals("4")||month.equals("6")||month.equals("9")||
// month.equals("11")||month.equals("04")||month.equals("06")||month.equals("09")))
// {
// return false;
// }
// else if(month.equals("2")||month.equals("02"))
// {
// if(year%4==0)
// {
// if(day.equals("30")||day.equals("31"))
// {
// return false;
// }
// }
// else
// {
// if(day.equals("29")||day.equals("30")||day.equals("31"))
// {
// return false;
// }
// }
// }
//
// }
// }
// else
// {
// return false;
// }
// // System.out.println(matcher.matches());
// // return matcher.matches();
// return true;

// (0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/((19|2[0-9])[0-9]{2})

// "(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/((19|20)\\d\\d)";
