# CSS Day 1 – Exercises: Problem Statements & Requirements

This package contains three beginner-friendly exercises aligned with your **Day 1: Foundations of CSS** topics.

---

## ✅ Exercise 1: Inline, Internal, and External CSS
**Goal:** Understand where CSS can be written and how cascade works across inline, internal, and external styles.

### Problem Statement
Create a webpage with a heading and a paragraph, and style them using all three CSS inclusion methods:
1. **Inline CSS** — Make the `<h1>` text color **blue** using the `style` attribute.
2. **Internal CSS** — Inside a `<style>` tag in `<head>`, set the `<p>` font size to **18px**.
3. **External CSS** — In `style.css`, set the `<body>` background to **light gray** (`#f0f0f0` or `lightgray`).

### Required Files
- `index.html`
- `style.css`

### Completion Checklist
- [ ] `<h1>` is blue **via inline CSS**
- [ ] `<p>` font size is **18px** **via internal CSS**
- [ ] `<body>` background is light gray **via external CSS**
- [ ] Page loads `style.css` with a proper `<link>` tag

---

## ✅ Exercise 2: Selectors Practice
**Goal:** Practice common selectors (universal, type, class, id) and see how they target elements.

### Problem Statement
Create a page with:
- 2 `<h1>` elements, 3 `<p>` elements, and 2 `<div>` elements.
- Apply the following with CSS:
  - **Universal selector** `*` → set a global font (e.g., `Arial, sans-serif`)
  - **Type selector** `h1` → color headings **red**
  - **Class selector** `.highlight` → **yellow** background for specific text
  - **ID selector** `#special` → set font size to **24px**

Use **external CSS** in `style.css` to define all rules.

### Required Files
- `index.html`
- `style.css`

### Completion Checklist
- [ ] `* { font-family: Arial, sans-serif; }` applied
- [ ] `h1` is red
- [ ] At least one element has class `.highlight` with yellow background
- [ ] At least one element has id `special` with font-size `24px`

---

## ✅ Exercise 3: Text, Colors & Units
**Goal:** Practice text styling using `px`, `em`, `rem`, alignment, color models, and spacing.

### Problem Statement
Create a `text-style.html` with three paragraphs:
1. **Paragraph 1** → `font-size: 16px; color: darkgreen;`
2. **Paragraph 2** → `font-size: 1.5em; color: rgba(0, 0, 255, 0.5);` (semi-transparent blue)
3. **Paragraph 3** → `font-size: 2rem; text-align: center; line-height: 1.8;`

Define the styles in an external `style.css` linked from `text-style.html`.

### Required Files
- `text-style.html`
- `style.css`

### Completion Checklist
- [ ] Paragraph 1 has `16px` font and **darkgreen** color
- [ ] Paragraph 2 uses **1.5em** and **rgba blue with 0.5 alpha**
- [ ] Paragraph 3 uses **2rem**, is **center-aligned**, and has `line-height: 1.8`

---

## 📦 Submission Hints
- Keep HTML semantic and minimal.
- Add comments in CSS using `/* ... */` to describe your rules.
- Validate file linking paths (relative `href="style.css"` from the HTML file).
- Test in the browser and use **Developer Tools → Inspect** to verify applied rules.