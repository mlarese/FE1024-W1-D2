package it.epicode.cicli;

import it.epicode.pizze.Pizza;
import it.epicode.pizze.PizzaHelper;

public class TestCicloFor {
    public static void main(String[] args) {


        Pizza[] pizze = PizzaHelper.menuDiPizze();

        for(int i=0; i<pizze.length; i++) {
            Pizza pizzaCorrente = pizze[i];

            System.out.printf("Pizza %s costo %f",pizzaCorrente.getNome(), pizzaCorrente.getCosto());
            System.out.println("");
            System.out.println("-------------------------------------");
        }



    }
}
