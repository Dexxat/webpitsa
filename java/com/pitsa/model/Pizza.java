package com.pitsa.model;

import java.math.BigDecimal;

/**
 * Una pizza del menú de Pitsa!, tal como se muestra en la sección
 * "Nuestras Pitsas!" del sitio (código de referencia: code.html, screen.png).
 */
public record Pizza(
        String name,
        BigDecimal price,
        String description,
        String imageUrl
) {
    public Pizza {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name no puede estar vacío");
        }
        if (price == null || price.signum() < 0) {
            throw new IllegalArgumentException("price debe ser un monto válido");
        }
    }

    /** Precio formateado como se ve en el sitio, ej. "$20,000". */
    public String formattedPrice() {
        return "$" + price.toBigInteger().toString().replaceAll("(?<=\\d)(?=(\\d{3})+$)", ",");
    }
}
