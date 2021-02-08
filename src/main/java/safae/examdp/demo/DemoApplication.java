package safae.examdp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import safae.examdp.demo.Composite.*;
import safae.examdp.demo.Observer.Parametre;
import safae.examdp.demo.Strategy.AlgoTraitement1;
import safae.examdp.demo.Strategy.AlgoTraitement2;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
      AlgoTraitement1 test1=new AlgoTraitement1();
      AlgoTraitement2 test2=new AlgoTraitement2();
      Dessin dessin =new Dessin(test1);

      Figure cercle1= new Cercle(new Point(1,2),4);
      Figure cercle2= new Cercle(new Point(3,4),4);
      Figure Rectangle1=new Rectangle(new Point(1,1),3,4);
      Figure Rectangle2=new Rectangle(new Point(4,2),4,8);

      Groupe groupe =new Groupe(Arrays.asList(cercle1,Rectangle2));
      Parametre parametre=new Parametre();

      parametre.subscribe(cercle1);
      parametre.subscribe(cercle2);

      parametre.subscribe(Rectangle1);
      parametre.subscribe(Rectangle2);


      dessin.add(cercle1);
      dessin.add(Rectangle1);
      dessin.add(groupe);

      System.out.println("Le Traitement du dessin: ");
      dessin.traiter();
      System.out.println("***********************************");
      System.out.println("L'affichage du dessin : ");
      dessin.display();
      System.out.println("***********************************");
    }











}
