package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

	@Autowired
	private CompactDisc cd;
	
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	
	/*@Autowired
	public CDPlayer(CompactDisc cd) {
		super();
		this.cd = cd;
	}*/

	@Override
	public void play() {
		cd.play();
	}

	


}
