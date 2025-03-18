package CryptoManager;

/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: CryptoManager has methods to check if a String is in range to be encrypted and also encrypt/decrypt methods for bellaso and caesar cyphers
 * Due: 3/17/25
 * Platform/compiler:
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Rowan Mau;e
*/


/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		//steps through to check each character of plainText
		for(int c = 0; c < plainText.length(); c++)
		{
			if(plainText.charAt(c) < LOWER_RANGE || plainText.charAt(c) > UPPER_RANGE)
			{
				//returns false if the currently checked character is outside the range
				return false;
			}
		}
		
		//returns true if it can step through each character of plainText without any characters going out of range
		return true;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		//if statement to check if the string is in the range, if yes then encrypt
		if(isStringInBounds(plainText))
		{
			String encryptedString = "";
			
			//steps through and encrypts each letter of the string
			for(int c = 0; c < plainText.length(); c++)
			{
				int letter = plainText.charAt(c) + key;
				
				//checks if the encrypted character is outside the ASCII character range and corrects it by looping back around
				while(letter > UPPER_RANGE)
				{
					letter = letter - RANGE;
				}
				
				encryptedString += (char) letter;
			}
			
			return encryptedString;
		} else {
			//returns this if string is not in range
			return "The selected string is not in bounds, Try again.";
		}
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		if(isStringInBounds(plainText))
		{
			String encryptedText = "";
			//keyChar checks which character of the key the program is on
			int keyChar = 0;
			
			//steps through each character of plainText
			for(int textChar = 0; textChar < plainText.length(); textChar++)
			{
				int letter = plainText.charAt(textChar) + bellasoStr.charAt(keyChar);
				
				//checks if the letter goes over the upper range
				while(letter > UPPER_RANGE)
				{
					letter -= RANGE;
				}
				
				//goes to the next character in bellasoStr
				keyChar++;
				//resets the character to 0 when it reaches the end of bellasoStr
				if(keyChar >= bellasoStr.length())
				{
					keyChar = 0;
				}
				
				encryptedText += (char)letter;
			}
			
			return encryptedText;
		} else {
			//returns this if string is not in range
			return "The selected string is not in bounds, Try again.";
		}
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
			String plainText = "";
			
			for(int c = 0; c < encryptedText.length(); c++)
			{
				int letter = encryptedText.charAt(c) - key;
				
				while(letter < LOWER_RANGE)
				{
					letter = letter + RANGE;
				}
				
				plainText += (char) letter;
			}
			
			return plainText;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		String plainText = "";
		int keyChar = 0;
		
		for(int textChar = 0; textChar < encryptedText.length(); textChar++)
		{
			int letter = encryptedText.charAt(textChar) - bellasoStr.charAt(keyChar);
			
			while(letter < LOWER_RANGE)
			{
				letter += RANGE;
			}
			
			keyChar++;
			if(keyChar >= bellasoStr.length())
			{
				keyChar = 0;
			}
			
			plainText += (char)letter;
		}
		
		return plainText;
	}
}
