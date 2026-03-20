package PRACTICA_I_AAMU.demo.CONTROLLERS;

import PRACTICA_I_AAMU.demo.models.Etiqueta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EtiquetaController {

    private List<Etiqueta> catalogo = new ArrayList<>();

    public EtiquetaController() {
        // --- ESTRUCTURA ---
        catalogo.add(new Etiqueta(1, "<html>", "Estructura", "Raíz del documento HTML.", "<html>...</html>", "lang", "<html></html>", ""));
        catalogo.add(new Etiqueta(2, "<head>", "Estructura", "Contenedor de metadatos (título, scripts, estilos).", "<head>...</head>", "Ninguno", "<head><title>Página</title></head>", ""));
        catalogo.add(new Etiqueta(3, "<body>", "Estructura", "Contiene el contenido visible del documento.", "<body>...</body>", "onload", "<body>Hola</body>", "<body>Contenido de la página</body>"));

        // --- TEXTO ---
        catalogo.add(new Etiqueta(4, "<h1> a <h6>", "Texto", "Encabezados de diferentes niveles.", "<h1>Título</h1>", "id, class", "<h1>Encabezado 1</h1>", "<h3>Encabezado de nivel 3</h3>"));
        catalogo.add(new Etiqueta(5, "<p>", "Texto", "Define un párrafo de texto.", "<p>...</p>", "id, class", "<p>Este es un párrafo.</p>", "<p>Párrafo de ejemplo.</p>"));
        catalogo.add(new Etiqueta(6, "<span>", "Texto", "Contenedor en línea para aplicar estilos.", "<span>...</span>", "class, style", "<span>Texto en línea</span>", "<span style='color:red'>Texto en rojo</span>"));
        catalogo.add(new Etiqueta(7, "<strong>", "Texto", "Define texto con importancia (negrita).", "<strong>...</strong>", "Ninguno", "<strong>Texto importante</strong>", "<strong>Texto resaltado</strong>"));
        catalogo.add(new Etiqueta(8, "<em>", "Texto", "Define texto con énfasis (cursiva).", "<em>...</em>", "Ninguno", "<em>Texto enfatizado</em>", "<em>Texto en cursiva</em>"));

        // --- ENLACES E IMÁGENES ---
        catalogo.add(new Etiqueta(9, "<a>", "Enlaces", "Crea un hipervínculo a otras páginas.", "<a href='URL'>Texto</a>", "href, target", "<a href='#'>Ir a inicio</a>", "<a href='https://google.com' target='_blank'>Google</a>"));
        catalogo.add(new Etiqueta(10, "<img>", "Imágenes", "Inserta una imagen en el documento.", "<img src='...' alt='...'>", "src, alt, width", "<img src='https://via.placeholder.com/50' alt='Img'>", "<img src='https://via.placeholder.com/150' width='100'>"));

        // --- LISTAS ---
        catalogo.add(new Etiqueta(11, "<ul>", "Listas", "Define una lista desordenada (con viñetas).", "<ul><li>...</li></ul>", "type", "<ul><li>Item</li></ul>", "<ul><li>Manzana</li><li>Pera</li></ul>"));
        catalogo.add(new Etiqueta(12, "<ol>", "Listas", "Define una lista ordenada (con números).", "<ol><li>...</li></ol>", "type, start", "<ol><li>Paso 1</li></ol>", "<ol><li>Primero</li><li>Segundo</li></ol>"));
        catalogo.add(new Etiqueta(13, "<li>", "Listas", "Define un elemento de una lista.", "<li>...</li>", "value", "<li>Elemento</li>", "<li>Elemento individual</li>"));

        // --- TABLAS ---
        catalogo.add(new Etiqueta(14, "<table>", "Tablas", "Crea una tabla para organizar datos.", "<table>...</table>", "border", "<table><tr><td>Dato</td></tr></table>", "<table border='1'><tr><th>Nombre</th><th>Edad</th></tr><tr><td>Juan</td><td>20</td></tr></table>"));
        catalogo.add(new Etiqueta(15, "<tr>", "Tablas", "Define una fila dentro de una tabla.", "<tr>...</tr>", "align", "<tr><td>Fila</td></tr>", "<tr><td>Celda 1</td><td>Celda 2</td></tr>"));
        catalogo.add(new Etiqueta(16, "<td>", "Tablas", "Define una celda de datos estándar.", "<td>...</td>", "colspan, rowspan", "<td>Celda</td>", "<td>Dato puntual</td>"));
        catalogo.add(new Etiqueta(17, "<th>", "Tablas", "Define una celda de encabezado (negrita y centrada).", "<th>...</th>", "scope", "<th>Encabezado</th>", "<th>Nombre de Columna</th>"));

        // --- FORMULARIOS ---
        catalogo.add(new Etiqueta(18, "<form>", "Formularios", "Contenedor para recoger datos del usuario.", "<form>...</form>", "action, method", "<form><input></form>", "<form action='#'><label>Escribe:</label><input type='text'></form>"));
        catalogo.add(new Etiqueta(19, "<input>", "Formularios", "Campo de entrada de datos.", "<input type='...'>", "type, name, value", "<input type='text'>", "<input type='checkbox'> Acepto"));
        catalogo.add(new Etiqueta(20, "<label>", "Formularios", "Etiqueta para un elemento del formulario.", "<label for='id'>Texto</label>", "for", "<label>Nombre:</label>", "<label style='color:blue'>Nombre completo:</label>"));
        catalogo.add(new Etiqueta(21, "<button>", "Formularios", "Botón clickeable.", "<button>Enviar</button>", "type", "<button>Click</button>", "<button type='button' class='btn'>Enviar Formulario</button>"));
        catalogo.add(new Etiqueta(22, "<select>", "Formularios", "Lista desplegable.", "<select><option>...</option></select>", "name, multiple", "<select><option>Opción</option></select>", "<select><option>Java</option><option>Python</option></select>"));

        // --- MULTIMEDIA ---
        catalogo.add(new Etiqueta(23, "<audio>", "Multimedia", "Reproduce contenido de sonido.", "<audio src='...'>", "controls, autoplay", "<audio controls></audio>", "<audio controls><source src='audio.mp3'></audio>"));
        catalogo.add(new Etiqueta(24, "<video>", "Multimedia", "Reproduce contenido de video.", "<video src='...'>", "controls, width, height", "<video width='200' controls></video>", "<video controls width='150'></video>"));

        // --- SEMÁNTICAS ---
        catalogo.add(new Etiqueta(25, "<header>", "Semánticas", "Cabecera de una sección o página.", "<header>...</header>", "class", "<header>Logo</header>", "<header style='background:grey'>Encabezado Semántico</header>"));
        catalogo.add(new Etiqueta(26, "<footer>", "Semánticas", "Pie de página o sección.", "<footer>...</footer>", "class", "<footer>Copyright 2026</footer>", "<footer style='border-top:1px solid'>Pie de página</footer>"));
        catalogo.add(new Etiqueta(27, "<section>", "Semánticas", "Sección genérica de contenido.", "<section>...</section>", "id", "<section>Sección</section>", "<section><h3>Bloque de contenido</h3></section>"));
        catalogo.add(new Etiqueta(28, "<article>", "Semánticas", "Contenido independiente y autónomo.", "<article>...</article>", "class", "<article>Noticia</article>", "<article>Post de blog</article>"));
        catalogo.add(new Etiqueta(29, "<nav>", "Semánticas", "Sección de enlaces de navegación.", "<nav>...</nav>", "class", "<nav>Menu</nav>", "<nav><a href='#'>Inicio</a> | <a href='#'>Contacto</a></nav>"));
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("etiquetas", catalogo);
        return "index";
    }

    @GetMapping("/etiqueta/{id}")
    public String detalle(@PathVariable int id, Model model) {
        Etiqueta actual = catalogo.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);

        model.addAttribute("etiqueta", actual);
        model.addAttribute("anterior", id > 1 ? id - 1 : null);
        model.addAttribute("siguiente", id < catalogo.size() ? id + 1 : null);

        return "detalle.html";
    }
}