package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioFIle {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		File file =  new File("audioFile.wav"); 
		AudioInputStream ad = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(ad);
		String resp = "";
		while(!resp.equals("Q")){
			System.out.println("p = Play, s= Stop, q= Quit, r= Reset");
			System.out.println("Enter Choice:");
			resp = sc.next().toUpperCase();
			
			switch (resp) {
			case "P": clip.start();
				break;
			case "S": clip.stop();
				break;
			case "R":clip.setMicrosecondPosition(0);
				break;
			case "Q": clip.close();
				break;
			default: System.out.println("Not valid response");
				
			}
		}
		System.out.println("Byee");
		
	}

}
