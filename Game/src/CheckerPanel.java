import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class CheckerPanel extends JPanel implements MouseMotionListener, MouseListener {

	
	private static final long serialVersionUID = 1L;
	
	public Checker checker;
	public Colision col;
	
	boolean highlight11=false;
	boolean highlight12=false;
	boolean highlight13=false;
	boolean highlight14=false;
	
	boolean highlight21=false;
	boolean highlight22=false;
	boolean highlight23=false;
	boolean highlight24=false;
	
	boolean highlight31=false;
	boolean highlight32=false;
	boolean highlight33=false;
	boolean highlight34=false;
	
	/*boolean highlight41=false;
	boolean highlight42=false;
	boolean highlight43=false;
	boolean highlight44=false;
	
	boolean highlight51=false;
	boolean highlight52=false;
	boolean highlight53=false;
	boolean highlight54=false;*/
	
	boolean highlight61=false;
	boolean highlight62=false;
	boolean highlight63=false;
	boolean highlight64=false;
	
	boolean highlight71=false;
	boolean highlight72=false;
	boolean highlight73=false;
	boolean highlight74=false;
	
	boolean highlight81=false;
	boolean highlight82=false;
	boolean highlight83=false;
	boolean highlight84=false;
	
	boolean square11=false;
	boolean square12=false;
	boolean square13=false;
	boolean square14=false;
	
	boolean square21=false;
	boolean square22=false;
	boolean square23=false;
	boolean square24=false;
	
	boolean square31=false;
	boolean square32=false;
	boolean square33=false;
	boolean square34=false;
	
	boolean square61=false;
	boolean square62=false;
	boolean square63=false;
	boolean square64=false;
	
	boolean square71=false;
	boolean square72=false;
	boolean square73=false;
	boolean square74=false;
	
	boolean square81=false;
	boolean square82=false;
	boolean square83=false;
	boolean square84=false;
	
	public int X11=87; 
	public boolean moved11= false;
	public int Y11=33;
	public int X12=246;
	public int Y12=33;
	public int X13=487;
	public int Y13=33;
	public int X14=566;
	public int Y14=33;
	
	public int X21=6;
	public int Y21=110;
	public int X22=166;
	public int Y22=110;
	public int X23=327;
	public int Y23=110;
	public int X24=487;
	public int Y24=110;
	
	public int X31=88;
	public int Y31=190;
	public int X32=246;
	public int Y32=190;
	public int X33=407;
	public int Y33=190;
	public int X34=566;
	public int Y34=190;
	
	/*public int X41=6;
	public int Y41=270;
	public int X42=166;
	public int Y42=110;
	public int X43=327;
	public int Y43=110;
	public int X44=487;
	public int Y44=110;
	
	public int X51=6;
	public int Y51=350;
	public int X52=166;
	public int Y52=350;
	public int X53=327;
	public int Y53=350;
	public int X54=487;
	public int Y54=350;*/
	
	public int X61=6;
	public int Y61=430;
	public int X62=166;
	public int Y62=430;
	public int X63=327;
	public int Y63=430;
	public int X64=487;
	public int Y64=430;
	
	public int X71=88;
	public int Y71=510;
	public int X72=246;
	public int Y72=510;
	public int X73=407;
	public int Y73=510;
	public int X74=566;
	public int Y74=510;
	
	public int X81=6;
	public int Y81=590;
	public int X82=166;
	public int Y82=590;
	public int X83=327;
	public int Y83=590;
	public int X84=487;
	public int Y84=590;
	
	public CheckerPanel() {
		checker = new Checker();
		col = new Colision();
		
		checker.red11X=X11;	checker.red11Y=Y11;
		col.coin11X=X11;	col.coin11Y=Y11;
		checker.red12X=X12;	checker.red12Y=Y12;
		col.coin13X=X12;	col.coin13Y=Y12;
		checker.red13X=X13;	checker.red13Y=Y13;
		col.coin15X=X13;	col.coin15Y=Y13;
		checker.red14X=X14;	checker.red14Y=Y14;
		col.coin17X=X14;	col.coin17Y=Y14;
		
		checker.red21X=X21;	checker.red21Y=Y21;
		col.coin21X=X21;	col.coin21Y=Y21;
		checker.red22X=X22;	checker.red22Y=Y22;
		col.coin24X=X22;	col.coin24Y=Y22;
		checker.red23X=X23;	checker.red23Y=Y23;
		col.coin26X=X23;	col.coin26Y=Y23;
		checker.red24X=X24;	checker.red24Y=Y24;
		col.coin28X=X24;	col.coin28Y=Y24;
		
		checker.red31X=X31;	checker.red31Y=Y31;
		col.coin31X=X31;	col.coin31Y=Y31;
		checker.red32X=X32;	checker.red32Y=Y32;
		col.coin33X=X32;	col.coin33Y=Y32;
		checker.red33X=X33;	checker.red33Y=Y33;
		col.coin35X=X33;	col.coin35Y=Y33;
		checker.red34X=X34;	checker.red34Y=Y34;
		col.coin37X=X34;	col.coin37Y=Y34;
		
		checker.blue11X=X61;	checker.blue11Y=Y61;
		col.coin62X=X61;	col.coin62Y=Y61;
		checker.blue12X=X62;	checker.blue12Y=Y62;
		col.coin64X=X62;	col.coin64Y=Y62;
		checker.blue13X=X63;	checker.blue13Y=Y63;
		col.coin66X=X63;	col.coin66Y=Y63;
		checker.blue14X=X64;	checker.blue14Y=Y64;
		col.coin68X=X64;	col.coin68Y=Y64;
		
		checker.blue21X=X71;	checker.blue21Y=Y71;
		col.coin71X=X71;	col.coin71Y=Y71;
		checker.blue22X=X72;	checker.blue22Y=Y72;
		col.coin73X=X72;	col.coin73Y=Y72;
		checker.blue23X=X73;	checker.blue23Y=Y73;
		col.coin75X=X73;	col.coin75Y=Y73;
		checker.blue24X=X74;	checker.blue24Y=Y74;
		col.coin77X=X74;	col.coin77Y=Y74;
		
		checker.blue31X=X81;	checker.blue31Y=Y81;
		col.coin82X=X81;	col.coin82Y=Y81;
		checker.blue32X=X82;	checker.blue32Y=Y82;
		col.coin84X=X82;	col.coin84Y=Y82;
		checker.blue33X=X83;	checker.blue33Y=Y83;
		col.coin86X=X83;	col.coin86Y=Y83;
		checker.blue34X=X84;	checker.blue34Y=Y84;
		col.coin88X=X84;	col.coin88Y=Y84;
		
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.black);
		g.fillRect(0, 0, 660, 700);
		g.setColor(Color.lightGray);
		g.fillRect(660, 0, 700, 700);
		g.setColor(Color.white); //red
		g.fillRect(2, 26, 80, 80);
		g.fillRect(162, 26, 80, 80);
		g.fillRect(322, 26, 80, 80);
		g.fillRect(482, 26, 80, 80);
		
		g.fillRect(82, 106, 80, 80);
		g.fillRect(242, 106, 80, 80);
		g.fillRect(402, 106, 80, 80);
		g.fillRect(562, 106, 80, 80);
		
		g.fillRect(2, 186, 80, 80);
		g.fillRect(162, 186, 80, 80);
		g.fillRect(322, 186, 80, 80);
		g.fillRect(482, 186, 80, 80);
		
		g.fillRect(82, 266, 80, 80);
		g.fillRect(242, 266, 80, 80);
		g.fillRect(402, 266, 80, 80);
		g.fillRect(562, 266, 80, 80);
		
		g.fillRect(2, 346, 80, 80);
		g.fillRect(162, 346, 80, 80);
		g.fillRect(322, 346, 80, 80);
		g.fillRect(482, 346, 80, 80);
		
		g.fillRect(82, 426, 80, 80);
		g.fillRect(242, 426, 80, 80);
		g.fillRect(402, 426, 80, 80);
		g.fillRect(562, 426, 80, 80);
		
		g.fillRect(2, 506, 80, 80);
		g.fillRect(162, 506, 80, 80);
		g.fillRect(322, 506, 80, 80);
		g.fillRect(482, 506, 80, 80);
		
		g.fillRect(82, 586, 80, 80);
		g.fillRect(242, 586, 80, 80);
		g.fillRect(402, 586, 80, 80);
		g.fillRect(562, 586, 80, 80);
		
		g.setColor(Color.blue);
		checker.checkerBlue11(g);
		checker.checkerBlue12(g);
		checker.checkerBlue13(g);
		checker.checkerBlue14(g);
		checker.checkerBlue21(g);
		checker.checkerBlue22(g);
		checker.checkerBlue23(g);
		checker.checkerBlue24(g);
		checker.checkerBlue31(g);
		checker.checkerBlue32(g);
		checker.checkerBlue33(g);
		checker.checkerBlue34(g);
		
		g.setColor(Color.red);
		checker.checkerred11(g);
		checker.checkerred12(g);
		checker.checkerred13(g); //>>>>wrong place
		checker.checkerred14(g);
		checker.checkerred21(g);
		checker.checkerred22(g);
		checker.checkerred23(g); //>>>>not moving target
		checker.checkerred24(g); //>>>>not moving target
		checker.checkerred31(g);
		checker.checkerred32(g);
		checker.checkerred33(g);
		checker.checkerred34(g);
		
		repaint();
		g.dispose();
		this.setSize(860,680);
	}
	
		@Override
	public void mouseDragged(MouseEvent e) {
			
			if(square11 == true) {
				X11=e.getX()-34;
				Y11=e.getY()-34;
				col.coin11X=X11;
				col.coin11Y=Y11;
				checker.red11X=X11;
				checker.red11Y=Y11;
			}
			
			if(square12 == true) {
				X12=e.getX()-34;
				Y12=e.getY()-34;
				col.coin13X=X12;
				col.coin13Y=Y12;
				checker.red12X=X12;
				checker.red12Y=Y12;
			}
			
			if(square13 == true) {
				X13=e.getX()-34;
				Y13=e.getY()-34;
				col.coin15X=X13;
				col.coin15Y=Y13;
				checker.red13X=X13;
				checker.red13Y=Y13;
			}
			
			if(square14 == true) {
				X14=e.getX()-34;
				Y14=e.getY()-34;
				col.coin17X=X14;
				col.coin17Y=Y14;
				checker.red14X=X14;
				checker.red14Y=Y14;
			}
			
			if(square21 == true) {
				X21=e.getX()-34;
				Y21=e.getY()-34;
				col.coin22X=X21;
				col.coin22Y=Y21;
				checker.red21X=X21;
				checker.red21Y=Y21;
			}
			
			if(square22 == true) {
				X22=e.getX()-34;
				Y22=e.getY()-34;
				col.coin24X=X22;
				col.coin24Y=Y22;
				checker.red22X=X22;
				checker.red22Y=Y22;
			}
			
			if(square23 == true) {
				X23=e.getX()-34;
				Y23=e.getY()-34;
				col.coin26X=X23;
				col.coin26Y=Y23;
				checker.red23X=X23;
				checker.red23Y=Y23;
			}
			
			if(square24 == true) {
				X24=e.getX()-34;
				Y24=e.getY()-34;
				col.coin28X=X24;
				col.coin28Y=Y24;
				checker.red24X=X24;
				checker.red24Y=Y24;
			}
			
			if(square31 == true) {
				X31=e.getX()-34;
				Y31=e.getY()-34;
				col.coin31X=X31;
				col.coin31Y=Y31;
				checker.red31X=X31;
				checker.red31Y=Y31;
			}
			
			if(square32 == true) {
				X32=e.getX()-34;
				Y32=e.getY()-34;
				col.coin33X=X32;
				col.coin33Y=Y32;
				checker.red32X=X32;
				checker.red32Y=Y32;
			}
			
			if(square33 == true) {
				X33=e.getX()-34;
				Y33=e.getY()-34;
				col.coin35X=X33;
				col.coin35Y=Y33;
				checker.red33X=X33;
				checker.red33Y=Y33;
			}
			
			if(square34 == true) {
				X34=e.getX()-34;
				Y34=e.getY()-34;
				col.coin37X=X34;
				col.coin37Y=Y34;
				checker.red34X=X34;
				checker.red34Y=Y34;
			}
			
			if(square61 == true) {
				X61=e.getX()-34;
				Y61=e.getY()-34;
				col.coin62X=X61;
				col.coin62Y=Y61;
				checker.blue11X=X61;
				checker.blue11Y=Y61;
			}
			
			if(square62 == true) {
				X62=e.getX()-34;
				Y62=e.getY()-34;
				col.coin64X=X62;
				col.coin64Y=Y62;
				checker.blue12X=X62;
				checker.blue12Y=Y62;
			}
			
			if(square63 == true) {
				X63=e.getX()-34;
				Y63=e.getY()-34;
				col.coin66X=X63;
				col.coin66Y=Y63;
				checker.blue13X=X63;
				checker.blue13Y=Y63;
			}
			
			if(square64 == true) {
				X64=e.getX()-34;
				Y64=e.getY()-34;
				col.coin68X=X64;
				col.coin68Y=Y64;
				checker.blue14X=X64;
				checker.blue14Y=Y64;
			}
			
			if(square71 == true) {
				X71=e.getX()-34;
				Y71=e.getY()-34;
				col.coin71X=X71;
				col.coin71Y=Y71;
				checker.blue21X=X71;
				checker.blue21Y=Y71;
			}
			
			if(square72 == true) {
				X72=e.getX()-34;
				Y72=e.getY()-34;
				col.coin73X=X72;
				col.coin73Y=Y72;
				checker.blue22X=X72;
				checker.blue22Y=Y72;
			}
			
			if(square73 == true) {
				X73=e.getX()-34;
				Y73=e.getY()-34;
				col.coin75X=X73;
				col.coin75Y=Y73;
				checker.blue23X=X73;
				checker.blue23Y=Y73;
			}
			
			if(square74 == true) {
				X74=e.getX()-34;
				Y74=e.getY()-34;
				col.coin77X=X74;
				col.coin77Y=Y74;
				checker.blue24X=X74;
				checker.blue24Y=Y74;
			}
			
			if(square81 == true) {
				X81=e.getX()-34;
				Y81=e.getY()-34;
				col.coin82X=X81;
				col.coin82Y=Y81;
				checker.blue31X=X81;
				checker.blue31Y=Y81;
			}
			
			if(square82 == true) {
				X82=e.getX()-34;
				Y82=e.getY()-34;
				col.coin84X=X82;
				col.coin84Y=Y82;
				checker.blue32X=X82;
				checker.blue32Y=Y82;
			}
			
			if(square83 == true) {
				X83=e.getX()-34;
				Y83=e.getY()-34;
				col.coin86X=X83;
				col.coin86Y=Y83;
				checker.blue33X=X83;
				checker.blue33Y=Y83;
			}
			
			if(square84 == true) {
				X84=e.getX()-34;
				Y84=e.getY()-34;
				col.coin88X=X84;
				col.coin88Y=Y84;
				checker.blue34X=X84;
				checker.blue34Y=Y84;
			}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(" mouse clicked red11X"+checker.red11X);
		System.out.println(" mouse clicked red11Y"+checker.red11Y);
		System.out.println(" mouse clicked coin11X"+col.coin11X);
		System.out.println(" mouse clicked coin11Y"+col.coin11Y);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getX()>col.coin11X&& e.getX()<col.coin11X+col.coin11.width&&e.getY()>col.coin11Y&&e.getY()<col.coin11Y+col.coin11.height) {
			square11=true;
			highlight11=true;
		}
		if(e.getX()>col.rect11.x&& e.getX()<col.rect11.x+col.rect11.width&&e.getY()>col.rect11.y&&e.getY()<col.rect11.y+col.rect11.height) {
			
		}
		
		if(e.getX()>col.coin13X&& e.getX()<col.coin13X+col.coin13.width&&e.getY()>col.coin13Y&&e.getY()<col.coin13Y+col.coin13.height) {
			square12=true;
			System.out.println("pressed"+square12);
		}
		if(e.getX()>col.rect13.x&& e.getX()<col.rect13.x+col.rect13.width&&e.getY()>col.rect13.y&&e.getY()<col.rect13.y+col.rect13.height) {
			
		}
		
		if(e.getX()>col.coin15X&& e.getX()<col.coin15X+col.coin15.width&&e.getY()>col.coin15Y&&e.getY()<col.coin15Y+col.coin15.height) {
			square13=true;
			System.out.println("pressed"+square13);
		}
		if(e.getX()>col.rect15.x&& e.getX()<col.rect15.x+col.rect15.width&&e.getY()>col.rect15.y&&e.getY()<col.rect15.y+col.rect15.height) {
			
		}
		
		if(e.getX()>col.coin17X&& e.getX()<col.coin17X+col.coin17.width&&e.getY()>col.coin17Y&&e.getY()<col.coin17Y+col.coin17.height) {
			square14=true;
			System.out.println("pressed"+square14);
		}
		if(e.getX()>col.rect17.x&& e.getX()<col.rect17.x+col.rect17.width&&e.getY()>col.rect17.y&&e.getY()<col.rect17.y+col.rect17.height) {
			
		}
		
		if(e.getX()>col.coin22X&& e.getX()<col.coin22X+col.coin22.width&&e.getY()>col.coin22Y&&e.getY()<col.coin22Y+col.coin22.height) {
			square21=true;
			System.out.println("pressed"+square21);
		}
		
		if(e.getX()>col.coin24X&& e.getX()<col.coin24X+col.coin24.width&&e.getY()>col.coin24Y&&e.getY()<col.coin24Y+col.coin24.height) {
			square22=true;
			System.out.println("pressed"+square22);
		}
		
		if(e.getX()>col.coin26X&& e.getX()<col.coin26X+col.coin26.width&&e.getY()>col.coin26Y&&e.getY()<col.coin26Y+col.coin26.height) {
			square23=true;
			System.out.println("pressed"+square23);
		}
		
		if(e.getX()>col.coin28X&& e.getX()<col.coin28X+col.coin28.width&&e.getY()>col.coin28Y&&e.getY()<col.coin28Y+col.coin28.height) {
			square24=true;
			System.out.println("pressed"+square24);
		}
		
		//--------------------------
		
		if(e.getX()>col.coin31X&& e.getX()<col.coin31X+col.coin31.width&&e.getY()>col.coin31Y&&e.getY()<col.coin31Y+col.coin31.height) {
			square31=true;
			System.out.println("pressed"+square21);
		}
		
		if(e.getX()>col.coin33X&& e.getX()<col.coin33X+col.coin33.width&&e.getY()>col.coin33Y&&e.getY()<col.coin33Y+col.coin33.height) {
			square32=true;
			System.out.println("pressed"+square22);
		}
		
		if(e.getX()>col.coin35X&& e.getX()<col.coin35X+col.coin35.width&&e.getY()>col.coin35Y&&e.getY()<col.coin35Y+col.coin35.height) {
			square33=true;
			System.out.println("pressed"+square23);
		}
		
		if(e.getX()>col.coin37X&& e.getX()<col.coin37X+col.coin37.width&&e.getY()>col.coin37Y&&e.getY()<col.coin37Y+col.coin37.height) {
			square34=true;
			System.out.println("pressed"+square24);
		}
		
		//-------------------------------
		
		if(e.getX()>col.coin71X&& e.getX()<col.coin71X+col.coin72.width&&e.getY()>col.coin71Y&&e.getY()<col.coin71Y+col.coin72.height) {
			square71=true;
			System.out.println("pressed"+square11+"coin11 x"+col.coin11.y );
		}
		
		if(e.getX()>col.coin73X&& e.getX()<col.coin73X+col.coin74.width&&e.getY()>col.coin73Y&&e.getY()<col.coin73Y+col.coin74.height) {
			square72=true;
			System.out.println("pressed"+square12);
		}
		
		if(e.getX()>col.coin75X&& e.getX()<col.coin75X+col.coin76.width&&e.getY()>col.coin75Y&&e.getY()<col.coin75Y+col.coin76.height) {
			square73=true;
			System.out.println("pressed"+square13);
		}
		
		if(e.getX()>col.coin77X&& e.getX()<col.coin77X+col.coin78.width&&e.getY()>col.coin77Y&&e.getY()<col.coin77Y+col.coin78.height) {
			square74=true;
			System.out.println("pressed"+square14);
		}
		
		//------------------------------
		
		if(e.getX()>col.coin82X&& e.getX()<col.coin82X+col.coin81.width&&e.getY()>col.coin82Y&&e.getY()<col.coin82Y+col.coin81.height) {
			square81=true;
			System.out.println("pressed"+square21);
		}
		
		if(e.getX()>col.coin84X&& e.getX()<col.coin84X+col.coin83.width&&e.getY()>col.coin84Y&&e.getY()<col.coin84Y+col.coin83.height) {
			square82=true;
			System.out.println("pressed"+square22);
		}
		
		if(e.getX()>col.coin86X&& e.getX()<col.coin86X+col.coin85.width&&e.getY()>col.coin86Y&&e.getY()<col.coin86Y+col.coin85.height) {
			square83=true;
			System.out.println("pressed"+square23);
		}
		
		if(e.getX()>col.coin88X&& e.getX()<col.coin88X+col.coin87.width&&e.getY()>col.coin88Y&&e.getY()<col.coin88Y+col.coin87.height) {
			square84=true;
			System.out.println("pressed"+square24);
		}
		
		//----------------------------
		
		if(e.getX()>col.coin62X&& e.getX()<col.coin62X+col.coin61.width&&e.getY()>col.coin62Y&&e.getY()<col.coin62Y+col.coin61.height) {
			square61=true;
			System.out.println("pressed"+square21);
		}
		
		if(e.getX()>col.coin64X&& e.getX()<col.coin64X+col.coin63.width&&e.getY()>col.coin64Y&&e.getY()<col.coin64Y+col.coin63.height) {
			square62=true;
			System.out.println("pressed"+square22);
		}
		
		if(e.getX()>col.coin66X&& e.getX()<col.coin66X+col.coin65.width&&e.getY()>col.coin66Y&&e.getY()<col.coin66Y+col.coin65.height) {
			square63=true;
			System.out.println("pressed"+square23);
		}
		
		if(e.getX()>col.coin68X&& e.getX()<col.coin68X+col.coin67.width&&e.getY()>col.coin68Y&&e.getY()<col.coin68Y+col.coin67.height) {
			square64=true;
			System.out.println("pressed"+square24);
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		//boolean highlight1=false;
			
		square11=false;
		square12=false;
		square13=false;
		square14=false;
		
		square21=false;
		square22=false;
		square23=false;
		square24=false;
		
		square31=false;
		square32=false;
		square33=false;
		square34=false;
		
		square61=false;
		square62=false;
		square63=false;
		square64=false;
		
		square71=false;
		square72=false;
		square73=false;
		square74=false;
		
		square81=false;
		square82=false;
		square83=false;
		square84=false;
		
		System.out.println("released"+square11);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

}



