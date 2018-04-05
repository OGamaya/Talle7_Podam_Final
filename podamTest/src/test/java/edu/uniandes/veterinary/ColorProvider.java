package edu.uniandes.veterinary;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Random;

import uk.co.jemos.podam.common.AttributeStrategy;

public class ColorProvider implements AttributeStrategy<String> {

	public String getValue(Class<?> arg0, List<Annotation> arg1) {
		int val = new Random().nextInt(5);
		switch (val) {
		case 0:
			return "red";
		case 1:
			return "blue";
		case 2:
			return "yellow";
		case 3:
			return "black";
		case 4:
			return "white";
		default:
			return "other color";
		}
	}
	public static boolean exist(String color) {
		return color.equals("red") ||
			   color.equals("blue") ||
			   color.equals("yellow") ||
			   color.equals("black") ||
			   color.equals("white");
	}
}
