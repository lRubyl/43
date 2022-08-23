package Audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AudioGeschichte {


    public static boolean audiorun1;

    public static void audioRun(boolean audiorun) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        if (audiorun){
            File file = new File("Audio/m1.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } else {
            System.out.println("audio sollte aus sein");
        }
        }

    public void audio() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        audioRun(audiorun1);


    }
}





