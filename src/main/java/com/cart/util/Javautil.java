package com.cart.util;

import java.util.Date;

public class Javautil {

	public static String generateTimeStamp() {
		Date date = new Date();
		String time = date.toString().replace(" ", "_").replace(":", "_");
		return time;
	}

}
