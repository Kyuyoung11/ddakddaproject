package dynamic_beat_2;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note extends Thread{
	private Image noteBasicImage = new ImageIcon(Main.class.getResource("../images/noteBasic.png"))
			.getImage();
	
	private int x,y = 580- (1000 /Main.SLEEP_TIME * Main.NOTE_SPEED) * Main.REACH_TIME; //노트가 생성되고 1초뒤에 판정라인 도착
	private String noteType;
	
	public Note(String noteType) {
		if(noteType.contentEquals("S")) {
			x=228;
		}
		else if(noteType.contentEquals("D")) {
			x=332;
		}
		else if(noteType.contentEquals("F")) {
			x=436;
		}
		else if(noteType.contentEquals("Space")) {
			x=540;
		}
		else if(noteType.contentEquals("J")) {
			x=744;
		}
		else if(noteType.contentEquals("K")) {
			x=848;
		}
		else if(noteType.contentEquals("L")) {
			x=952;
		}
		this.noteType=noteType;
	}
	
	public void screenDraw(Graphics2D g) {
		if(!noteType.equals("Space")) { //spacebar 제외 한 키
			g.drawImage(noteBasicImage, x, y, null);
		}
		else //spacebar인경우
		{
			g.drawImage(noteBasicImage, x, y, null);
			g.drawImage(noteBasicImage, x+100, y, null);
		}
	}
	
	public void drop() {
		y+= Main.NOTE_SPEED; 
	}
	
	@Override
	public void run() {
		try { 
			while(true) { //배열에 저장된 노트를 떨어트려줄거임
				drop();
				Thread.sleep(Main.SLEEP_TIME); //Sleeptime 만큼 쉬면서 떨어트림
			}
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	
}
