document.addEventListener("DOMContentLoaded", () => {
  const form = document.getElementById("surveyForm");
  const popup = document.getElementById("popup");
  const popupClose = document.getElementById("popup-close");
  const popupDetails = document.getElementById("popup-details");

  form.addEventListener("submit", (e) => {
    e.preventDefault();

    if (validateForm()) {
      displayPopup();
      form.reset();
    }
  });

  popupClose.addEventListener("click", () => {
    popup.style.display = "none";
  });

  function validateForm() {
    const Name = document.getElementById("Name").value.trim();
    const email = document.getElementById("email").value.trim();
    const textarea = document.getElementById("textarea").value;

    if (!Name || !email || !textarea) {
      alert("All fields are required.");
      return false;
    }
    return true;
  }

  function displayPopup() {
    const Name = document.getElementById("Name").value.trim();
    const textarea = document.getElementById("textarea").value.trim();
    const email = document.getElementById("email").value.trim();

    const details = `
        <p><strong>First Name:</strong> ${Name}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Email:</strong> ${textarea}</p>
      `;

    popupDetails.innerHTML = details;
    popup.style.display = "flex";
  }
});
