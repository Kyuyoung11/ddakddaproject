package dynamic_beat_2;
//���ӿ� ���� ��Ʈ�� �۾�

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
	
	ArrayList<Note> noteList = new ArrayList<Note>(); //�� note�� ������ �迭
	
	public Game(String titleName, String musicTitle) {
		this.titleName = titleName;
		this.musicTitle=musicTitle;
		gameMusic = new Music(this.musicTitle, false); //�ѹ��� ����
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
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON); //�ؽ�Ʈ ���� �����
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString(titleName, 20, 702); //���� �� �̸� 
		
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
			int StartTime=4460-Main.REACH_TIME *1000;
			int gap=300;
			beats=new Beat[]{
					new Beat(StartTime+gap *2,"S"),
		            new Beat(StartTime+gap *4,"Space"),
		            new Beat(StartTime+gap *6,"L"),
		            new Beat(StartTime+gap *10,"S"),
		            new Beat(StartTime+gap *12,"Space"),
		            new Beat(StartTime+gap *14,"L"),

		            new Beat(StartTime+gap *16,"F"),
		            new Beat(StartTime+gap *19,"D"),
		            new Beat(StartTime+gap *22,"S"),
		            new Beat(StartTime+gap *24,"J"),
		            new Beat(StartTime+gap *26,"K"),
		            new Beat(StartTime+gap *30,"L"),
		            
		            new Beat(StartTime+gap *33,"Space"),

		            //두번째
		            new Beat(StartTime+gap *42,"S"),
		            new Beat(StartTime+gap *44,"Space"),
		            new Beat(StartTime+gap *46,"L"),
		            new Beat(StartTime+gap *50,"S"),
		            new Beat(StartTime+gap *52,"Space"),
		            new Beat(StartTime+gap *54,"L"),
		            
		            new Beat(StartTime+gap *58,"D"),
		            new Beat(StartTime+gap *60,"Space"),
		            new Beat(StartTime+gap *62,"K"),
		            new Beat(StartTime+gap *66,"D"),
		            new Beat(StartTime+gap *68,"Space"),
		            new Beat(StartTime+gap *70,"K"),

		            new Beat(StartTime+gap *72,"F"),
		            new Beat(StartTime+gap *75,"D"),
		            new Beat(StartTime+gap *78,"S"),
		            new Beat(StartTime+gap *80,"J"),
		            new Beat(StartTime+gap *82,"K"),
		            new Beat(StartTime+gap *86,"L"),
		            
		            new Beat(StartTime+gap *89,"Space"),
		            
		            new Beat(StartTime+gap *98,"S"),
		            new Beat(StartTime+gap *100,"Space"),
		            new Beat(StartTime+gap *102,"L"),
		            new Beat(StartTime+gap *106,"S"),
		            new Beat(StartTime+gap *108,"Space"),
		            new Beat(StartTime+gap *110,"L"),
		            
		            new Beat(StartTime+gap *114,"D"),
		            new Beat(StartTime+gap *116,"Space"),
		            new Beat(StartTime+gap *118,"K"),
		            new Beat(StartTime+gap *122,"D"),
		            new Beat(StartTime+gap *124,"Space"),
		            new Beat(StartTime+gap *126,"K"),

		            new Beat(StartTime+gap *128,"F"),
		            new Beat(StartTime+gap *131,"D"),
		            new Beat(StartTime+gap *134,"S"),
		            new Beat(StartTime+gap *136,"J"),
		            new Beat(StartTime+gap *138,"K"),
		            new Beat(StartTime+gap *142,"L"),
		            
		            new Beat(StartTime+gap *145,"Space"),
		            
		            new Beat(StartTime+gap *154,"S"),
		            new Beat(StartTime+gap *156,"Space"),
		            new Beat(StartTime+gap *158,"L"),
		            new Beat(StartTime+gap *162,"S"),
		            new Beat(StartTime+gap *164,"Space"),
		            new Beat(StartTime+gap *166,"L"),
		            
		            new Beat(StartTime+gap *170,"D"),
		            new Beat(StartTime+gap *172,"Space"),
		            new Beat(StartTime+gap *174,"K"),
		            new Beat(StartTime+gap *178,"D"),
		            new Beat(StartTime+gap *180,"Space"),
		            new Beat(StartTime+gap *182,"K"),

		            new Beat(StartTime+gap *184,"F"),
		            new Beat(StartTime+gap *187,"D"),
		            new Beat(StartTime+gap *190,"S"),
		            new Beat(StartTime+gap *192,"J"),
		            new Beat(StartTime+gap *194,"K"),
		            new Beat(StartTime+gap *198,"L"),
		            
		            new Beat(StartTime+gap *201,"Space"),
		            
		            new Beat(StartTime+gap *210,"S"),
		            new Beat(StartTime+gap *212,"Space"),
		            new Beat(StartTime+gap *214,"L"),
		            new Beat(StartTime+gap *218,"S"),
		            new Beat(StartTime+gap *220,"Space"),
		            new Beat(StartTime+gap *222,"L"),
		            
		            new Beat(StartTime+gap *226,"D"),
		            new Beat(StartTime+gap *228,"Space"),
		            new Beat(StartTime+gap *230,"K"),
		            new Beat(StartTime+gap *234,"D"),  
		            new Beat(StartTime+gap *236,"Space"),
		            new Beat(StartTime+gap *238,"K"),

		            new Beat(StartTime+gap *240,"F"),
		            new Beat(StartTime+gap *243,"D"),
		            new Beat(StartTime+gap *246,"S"),
		            new Beat(StartTime+gap *248,"J"),
		            new Beat(StartTime+gap *250,"K"),
		            new Beat(StartTime+gap *254,"L"),
		            
		            new Beat(StartTime+gap *257,"Space")
			};

		}
		else if(titleName.equals("Starman")) {
			int gap=300;
			int StartTime=1000;
			beats=new Beat[]{
					new Beat(StartTime,"K"),
		            new Beat(StartTime+gap*5,"D"),
		            new Beat(StartTime+gap*7,"J"),
		            new Beat(StartTime+gap*9,"S"),
		            new Beat(StartTime+gap*11,"F"),
		            new Beat(StartTime+gap*13,"Space"),
		            
		            //두번쨰
		            new Beat(StartTime+gap*15,"K"),
		            new Beat(StartTime+gap*19,"D"),
		            new Beat(StartTime+gap*21,"J"),
		            new Beat(StartTime+gap*23,"S"),
		            new Beat(StartTime+gap*26,"F"),
		            new Beat(StartTime+gap*28,"Space"),
		            
		            new Beat(StartTime+gap*30,"K"),
		            new Beat(StartTime+gap*34,"D"),
		            new Beat(StartTime+gap*36,"J"),
		            new Beat(StartTime+gap*38,"S"),
		            new Beat(StartTime+gap*41,"F"),
		            new Beat(StartTime+gap*43,"Space"),
		            
		            new Beat(StartTime+gap*45,"K"),
		            new Beat(StartTime+gap*49,"D"),
		            new Beat(StartTime+gap*51,"J"),
		            new Beat(StartTime+gap*53,"S"),
		            new Beat(StartTime+gap*56,"F"),
		            new Beat(StartTime+gap*58,"Space"),
		            
		            new Beat(StartTime+gap*60,"K"),
		            new Beat(StartTime+gap*64,"D"),
		            new Beat(StartTime+gap*66,"J"),
		            new Beat(StartTime+gap*68,"S"),
		            new Beat(StartTime+gap*71,"F"),
		            new Beat(StartTime+gap*73,"Space"),
		            
		            new Beat(StartTime+gap*75,"K"),
		            new Beat(StartTime+gap*79,"D"),
		            new Beat(StartTime+gap*81,"J"),
		            new Beat(StartTime+gap*83,"S"),
		            new Beat(StartTime+gap*86,"F"),
		            new Beat(StartTime+gap*88,"Space"),
		            
		            new Beat(StartTime+gap*90,"K"),
		            new Beat(StartTime+gap*94,"D"),
		            new Beat(StartTime+gap*96,"J"),
		            new Beat(StartTime+gap*98,"S"),
		            new Beat(StartTime+gap*101,"F"),
		            new Beat(StartTime+gap*103,"Space"),
		            
		            new Beat(StartTime+gap*105,"K"),
		            new Beat(StartTime+gap*109,"D"),
		            new Beat(StartTime+gap*111,"J"),
		            new Beat(StartTime+gap*113,"S"),
		            new Beat(StartTime+gap*116,"F"),
		            new Beat(StartTime+gap*118,"Space"),
		            
		            new Beat(StartTime+gap*120,"K"),
		            new Beat(StartTime+gap*124,"D"),
		            new Beat(StartTime+gap*126,"J"),
		            new Beat(StartTime+gap*128,"S"),
		            new Beat(StartTime+gap*131,"F"),
		            new Beat(StartTime+gap*133,"Space"),
		            
		            new Beat(StartTime+gap*135,"K"),
		            new Beat(StartTime+gap*139,"D"),
		            new Beat(StartTime+gap*141,"J"),
		            new Beat(StartTime+gap*143,"S"),
		            new Beat(StartTime+gap*146,"F"),
		            new Beat(StartTime+gap*148,"Space"),
		            //스타맨
		            new Beat(StartTime+gap*150,"K"),
		            new Beat(StartTime+gap*154,"D"),
		            new Beat(StartTime+gap*156,"J"),
		            new Beat(StartTime+gap*158,"S"),
		            new Beat(StartTime+gap*161,"F"),
		            new Beat(StartTime+gap*163,"Space"),
		            
		            new Beat(StartTime+gap*165,"K"),
		            new Beat(StartTime+gap*169,"D"),
		            new Beat(StartTime+gap*171,"J"),
		            new Beat(StartTime+gap*173,"S"),
		            new Beat(StartTime+gap*176,"F"),
		            new Beat(StartTime+gap*178,"Space"),
		            
		            new Beat(StartTime+gap*180,"K"),
		            new Beat(StartTime+gap*184,"D"),
		            new Beat(StartTime+gap*186,"J"),
		            new Beat(StartTime+gap*188,"S"),
		            new Beat(StartTime+gap*191,"F"),
		            new Beat(StartTime+gap*193,"Space")

			};

		}
		//else if(titleName.equals("Over World")) {
		//	int startTime = 1000;
		//	beats = new Beat[] {
		//			new Beat(startTime, "Space"),
		//	};
		//}
		
		
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
