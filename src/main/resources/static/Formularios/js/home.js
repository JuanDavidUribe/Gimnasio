const articles = [
  {
    image:
      "https://images.pexels.com/photos/1552242/pexels-photo-1552242.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
    text: "Disciplina",
  },
  {
    image:
      "https://images.pexels.com/photos/260352/pexels-photo-260352.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
    text: "Confianza",
  },
  {
    image:
      "https://images.pexels.com/photos/4162449/pexels-photo-4162449.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
    text: "Motivacion",
  },
  {
    image:
      "https://images.pexels.com/photos/4761779/pexels-photo-4761779.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
    text: "Riesgo",
  },
  {
    image:
      "https://images.pexels.com/photos/1608099/pexels-photo-1608099.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
    text: "Perseverancia",
  },
  {
    image:
      "https://images.pexels.com/photos/4761661/pexels-photo-4761661.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
    text: "Actitud",
  },
  {
    image:
      "https://images.pexels.com/photos/2085739/pexels-photo-2085739.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
    text: "Aprendizaje",
  },
];

const devTeam = [
  {
    name: "Cristian Idárraga",
    rol: "DESARROLLADOR",
    image: "images/cris.png",
    git: "https://github.com/Cristian-Idarraga",
  },
  {
    name: "Juan David Uribe",
    rol: "DESARROLLADOR",
    image: "images/juan.png",
    git: "https://github.com/JuanDavidUribe",
  },
  {
    name: "Anderson Garces",
    rol: "DISEÑADOR",
    image: "images/ander.png",
    git: "https://github.com",
  },
  {
    name: "Luis David Diaz",
    rol: "ARQUITECTO",
    image: "images/luis.png",
    git: "https://github.com",
  },
];

const innerDevTeam = () => {
  let content = "";
  let usersContainer = document.querySelector(".content-cards");
  devTeam.forEach((user) => {
    content += `<article class="card">
        <img class="user-icon" src="${user.image}" alt="user-icon" />
        <div class="user-desc">
            <h3>${user.name}</h3>
            <h5>${user.rol}</h5>
        </div>
        <a target="__blank" class="social" href="${user.git}" title="facebook"><img src="images/git.png" alt="facebook-logo" width="35px" /></a>
    </article>`;
  });
  usersContainer.innerHTML = content;
};

const innerArticles = () => {
  let text = "";
  let carouselContainer = document.querySelector(".carousel__container");
  articles.forEach((article) => {
    text += `<div class="carousel-item">
            <img class="carousel-item__img" src="${article.image}" alt="gym-image" />
            <div class="carousel-item__details">
            <p tabindex="0" class="carousel-item__details--title">${article.text}</p>
            </div>
            </div>`;
  });
  carouselContainer.innerHTML = text;
};

innerArticles();
innerDevTeam();
