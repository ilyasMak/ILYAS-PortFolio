package TP6_GraphiqueInitiation;


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;




public class Fenetre1 extends JFrame {
	static int cmpt = 0;

	Color lon[][]=new Color[3][3]  ; 
	JButton clickedButton =new JButton();
	JPanel notrePane ; 
	JButton botona1,botona2,Repeat ; 
	int XO_Visible=0 ;
	static int Winner[][]=new int[][] {{3,4,5},{6,7,8},{9,10,11}};
	JButton XO[][]=new JButton[3][3];
	JLabel ktaba ;
	JLabel GameComment,winner;
	//JLabel logo ;
	Timer horloge1  ;
	int I=0 ,J=0;
	int posx=0,posy=0 ;
	int X=0 ,Y=600;
	int X_Sym=0;
	int xo[][]=new int[][] { {0,0,0} , {0,0,0} , {0,0,0} } ;
	boolean back =false;
	boolean BACK=false  ;
	//-------------------------------------
	  public  static boolean win() {

		  int j=0 ;
		  for(int i=0 ;i<3 ;i++) {
			  if(Winner[i][j]==Winner[i][j+1] && Winner[i][j+1]==Winner[i][j+2])  return true ; 
			 if(Winner[j][i]==Winner[j+1][i] && Winner[j+1][i]==Winner[j+2][i])  return true ;
			
		  }
		  if(Winner[0][0]==Winner[1][1] && Winner[1][1]==Winner[2][2]) return true ;
		  if(Winner[0][2]==Winner[2][2] && Winner[2][2]==Winner[2][0]) return true ;
			   
			  
			  
		   
			
		   return false ; 
	   }
	//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_--__-_-_-_-_-_-_-_-_-_-_-_-_-_
	
   public Fenetre1() {
	   
	  
       
	   botona1=new JButton("Start") ;
	   botona2=new JButton("Stop") ;
	 
	   ktaba=new JLabel("ILYAS MAKHLOUL") ;
	   Repeat=new JButton("Repeat");
	   GameComment=new JLabel("--RED--") ;
	   winner=new JLabel();
	 //logo= new JLabel(new ImageIcon("C:/Users/pc/Pictures/me_files/me XO.jpg"));
	   
	   Repeat.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			for(int i=0 ; i<3 ; i++) {
				for(int j=0 ; j<3 ; j++) {
					xo[i][j]=0;
					Winner[i][j]=2*i-j+3 ;
					XO[i][j].setEnabled(true);
					
				}
			}
			
		}
	});
	   
	  //_______________________________________________
		for(int i=0 ; i<3; i++) {
			for(int j=0;j<3;j++) {
			   XO[i][j]=new JButton(""); 
			   }
			}
	//_________________________________________________
		XO[0][0].addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XO[0][0].setEnabled(false);
				cmpt++ ; 
				
				//---------
				if(cmpt%2==1) {
					lon[0][0]=Color.RED ; 
					GameComment.setText("--BLUE--");
					Winner[0][0]=1;
					if(win()==true) {
						System.out.println("Red win");
						winner.setText("RED win");
					}
				}
				//--------
				if(cmpt%2==0) {
					lon[0][0]=Color.blue ; 
					GameComment.setText("--RED--");
					Winner[0][0]=2;
					if(win()==true) {
						System.out.println("blue win");
						winner.setText("BLUE win");
					}
				}
				//--------
				xo[0][0]=50 ;
			}
		
			 
		 });
		//__________________________________________
XO[0][1].addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XO[0][1].setEnabled(false);
				cmpt++ ; 
				if(cmpt%2==1) {
					lon[0][1]=Color.RED ; 
					GameComment.setText("--BLUE--");
					Winner[0][1]=1;
					if(win()==true) {
						System.out.println("red win");
						winner.setText("RED win");
					}
				}
				if(cmpt%2==0) {
					lon[0][1]=Color.blue ; 
					GameComment.setText("--RED--");
					Winner[0][1]=2;
					if(win()==true) {
						System.out.println("blue win");
						winner.setText("BLUE win");
					}
				}
				xo[0][1]=50 ;
			}
		
			 
		 });
	   
//__________________________________________
XO[0][2].addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XO[0][2].setEnabled(false);
				cmpt++ ; 
				if(cmpt%2==1) {
					lon[0][2]=Color.RED ; 
					GameComment.setText("--BLUE--");
					Winner[0][2]=1;
					if(win()==true) {
						System.out.println("red win");
						winner.setText("RED win");
					}
				}
				if(cmpt%2==0) {
					lon[0][2]=Color.blue ;
					GameComment.setText("--RED--");
					Winner[0][2]=2;
					if(win()==true) {
						System.out.println("blue win");
						winner.setText("BLUE win");
					}
				}
				xo[0][2]=50 ;
			}
		
			 
		 });
	   
