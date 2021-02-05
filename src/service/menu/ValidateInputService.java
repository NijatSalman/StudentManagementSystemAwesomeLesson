package service.menu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import menu.service.inter.ValidateInputServiceInter;

public class ValidateInputService implements ValidateInputServiceInter {

	@Override
	public void processValidation() {
		
		
//		boolean success = true;
//		if(value==null){
//			return success=false;
//		}
//		String getClassNamevalue=value.getClass().getName();
//		System.out.println("1111111111"+" "+getClassNamevalue);
//		 if(validateSpecialChar(value)){
//			return success=false;
//		}		
//
//		 if(getClassNamevalue.contains("java.lang.Integer")){
//			 success=validateInteger(value);
//		}else if(getClassNamevalue.contains("java.lang.String")){
//			success=validateString(value);
//		}
//		return success;

	}

	@Override
	public Object processValidation(Object value) {
		Scanner scanner=new Scanner(System.in);
		
		if(scanner.hasNextInt()){
			return validateInteger(scanner);
		}else{
			return validateString(scanner);
		}
		 
	}

	public char objectToChar(Object value) {
		char charValue = ' ';
		for (int i = 0; i < value.toString().length(); i++) {
			charValue = value.toString().charAt(i);
			System.out.println("Character at " + i + " Position: " + charValue);
			return charValue;
		}
		return charValue;
	}

	public boolean validateSpecialChar(Object value) {

		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");

		String stringValue = value.toString();
		Matcher matcher = pattern.matcher(stringValue);

		if (!matcher.matches()) {
			System.out.println("string '" + stringValue + "' contains special character");
			return true;
		} else {
			System.out.println("string '" + stringValue + "' doesn't contains special character");
		}
		return false;
	}

	public Object validateInteger(Object value) {

//		char charValue = objectToChar(value);
//		String strValue = value.toString();
//		for (int j = 0; j < strValue.length(); j++) {
//			Boolean flag = Character.isDigit(strValue.charAt(j));
//
//			if (!flag) {
//				System.out.println("'" + strValue.charAt(j) + "' is a letter");
//				return false;
//			}
//		}
//		return true;
		
		int number;
        do {
            System.out.print("Please enter a positive number: ");
            while (!((Scanner) value).hasNextInt()) {
                String input = ((Scanner) value).next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
            }
            number = ((Scanner) value).nextInt();
            return number;
        } while (number < 0);
	}

	public Object validateString(Object value) {

		char charValue = objectToChar(value);
		String strValue = value.toString();
		for (int j = 0; j < strValue.length(); j++) {
			Boolean flag = Character.isLetter(strValue.charAt(j));
			if (!flag) {
				System.out.println("'" + strValue.charAt(j) + "' is a letter");
				//break;
			}
		}
		return strValue;
	}

}
