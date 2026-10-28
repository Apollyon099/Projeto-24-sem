
document.querySelectorAll(".image").forEach((card) => {
  card.setAttribute("aria-pressed", "false");

  card.addEventListener("click", () => {
    const active = card.classList.toggle("active");
    card.setAttribute("aria-pressed", String(active));
  });
});
