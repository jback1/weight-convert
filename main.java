import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by jienseock on 2017-05-23.
 */
public class main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double kg = 0;
        double g = 0;
        double Ton = 0;
        double gr = 0;
        double lb = 0;
        String unit;
        String yesorno;
        double weight = 0;


        System.out.println("Type the unit. (kg,g,Ton,gr,lb,once)");
        unit = scnr.nextLine();
        System.out.println("Type the weight");
        weight = scnr.nextDouble();
        System.out.println("So it is " + weight + " " + unit);
        System.out.println("Is it true? (Yes or No)");

        yesorno = scnr.next();


        if (yesorno.equals("Yes")) {
            if (unit.equals("kg")) {
                kg = weight;
                System.out.println(kg + " kg");
                g = weight * 1000;
                System.out.println(g + "g");
                Ton = weight / 1000;
                System.out.println(Ton + " ton");
                gr = weight * 15432;
                System.out.println(gr + " gr");
                lb = weight * 2.204;
                System.out.println(lb + " lb");


            } else if (unit.equals("g")) {
                g = weight;
                kg = weight / 1000;
                Ton = weight / 1000000;
                gr = weight * 15.432;
                lb = weight * 0.0022;
                System.out.println(g + " g");
                System.out.println(kg + " kg");
                System.out.println(Ton + " ton");
                System.out.println(gr + " gr");
                System.out.println(lb + " lb");
            } else if (unit.equals("Ton")) {
                Ton = weight;
                kg = weight * 1000;
                g = weight * 1000000;
                lb = weight * 2204.666;
                gr = weight * 15432000;
                System.out.println(Ton + " Ton");
                System.out.println(kg + " kg");
                System.out.println(g + " g");
                System.out.println(gr + " gr");
                System.out.println(lb + " lb");
            } else if (unit.equals("lb")) {
                lb = weight;
                g = weight * 453.58;
                Ton = weight * 0.000453;
                gr = weight * 6999.6976;
                kg = weight * 0.45358;
                System.out.println(lb + " lb");
                System.out.println(kg + " kg");
                System.out.println(Ton + " ton");
                System.out.println(gr + " gr");
                System.out.println(g + " g");
            } else if (unit.equals("gr")) {
                gr = weight;
                g = weight * 28.34;
                kg = weight * 0.02834;
                lb = weight * 0.0625;
                gr = weight * 437.48;
                System.out.println(gr + " gr");
                System.out.println(kg + " kg");
                System.out.println(Ton + " ton");
                System.out.println(g + " g");
                System.out.println(lb + " lb");
            }
        }

            System.out.println("Please type the unit again. (kg,g,Ton,gr,lb,once)");
            unit = scnr.next();
            System.out.println("Type the weight");
            weight = scnr.nextDouble();
            System.out.println("So it is " + weight + " " + unit);
            System.out.println("Is it true? (Yes or No)");
        if (yesorno.equals("No")){
            if (unit.equals("kg")) {
                kg = weight;
                System.out.println(kg + " kg");
                g = weight * 1000;
                System.out.println(g + "g");
                Ton = weight / 1000;
                System.out.println(Ton + " ton");
                gr = weight * 15432;
                System.out.println(gr + " gr");
                lb = weight * 2.204;
                System.out.println(lb + " lb");


            } else if (unit.equals("g")) {
                g = weight;
                kg = weight / 1000;
                Ton = weight / 1000000;
                gr = weight * 15.432;
                lb = weight * 0.0022;
                System.out.println(g + " g");
                System.out.println(kg + " kg");
                System.out.println(Ton + " ton");
                System.out.println(gr + " gr");
                System.out.println(lb + " lb");
            } else if (unit.equals("Ton")) {
                Ton = weight;
                kg = weight * 1000;
                g = weight * 1000000;
                lb = weight * 2204.666;
                gr = weight * 15432000;
                System.out.println(Ton + " Ton");
                System.out.println(kg + " kg");
                System.out.println(g + " g");
                System.out.println(gr + " gr");
                System.out.println(lb + " lb");
            } else if (unit.equals("lb")) {
                lb = weight;
                g = weight * 453.58;
                Ton = weight * 0.000453;
                gr = weight * 6999.6976;
                kg = weight * 0.45358;
                System.out.println(lb + " lb");
                System.out.println(kg + " kg");
                System.out.println(Ton + " ton");
                System.out.println(gr + " gr");
                System.out.println(g + " g");
            } else if (unit.equals("gr")) {
                gr = weight;
                g = weight * 28.34;
                kg = weight * 0.02834;
                lb = weight * 0.0625;
                gr = weight * 437.48;
                System.out.println(gr + " gr");
                System.out.println(kg + " kg");
                System.out.println(Ton + " ton");
                System.out.println(g + " g");
                System.out.println(lb + " lb");
            }


        }

    }
}