//__________________________________________
XO[1][0].addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XO[1][0].setEnabled(false);
				cmpt++ ; 
				if(cmpt%2==1) {
					lon[1][0]=Color.RED ; 
					GameComment.setText("--BLUE--");
					Winner[1][0]=1;
					if(win()==true) {
						System.out.println("red win");
						winner.setText("RED win");
					}
				}
				if(cmpt%2==0) {
					lon[1][0]=Color.blue ; 
					GameComment.setText("--RED--");
					Winner[1][0]=2;
					if(win()==true) {
						System.out.println("blue win");
						winner.setText("BLUE win");
					}
				}
				
				xo[1][0]=50 ;
			}
		
			 
		 });
	   
//__________________________________________
XO[1][1].addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XO[1][1].setEnabled(false);
				cmpt++ ; 
				if(cmpt%2==1) {
					lon[1][1]=Color.RED ; 
					GameComment.setText("--BLUE--");
					Winner[1][1]=1;
					if(win()==true) {
						System.out.println("red win");
						winner.setText("RED win");
					}
				}
				if(cmpt%2==0) {
					lon[1][1]=Color.blue ; 
					GameComment.setText("--RED--");
					Winner[1][1]=2;
					if(win()==true) {
						System.out.println("blue win");
						winner.setText("BLUE win");
					}
				}
				xo[1][1]=50 ;
			}
		
			 
		 });
	   
//__________________________________________	
XO[1][2].addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XO[1][2].setEnabled(false);
				cmpt++ ; 
				if(cmpt%2==1) {
					lon[1][2]=Color.RED ; 
					GameComment.setText("--BLUE--");
					Winner[1][2]=1;
					if(win()==true) {
						System.out.println("red win");
						winner.setText("RED win");
					}
				}
				if(cmpt%2==0) {
					lon[1][2]=Color.blue ; 
					GameComment.setText("--RED--");
					Winner[1][2]=2;
					if(win()==true) {
						System.out.println("blue win");
						winner.setText("BLUE win");
					}
				}
				xo[1][2]=50 ;
			}
		
			 
		 });
	   
//__________________________________________
XO[2][0].addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XO[2][0].setEnabled(false);
				cmpt++ ; 
				if(cmpt%2==1) {
					lon[2][0]=Color.RED ; 
					GameComment.setText("--BLUE--");
					Winner[2][0]=1;
					if(win()==true) {
						System.out.println("red win");
						winner.setText("RED win");
					}
				}
				if(cmpt%2==0) {
					lon[2][0]=Color.blue ; 
					GameComment.setText("--RED--");
					Winner[2][0]=2;
					if(win()==true) {
						System.out.println("blue win");
						winner.setText("BLUE win");
					}
				}
				xo[2][0]=50 ;
			}
		
			 
		 });
	   
//__________________________________________
XO[2][1].addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XO[2][1].setEnabled(false);
				cmpt++ ; 
				if(cmpt%2==1) {
					lon[2][1]=Color.RED ; 
					GameComment.setText("--BLUE--");
					Winner[2][1]=1;
					if(win()==true) {
						System.out.println("red win");
						winner.setText("RED win");
					}
				}
				if(cmpt%2==0) {
					lon[2][1]=Color.blue ; 
					GameComment.setText("--RED--");
					Winner[2][1]=2;
					if(win()==true) {
						System.out.println("blue win");
						winner.setText("BLUE win");
					}
				}
				xo[2][1]=50 ;
			}
		
			 
		 });
	   
//__________________________________________
XO[2][2].addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XO[2][2].setEnabled(false);
				cmpt++ ; 
				if(cmpt%2==1) {
					lon[2][2]=Color.RED ; 
					GameComment.setText("--BLUE--");
					Winner[2][2]=1;
					if(win()==true) {
						System.out.println("red win");
						winner.setText("RED win");
					}
				}
				if(cmpt%2==0) {
					lon[2][2]=Color.blue ; 
					GameComment.setText("--RED--");
					Winner[2][2]=2;
					if(win()==true) {
						System.out.println("blue win");
						winner.setText("BLUE win");
					}
				}
		
				xo[2][2]=50 ;
			}	 
		 });
	
	 //__________________________________________________
