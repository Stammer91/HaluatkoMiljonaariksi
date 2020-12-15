import java.io.*;
import java.util.*;
public class Kilpailu {
	
	static Kysymykset kysymysclass[] = new Kysymykset[4];
	
	public static void main(String[] args) throws IOException {
		
	     Highscores Leaderboard = new Highscores();
		
	       
		Scanner in = new Scanner (System.in);
		
		
		
	    int arvo = 100;

		int arvot [] = new int [] {100, 300, 500, 700, 1000, 2000, 3000, 5000, 7000, 10000, 15000, 30000, 60000, 200000, 1000000};

		int laske = 0;
		
		
		
	    String kysymys ="", A ="", B = "", C = "", D = "", vastaus="", K‰ytt‰j‰="";

	    boolean OikeinV‰‰rin = false;

	    boolean Lopeta = false;
	    
		String nimi = null;
		
		char again = 'y';
		while(again == 'y')
		{

		
		for (int i = 0; i<1; i++)
	      {
	         kysymysclass[i]= new Kysymykset ();
	         kysymysclass[i].kysymykset();
	        
	      
		 System.out.println("\t\t-----------------------");
	      System.out.println("\t\tHaluatko Miljon‰‰riksi?");
	      System.out.println("\t\t-----------------------\t\t\t\t\t\t\t\tVastaukset:A,B,C,D & Pelin lopetus = F"
	      		+ "\n\t\t\t\t\t\t\t\t\t\t\t\tKirjoita 'leaderboard' n‰hd‰ksesi aiemmat tulokset");
	      
	      laske = 0;
	      Lopeta = false;
	      arvo = 100;
	      do {
	                if (arvo == 100)
	                {
	                	System.out.println("Nimi:");
	                	nimi = in.nextLine();
	                	
	                		if (nimi.equals("leaderboard")) {
	                			Leaderboard.Leaderboard(nimi);	                			
	                			System.out.print("\nHaluatko aloittaa pelin? <y/n> \n");	        
	                			again = in.nextLine().charAt(0);
	                			break;
	                	}
	                	
	                  System.out.println("\n\n" + nimi + ", On vuorosi pelata!..... Haluatko miljon‰‰riksi!\n");
	                }

	                
	                for (int j = 1; j<=7; j++) // Looppi ja getterit
	                {
	                	 if (j == 1)
	                	 {
		                    
							kysymys = kysymysclass[i].getKysymys();
		                      System.out.println("Voittaaksesi $"+arvo+"\n\n"+kysymys);
		                   }
	                	 if (j == 1)
		                   {
		                      A = kysymysclass[i].getA();
		                      System.out.println(A);
		                   }
		                   if (j == 1)
		                   {
		                      B = kysymysclass[i].getB();
		                      System.out.println(B);
		                   }
		                   if (j == 1)
		                   {
		                      C = kysymysclass[i].getC();
		                      System.out.println(C);
		                   }
		                   if (j == 1)
		                   {
		                      D = kysymysclass[i].getD();
		                      System.out.println(D);
		                   }
		                   if (j == 6)
		                   {
		                      vastaus = kysymysclass[i].getVastaus();
		                   }
		                   if (arvo == 100) // Sovellus n‰kym‰
		                   {
		                      System.out.println();
		                   }
	                   }
	      do
	      {
	      System.out.println("Mik‰ on vastauksesi?:");
    	  K‰ytt‰j‰ = in.nextLine();
          if (K‰ytt‰j‰.compareTo("F")==0&&arvo==100)
          {
             System.out.println("Et voi lopettaa ensimm‰isess‰ kysymyksess‰!");
          }
	      } while ((K‰ytt‰j‰.compareTo("F")==0&&arvo==100));
	
          if (K‰ytt‰j‰.compareTo(vastaus) == 0)
          {
             OikeinV‰‰rin = true;
          }
          else
          {
             OikeinV‰‰rin = false;
          }
          if (OikeinV‰‰rin == false&&arvo==100)
          {
        	  arvo = 0;
             System.out.println("\nOlen pahoillani, Vastaus oli v‰‰rin! Oikea vastaus oli: "+vastaus);
             System.out.println("Voitit $" + arvo +"\n");
             Highscores.Highscore(arvo, nimi);
             System.out.print("Haluatko aloittaa uuden pelin? <y/n> \n");	        
 			again = in.nextLine().charAt(0);
          }
          else if (OikeinV‰‰rin == false&&arvo!=100)
          {
        	  arvo = arvot[laske-1];
        	  laske--;
             System.out.println("\nOlen pahoillani, Vastaus oli v‰‰rin! Oikea vastaus oli: "+vastaus);
             System.out.println("Voitit $" + arvo +"\n");
             Highscores.Highscore(arvo, nimi);
             System.out.print("Haluatko aloittaa uuden pelin? <y/n> \n");	        
 			again = in.nextLine().charAt(0);
          }
          else if (OikeinV‰‰rin == false&&K‰ytt‰j‰.compareTo("F")==0)
          {
             System.out.println("\nP‰‰tit lopettaa pelin! Oikea vastaus oli: "+vastaus);
             System.out.println("Voitit $" + arvo +"\n");
             Highscores.Highscore(arvo, nimi);
             System.out.print("Haluatko aloittaa uuden pelin? <y/n> \n");	        
 			again = in.nextLine().charAt(0);
          }
          if (OikeinV‰‰rin == true&&arvo!=1000000)
          {
             System.out.println ("\nHyv‰! "+vastaus+" on oikein!\n");
             arvo = arvot[laske+1];
             laske++;
          }
          else if (OikeinV‰‰rin == true&&arvo==1000000)
          {
             System.out.println("Onneksi olkoon!!! Olet voittanut Haluatko miljon‰‰riksi ja $1000000!\n");
             OikeinV‰‰rin = false;
             Highscores.Highscore(arvo, nimi);
             System.out.print("Haluatko aloittaa uuden pelin? <y/n> \n");	        
 			again = in.nextLine().charAt(0);
          }
	      }  while (OikeinV‰‰rin != false && arvo<=1000000 && Lopeta!=true);
         
	      }
		}
	}
}