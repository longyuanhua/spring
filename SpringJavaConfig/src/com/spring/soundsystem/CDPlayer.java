package com.spring.soundsystem;

public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;
	
	public CDPlayer(CompactDisc sgtPeppers) {
		this.cd = sgtPeppers;
	}


	@Override
	public void play() {
		cd.play();
	}

	


}
