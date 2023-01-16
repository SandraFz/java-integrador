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
                        <p class="card-text">El primer trabajo integrador fue de el de maquetar una página según un prototipo que nos proveyeron. Aquí apliqué los conocimientos básicos de HTML, CSS y Bootstrap.</p>
                    </div>
                </div>
                <div class="card">
                    <a class="img-cards" href="https://sandrafz.github.io/cac003-maquetaBootstrap/" target="_blank">
                        <img src="./assets/bootstrap-isologo.jpg" class="img fluid card-img-top img-bootstrap"
                            loading="lazy" alt="Logos de Bootstrap y HTML">
                    </a>
                    <div class="card-body">
                        <h5 class="card-title">Maquetado con Bootstrap</h5>
                        <p class="card-text">Este trabajo de maquetado, si bien se trataba de aplicar todo lo posible Bootstrap, me atreví a experimentar, de modo que el backgraund de las cards están hechas solo con CSS y solo los logos son imágenes.</p>
                    </div>
                </div>
                <div class="card">
                    <a class="img-cards" href="https://github.com/SandraFz/cac004-dataBases" target="_blank">
                        <img src="./assets/descarga.jpg" class="card-img-top img-db" loading="lazy"
                            alt="Esquema de base de datos">
                    </a>
                    <div class="card-body">
                        <h5 class="card-title">Base de datos</h5> 
                        <p class="card-text">En esta etapa aprendimos a crear una base de datos y a realizar las sentencias básicas. Esta BD es la misma que uso para el trabajo final.</p>
                    </div>

                    
            </div>
            <div class="card">
                        <a class="img-cards" href="<%=request.getContextPath()%>/start.jsp" target="_blank">
                            <img src="./assets/java-img.jpeg" class="card-img-top img-db" loading="lazy"
                                alt="Esquema de base de datos">
                        </a>
                        <div class="card-body">
                            <h5 class="card-title">Desafío Java</h5>
                            <p class="card-text">Finalmente estuvimos en condiciones de crear un CRUD con Java. El código se puede encontrar en mi Github como<a href="https://github.com/SandraFz/java-integrador" target="_blank">Java-integrador</a>
                            </p>
                        </div>
                </div>

        </div>

    </main>

    <footer>

    </footer>

    <script src="./bootstrap.js"></script>
</body>

</html>