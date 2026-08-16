/**
 * Tailwind config para Pitsa! — generado a partir de los design tokens
 * definidos en DESIGN.md (frontmatter). Mantenido en un archivo aparte
 * del HTML para que el equipo de diseño pueda actualizar la paleta /
 * tipografía sin tocar el markup.
 */
tailwind.config = {
  darkMode: "class",
  theme: {
    extend: {
      colors: {
        "primary-fixed": "#ffdad6",
        "on-error": "#ffffff",
        "accent-red": "#e82c2a",
        "surface-dim": "#dadad9",
        "secondary-container": "#9af3b9",
        "error-container": "#ffdad6",
        "on-surface-variant": "#5d3f3c",
        "on-secondary": "#ffffff",
        "on-secondary-container": "#0d7144",
        "surface-variant": "#e2e2e2",
        "tertiary-fixed": "#c5e7ff",
        "surface-container-lowest": "#ffffff",
        "surface-container-highest": "#e2e2e2",
        "surface": "#f9f9f9",
        "tertiary-fixed-dim": "#89cffa",
        "surface-tint": "#c00012",
        "inverse-surface": "#2f3131",
        "tertiary-container": "#2f7ca3",
        "outline": "#916f6b",
        "on-surface": "#1a1c1c",
        "surface-container-low": "#f4f3f3",
        "on-primary-fixed-variant": "#93000b",
        "on-error-container": "#93000a",
        "secondary-fixed": "#9cf5bc",
        "surface-container-high": "#e8e8e8",
        "inverse-on-surface": "#f1f1f0",
        "surface-card": "#ffffff",
        "inverse-primary": "#ffb4ab",
        "on-tertiary": "#ffffff",
        "on-tertiary-fixed": "#001e2d",
        "outline-variant": "#e6bdb8",
        "primary": "#e82c2a",
        "surface-bright": "#f9f9f9",
        "background": "#f9f9f9",
        "on-primary": "#ffffff",
        "on-background": "#1a1c1c",
        "secondary": "#026d40",
        "primary-container": "#e12626",
        "tertiary": "#006389",
        "on-secondary-fixed-variant": "#00522f",
        "on-primary-fixed": "#410002",
        "on-tertiary-fixed-variant": "#004c6a",
        "error": "#ba1a1a",
        "on-primary-container": "#fffbff",
        "secondary-fixed-dim": "#81d9a1",
        "on-secondary-fixed": "#002110",
        "primary-fixed-dim": "#ffb4ab",
        "surface-container": "#eeeeed",
        "surface-bg": "#f9f9f9",
        "on-tertiary-container": "#fcfcff"
      },
      borderRadius: {
        "DEFAULT": "0.25rem",
        "lg": "0.5rem",
        "xl": "0.75rem",
        "full": "9999px"
      },
      spacing: {
        "section-padding": "80px",
        "margin-mobile": "20px",
        "base": "8px",
        "margin-desktop": "64px",
        "gutter": "24px"
      },
      fontFamily: {
        "display-lg": ["Outfit"],
        "display-lg-mobile": ["Outfit"],
        "label-sm": ["Hanken Grotesk"],
        "label-lg": ["Hanken Grotesk"],
        "body-md": ["Hanken Grotesk"],
        "headline-lg": ["Outfit"],
        "headline-xl": ["Outfit"],
        "headline-md": ["Outfit"],
        "body-lg": ["Hanken Grotesk"]
      },
      fontSize: {
        "display-lg": ["64px", { lineHeight: "1.1", letterSpacing: "-0.02em", fontWeight: "800" }],
        "display-lg-mobile": ["44px", { lineHeight: "1.1", letterSpacing: "-0.02em", fontWeight: "800" }],
        "label-sm": ["12px", { lineHeight: "1.2", fontWeight: "500" }],
        "label-lg": ["14px", { lineHeight: "1.2", letterSpacing: "0.02em", fontWeight: "600" }],
        "body-md": ["16px", { lineHeight: "1.6", fontWeight: "400" }],
        "headline-lg": ["32px", { lineHeight: "1.2", fontWeight: "700" }],
        "headline-xl": ["40px", { lineHeight: "1.2", fontWeight: "700" }],
        "headline-md": ["24px", { lineHeight: "1.3", fontWeight: "600" }],
        "body-lg": ["18px", { lineHeight: "1.6", fontWeight: "400" }]
      }
    }
  }
};