botona1.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		horloge1.start();
	}
});
	   //---------------
	   botona2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				horloge1.stop();
			}
		});
	 //_______________________________________________ 
	   notrePane=new JPanel() {
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				super.paint(g);
				//g.drawOval(0, 0, 100,100);
				g.setColor(Color.blue);
				g.fillOval(posx,posy, 50, 50);
				g.setColor(Color.red);
				g.fillOval(X, Y, 50, 50);
			
				//------------------
				for(int i=0 ; i<3 ; i++) {
					for(int j=0 ; j<3 ;j++) {
						g.setColor(lon[i][j]);
						g.fillOval(425+j*100, 330+i*100, xo[i][j], 50);
					}	
				}
				//------------------
				for(int i=4 ; i<7; i++) {
					for(int j=3;j<6;j++) {
						g.drawRect(100*i, 100*j, 100, 100);
					}
				}
			}
			//________________________________________
			
			 public void paintComponent(Graphics g) {
			        super.paintComponent(g);
			        
			       
			        Graphics2D g2d = (Graphics2D) g;
			        
			       
			        Color color1 = new Color(51, 153, 255);
			        Color color2 = new Color(255, 255, 255);
			        GradientPaint gradient = new GradientPaint(0, 0, color1, getWidth(), getHeight(), color2);
			        
			      
			        g2d.setPaint(gradient);
			        g2d.fillRect(0, 0, getWidth(), getHeight());
			 }
			        
			
			
			
		};
	
		//_______________________________________________
		ktaba.setBounds(500, 150, 600, 100);
		GameComment.setBounds(510,570,600,100);
		botona1.setBounds(420, 260,120, 30);
		botona2.setBounds(550,260,120,30);
		winner.setBounds(520,590,600,100);
		Repeat.setBounds(425,215,240,40);
		//logo.setBounds(10,10,500,500);
	
		
		this.setContentPane(notrePane);
		
		this.setLayout( null);
		for(int i=0;i<3;i++) {
			for(int j=0 ;j<3 ; j++) {
				XO[i][j].setBounds(400+j*100,300+i*100,100 , 100);
				XO[i][j].setBackground(Color.black);
				this.getContentPane().add(XO[i][j]);
			}
		}
		 this.getContentPane().add(ktaba);
		 this.getContentPane().add(botona2);
		this.getContentPane().add(botona1);
		this.getContentPane().add(GameComment);
		this.getContentPane().add(winner);
		this.getContentPane().add(Repeat);
		//this.getContentPane().add(logo);
		//this.getContentPane().pack();
		//_______________________________________________
		horloge1 =new Timer(1,new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-__-_-_-_-_-_-_
				if(posx>=0 && posx<=360 && back==false) {
					posx=posx+6 ; 
					posy=2*posx ; 
				}
				//_________________________
				else if(posx>360  && posx<=732 && back==false ) {
					posx=posx+6 ;
               	 X_Sym=posx-380 ; 
               	posy=2*(380-X_Sym);
               	//notrePane.getContentPane().setBackground(Color.red); 
				}
				//_________________________
				else if(posx>732 && posx<=1090 && back==false){posx=posx+6 ;
        		posy=2*(posx-732);
				}
				//_________________________
			     if(posx>1090) {back=true ; 
			     X_Sym=0;
			     }
			   //_________________________
				 if(back==true) {
					posx=posx-6 ;
					 X_Sym=X_Sym+6; 
					//X_Sym=posx-1042 ;
					posy=684-2*X_Sym ;
					
				}
				 if(posx<=629 && back==true) { back=false ; 
				 posx=0 ;
				 posy=0;}
				 
				//_________________________
				//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-__-_-_-_-_-_-_
				 if(X>=0 && X<600 && BACK==false) {
					 X=X+8 ; 
					 Y=600-X;
				 }
				 else if (X>=600 &&  X<973 && BACK==false) {
					 X=X+5 ;
					 X_Sym=X-600 ;
					 Y=2*X_Sym;			 
				 }
				 else if (X>=974 && X<1200 && BACK==false ) {
					 X=X+8 ;
					 X_Sym=X-973 ;
					 Y=746-X_Sym;
				 }
				 if(X>=1200) {
					 BACK=true ; 
				 }
				 if(BACK==true) {
					 BACK=false ; 
					 X=0 ;
							 Y=0 ;
					 
				 }
					repaint();	
			}
		});
		//_________________________________________________________
	   this.setTitle("ILYAS MAKHLOUL , X-O RED-BLUE");
	   int  x= Toolkit.getDefaultToolkit().getScreenSize().width ;
	   int  y= Toolkit.getDefaultToolkit().getScreenSize().width ;
	   //------------------
	   this.setSize(3*x/4 , 3*y/4);
	   this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	   this.setLocationRelativeTo(null);  //reference est tous l'ecran lorsqu'on met null
	  //this.getContentPane().setBackground(Color.red); 
	  //this.addMouseListener(new EcouteurSouris()); //method 1 
	  //this.addMouseListener(this);   //Method 2
	  //Method 3 : utiliser MouseAdapter classe anonyme
	  //------------------
	  this.addMouseListener(new MouseAdapter() {
		  @Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseEntered(e);
		}
	  });
	  //-------------------------------------
	 this.setVisible(true);
   }
   //__________________________________________________
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fenetre1 maFenetre=new Fenetre1();
	}
}