

import java.applet.Applet;
import java.applet.AudioClip;

public class Sound {

	public static final AudioClip BALL = Applet.newAudioClip(Sound.class.getResource("ball.wav"));
	public static final AudioClip GAMEOVER = Applet.newAudioClip(Sound.class.getResource("game_over.wav"));
	public static final AudioClip BACK = Applet.newAudioClip(Sound.class.getResource("music.wav"));

}