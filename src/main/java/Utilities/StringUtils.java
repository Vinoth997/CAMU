package Utilities;

import java.util.Random;

public class StringUtils {
	
	public static String replaceAllBy(String text, String replace, String replaceWith) {
		String result = text.replaceAll(replace, replaceWith);
		return result;
	}

	public static String trim(String text) {
		String result = text.trim();
		return result;
	}
	
	public static String sliceFromFront(String text, int endIndex) {
	    if (text.length() >= endIndex) {
	        return text.substring(0, endIndex);
	    } else {
	        return text;
	    }
	}

	public static String sliceFromEnd(String text, int startIndex) {
	    if (text.length() >= startIndex) {
	        return text.substring(text.length() - startIndex);
	    } else {
	        return text;
	    }
	}
	
	public static String removeTextAfterLineBreak(String text) {
	    int index = text.indexOf("\n");
	    if (index != -1) {
	        return text.substring(0, index);
	    } else {
	        return text;
	    }
	}
	
	public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }
	
	public static String generateRandomNumbers(int length) {
        String characters = "1234567890";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }
	
	public static String generateRandomCharacter(int length) {
        String characters = "!@#$%^&*()_+-=;':,.<>/?!`~";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }
	
	public static String generateRandomStringNumberCharacter(int alphaCount, int numCount, int charCount) {
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String characters = "!@#$%^&*()_+-=;':,.<>/?!`~";

        StringBuilder sb = new StringBuilder(alphaCount + numCount + charCount);
        Random random = new Random();

        // Generate random alphabets
        for (int i = 0; i < alphaCount; i++) {
            int randomIndex = random.nextInt(alphabets.length());
            char randomChar = alphabets.charAt(randomIndex);
            sb.append(randomChar);
        }

        // Generate random numbers
        for (int i = 0; i < numCount; i++) {
            int randomIndex = random.nextInt(numbers.length());
            char randomChar = numbers.charAt(randomIndex);
            sb.append(randomChar);
        }

        // Generate random characters
        for (int i = 0; i < charCount; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }

        // Shuffle the generated string
        String randomString = sb.toString();
        char[] chars = randomString.toCharArray();
        for (int i = chars.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = chars[index];
            chars[index] = chars[i];
            chars[i] = temp;
        }
        return new String(chars);
    }

}
