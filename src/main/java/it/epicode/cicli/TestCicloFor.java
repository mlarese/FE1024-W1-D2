package it.epicode.cicli;

import it.epicode.pizze.Pizza;

public class TestCicloFor {
    public static void main(String[] args) {
        Pizza pizzaMargherita = new Pizza();
        pizzaMargherita.setCalorie(200);
        pizzaMargherita.setCosto(10);
        pizzaMargherita.setIngredienti("Mozzarella, Pomodoro, Capperi");
        pizzaMargherita.setNome("Margherita");

        Pizza pizzaDiavola = new Pizza();
        pizzaDiavola.setCalorie(300);
        pizzaDiavola.setCosto(15);
        pizzaDiavola.setIngredienti("Mozzarella, Pomodoro, Capperi, Peperoni");
        pizzaDiavola.setNome("Diavola");

        Pizza pizzaCapricciosa = new Pizza();
        pizzaCapricciosa.setCalorie(400);
        pizzaCapricciosa.setCosto(20);
        pizzaCapricciosa.setIngredienti("Mozzarella, Pomodoro, Capperi, Peperoni, Funghi");
        pizzaCapricciosa.setNome("Capricciosa");

        Pizza[] pizze = {pizzaMargherita, pizzaDiavola, pizzaCapricciosa};

        for(int i=0; i<pizze.length; i++) {
            Pizza pizzaCorrente = pizze[i];

            System.out.printf("Pizza %s costo %f",pizzaCorrente.getNome(), pizzaCorrente.getCosto());
            System.out.println("");
            System.out.println("-------------------------------------");
        }



    }
}
