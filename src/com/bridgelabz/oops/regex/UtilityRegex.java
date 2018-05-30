package com.bridgelabz.oops.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Purpose: to utilize methods
 * @author Jayanta Roy
 * @version 1.0
 * @since 30/05/18
 */
public class UtilityRegex {

	 public static String regexReplacement(String template,String regex,String replaceWith) {
	        Pattern pattern= Pattern.compile(regex);
	        Matcher matcher= pattern.matcher(template);
	        template=matcher.replaceAll(replaceWith);
	        return template;
	    }
}
