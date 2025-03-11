package it.epicode.pizze;

public class PizzaHelper {
    public static Pizza[] menuDiPizze() {
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

        return pizze;
    }

}
