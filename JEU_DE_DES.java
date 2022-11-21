package monpackage;
import java.lang.Math;

public class JEU_DE_DES {

	public static void main(String[] args)  throws InterruptedException{
	
		String name1,name2;
		
		name1= Saisie.lire_String("Joueur 1 veuillez saisir votre nom");
		name2= Saisie.lire_String("Joueur 2 veuillez saisir votre nom");
		
		
			System.out.println("Bienvenue "+name1+" et "+name2+" vous allez jouer au jeu de dés");
			System.out.println("");
			System.out.println("Chance désignera qui débutera.");
			
			
			
			
			int j1=1;
			int j2=0;
			int range_joueur = j1 - j2 + 1;
			
			
			for (int c = 0; c < 1; c++) {
				int joueur_commence = (int)(Math.random() * range_joueur)+ j2;
				
				if (joueur_commence==1) {
					System.out.println("C'est "+name1+" qui commence!");
				}else {
					System.out.println("C'est "+name2+" qui commence!");
				}
			}
		
		
			int scoremin = 0;
			int score_joueur1 = 0;
			int score_joueur2 = 0;
			int scoremax=30;
			int lancer = 0;
		
			
			int max = 6;
			int min = 1;
			int range = max - min + 1;
			
			
			
			//nombre entre 1 et 6
			for(int i = 0; i < 30; i++);
				int rand1 = (int)(Math.random() *range) + min;
				int rand2 = (int)(Math.random() *range) + min;
				
				
				while (score_joueur1<scoremax || score_joueur2<scoremax) {
					if (rand1>rand2) {
						System.out.println("Le lancer numéro :"+lancer);
						lancer++;
						
						
						System.out.println(name1+" lance le dé, et c'est le :"+rand1);
						System.out.println(name1+" est a :"+score_joueur1+" point(s)");
						
					
						
						System.out.println("");
						
						
						System.out.println(name2+" lance le dé, et c'est le :"+rand2);
						System.out.println(name2+" est a :"+score_joueur2+" point(s)");
						System.out.println("");
						System.out.println("");
						
						
						
					
					}else if (rand1==rand2) {
						
						System.out.println("Le lancer numéro :"+lancer);
						lancer++;
						
						
						
						System.out.println(name1+" lance le dé, et c'est le :"+rand1);
						System.out.println(name1+" est a :"+score_joueur1+" point(s)");
						
						
						
						System.out.println("");
						
						
						System.out.println(name2+" lance le dé, et c'est le :"+rand2);
						System.out.println(name2+" est a :"+score_joueur2+" point(s)");
						System.out.println("");
						System.out.println("");
						
						
					}else {
						
						System.out.println("Le lancer numéro :"+lancer);
						lancer++;
						score_joueur2++;
					
						
						System.out.println(name2+" lance le dé, et c'est le :"+rand2);
						System.out.println(name2+" est a :"+score_joueur2+" point(s)");
						
						
						
						System.out.println("");
						
						
						System.out.println(name1+" lance le dé, et c'est le :"+rand1);
						System.out.println(name1+" est a :"+score_joueur1+"point(s)");
						System.out.println("");
						System.out.println("");
						
						
						
					}
					if (score_joueur1 == scoremax || score_joueur2==scoremax) {
						if (score_joueur1 == scoremax) {
							System.out.println(name1 +"à gagner!");
							
							System.out.println(name2 +"à perdu!");
							break;
						}else {
							System.out.println(name1 +"à gagner!");
							
							System.out.println(name2 +"à perdu!");
							break;
						}
					}
				}
				
	}

}
