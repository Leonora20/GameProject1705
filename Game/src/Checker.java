//import java.awt.Color;
import java.awt.Graphics;

public class Checker {
	
	public int red11X;
	public int red11Y;
	public int red12X;
	public int red12Y;
	public int red13X;
	public int red13Y;
	public int red14X;
	public int red14Y;
	
	public int red21X;
	public int red21Y;
	public int red22X;
	public int red22Y;
	public int red23X;
	public int red23Y;
	public int red24X;
	public int red24Y;
	
	public int red31X;
	public int red31Y; 
	public int red32X;
	public int red32Y;
	public int red33X;
	public int red33Y;
	public int red34X;
	public int red34Y;
	
	public int blue11X;
	public int blue11Y;
	public int blue12X;
	public int blue12Y;
	public int blue13X;
	public int blue13Y;
	public int blue14X;
	public int blue14Y;
	
	public int blue21X;
	public int blue21Y;
	public int blue22X;
	public int blue22Y;
	public int blue23X;
	public int blue23Y;
	public int blue24X;
	public int blue24Y;
	
	public int blue31X;
	public int blue31Y;
	public int blue32X;
	public int blue32Y;
	public int blue33X;
	public int blue33Y;
	public int blue34X;
	public int blue34Y;
	
	public Checker() {
	}
	
	public void redChecker(Graphics g) {
	}
	public void blueChecker(Graphics g) {
	}
	
	public void checkerred11(Graphics g) {
		g.fillOval(red11X, red11Y, 70, 70);
	}
	public void checkerred12(Graphics g) {
		g.fillOval(red12X, red12Y, 70, 70);
	}
	public void checkerred13(Graphics g) {
		g.fillOval(red13X, red13Y, 70, 70);
	}
	public void checkerred14(Graphics g) {
		g.fillOval(red14X, red14Y, 70, 70);
	}
	
	public void checkerred21(Graphics g) {
		g.fillOval(red21X, red21Y, 70, 70);
	}
	public void checkerred22(Graphics g) {
		g.fillOval(red22X, red22Y, 70, 70);
	}
	public void checkerred23(Graphics g) {
		g.fillOval(red23X, red23Y, 70, 70);
	}
	public void checkerred24(Graphics g) {
		g.fillOval(red24X, red24Y, 70, 70);
	}
	
	public void checkerred31(Graphics g) {
		g.fillOval(red31X, red31Y, 70, 70);
	}
	public void checkerred32(Graphics g) {
		g.fillOval(red32X, red32Y, 70, 70);
	}
	public void checkerred33(Graphics g) {
		g.fillOval(red33X, red33Y, 70, 70);
	}
	public void checkerred34(Graphics g) {
		g.fillOval(red34X, red34Y, 70, 70);
	}
	
	public void checkerBlue11(Graphics g) {
		g.fillOval(blue11X, blue11Y, 70, 70);
	}
	public void checkerBlue12(Graphics g) {
		g.fillOval(blue12X, blue12Y, 70, 70);
	}
	public void checkerBlue13(Graphics g) {
		g.fillOval(blue13X, blue13Y, 70, 70);
	}
	public void checkerBlue14(Graphics g) {
		g.fillOval(blue14X, blue14Y, 70, 70);
	}
	
	public void checkerBlue21(Graphics g) {
		g.fillOval(blue21X, blue21Y, 70, 70);
	}
	public void checkerBlue22(Graphics g) {
		g.fillOval(blue22X, blue22Y, 70, 70);
	}
	public void checkerBlue23(Graphics g) {
		g.fillOval(blue23X, blue23Y, 70, 70);
	}
	public void checkerBlue24(Graphics g) {
		g.fillOval(blue24X, blue24Y, 70, 70);
	}
	
	public void checkerBlue31(Graphics g) {
		g.fillOval(blue31X, blue31Y, 70, 70);
	}
	public void checkerBlue32(Graphics g) {
		g.fillOval(blue32X, blue32Y, 70, 70);
	}
	public void checkerBlue33(Graphics g) {
		g.fillOval(blue33X, blue33Y, 70, 70);
	}
	public void checkerBlue34(Graphics g) {
		g.fillOval(blue34X, blue34Y, 70, 70);
	}

}



