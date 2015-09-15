package nebulus;

public class Nebulus {

	public static void main(String[] args) {
    String say = "Hello World, My name is Boris!";
	voce.SpeechInterface.init("C:\\Users\\RobertCyber\\git\\nebulus\\voce-0.9.1\\lib", true, true, "", "");
	voce.SpeechInterface.setRecognizerEnabled(true);
	voce.SpeechInterface.synthesize(say);
	
	while (voce.SpeechInterface.getRecognizerQueueSize() > 0)
	{
		String s = voce.SpeechInterface.popRecognizedString();
		System.out.println("You said: " + s);
	}
		
	}

}
