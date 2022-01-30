// Program to play Mp3 file format
// Requires "jl1.0.jar"

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

class Mp3Player {

    private String filename;
    private Player player;

    public Mp3Player(String filename) {
        this.filename = filename;
    }

    public void play() {
        try {
            BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(filename));
            player = new Player(buffer);
            player.play();
        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        Mp3Player mp3 = new Mp3Player("<example>.mp3");   //Edit this line.
        mp3.play();
    }
}
