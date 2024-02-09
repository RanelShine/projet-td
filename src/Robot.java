//La classes Robot

public class Robot{
    // Creation des attribute
    String nom;
    int pointDeVie;

    //Creation des methods

    //Constructor
    public Robot(String nom){
        this.nom = nom;
        this.pointDeVie = 10;
        System.out.println("Robot "+this.nom);
    }

    //Methode Fire pour attaquer un robot cible
    public void fire(Robot cible){
        cible.pointDeVie -= 2;
        System.out.println("Robot "+cible.nom+" a ete touche par le Robot "+this.nom+" !");
        System.out.println("Point de vie: "+cible.nom+" = "+cible.pointDeVie+"; "+this.nom+" = "+this.pointDeVie+" ;\n");
    }

    //Methode isdead pour verifier si le robot est mort
    public boolean isDead(){
        if (this.pointDeVie <= 0) return true;
        else return false;
    }

    public static void main(String[] args){}
}
