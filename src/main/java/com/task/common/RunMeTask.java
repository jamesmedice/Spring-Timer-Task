package com.task.common;

import java.util.Calendar;

public class RunMeTask {
    public void printMe() {
	String test = "0000000450";
	System.out.println(test.replaceFirst("^0+(?!$)", ""));

	test = "+ 450000000";

	System.out.println(test.replaceFirst("^.|.$", ""));

	System.out.println("Running: " + Calendar.getInstance().getTime());
    }
}
