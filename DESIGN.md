---
name: Modern Zest
colors:
  surface: '#f9f9f9'
  surface-dim: '#dadad9'
  surface-bright: '#f9f9f9'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#f4f3f3'
  surface-container: '#eeeeed'
  surface-container-high: '#e8e8e8'
  surface-container-highest: '#e2e2e2'
  on-surface: '#1a1c1c'
  on-surface-variant: '#5d3f3c'
  inverse-surface: '#2f3131'
  inverse-on-surface: '#f1f1f0'
  outline: '#916f6b'
  outline-variant: '#e6bdb8'
  surface-tint: '#c00012'
  primary: '#bb0011'
  on-primary: '#ffffff'
  primary-container: '#e12626'
  on-primary-container: '#fffbff'
  inverse-primary: '#ffb4ab'
  secondary: '#026d40'
  on-secondary: '#ffffff'
  secondary-container: '#9af3b9'
  on-secondary-container: '#0d7144'
  tertiary: '#006389'
  on-tertiary: '#ffffff'
  tertiary-container: '#2f7ca3'
  on-tertiary-container: '#fcfcff'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#ffdad6'
  primary-fixed-dim: '#ffb4ab'
  on-primary-fixed: '#410002'
  on-primary-fixed-variant: '#93000b'
  secondary-fixed: '#9cf5bc'
  secondary-fixed-dim: '#81d9a1'
  on-secondary-fixed: '#002110'
  on-secondary-fixed-variant: '#00522f'
  tertiary-fixed: '#c5e7ff'
  tertiary-fixed-dim: '#89cffa'
  on-tertiary-fixed: '#001e2d'
  on-tertiary-fixed-variant: '#004c6a'
  background: '#f9f9f9'
  on-background: '#1a1c1c'
  surface-variant: '#e2e2e2'
  surface-bg: '#f9f9f9'
  surface-card: '#ffffff'
  accent-red: '#e82c2a'
typography:
  display-lg:
    fontFamily: Outfit
    fontSize: 64px
    fontWeight: '800'
    lineHeight: '1.1'
    letterSpacing: -0.02em
  display-lg-mobile:
    fontFamily: Outfit
    fontSize: 44px
    fontWeight: '800'
    lineHeight: '1.1'
    letterSpacing: -0.02em
  headline-xl:
    fontFamily: Outfit
    fontSize: 40px
    fontWeight: '700'
    lineHeight: '1.2'
  headline-lg:
    fontFamily: Outfit
    fontSize: 32px
    fontWeight: '700'
    lineHeight: '1.2'
  headline-md:
    fontFamily: Outfit
    fontSize: 24px
    fontWeight: '600'
    lineHeight: '1.3'
  body-lg:
    fontFamily: Hanken Grotesk
    fontSize: 18px
    fontWeight: '400'
    lineHeight: '1.6'
  body-md:
    fontFamily: Hanken Grotesk
    fontSize: 16px
    fontWeight: '400'
    lineHeight: '1.6'
  label-lg:
    fontFamily: Hanken Grotesk
    fontSize: 14px
    fontWeight: '600'
    lineHeight: '1.2'
    letterSpacing: 0.02em
  label-sm:
    fontFamily: Hanken Grotesk
    fontSize: 12px
    fontWeight: '500'
    lineHeight: '1.2'
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  base: 8px
  gutter: 24px
  margin-mobile: 20px
  margin-desktop: 64px
  section-padding: 80px
---

## Brand & Style

The design system is evolving into a high-energy, modern, and "less serious" aesthetic that balances professional execution with a playful spirit. It moves away from the rigid sobriety of traditional artisanal branding toward a **High-Contrast / Modern** style that feels approachable and optimistic. 

The emotional response should be one of excitement and freshness, utilizing vibrant color blocking and dynamic typography to signal a contemporary food culture. This is achieved through a mix of clean white spaces, bold primary accents, and rounded geometry that feels tactile and friendly rather than corporate.

## Colors

The color palette is anchored by a vibrant, high-energy **Brand Red (#e82c2a)**. This color is the primary driver of the visual identity, used for critical calls to action and brand-defining sections like "Somos Pitsa!". 

The color mode is primarily **light**, utilizing a crisp white background for content containers to maintain a sense of cleanliness. Secondary greens and tertiary blues are used sparingly as functional accents for tags, status indicators, or category-specific backgrounds, ensuring the red remains the dominant visual focal point. Neutral tones are kept dark and high-contrast to ensure the playful typography remains sharp and legible.

## Typography

This system employs a dual-font strategy to balance character with readability. **Outfit** is used for all headlines and display text, providing a geometric, modern, and playful rhythm that defines the brand's personality. For the "Somos Pitsa!" section, utilize the heaviest weights of Outfit to maximize impact.

**Hanken Grotesk** serves as the workhorse for body text and labels. Its friendly, open counters and contemporary structure make it highly readable while feeling less formal than traditional grotesques. For mobile, headline sizes are scaled down slightly while maintaining their bold weights to ensure the playful energy persists on smaller screens.

## Layout & Spacing

The layout follows a **Fixed Grid** model on desktop (centering content at a maximum width of 1200px) and transitions to a **Fluid Grid** on mobile. 

The rhythm is built on an 8px spacing unit. Large vertical gaps (Section Padding) are used between major content blocks to create a breezy, modern editorial flow. Gutters are kept generous at 24px to prevent the interface from feeling cluttered, reinforcing the "less serious" and more open brand vibe.

## Elevation & Depth

Hierarchy is established using **Tonal Layers** combined with **Ambient Shadows**. Surfaces are primarily flat, but key interactive elements like cards and buttons utilize very soft, diffused shadows with a slight tint of the primary red to suggest they are "floating" slightly above the background.

Avoid heavy borders or stark outlines. Instead, use subtle color shifts in backgrounds to define different content zones. This creates a "soft stack" effect that feels modern and approachable rather than rigid and architectural.

## Shapes

The shape language is **Rounded**, defined by a consistent 8px (0.5rem) corner radius across all standard UI components like buttons, cards, and input fields. 

This specific radius is large enough to feel soft and friendly—supporting the "less serious" mandate—without becoming fully pill-shaped. This geometric consistency creates a unified visual language that ties the modern typography and vibrant colors together.

## Components

**Buttons:**
Primary buttons use the Brand Red (#e82c2a) with white text. They should have an 8px corner radius and a subtle lift effect on hover. Use `label-lg` for button text to maintain a bold, readable weight.

**Cards:**
Product and info cards use a white background with a very soft ambient shadow. The 8px corner radius is applied to both the card container and any images nested within it.

**Chips & Tags:**
Use for dietary labels (e.g., Vegan, Spicy). These should be fully rounded (pill-shaped) to distinguish them from actionable buttons, using low-saturation versions of the secondary or tertiary colors.

**Input Fields:**
Fields should have a 1px light gray border and an 8px radius. On focus, the border should thicken slightly and change to Brand Red to provide clear, playful feedback.

**Lists:**
Menu lists should be clean, using `body-lg` for item titles. Use subtle horizontal separators and generous vertical padding (16-24px) between items to maintain the open, airy feel of the layout.