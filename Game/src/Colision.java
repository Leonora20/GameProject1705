import java.awt.Rectangle;

public class Colision {

		public int coin11X;
		public int coin11Y;
		public int coin13X=246;
		public int coin13Y=33;
		public int coin15X=407;
		public int coin15Y=33;
		public int coin17X=560;
		public int coin17Y=33;
		
		public int coin21X;
		public int coin21Y;
		public int coin22X=6;
		public int coin22Y=110;
		public int coin24X=166;
		public int coin24Y=110;
		public int coin26X=326;
		public int coin26Y=110;
		public int coin28X=486;
		public int coin28Y=110;
		
		public int coin31X=88;
		public int coin31Y=190;
		public int coin33X=246;
		public int coin33Y=190;
		public int coin35X=407;
		public int coin35Y=190;
		public int coin37X=560;
		public int coin37Y=190;
		
		public int coin42X;
		public int coin42Y;
		public int coin44X;
		public int coin44Y;
		public int coin46X;
		public int coin46Y;
		public int coin48X;
		public int coin48Y;
		
		public int coin51X;
		public int coin51Y;
		public int coin53X;
		public int coin53Y;
		public int coin55X;
		public int coin55Y;
		public int coin57X;
		public int coin57Y;
		
		public int coin62X;
		public int coin62Y;
		public int coin64X;
		public int coin64Y;
		public int coin66X;
		public int coin66Y;
		public int coin68X;
		public int coin68Y;
		
		public int coin71X;
		public int coin71Y;
		public int coin73X;
		public int coin73Y;
		public int coin75X;
		public int coin75Y;
		public int coin77X;
		public int coin77Y;
		
		public int coin82X;
		public int coin82Y;
		public int coin84X;
		public int coin84Y;
		public int coin86X;
		public int coin86Y;
		public int coin88X;
		public int coin88Y;
		
		public Rectangle rect11;
		public Rectangle rect13;
		public Rectangle rect15;
		public Rectangle rect17;
		
		public Rectangle rect22;
		public Rectangle rect24;
		public Rectangle rect26;
		public Rectangle rect28;
		
		public Rectangle rect31;
		public Rectangle rect33;
		public Rectangle rect35;
		public Rectangle rect37;
		
		public Rectangle rect42;
		public Rectangle rect44;
		public Rectangle rect46;
		public Rectangle rect48;
		
		public Rectangle rect51;
		public Rectangle rect53;
		public Rectangle rect55;
		public Rectangle rect57;
		
		public Rectangle rect62;
		public Rectangle rect64;
		public Rectangle rect66;
		public Rectangle rect68;
		
		public Rectangle rect71;
		public Rectangle rect73;
		public Rectangle rect75;
		public Rectangle rect77;
		
		public Rectangle rect82;
		public Rectangle rect84;
		public Rectangle rect86;
		public Rectangle rect88;
		
		//--------------------------------
		
		public Rectangle coin11;
		public Rectangle coin13;
		public Rectangle coin15;
		public Rectangle coin17;
		
		public Rectangle coin22;
		public Rectangle coin24;
		public Rectangle coin26;
		public Rectangle coin28;
		
		public Rectangle coin31;
		public Rectangle coin33;
		public Rectangle coin35;
		public Rectangle coin37;
		
		public Rectangle coin42;
		public Rectangle coin44;
		public Rectangle coin46;
		public Rectangle coin48;
		
		public Rectangle coin51;
		public Rectangle coin53;
		public Rectangle coin55;
		public Rectangle coin57;
		
		public Rectangle coin61;
		public Rectangle coin63;
		public Rectangle coin65;
		public Rectangle coin67;
		
		public Rectangle coin72;
		public Rectangle coin74;
		public Rectangle coin76;
		public Rectangle coin78;
		
		public Rectangle coin81;
		public Rectangle coin83;
		public Rectangle coin85;
		public Rectangle coin87;
		
