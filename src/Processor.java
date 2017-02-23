
public class Processor {
	
	

	public void encrypt(String message, String key){
		
		int msgLen= message.length();
		int keyLen= key.length();
		String cipherTxt="";
		cipherTxt=cipherTxt.replaceAll("[^a-zA-Z0-9 ]+", "");
		String msg= message.toUpperCase();
		
		for(int i=0,j=0; i<msgLen;i++){
			
		char letter= msg.charAt(i);
		cipherTxt +=letter;
		cipherTxt+= (char)((letter + key.charAt(j)-2*'A') % 26+ 'A');
		j= ++j%key.length();	
		}
		
		System.out.println(cipherTxt);
	}


public void decrypt(String aText, String key){
	
	String result=" ";
	aText=aText.toUpperCase();
	aText=aText.replaceAll("[^a-zA-Z0-9 ]+", "");
	for(int i=0,j=0;i<aText.length();i++){
		char c=aText.charAt(i);
		result+= (char)((c-key.charAt(j)+26)% 26 + 'A');
		j=++j %key.length();
	}
	
	System.out.println(aText);

}


}