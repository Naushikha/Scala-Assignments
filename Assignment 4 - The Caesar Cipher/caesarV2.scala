//v2 - Uses Map Reduce to perform the cipher
object caesarV2{
	val shifts = 1; //Shifts can be configured within the app, by default this is set to '1'
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //This means that the alphabet can be configured as we wish, this is not possible in V1
	
	//There's an issue in the algorithm given in the slides... for an example if we were to decrypt "ABC" Scala would throw a string index out of range error

	val encrypt = (pt: String) => pt.map(c => if (c != ' ') alphabet((alphabet.indexOf(c.toUpper)+ shifts) % alphabet.size) else ' '); //We added proper support for spaces
	val decrypt = (ct: String) => ct.map(c => if (c != ' ') alphabet((alphabet.indexOf(c.toUpper)- shifts + 26) % alphabet.size) else ' ');//+26 ensures that String index stays in range
	
	//The program accepts two arguments,
		//the mode - Encrypt, Decrypt
		//the cipher or the plain text
	def main(args: Array[String]): Unit = {
		printf("---------The Caesar Cipher v2.0 (Using Map Reduce)---------\n");
	
		//First let's check whether we have the number of arguments required (that is 2)
		if (args.length == 2){
			if (args(0) == "encrypt"){ //User wants to encrypt
				printf("Encryption of \'%s\'; \n", args(1));
				printf("%s \n", encrypt(args(1)));
			}
			else if (args(0) == "decrypt"){ //User wants to decrypt
				printf("Decryption of \'%s\'; \n", args(1));
				printf("%s \n", decrypt(args(1)));
			}
			else{
				printf("ERROR;\n\'%s\' is not recognized mode of operation!\n", args(0));
				printf("First argument should specify mode of operation;\n\ti.e. encrypt or decrypt\n");		
			}
		}
		else{
			printf("ERROR;\nRequired arugments not provided!\n\n");
			printf("First argument should specify mode of operation;\n\ti.e. encrypt or decrypt\n\n");
			printf("Second argument should specify plain text or cipher text;\n\te.g. caesarV2 encrypt \"Hello World\"\n\t     caesarV2 decrypt \"IfmmpaXpsme\"\n");
		}
	}
}