		public Colision() {
			coin11X=88;
			coin11Y=33;
			
			rect11 = new Rectangle(82,26,80,80);
			rect13 = new Rectangle(242,26,80,80);
			rect15 = new Rectangle(402,26,80,80);
			rect17 = new Rectangle(562,26,80,80);
			
			rect22 = new Rectangle(2,106,80,80);
			rect24 = new Rectangle(162,106,80,80);
			rect26 = new Rectangle(322,106,80,80);
			rect28 = new Rectangle(482,106,80,80);
			
			rect31 = new Rectangle(82,186,80,80);
			rect33 = new Rectangle(242,186,80,80);
			rect35 = new Rectangle(402,186,80,80);
			rect37 = new Rectangle(562,186,80,80);
			
			rect42 = new Rectangle(2,266,80,80);
			rect44 = new Rectangle(162,266,80,80);
			rect46 = new Rectangle(322,266,80,80);
			rect48 = new Rectangle(482,266,80,80);
			
			rect51 = new Rectangle(82,346,80,80);
			rect53 = new Rectangle(242,346,80,80);
			rect55 = new Rectangle(402,346,80,80);
			rect57 = new Rectangle(562,346,80,80);
			
			rect62 = new Rectangle(2,426,80,80);
			rect64 = new Rectangle(162,426,80,80);
			rect66 = new Rectangle(322,426,80,80);
			rect68 = new Rectangle(482,426,80,80);
			
			rect71 = new Rectangle(82,506,80,80);
			rect73 = new Rectangle(242,506,80,80);
			rect75 = new Rectangle(402,506,80,80);
			rect77 = new Rectangle(562,506,80,80);
			
			rect82 = new Rectangle(2,586,80,80);
			rect84 = new Rectangle(162,586,80,80);
			rect86 = new Rectangle(322,586,80,80);
			rect88 = new Rectangle(482,586,80,80);
			
			//--------------------
			
			coin11 = new Rectangle(coin11X,coin11Y,69,69);
			coin13 = new Rectangle(coin13X,coin13Y,69,69);
			coin15 = new Rectangle(coin15X,coin15Y,69,69);
			coin17 = new Rectangle(coin17X,coin17Y,69,69);
			
			coin22 = new Rectangle(coin22X,coin22Y,69,69);
			coin24 = new Rectangle(coin24X,coin24Y,69,69);
			coin26 = new Rectangle(coin26X,coin26Y,69,69);
			coin28 = new Rectangle(coin28X,coin28Y,69,69);
			
			coin31 = new Rectangle(coin31X,coin31Y,69,69);
			coin33 = new Rectangle(coin33X,coin33Y,69,69);
			coin35 = new Rectangle(coin35X,coin35Y,69,69);
			coin37 = new Rectangle(coin37X,coin37Y,69,69);
			
			//--------------------------
			
			coin42 = new Rectangle(2,266,69,69);
			coin44 = new Rectangle(162,266,69,69);
			coin46 = new Rectangle(322,266,69,69);
			coin48 = new Rectangle(482,266,69,69);
			
			coin51 = new Rectangle(82,346,69,69);
			coin53 = new Rectangle(242,346,69,69);
			coin55 = new Rectangle(402,346,69,69);
			coin57 = new Rectangle(562,346,69,69);
			
			//-------------------------
			
			coin61 = new Rectangle(coin62X,coin62Y,69,69);
			coin63 = new Rectangle(coin64X,coin64Y,69,69);
			coin65 = new Rectangle(coin66X,coin66Y,69,69);
			coin67 = new Rectangle(coin68X,coin68Y,69,69);
			
			coin72 = new Rectangle(coin71X,coin71Y,69,69);
			coin74 = new Rectangle(coin73X,coin73Y,69,69);
			coin76 = new Rectangle(coin75X,coin75Y,69,69);
			coin78 = new Rectangle(coin77X,coin77Y,69,69);
			
			coin81 = new Rectangle(coin82X,coin82Y,69,69);
			coin83 = new Rectangle(coin84X,coin84Y,69,69);
			coin85 = new Rectangle(coin86X,coin86Y,69,69);
			coin87 = new Rectangle(coin88X,coin88Y,69,69);
			 
		}
}
