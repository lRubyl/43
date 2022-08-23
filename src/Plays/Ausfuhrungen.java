package Plays;

/**
 * Diese Klasse führt alle Klassen aus , somit kann man viel leichter eine Klasse verbinden da man sie mit einer zeile aufruft
 */

import Audio.AudioGeschichte;
import GuiTest.MainFrame;
import GuiTest.Menu;
import GuiTest.SpielVerlassen;
import Scenen.Hauptmenu;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Ausfuhrungen {
    public static void mainframe(){
        MainFrame mainFrame = new MainFrame();
        mainFrame.mainFrame();
    }


    public static void musik() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        AudioGeschichte audio = new AudioGeschichte();
        audio.audio();
    }
    public static void audioGo() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        AudioGeschichte.audioRun(true);
    }



    public static void hauptmenu(){
        Hauptmenu hauptmenu = new Hauptmenu();
    }

    public static void menu(){
        Menu menu = new Menu();
        MainFrame.frame.setVisible(true);
        menu.addAll();
    }
    public static void spieleBeenden(){
        SpielVerlassen spielVerlassen = new SpielVerlassen();
    }
}
