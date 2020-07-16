object caesar{
	val shifts = 1; //Shifts can be configured within the app, by default this is set to '1'

	def encrypt(plainText: String): Int = { //Function to encrypt any given string using the cipher
		val tmpText = plainText.toUpperCase();
		for (i <- 0 to (tmpText.length - 1)){
			val tmpChar = tmpText.charAt(i);
			if ('A' <= tmpChar && tmpChar <= 'Z'){
				val tmpCharVal:Int = tmpChar % 'A';
				var tmpRes = tmpCharVal + shifts;
				if (tmpRes < 0) tmpRes += 26;
				else if (tmpRes > 25) tmpRes -= 26;
				tmpRes = (tmpRes % 26) + 'A';
				printf("%c", tmpRes); 
			}
			else if (tmpChar == ' ') printf(" ");
			else return 1; //We hit an unsupported character
		}
		return 0; //Success!
	}
	
	def decrypt(cipherText: String): Int = { //Function to decrypt any given string using the cipher
		val tmpText = cipherText.toUpperCase();
		for (i <- 0 to (tmpText.length - 1)){
			val tmpChar = tmpText.charAt(i);
			if ('A' <= tmpChar && tmpChar <= 'Z'){
				val tmpCharVal:Int = tmpChar % 'A';
				var tmpRes = tmpCharVal - shifts;
				if (tmpRes < 0) tmpRes += 26;
				else if (tmpRes > 25) tmpRes -= 26;
				tmpRes = (tmpRes % 26) + 'A';
				printf("%c", tmpRes); 
			}
			else if (tmpChar == ' ') printf(" ");
			else return 1; //We hit an unsupported character
		}
		return 0; //Success!
	}
	
	//The program accepts two arguments,
		//the mode - Encrypt, Decrypt
		//the cipher or the plain text
	def main(args: Array[String]): Unit = {
		printf("---------The Caesar Cipher---------\n");
	
		//First let's check whether we have the number of arguments required (that is 2)
		if (args.length == 2){
			if (args(0) == "encrypt"){ //User wants to encrypt
				printf("Encryption of \'%s\'; \n", args(1));
				if (encrypt(args(1)) == 0){
					printf("\n");
				}
				else{ //Encryption aborted due to an error in the string
					printf("\n\nERROR;\nThe input text consists unsupported character/s!\n");
					printf("The plain text to encrypt should ONLY consist of alphabetic characters or spaces.\n");				
				}
			}
			else if (args(0) == "decrypt"){ //User wants to decrypt
				printf("Decryption of \'%s\'; \n", args(1));
				if (decrypt(args(1)) == 0){
					printf("\n");
				}
				else{ //Decryption aborted due to an error in the string
					printf("\n\nERROR;\nThe input text consists unsupported character/s!\n");
					printf("The cipher text to decrypt should ONLY consist of alphabetic characters or spaces.\n");				
				}
			}
			else{
				printf("ERROR;\n\'%s\' is not recognized mode of operation!\n", args(0));
				printf("First argument should specify mode of operation;\n\ti.e. encrypt or decrypt\n");		
			}
		}
		else{
			printf("ERROR;\nRequired arugments not provided!\n\n");
			printf("First argument should specify mode of operation;\n\ti.e. encrypt or decrypt\n\n");
			printf("Second argument should specify plain text or cipher text;\n\te.g. caesar encrypt \"Hello World\"\n\t     caesar decrypt \"Ifmmp Xpsme\"\n");
		}
	}
}
//Reference on the Caesar Cipher is available at https://en.wikipedia.org/wiki/Caesar_cipher
