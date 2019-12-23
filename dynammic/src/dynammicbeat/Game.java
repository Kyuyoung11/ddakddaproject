package dynammicbeat;
//게임에 대한 컨트롤 작업

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Game extends Thread {
	
	
	private Image noteRouteLineImage = new ImageIcon(Main.class.getResource("../images/noteRouteLine.png"))
			.getImage();
	private Image gameInfoImage = new ImageIcon(Main.class.getResource("../images/gameinfo.png"))
			.getImage();
	private Image judgementLineImage = new ImageIcon(Main.class.getResource("../images/judgementLine.png"))
			.getImage();
	
	private Image noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
			.getImage();
	private Image noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
			.getImage();
	private Image noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
			.getImage();
	private Image noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRouteSpace.png"))
			.getImage();
	private Image noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRouteSpace2.png"))
			.getImage();
	private Image noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
			.getImage();
	private Image noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
			.getImage();
	private Image noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png"))
			.getImage();
	
	private String titleName;
	private String musicTitle;
	private Music gameMusic;
	
	ArrayList<Note> noteList = new ArrayList<Note>(); //각 note를 저장할 배열
	
	public Game(String titleName, String musicTitle) {
		this.titleName = titleName;
		this.musicTitle=musicTitle;
		gameMusic = new Music(this.musicTitle, false); //한번만 실행
	}
	
	public void screenDraw(Graphics2D g) {
		g.drawImage(noteRouteSImage, 228, 30, null);
		g.drawImage(noteRouteDImage, 332, 30, null);
		g.drawImage(noteRouteFImage, 436, 30, null);
		g.drawImage(noteRouteSpace1Image, 540, 30, null);
		g.drawImage(noteRouteSpace2Image, 640, 30, null);
		g.drawImage(noteRouteJImage, 744, 30, null);
		g.drawImage(noteRouteKImage, 848, 30, null);
		g.drawImage(noteRouteLImage, 952, 30, null);
		
		g.drawImage(noteRouteLineImage, 224, 30, null);
		g.drawImage(noteRouteLineImage, 328, 30, null);
		g.drawImage(noteRouteLineImage, 432, 30, null);
		g.drawImage(noteRouteLineImage, 536, 30, null);
		g.drawImage(noteRouteLineImage, 740, 30, null);
		g.drawImage(noteRouteLineImage, 844, 30, null);
		g.drawImage(noteRouteLineImage, 948, 30, null);
		g.drawImage(noteRouteLineImage, 1052, 30, null);
		
		
		g.drawImage(gameInfoImage, 0, 660, null);
		g.drawImage(judgementLineImage, 0, 580, null);
		
		for(int i=0; i<noteList.size(); i++)
		{
			Note note = noteList.get(i);
			note.screenDraw(g);
		}
		
		g.setColor(Color.white);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON); //텍스트 깨짐 사라짐
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString(titleName, 20, 702); //현재 곡 이름 
		
		g.setFont(new Font("Arial", Font.PLAIN, 26));
		g.setColor(Color.DARK_GRAY);
		g.drawString("S", 270, 609);
		g.drawString("D", 374, 609);
		g.drawString("F", 478, 609);
		g.drawString("Space Bar", 580, 609);
		g.drawString("J", 784, 609);
		g.drawString("K", 889, 609);
		g.drawString("L", 993, 609);
		g.setColor(Color.LIGHT_GRAY);
		g.setFont(new Font("Elephant",Font.BOLD, 30));
		g.drawString("00000", 565, 702);
		
		
	}
	
	public void pressS() {
		noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("dSmall.mp3",false).start();
	}
	public void releaseS() {
		noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	public void pressD() {
		noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("dSmall.mp3",false).start();
	}
	public void releaseD() {
		noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	public void pressF() {
		noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("dSmall.mp3",false).start();
	}
	public void releaseF() {
		noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	public void pressSpace() {
		noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressedSpace.png")).getImage();
		noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoutePressedSpace2.png")).getImage();
		new Music("dSmall.mp3",false).start();

	}
	public void releaseSpace() {
		noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRouteSpace.png")).getImage();
		noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRouteSpace2.png")).getImage();

	}
	
	public void pressJ() {
		noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("dSmall.mp3",false).start();
	}
	public void releaseJ() {
		noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	public void pressK() {
		noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("dSmall.mp3",false).start();
	}
	public void releaseK() {
		noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	public void pressL() {
		noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();
		new Music("dSmall.mp3",false).start();
	}
	public void releaseL() {
		noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	@Override
	public void run() {
		dropNotes();
	}
	
	public void close() {
		gameMusic.close();
		this.interrupt(); 
	}
	
	public void dropNotes() {
		Beat[] beats = null;
		if(titleName.equals("Under World")) {
			int StartTime=3500-Main.REACH_TIME *1000;
			int gap=225;
			beats=new Beat[]{

				
			};

		}
		else if(titleName.equals("Starman")) {
			int StartTime=3500-Main.REACH_TIME *1000;
			int gap=214;
			beats=new Beat[]{
				
				
				
				
			};

		}
		else if(titleName.equals("Over World")) {
			int startTime=4460-Main.REACH_TIME *1000;
			int gap=220;
			beats = new Beat[] {
					new Beat(startTime + gap *4,"K"),
					new Beat(startTime + gap *6,"D"),
					new Beat(startTime + gap *8,"S"),
					//new Beat(startTime + gap *9,"D"),//+1
					new Beat(startTime + gap *12,"S"),//+3
					//new Beat(startTime + gap *14,"D"),
					new Beat(startTime + gap *16,"J"),
					new Beat(startTime + gap *16,"F"),
					new Beat(startTime + gap *18,"Space"),
					
					new Beat(startTime + gap *20,"K"),
					new Beat(startTime + gap *22,"D"),
					new Beat(startTime + gap *24,"S"),
					//new Beat(startTime + gap *25,"D"),//+1
					new Beat(startTime + gap *28,"S"),//+3
					//new Beat(startTime + gap *29,"D"),//+1
					new Beat(startTime + gap *30,"J"),//+1
					new Beat(startTime + gap *30,"F"),
					new Beat(startTime + gap *32,"Space"),//+1
					
					new Beat(startTime + gap *36,"K"),
					new Beat(startTime + gap *38,"D"),
					new Beat(startTime + gap *40,"S"),
					//new Beat(startTime + gap *41,"D"),
					new Beat(startTime + gap *44,"F"),
					//new Beat(startTime + gap *46,"D"),
					new Beat(startTime + gap *48,"K"),
					new Beat(startTime + gap *50,"Space"),
					
					new Beat(startTime + gap *52,"K"),
					new Beat(startTime + gap *54,"D"),
					new Beat(startTime + gap *56,"S"),
					//new Beat(startTime + gap *57,"D"),//+1
					new Beat(startTime + gap *60,"S"),//+3
					//new Beat(startTime + gap *61,"D"),//+1
					//new Beat(startTime + gap *62,"L"),//+1
					//new Beat(startTime + gap *60,"K"),//+1
					new Beat(startTime + gap *62,"D"),
					//new Beat(startTime + gap *64,"J"),//+1
					new Beat(startTime + gap *64,"Space"),//+1
					
					new Beat(startTime + gap *69,"K"),
					new Beat(startTime + gap *71,"D"),
					new Beat(startTime + gap *73,"K"),
					new Beat(startTime + gap *75,"D"),
					new Beat(startTime + gap *77,"L"),
					//new Beat(startTime + gap *78,"K"),
					//new Beat(startTime + gap *79,"J"),
					new Beat(startTime + gap *80,"Space"),
					//new Beat(startTime + gap *81,"J"),
					
					new Beat(startTime + gap *85,"K"),
					new Beat(startTime + gap *87,"D"),
					new Beat(startTime + gap *89,"K"),
					new Beat(startTime + gap *91,"D"),
					new Beat(startTime + gap *93,"L"),
					//new Beat(startTime + gap *94,"K"),
					//new Beat(startTime + gap *95,"J"),
					new Beat(startTime + gap *95,"Space"),
					
					new Beat(startTime + gap *102,"K"),
					new Beat(startTime + gap *104,"D"),
					//new Beat(startTime + gap *106,"S"),
					new Beat(startTime + gap *108,"D"),
					//new Beat(startTime + gap *109,"K"),
					new Beat(startTime + gap *110,"F"),
					new Beat(startTime + gap *112,"Space"),
					
					new Beat(startTime + gap *117,"J"),
					new Beat(startTime + gap *118,"F"),
					new Beat(startTime + gap *119,"J"),
					new Beat(startTime + gap *120,"F"),
					new Beat(startTime + gap *121,"L"),
					new Beat(startTime + gap *124,"F"),
					new Beat(startTime + gap *124,"J"),
					new Beat(startTime + gap *126,"Space"),
					
					new Beat(startTime + gap *134,"K"),
					new Beat(startTime + gap *137,"S"),
					new Beat(startTime + gap *140,"L"),
					new Beat(startTime + gap *143,"D"),
					new Beat(startTime + gap *146,"K"),
					new Beat(startTime + gap *149,"F"),
					new Beat(startTime + gap *152,"L"),
					new Beat(startTime + gap *155,"S"),
					new Beat(startTime + gap *158,"J"),
					//new Beat(startTime + gap *152,"D"),
					//new Beat(startTime + gap *154,"K"),
					//new Beat(startTime + gap *156,"F"),
					//new Beat(startTime + gap *158,"S"),
					//new Beat(startTime + gap *160,"L"),
					//new Beat(startTime + gap *162,"D"),
					
					new Beat(startTime + gap *166,"K"),
					new Beat(startTime + gap *168,"D"),
					new Beat(startTime + gap *170,"L"),
					new Beat(startTime + gap *172,"S"),
					new Beat(startTime + gap *174,"K"),
					//new Beat(startTime + gap *176,"D"),
					new Beat(startTime + gap *176,"L"),
					new Beat(startTime + gap *178,"Space"),
					
					new Beat(startTime + gap *182,"K"),
					new Beat(startTime + gap *184,"D"),
					new Beat(startTime + gap *186,"S"),
					//new Beat(startTime + gap *9,"D"),//+1
					new Beat(startTime + gap *190,"S"),//+3
					//new Beat(startTime + gap *14,"D"),
					new Beat(startTime + gap *194,"J"),
					new Beat(startTime + gap *194,"F"),
					new Beat(startTime + gap *196,"Space"),
					
					new Beat(startTime + gap *199,"K"),
					new Beat(startTime + gap *201,"D"),
					new Beat(startTime + gap *203,"S"),
					//new Beat(startTime + gap *25,"D"),//+1
					new Beat(startTime + gap *207,"S"),//+3
					//new Beat(startTime + gap *29,"D"),//+1
					new Beat(startTime + gap *209,"J"),//+1
					new Beat(startTime + gap *209,"F"),
					new Beat(startTime + gap *211,"Space"),//+1
					
					new Beat(startTime + gap *215,"K"),
					new Beat(startTime + gap *217,"D"),
					new Beat(startTime + gap *219,"S"),
					//new Beat(startTime + gap *41,"D"),
					new Beat(startTime + gap *223,"F"),
					//new Beat(startTime + gap *46,"D"),
					new Beat(startTime + gap *227,"K"),
					new Beat(startTime + gap *229,"Space"),
					
					new Beat(startTime + gap *231,"K"),
					new Beat(startTime + gap *233,"D"),
					new Beat(startTime + gap *235,"S"),
					//new Beat(startTime + gap *57,"D"),//+1
					new Beat(startTime + gap *239,"S"),//+3
					//new Beat(startTime + gap *61,"D"),//+1
					//new Beat(startTime + gap *62,"L"),//+1
					//new Beat(startTime + gap *60,"K"),//+1
					new Beat(startTime + gap *241,"D"),
					//new Beat(startTime + gap *64,"J"),//+1
					new Beat(startTime + gap *243,"Space"),//+1
					
					new Beat(startTime + gap *248,"K"),
					new Beat(startTime + gap *250,"D"),
					new Beat(startTime + gap *251,"K"),
					new Beat(startTime + gap *253,"D"),
					new Beat(startTime + gap *255,"L"),
					//new Beat(startTime + gap *78,"K"),
					//new Beat(startTime + gap *79,"J"),
					new Beat(startTime + gap *258,"Space"),
					//new Beat(startTime + gap *81,"J"),
					
					new Beat(startTime + gap *264,"K"),
					new Beat(startTime + gap *266,"D"),
					new Beat(startTime + gap *268,"K"),
					new Beat(startTime + gap *270,"D"),
					new Beat(startTime + gap *272,"L"),
					//new Beat(startTime + gap *94,"K"),
					//new Beat(startTime + gap *95,"J"),
					new Beat(startTime + gap *274,"Space"),
					
					new Beat(startTime + gap *281,"K"),
					new Beat(startTime + gap *283,"D"),
					//new Beat(startTime + gap *106,"S"),
					new Beat(startTime + gap *287,"D"),
					//new Beat(startTime + gap *109,"K"),
					new Beat(startTime + gap *289,"F"),
					new Beat(startTime + gap *291,"Space"),
					
					new Beat(startTime + gap *296,"J"),
					new Beat(startTime + gap *297,"F"),
					new Beat(startTime + gap *298,"J"),
					new Beat(startTime + gap *299,"F"),
					new Beat(startTime + gap *300,"L"),
					new Beat(startTime + gap *303,"F"),
					new Beat(startTime + gap *303,"J"),
					new Beat(startTime + gap *305,"Space"),
					
					new Beat(startTime + gap *312,"K"),
					new Beat(startTime + gap *315,"S"),
					new Beat(startTime + gap *318,"L"),
					new Beat(startTime + gap *321,"D"),
					new Beat(startTime + gap *324,"K"),
					new Beat(startTime + gap *327,"F"),
					new Beat(startTime + gap *330,"L"),
					new Beat(startTime + gap *333,"S"),
					new Beat(startTime + gap *336,"J")
					//new Beat(startTime + gap *152,"D"),
					//new Beat(startTime + gap *154,"K"),
					//new Beat(startTime + gap *156,"F"),
					//new Beat(startTime + gap *158,"S"),
					//new Beat(startTime + gap *160,"L"),
					//new Beat(startTime + gap *162,"D"),
			};
		}
		
		
		int i = 0;
		gameMusic.start();
		while(i<beats.length && !isInterrupted()) {
			boolean dropped = false;
			if(beats[i].getTime() <=gameMusic.getTime()) {
				Note note = new Note(beats[i].getNoteName());
				note.start();
				noteList.add(note);
				i++;
				dropped = true;
			}
			if(!dropped) {
				try {
					Thread.sleep(5);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
