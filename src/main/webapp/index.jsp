<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Desafío Java</title>
    <link rel="shortcut icon" href="./assets/favicon.ico">
    <link rel="stylesheet" href="./bootstrap.css">
    <link rel="stylesheet" href="./style.css">
</head>

<body>

    <main>

        <div>

            <div class="card mb-3">

                <div class="card-body top-card">
                    <h5 class="card-title">Codo a Codo 2022</h5>
                    <div>
                        <p class="card-text">Aquí encontrarás los proyectos de Sandra N. Fernández trabajados durante el curso Full Stack Java de Codo a Codo 2022/comisión 22561.</p>
                    </div>
                </div>
            </div>

            <div class="card-group">
                <div class="card">
                    <a class="img-cards" href="https://sandrafer-maquetacion1.netlify.app/" target="_blank">
                        <img src="./assets/final_front_2022.jpg" class="card-img-top img-front" loading="lazy"
                            alt="Captura de head de maquetado">
                    </a>
                    <div class="card-body">
                        <h5 class="card-title">Maquetado HTML, CSS y bootstrap</h5>
                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                            additional content. This content is a little bit longer.</p>
                    </div>
                </div>
                <div class="card">
                    <a class="img-cards" href="https://sandrafz.github.io/cac003-maquetaBootstrap/" target="_blank">
                        <img src="./assets/bootstrap-isologo.jpg" class="img fluid card-img-top img-bootstrap"
                            loading="lazy" alt="Logos de Bootstrap y HTML">
                    </a>
                    <div class="card-body">
                        <h5 class="card-title">Maquetado con bootstrap</h5>
                        <p class="card-text">This card has supporting text below as a natural lead-in to additional
                            content.</p>
                    </div>
                </div>
                <div class="card">
                    <a class="img-cards" href="https://github.com/SandraFz/cac004-dataBases" target="_blank">
                        <img src="./assets/descarga.jpg" class="card-img-top img-db" loading="lazy"
                            alt="Esquema de base de datos">
                    </a>
                    <div class="card-body">
                        <h5 class="card-title">Base de datos</h5>
                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                            additional content. This card has even longer content than the first to show that equal
                            height action.</p>
                    </div>

                    
            </div>
            <div class="card">
                        <a class="img-cards" href="<%=request.getContextPath()%>/start.jsp" target="_blank">
                            <img src="./assets/java-img.jpeg" class="card-img-top img-db" loading="lazy"
                                alt="Esquema de base de datos">
                        </a>
                        <div class="card-body">
                            <h5 class="card-title">Desafío Java</h5>
                            <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                                additional content. This card has even longer content than the first to show that equal
                                height action.</p>
                        </div>
                </div>

        </div>

    </main>

    <footer>

    </footer>

    <script src="./bootstrap.js"></script>
</body>

</html>