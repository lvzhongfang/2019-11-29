package com;

import java.util.regex.Pattern;

public class Dog {

    private static Pattern SEPARATOR_REEAT = Pattern.compile("/{2,}");
    private static Pattern SEPARATOR_START_END = Pattern.compile("^/+|/+$");
    
    public static String normalize(String path) {
		if(path==null){
			return "";
		}
		return "/"+SEPARATOR_START_END.matcher(SEPARATOR_REEAT.matcher(path).replaceAll("/")).replaceAll("");
	}
}