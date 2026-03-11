package com.puneet.ProgrammingPractice;
	import java.util.regex.*;

	public class ValidateIPv4 {
	    public static void main(String[] args) {
	        String[] testIPs = {
	            "192.168.1.1",
	            "255.255.255.255",
	            "256.100.50.25",
	            "192.168.0",
	            "123.045.067.089",
	            "0.0.0.0"
	        };

	        for (String ip : testIPs) {
	            if (isValidIPv4(ip))
	                System.out.println(ip + " → Valid IPv4 address");
	            else
	                System.out.println(ip + " → Invalid IPv4 address");
	        }
	    }

	    public static boolean isValidIPv4(String ip) {
	        // Regular expression for IPv4
	        String ipv4Pattern =
	            "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}"
	          + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

	        Pattern pattern = Pattern.compile(ipv4Pattern);
	        Matcher matcher = pattern.matcher(ip);
	        return matcher.matches();
	    }
	
}
