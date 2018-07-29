
public class RoboNG extends Robot {
 public RoboNG (String nom){
	 super(nom);
	 
 }
 public RoboNG (String nom,int x,int y,String direction){
		super (nom,x,y,direction);
	}
 public void avance (int pas){
	 for(int i =0;i<pas;i++){
		 avance();
	 }
 }
 public void gauche(){
	 droite();
	 droite();droite();
 }
 public void demiTour(){
	 droite();droite();
 }
 void affiche(){
		System.out.println("le robot s'appel :"+nom+"sa position est :"+x+","+y+"sa direction "+ direction);
	}

}
