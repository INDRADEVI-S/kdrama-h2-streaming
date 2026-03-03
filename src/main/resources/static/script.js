fetch("/api/kdramas")
.then(res => res.json())
.then(data => {
    const container = document.getElementById("kdrama-container");
    data.forEach(drama => {
        const div = document.createElement("div");
        div.className = "card";
        div.innerHTML = `
            <img src="${drama.thumbnailUrl}" width="200">
            <h3>${drama.title}</h3>
            <p>${drama.genre}</p>
            <iframe width="300" height="200"
                src="${drama.trailerUrl}"
                frameborder="0" allowfullscreen>
            </iframe>
        `;
        container.appendChild(div);
    });
});
