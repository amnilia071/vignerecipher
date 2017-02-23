import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class AmaniVigCipherMain {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		Processor processor= new Processor();
		
		System.out.println("Text to encrypt");
		Scanner input= new Scanner(System.in);
		String txt= input.next();
		//System.out.println("You entered  " + txt);
		
		System.out.println("Enter the Secret key");
		Scanner keyIn= new Scanner(System.in);
		String key= keyIn.next();
		
		System.out.println("Encrypted-->");
		
		processor.encrypt(txt, key);
		System.out.println(" \n");
		
		System.out.println("Decrypted-->");
	
		processor.decrypt(txt, key);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	
	}

}
