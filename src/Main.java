import BilderManegment.Ladebildschirm;
import Plays.Ausfuhrungen;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {

        Ladebildschirm ladebildschirm = new Ladebildschirm();
        ladebildschirm.mainFrame();
        Thread.sleep(1000);
        ladebildschirm.schliessen();

        Ausfuhrungen.hauptmenu();
//        Ausfuhrungen.audioGo();
//        Ausfuhrungen.musik();
        Ausfuhrungen.mainframe();



    }

}
