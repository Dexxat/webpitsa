package com.pitsa.data;

import com.pitsa.model.BrandInfo;
import com.pitsa.model.InfoCard;
import com.pitsa.model.Pizza;

import java.math.BigDecimal;
import java.util.List;

/**
 * Datos de contenido de Pitsa!, extraídos del sitio de referencia
 * (code.html / screen.png): menú, dirección, horarios y tarjetas
 * informativas de la sección "Somos Pitsa!".
 */
public final class PitsaData {

    private PitsaData() {
    }

    public static BrandInfo brandInfo() {
        return new BrandInfo(
                "Pitsa!",
                "#SomosPitsa!",
                "Y hacemos pizzas, hechas con mucha dedicacion y la mejor materia prima posible. "
                        + "Amasamos cada día respetando los tiempos de fermentación, utilizamos ingredientes "
                        + "locales, recetas perfeccionadas y el toque inconfundible de nuestro horno de leña. "
                        + "Nos tomamos en serio cada sabor y detalle. Nuestros hornos estan en Muñiz y "
                        + "hacemos envios y take-away.",
                "Pedro Goyena 1079",
                "Muñiz",
                "Jueves a Domingo",
                "20:00 a 23:00 hs.",
                "1234567890",
                List.of(
                        new InfoCard("location_on", "¿Dónde?", "Pedro Goyena 1079, Muñiz"),
                        new InfoCard("local_pizza", "Pizza a la piedra", "48 hs de levado en frío."),
                        new InfoCard("schedule", "¿Cuándo?", "Jueves a Domingo, 20:00 a 23:00 hs.")
                )
        );
    }

    public static List<Pizza> menu() {
        return List.of(
                new Pizza("Margherita", new BigDecimal(20000),
                        "Masa, salsa de tomate, mozzarella, tomates en rodajas, pesto, oliva, parmesano.",
                        "margherita.jpg"),
                new Pizza("Jamón y Morrón", new BigDecimal(23000),
                        "Masa, salsa de tomate, mozzarella, jamón natural, morrón rojo y verde, oliva, orégano.",
                        "jamon-y-morron.jpg"),
                new Pizza("Rúcula y Jamón Crudo", new BigDecimal(23000),
                        "Masa, salsa de tomate, mozzarella, jamón crudo estilo parma, parmesano, oliva.",
                        "rucula-y-jamon-crudo.jpg"),
                new Pizza("Provolone", new BigDecimal(19000),
                        "Masa, salsa de tomate, mozzarella, provolone, oliva, orégano y aceitunas.",
                        "provolone.jpg"),
                new Pizza("Especial", new BigDecimal(22000),
                        "Masa, salsa de tomate, berenjenas, parmesano, provolone y oliva.",
                        "especial.jpg"),
                new Pizza("Cheese", new BigDecimal(17000),
                        "Masa, salsa de tomate, mozzarella, parmesano, albahaca y oliva.",
                        "cheese.jpg"),
                new Pizza("Fugazzeta", new BigDecimal(19000),
                        "Masa, mozzarella, cebolla, orégano y oliva.",
                        "fugazzeta.jpg"),
                new Pizza("Pepperoni", new BigDecimal(21000),
                        "Masa, salsa de tomate, mozzarella, pepperoni, miel picante, oliva.",
                        "pepperoni.jpg")
        );
    }

    /** Demo de consola para mostrarle al cliente que el modelo de datos funciona. */
    public static void main(String[] args) {
        BrandInfo brand = brandInfo();

        System.out.println(brand.name() + " " + brand.hashtag());
        System.out.println(brand.address() + ", " + brand.city());
        System.out.println(brand.openDays() + " · " + brand.openHours());
        System.out.println();

        System.out.println("Nuestras Pitsas!");
        System.out.println("-".repeat(40));
        for (Pizza pizza : menu()) {
            System.out.printf("%-22s %10s%n", pizza.name(), pizza.formattedPrice());
            System.out.println("  " + pizza.description());
        }
    }
}
