// Program to play wav file format

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

class Wav_Player{
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException{
        Scanner scanner = new Scanner(System.in);

        File file = new File("monody.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();

        String response = scanner.next();
        
        scanner.close();
    } 
}