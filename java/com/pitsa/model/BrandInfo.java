package com.pitsa.model;

import java.util.List;

/**
 * Información institucional de la marca (sección "Somos Pitsa!" y footer).
 */
public record BrandInfo(
        String name,
        String hashtag,
        String description,
        String address,
        String city,
        String openDays,
        String openHours,
        String whatsappNumber,
        List<InfoCard> infoCards
) {
}