/*
import java.awt.Color; 
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class CheckerPanel extends JPanel implements MouseMotionListener, MouseListener {

	
	private static final long serialVersionUID = 1L;
	
	public Checker checker;
	public Colision col;
	
	boolean highlight11=false;
	boolean highlight12=false;
	boolean highlight13=false;
	boolean highlight14=false;
	
	boolean highlight21=false;
	boolean highlight22=false;
	boolean highlight23=false;
	boolean highlight24=false;
	
	boolean highlight31=false;
	boolean highlight32=false;
	boolean highlight33=false;
	boolean highlight34=false;
	
	boolean highlight41=false;
	boolean highlight42=false;
	boolean highlight43=false;
	boolean highlight44=false;
	
	boolean highlight51=false;
	boolean highlight52=false;
	boolean highlight53=false;
	boolean highlight54=false;
	
	boolean highlight61=false;
	boolean highlight62=false;
	boolean highlight63=false;
	boolean highlight64=false;
	
	boolean highlight71=false;
	boolean highlight72=false;
	boolean highlight73=false;
	boolean highlight74=false;
	
	boolean highlight81=false;
	boolean highlight82=false;
	boolean highlight83=false;
	boolean highlight84=false;
	
	boolean square11=false;
	boolean square12=false;
	boolean square13=false;
	boolean square14=false;
	
	boolean square21=false;
	boolean square22=false;
	boolean square23=false;
	boolean square24=false;
	
	boolean square31=false;
	boolean square32=false;
	boolean square33=false;
	boolean square34=false;
	
	boolean square61=false;
	boolean square62=false;
	boolean square63=false;
	boolean square64=false;
	
	boolean square71=false;
	boolean square72=false;
	boolean square73=false;
	boolean square74=false;
	
	boolean square81=false;
	boolean square82=false;
	boolean square83=false;
	boolean square84=false;
	
	public int X11=87; 
	public boolean moved11= false;
	public int Y11=33;
	public int X12=246;
	public int Y12=33;
	public int X13=487;
	public int Y13=33;
	public int X14=566;
	public int Y14=33;
	
	public int X21=6;
	public int Y21=110;
	public int X22=166;
	public int Y22=110;
	public int X23=327;
	public int Y23=110;
	public int X24=487;
	public int Y24=110;
	
	public int X31=88;
	public int Y31=190;
	public int X32=246;
	public int Y32=190;
	public int X33=407;
	public int Y33=190;
	public int X34=566;
	public int Y34=190;
	
	public int X41=6;
	public int Y41=270;
	public int X42=166;
	public int Y42=110;
	public int X43=327;
	public int Y43=110;
	public int X44=487;
	public int Y44=110;
	
	public int X51=6;
	public int Y51=350;
	public int X52=166;
	public int Y52=350;
	public int X53=327;
	public int Y53=350;
	public int X54=487;
	public int Y54=350;
	
	public int X61=6;
	public int Y61=430;
	public int X62=166;
	public int Y62=430;
	public int X63=327;
	public int Y63=430;
	public int X64=487;
	public int Y64=430;
	
	public int X71=88;
	public int Y71=510;
	public int X72=246;
	public int Y72=510;
	public int X73=407;
	public int Y73=510;
	public int X74=566;
	public int Y74=510;
	
	public int X81=6;
	public int Y81=590;
	public int X82=166;
	public int Y82=590;
	public int X83=327;
	public int Y83=590;
	public int X84=487;
	public int Y84=590;
	
	public CheckerPanel() {
		checker = new Checker();
		col = new Colision();
		
		checker.white11X=X11;	checker.white11Y=Y11;
		col.coin11X=X11;	col.coin11Y=Y11;
		checker.white12X=X12;	checker.white12Y=Y12;
		col.coin13X=X12;	col.coin13Y=Y12;
		checker.white13X=X13;	checker.white13Y=Y13;
		col.coin15X=X13;	col.coin15Y=Y13;
		checker.white14X=X14;	checker.white14Y=Y14;
		col.coin17X=X14;	col.coin17Y=Y14;
		
		checker.white21X=X21;	checker.white21Y=Y21;
		col.coin21X=X21;	col.coin21Y=Y21;
		checker.white22X=X22;	checker.white22Y=Y22;
		col.coin24X=X22;	col.coin24Y=Y22;
		checker.white23X=X23;	checker.white23Y=Y23;
		col.coin26X=X23;	col.coin26Y=Y23;
		checker.white24X=X24;	checker.white24Y=Y24;
		col.coin28X=X24;	col.coin28Y=Y24;
		
		checker.white31X=X31;	checker.white31Y=Y31;
		col.coin31X=X31;	col.coin31Y=Y31;
		checker.white32X=X32;	checker.white32Y=Y32;
		col.coin33X=X32;	col.coin33Y=Y32;
		checker.white33X=X33;	checker.white33Y=Y33;
		col.coin35X=X33;	col.coin35Y=Y33;
		checker.white34X=X34;	checker.white34Y=Y34;
		col.coin37X=X34;	col.coin37Y=Y34;
		
		checker.blue11X=X61;	checker.blue11Y=Y61;
		col.coin62X=X61;	col.coin62Y=Y61;
		checker.blue12X=X62;	checker.blue12Y=Y62;
		col.coin64X=X62;	col.coin64Y=Y62;
		checker.blue13X=X63;	checker.blue13Y=Y63;
		col.coin66X=X63;	col.coin66Y=Y63;
		checker.blue14X=X64;	checker.blue14Y=Y64;
		col.coin68X=X64;	col.coin68Y=Y64;
		
		checker.blue21X=X71;	checker.blue21Y=Y71;
		col.coin71X=X71;	col.coin71Y=Y71;
		checker.blue22X=X72;	checker.blue22Y=Y72;
		col.coin73X=X72;	col.coin73Y=Y72;
		checker.blue23X=X73;	checker.blue23Y=Y73;
		col.coin75X=X73;	col.coin75Y=Y73;
		checker.blue24X=X74;	checker.blue24Y=Y74;
		col.coin77X=X74;	col.coin77Y=Y74;
		
		checker.blue31X=X81;	checker.blue31Y=Y81;
		col.coin82X=X81;	col.coin82Y=Y81;
		checker.blue32X=X82;	checker.blue32Y=Y82;
		col.coin84X=X82;	col.coin84Y=Y82;
		checker.blue33X=X83;	checker.blue33Y=Y83;
		col.coin86X=X83;	col.coin86Y=Y83;
		checker.blue34X=X84;	checker.blue34Y=Y84;
		col.coin88X=X84;	col.coin88Y=Y84;
		
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.black);
		g.fillRect(0, 0, 660, 700);
		g.setColor(Color.lightGray);
		g.fillRect(660, 0, 700, 700);
		g.setColor(Color.white); 
		g.fillRect(2, 26, 80, 80);
		g.fillRect(162, 26, 80, 80);
		g.fillRect(322, 26, 80, 80);
		g.fillRect(482, 26, 80, 80);
		
		g.fillRect(82, 106, 80, 80);
		g.fillRect(242, 106, 80, 80);
		g.fillRect(402, 106, 80, 80);
		g.fillRect(562, 106, 80, 80);
		
		g.fillRect(2, 186, 80, 80);
		g.fillRect(162, 186, 80, 80);
		g.fillRect(322, 186, 80, 80);
		g.fillRect(482, 186, 80, 80);
		
		g.fillRect(82, 266, 80, 80);
		g.fillRect(242, 266, 80, 80);
		g.fillRect(402, 266, 80, 80);
		g.fillRect(562, 266, 80, 80);
		
		g.fillRect(2, 26, 80, 80);
		g.fillRect(162, 26, 80, 80);
		g.fillRect(322, 26, 80, 80);
		g.fillRect(482, 26, 80, 80);
		
		g.fillRect(2, 346, 80, 80);
		g.fillRect(162, 346, 80, 80);
		g.fillRect(322, 346, 80, 80);
		g.fillRect(482, 346, 80, 80);
		
		g.fillRect(82, 426, 80, 80);
		g.fillRect(242, 426, 80, 80);
		g.fillRect(402, 426, 80, 80);
		g.fillRect(562, 426, 80, 80);
		
		g.fillRect(2, 506, 80, 80);
		g.fillRect(162, 506, 80, 80);
		g.fillRect(322, 506, 80, 80);
		g.fillRect(482, 506, 80, 80);
		
		g.fillRect(82, 586, 80, 80);
		g.fillRect(242, 586, 80, 80);
		g.fillRect(402, 586, 80, 80);
		g.fillRect(562, 586, 80, 80);
		
		g.setColor(Color.blue);
		checker.checkerBlue11(g);
		checker.checkerBlue12(g);
		checker.checkerBlue13(g);
		checker.checkerBlue14(g);
		checker.checkerBlue21(g);
		checker.checkerBlue22(g);
		checker.checkerBlue23(g);
		checker.checkerBlue24(g);
		checker.checkerBlue31(g);
		checker.checkerBlue32(g);
		checker.checkerBlue33(g);
		checker.checkerBlue34(g);
		
		g.setColor(Color.red);
		checker.checkerWhite11(g);
		checker.checkerWhite12(g);
		checker.checkerWhite13(g); //>>>>wrong place
		checker.checkerWhite14(g);
		checker.checkerWhite21(g);
		checker.checkerWhite22(g);
		checker.checkerWhite23(g); //>>>>not moving target
		checker.checkerWhite24(g); //>>>>not moving target
		checker.checkerWhite31(g);
		checker.checkerWhite32(g);
		checker.checkerWhite33(g);
		checker.checkerWhite34(g);
		
		repaint();
		g.dispose();
		this.setSize(860,680);
	}
	
		@Override
	public void mouseDragged(MouseEvent e) {
			
			if(square11 == true) {
				X11=e.getX()-34;
				Y11=e.getY()-34;
				col.coin11X=X11;
				col.coin11Y=Y11;
				checker.white11X=X11;
				checker.white11Y=Y11;
			}
			
			if(square12 == true) {
				X12=e.getX()-34;
				Y12=e.getY()-34;
				col.coin13X=X12;
				col.coin13Y=Y12;
				checker.white12X=X12;
				checker.white12Y=Y12;
			}
			
			if(square13 == true) {
				X13=e.getX()-34;
				Y13=e.getY()-34;
				col.coin15X=X13;
				col.coin15Y=Y13;
				checker.white13X=X13;
				checker.white13Y=Y13;
			}
			
			if(square14 == true) {
				X14=e.getX()-34;
				Y14=e.getY()-34;
				col.coin17X=X14;
				col.coin17Y=Y14;
				checker.white14X=X14;
				checker.white14Y=Y14;
			}
			
			if(square21 == true) {
				X21=e.getX()-34;
				Y21=e.getY()-34;
				col.coin22X=X21;
				col.coin22Y=Y21;
				checker.white21X=X21;
				checker.white21Y=Y21;
			}
			
			if(square22 == true) {
				X22=e.getX()-34;
				Y22=e.getY()-34;
				col.coin24X=X22;
				col.coin24Y=Y22;
				checker.white22X=X22;
				checker.white22Y=Y22;
			}
			
			if(square23 == true) {
				X23=e.getX()-34;
				Y23=e.getY()-34;
				col.coin26X=X21;
				col.coin26Y=Y21;
				checker.white21X=X21;
				checker.white21Y=Y21;
			}
			
			if(square24 == true) {
				X24=e.getX()-34;
				Y24=e.getY()-34;
				col.coin28X=X21;
				col.coin28Y=Y21;
				checker.white21X=X21;
				checker.white21Y=Y21;
			}
			
			if(square31 == true) {
				X31=e.getX()-34;
				Y31=e.getY()-34;
				col.coin31X=X31;
				col.coin31Y=Y31;
				checker.white31X=X31;
				checker.white31Y=Y31;
			}
			
			if(square32 == true) {
				X32=e.getX()-34;
				Y32=e.getY()-34;
				col.coin33X=X32;
				col.coin33Y=Y32;
				checker.white32X=X32;
				checker.white32Y=Y32;
			}
			
			if(square33 == true) {
				X33=e.getX()-34;
				Y33=e.getY()-34;
				col.coin35X=X33;
				col.coin35Y=Y33;
				checker.white33X=X33;
				checker.white33Y=Y33;
			}
			
			if(square34 == true) {
				X34=e.getX()-34;
				Y34=e.getY()-34;
				col.coin37X=X34;
				col.coin37Y=Y34;
				checker.white34X=X34;
				checker.white34Y=Y34;
			}
			
			if(square61 == true) {
				X61=e.getX()-34;
				Y61=e.getY()-34;
				col.coin62X=X61;
				col.coin62Y=Y61;
				checker.blue11X=X61;
				checker.blue11Y=Y61;
			}
			
			if(square62 == true) {
				X62=e.getX()-34;
				Y62=e.getY()-34;
				col.coin64X=X62;
				col.coin64Y=Y62;
				checker.blue12X=X62;
				checker.blue12Y=Y62;
			}
			
			if(square63 == true) {
				X63=e.getX()-34;
				Y63=e.getY()-34;
				col.coin66X=X63;
				col.coin66Y=Y63;
				checker.blue13X=X63;
				checker.blue13Y=Y63;
			}
			
			if(square64 == true) {
				X64=e.getX()-34;
				Y64=e.getY()-34;
				col.coin68X=X64;
				col.coin68Y=Y64;
				checker.blue14X=X64;
				checker.blue14Y=Y64;
			}
			
			if(square71 == true) {
				X71=e.getX()-34;
				Y71=e.getY()-34;
				col.coin71X=X71;
				col.coin71Y=Y71;
				checker.blue21X=X71;
				checker.blue21Y=Y71;
			}
			
			if(square72 == true) {
				X72=e.getX()-34;
				Y72=e.getY()-34;
				col.coin73X=X72;
				col.coin73Y=Y72;
				checker.blue22X=X72;
				checker.blue22Y=Y72;
			}
			
			if(square73 == true) {
				X73=e.getX()-34;
				Y73=e.getY()-34;
				col.coin75X=X73;
				col.coin75Y=Y73;
				checker.blue23X=X73;
				checker.blue23Y=Y73;
			}
			
			if(square74 == true) {
				X74=e.getX()-34;
				Y74=e.getY()-34;
				col.coin77X=X74;
				col.coin77Y=Y74;
				checker.blue24X=X74;
				checker.blue24Y=Y74;
			}
			
			if(square81 == true) {
				X81=e.getX()-34;
				Y81=e.getY()-34;
				col.coin82X=X81;
				col.coin82Y=Y81;
				checker.blue31X=X81;
				checker.blue31Y=Y81;
			}
			
			if(square82 == true) {
				X82=e.getX()-34;
				Y82=e.getY()-34;
				col.coin84X=X82;
				col.coin84Y=Y82;
				checker.blue32X=X82;
				checker.blue32Y=Y82;
			}
			
			if(square83 == true) {
				X83=e.getX()-34;
				Y83=e.getY()-34;
				col.coin86X=X83;
				col.coin86Y=Y83;
				checker.blue33X=X83;
				checker.blue33Y=Y83;
			}
			
			if(square84 == true) {
				X84=e.getX()-34;
				Y84=e.getY()-34;
				col.coin88X=X84;
				col.coin88Y=Y84;
				checker.blue34X=X84;
				checker.blue34Y=Y84;
			}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(" mouse clicked white11X"+checker.white11X);
		System.out.println(" mouse clicked white11Y"+checker.white11Y);
		System.out.println(" mouse clicked coin11X"+col.coin11X);
		System.out.println(" mouse clicked coin11Y"+col.coin11Y);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getX()>col.coin11X&& e.getX()<col.coin11X+col.coin11.width&&e.getY()>col.coin11Y&&e.getY()<col.coin11Y+col.coin11.height) {
			square11=true;
			highlight11=true;
		}
		if(e.getX()>col.rect11.x&& e.getX()<col.rect11.x+col.rect11.width&&e.getY()>col.rect11.y&&e.getY()<col.rect11.y+col.rect11.height) {
			
		}
		
		if(e.getX()>col.coin13X&& e.getX()<col.coin13X+col.coin13.width&&e.getY()>col.coin13Y&&e.getY()<col.coin13Y+col.coin13.height) {
			square12=true;
			System.out.println("pressed"+square12);
		}
		if(e.getX()>col.rect13.x&& e.getX()<col.rect13.x+col.rect13.width&&e.getY()>col.rect13.y&&e.getY()<col.rect13.y+col.rect13.height) {
			
		}
		
		if(e.getX()>col.coin15X&& e.getX()<col.coin15X+col.coin15.width&&e.getY()>col.coin15Y&&e.getY()<col.coin15Y+col.coin15.height) {
			square13=true;
			System.out.println("pressed"+square13);
		}
		if(e.getX()>col.rect15.x&& e.getX()<col.rect15.x+col.rect15.width&&e.getY()>col.rect15.y&&e.getY()<col.rect15.y+col.rect15.height) {
			
		}
		
		if(e.getX()>col.coin17X&& e.getX()<col.coin17X+col.coin17.width&&e.getY()>col.coin17Y&&e.getY()<col.coin17Y+col.coin17.height) {
			square14=true;
			System.out.println("pressed"+square14);
		}
		if(e.getX()>col.rect17.x&& e.getX()<col.rect17.x+col.rect17.width&&e.getY()>col.rect17.y&&e.getY()<col.rect17.y+col.rect17.height) {
			
		}
		
		if(e.getX()>col.coin22X&& e.getX()<col.coin22X+col.coin22.width&&e.getY()>col.coin22Y&&e.getY()<col.coin22Y+col.coin22.height) {
			square21=true;
			System.out.println("pressed"+square21);
		}
		
		if(e.getX()>col.coin24X&& e.getX()<col.coin24X+col.coin24.width&&e.getY()>col.coin24Y&&e.getY()<col.coin24Y+col.coin24.height) {
			square22=true;
			System.out.println("pressed"+square22);
		}
		
		if(e.getX()>col.coin26X&& e.getX()<col.coin26X+col.coin26.width&&e.getY()>col.coin26Y&&e.getY()<col.coin26Y+col.coin26.height) {
			square23=true;
			System.out.println("pressed"+square23);
		}
		
		if(e.getX()>col.coin28X&& e.getX()<col.coin28X+col.coin28.width&&e.getY()>col.coin28Y&&e.getY()<col.coin28Y+col.coin28.height) {
			square24=true;
			System.out.println("pressed"+square24);
		}
		
		//--------------------------
		
		if(e.getX()>col.coin31X&& e.getX()<col.coin31X+col.coin31.width&&e.getY()>col.coin31Y&&e.getY()<col.coin31Y+col.coin31.height) {
			square31=true;
			System.out.println("pressed"+square21);
		}
		
		if(e.getX()>col.coin33X&& e.getX()<col.coin33X+col.coin33.width&&e.getY()>col.coin33Y&&e.getY()<col.coin33Y+col.coin33.height) {
			square32=true;
			System.out.println("pressed"+square22);
		}
		
		if(e.getX()>col.coin35X&& e.getX()<col.coin35X+col.coin35.width&&e.getY()>col.coin35Y&&e.getY()<col.coin35Y+col.coin35.height) {
			square33=true;
			System.out.println("pressed"+square23);
		}
		
		if(e.getX()>col.coin37X&& e.getX()<col.coin37X+col.coin37.width&&e.getY()>col.coin37Y&&e.getY()<col.coin37Y+col.coin37.height) {
			square34=true;
			System.out.println("pressed"+square24);
		}
		
		//-------------------------------
		
		if(e.getX()>col.coin71X&& e.getX()<col.coin71X+col.coin72.width&&e.getY()>col.coin71Y&&e.getY()<col.coin71Y+col.coin72.height) {
			square71=true;
			System.out.println("pressed"+square11+"coin11 x"+col.coin11.y );
		}
		
		if(e.getX()>col.coin73X&& e.getX()<col.coin73X+col.coin74.width&&e.getY()>col.coin73Y&&e.getY()<col.coin73Y+col.coin74.height) {
			square72=true;
			System.out.println("pressed"+square12);
		}
		
		if(e.getX()>col.coin75X&& e.getX()<col.coin75X+col.coin76.width&&e.getY()>col.coin75Y&&e.getY()<col.coin75Y+col.coin76.height) {
			square73=true;
			System.out.println("pressed"+square13);
		}
		
		if(e.getX()>col.coin77X&& e.getX()<col.coin77X+col.coin78.width&&e.getY()>col.coin77Y&&e.getY()<col.coin77Y+col.coin78.height) {
			square74=true;
			System.out.println("pressed"+square14);
		}
		
		//------------------------------
		
		if(e.getX()>col.coin82X&& e.getX()<col.coin82X+col.coin81.width&&e.getY()>col.coin82Y&&e.getY()<col.coin82Y+col.coin81.height) {
			square81=true;
			System.out.println("pressed"+square21);
		}
		
		if(e.getX()>col.coin84X&& e.getX()<col.coin84X+col.coin83.width&&e.getY()>col.coin84Y&&e.getY()<col.coin84Y+col.coin83.height) {
			square82=true;
			System.out.println("pressed"+square22);
		}
		
		if(e.getX()>col.coin86X&& e.getX()<col.coin86X+col.coin85.width&&e.getY()>col.coin86Y&&e.getY()<col.coin86Y+col.coin85.height) {
			square83=true;
			System.out.println("pressed"+square23);
		}
		
		if(e.getX()>col.coin88X&& e.getX()<col.coin88X+col.coin87.width&&e.getY()>col.coin88Y&&e.getY()<col.coin88Y+col.coin87.height) {
			square84=true;
			System.out.println("pressed"+square24);
		}
		
		//----------------------------
		
		if(e.getX()>col.coin62X&& e.getX()<col.coin62X+col.coin61.width&&e.getY()>col.coin62Y&&e.getY()<col.coin62Y+col.coin61.height) {
			square61=true;
			System.out.println("pressed"+square21);
		}
		
		if(e.getX()>col.coin64X&& e.getX()<col.coin64X+col.coin63.width&&e.getY()>col.coin64Y&&e.getY()<col.coin64Y+col.coin63.height) {
			square62=true;
			System.out.println("pressed"+square22);
		}
		
		if(e.getX()>col.coin66X&& e.getX()<col.coin66X+col.coin65.width&&e.getY()>col.coin66Y&&e.getY()<col.coin66Y+col.coin65.height) {
			square63=true;
			System.out.println("pressed"+square23);
		}
		
		if(e.getX()>col.coin68X&& e.getX()<col.coin68X+col.coin67.width&&e.getY()>col.coin68Y&&e.getY()<col.coin68Y+col.coin67.height) {
			square64=true;
			System.out.println("pressed"+square24);
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
			boolean highlight1=false;
			
		square11=false;
		square12=false;
		square13=false;
		square14=false;
		
		square21=false;
		square22=false;
		square23=false;
		square24=false;
		
		square31=false;
		square32=false;
		square33=false;
		square34=false;
		
		square61=false;
		square62=false;
		square63=false;
		square64=false;
		
		square71=false;
		square72=false;
		square73=false;
		square74=false;
		
		square81=false;
		square82=false;
		square83=false;
		square84=false;
		
		System.out.println("released"+square11);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
*/