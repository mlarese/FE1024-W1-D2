package it.epicode.pizze;
import lombok.Data;

@Data
public class Pizza {
    private String nome;
    private String ingredienti;
    private double costo;
    protected int calorie;
}
