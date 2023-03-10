package composition;

public class Smartphone {
	// Composition:
	  private Screen theScreen;
	  private Case theCase;
	  private Speaker theSpeaker;
	  private Microphone theMicrophone;
	 
	  public Smartphone(int pixelNumber, int width, int length, int depth, int maxSpeakerVolume, int maxMicVolume) {
		  this.theScreen = new Screen(pixelNumber, width, length, depth);
		  this.theSpeaker = new Speaker(maxSpeakerVolume);
		  this.theMicrophone = new Microphone(maxMicVolume);
		  this.theCase = new Case();
	  }
	  
	  
	  public Smartphone(Screen theScreen, Case theCase, 
	                    Speaker theSpeaker, Microphone theMicrophone) {
	    this.theScreen = theScreen;
	    this.theCase = theCase;
	    this.theSpeaker = theSpeaker;
	    this.theMicrophone = theMicrophone;
	  }
	 
	  public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, 
	                    int speakerCrtVol, int microMaxVol, int microCrtVol) {
	    this.theScreen = new Screen(pixelsNo, width, length, depth);
	    this.theCase = new Case();
	    this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
	    this.theMicrophone = new Microphone(microMaxVol, microCrtVol);
	  }
	 
	  public void pressVolumeUp() {
		  this.theCase.pressVolumeUp();
		  this.theSpeaker.increaseVolume();
	  }
	  
	  public void pressVolumeDown() {
		  this.theCase.pressVolumeDown();
		  this.theSpeaker.decreaseVolume();
	  }
	  
	  public void setPixel(int index, String color) {
		  this.theScreen.setPixel(index, color);
	  }
	  
	  public void colorScreen(String color) {
		  this.theScreen.colorScreen(color);
	  }
	  
	  public void increaseMicVol() {
		  this.theMicrophone.increaseVolume();
	  }
	  
	  public void muteMic() {
		  this.theMicrophone.muteMicrophone();
	  }
	  
	  public void setSilenceMode() {
		  this.theSpeaker.setSilenceMode();
	  }
}
