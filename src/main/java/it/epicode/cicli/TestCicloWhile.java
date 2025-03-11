package it.epicode.cicli;

import it.epicode.pizze.Pizza;
import it.epicode.pizze.PizzaHelper;

public class TestCicloWhile {

    public static void main(String[] args) {
        Pizza[] pizze = PizzaHelper.menuDiPizze();

        int pizzeStampate = 0;

        System.out.println("Menu pizze con while");

        while(pizzeStampate<pizze.length  ) {
            Pizza pizzaCorrente = pizze[pizzeStampate];
            System.out.printf("Pizza %s costo %f",pizzaCorrente.getNome(), pizzaCorrente.getCosto());
            System.out.println("");
            System.out.println("-------------------------------------");
            pizzeStampate++;
        }

    }
}
