

//Code Principal

public class Main{

    public static void main(String[] args){
        System.out.println("---------------------------------------------\n");

        //Test du constructor
        Robot bob= new Robot("bob");

        //Test du combat de la methode fight

        //creation de robots
        Robot d2r2= new Robot("D2R2");
        Robot data= new Robot("Data");

        System.out.println("\nCombat entre le robot "+d2r2.nom+" et le Robot "+data.nom+" ....FIGHT !!\n");

        System.out.println("\n Le vainqueur du combat est "+Arene.fight(d2r2, data).nom);

        System.out.println("------------------------------------------------\n");
    }

}