/*
import java.awt.Graphics;

public class Checker {
	
	public int white11X;
	public int white11Y;
	public int white12X;
	public int white12Y;
	public int white13X;
	public int white13Y;
	public int white14X;
	public int white14Y;
	
	public int white21X;
	public int white21Y;
	public int white22X;
	public int white22Y;
	public int white23X;
	public int white23Y;
	public int white24X;
	public int white24Y;
	
	public int white31X;
	public int white31Y; 
	public int white32X;
	public int white32Y;
	public int white33X;
	public int white33Y;
	public int white34X;
	public int white34Y;
	
	public int blue11X;
	public int blue11Y;
	public int blue12X;
	public int blue12Y;
	public int blue13X;
	public int blue13Y;
	public int blue14X;
	public int blue14Y;
	
	public int blue21X;
	public int blue21Y;
	public int blue22X;
	public int blue22Y;
	public int blue23X;
	public int blue23Y;
	public int blue24X;
	public int blue24Y;
	
	public int blue31X;
	public int blue31Y;
	public int blue32X;
	public int blue32Y;
	public int blue33X;
	public int blue33Y;
	public int blue34X;
	public int blue34Y;
	
	public Checker() {
	}
	
	public void whiteChecker(Graphics g) {
	}
	public void blueChecker(Graphics g) {
	}
	
	public void checkerWhite11(Graphics g) {
		g.fillOval(white11X, white11Y, 70, 70);
	}
	public void checkerWhite12(Graphics g) {
		g.fillOval(white12X, white12Y, 70, 70);
	}
	public void checkerWhite13(Graphics g) {
		g.fillOval(white13X, white13Y, 70, 70);
	}
	public void checkerWhite14(Graphics g) {
		g.fillOval(white14X, white14Y, 70, 70);
	}
	
	public void checkerWhite21(Graphics g) {
		g.fillOval(white21X, white21Y, 70, 70);
	}
	public void checkerWhite22(Graphics g) {
		g.fillOval(white22X, white22Y, 70, 70);
	}
	public void checkerWhite23(Graphics g) {
		g.fillOval(white23X, white23Y, 70, 70);
	}
	public void checkerWhite24(Graphics g) {
		g.fillOval(white24X, white24Y, 70, 70);
	}
	
	public void checkerWhite31(Graphics g) {
		g.fillOval(white31X, white31Y, 70, 70);
	}
	public void checkerWhite32(Graphics g) {
		g.fillOval(white32X, white32Y, 70, 70);
	}
	public void checkerWhite33(Graphics g) {
		g.fillOval(white33X, white33Y, 70, 70);
	}
	public void checkerWhite34(Graphics g) {
		g.fillOval(white34X, white34Y, 70, 70);
	}
	
	public void checkerBlue11(Graphics g) {
		g.fillOval(blue11X, blue11Y, 70, 70);
	}
	public void checkerBlue12(Graphics g) {
		g.fillOval(blue12X, blue12Y, 70, 70);
	}
	public void checkerBlue13(Graphics g) {
		g.fillOval(blue13X, blue13Y, 70, 70);
	}
	public void checkerBlue14(Graphics g) {
		g.fillOval(blue14X, blue14Y, 70, 70);
	}
	
	public void checkerBlue21(Graphics g) {
		g.fillOval(blue21X, blue21Y, 70, 70);
	}
	public void checkerBlue22(Graphics g) {
		g.fillOval(blue22X, blue22Y, 70, 70);
	}
	public void checkerBlue23(Graphics g) {
		g.fillOval(blue23X, blue23Y, 70, 70);
	}
	public void checkerBlue24(Graphics g) {
		g.fillOval(blue24X, blue24Y, 70, 70);
	}
	
	public void checkerBlue31(Graphics g) {
		g.fillOval(blue31X, blue31Y, 70, 70);
	}
	public void checkerBlue32(Graphics g) {
		g.fillOval(blue32X, blue32Y, 70, 70);
	}
	public void checkerBlue33(Graphics g) {
		g.fillOval(blue33X, blue33Y, 70, 70);
	}
	public void checkerBlue34(Graphics g) {
		g.fillOval(blue34X, blue34Y, 70, 70);
	}

}
*/
