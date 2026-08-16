package com.pitsa.model;

/**
 * Tokens de diseño de la marca Pitsa!, tomados 1:1 de DESIGN.md.
 * Sirven como referencia tipada para cualquier consumidor Java del
 * modelo (por ejemplo, un futuro backend o generador de reportes)
 * sin depender del HTML/CSS del sitio.
 */
public final class DesignTokens {

    private DesignTokens() {
    }

    /** Paleta de colores (hex), nombre de token igual al de DESIGN.md. */
    public static final class Colors {
        private Colors() {
        }

        public static final String SURFACE = "#f9f9f9";
        public static final String SURFACE_DIM = "#dadad9";
        public static final String SURFACE_BRIGHT = "#f9f9f9";
        public static final String SURFACE_CONTAINER_LOWEST = "#ffffff";
        public static final String SURFACE_CONTAINER_LOW = "#f4f3f3";
        public static final String SURFACE_CONTAINER = "#eeeeed";
        public static final String SURFACE_CONTAINER_HIGH = "#e8e8e8";
        public static final String SURFACE_CONTAINER_HIGHEST = "#e2e2e2";
        public static final String ON_SURFACE = "#1a1c1c";
        public static final String ON_SURFACE_VARIANT = "#5d3f3c";
        public static final String INVERSE_SURFACE = "#2f3131";
        public static final String INVERSE_ON_SURFACE = "#f1f1f0";
        public static final String OUTLINE = "#916f6b";
        public static final String OUTLINE_VARIANT = "#e6bdb8";
        public static final String SURFACE_TINT = "#c00012";

        /** Rojo de marca ("Brand Red"), color dominante de la identidad visual. */
        public static final String PRIMARY = "#bb0011";
        public static final String ON_PRIMARY = "#ffffff";
        public static final String PRIMARY_CONTAINER = "#e12626";
        public static final String ON_PRIMARY_CONTAINER = "#fffbff";
        public static final String INVERSE_PRIMARY = "#ffb4ab";

        public static final String SECONDARY = "#026d40";
        public static final String ON_SECONDARY = "#ffffff";
        public static final String SECONDARY_CONTAINER = "#9af3b9";
        public static final String ON_SECONDARY_CONTAINER = "#0d7144";

        public static final String TERTIARY = "#006389";
        public static final String ON_TERTIARY = "#ffffff";
        public static final String TERTIARY_CONTAINER = "#2f7ca3";
        public static final String ON_TERTIARY_CONTAINER = "#fcfcff";

        public static final String ERROR = "#ba1a1a";
        public static final String ON_ERROR = "#ffffff";
        public static final String ERROR_CONTAINER = "#ffdad6";
        public static final String ON_ERROR_CONTAINER = "#93000a";

        public static final String BACKGROUND = "#f9f9f9";
        public static final String ON_BACKGROUND = "#1a1c1c";
        public static final String SURFACE_VARIANT = "#e2e2e2";
        public static final String SURFACE_CARD = "#ffffff";

        /** Rojo de acento usado en el sitio (accent-red / Tailwind "primary"). */
        public static final String ACCENT_RED = "#e82c2a";
    }

    /** Escala tipográfica (fontFamily, tamaño en px, peso, line-height). */
    public enum Typography {
        DISPLAY_LG("Outfit", 64, 800, 1.1),
        DISPLAY_LG_MOBILE("Outfit", 44, 800, 1.1),
        HEADLINE_XL("Outfit", 40, 700, 1.2),
        HEADLINE_LG("Outfit", 32, 700, 1.2),
        HEADLINE_MD("Outfit", 24, 600, 1.3),
        BODY_LG("Hanken Grotesk", 18, 400, 1.6),
        BODY_MD("Hanken Grotesk", 16, 400, 1.6),
        LABEL_LG("Hanken Grotesk", 14, 600, 1.2),
        LABEL_SM("Hanken Grotesk", 12, 500, 1.2);

        public final String fontFamily;
        public final int fontSizePx;
        public final int fontWeight;
        public final double lineHeight;

        Typography(String fontFamily, int fontSizePx, int fontWeight, double lineHeight) {
            this.fontFamily = fontFamily;
            this.fontSizePx = fontSizePx;
            this.fontWeight = fontWeight;
            this.lineHeight = lineHeight;
        }
    }

    /** Escala de espaciado (base 8px) y radios de borde. */
    public static final class Spacing {
        private Spacing() {
        }

        public static final int BASE_PX = 8;
        public static final int GUTTER_PX = 24;
        public static final int MARGIN_MOBILE_PX = 20;
        public static final int MARGIN_DESKTOP_PX = 64;
        public static final int SECTION_PADDING_PX = 80;
    }

    public static final class Radius {
        private Radius() {
        }

        public static final double SM_REM = 0.25;
        public static final double DEFAULT_REM = 0.5;
        public static final double MD_REM = 0.75;
        public static final double LG_REM = 1.0;
        public static final double XL_REM = 1.5;
        public static final String FULL = "9999px";
    }
}
