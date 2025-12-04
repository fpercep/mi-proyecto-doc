# Proyecto Intermodular: Calculadora Científica (Java) + CI/CD
Este proyecto implementa una calculadora científica en Java, diseñada para demostrar un flujo de trabajo completo de DevOps que incluye la generación automática de documentación técnica y su despliegue continuo mediante GitHub Actions.

## Enlaces
  - Respositorio: [enlace](https://github.com/fpercep/mi-proyecto-doc)
  - Documentación: [enlace](https://fpercep.github.io/mi-proyecto-doc/package-summary.html)

## Herramientas: Javadoc(Generar HTML)
Comando local(el dado en la tarea me daba errores): """javadoc -d docs/api -encoding UTF-8 -charset UTF-8 -author -version src/CalculadoraCientifica.java"""
Ejemplos código documentado: 
  /**
   * Divide dos números reales.
   * * @param a el número a dividir (dividendo)
   * @param b el número por el cual dividir (divisor)
   * @return el cociente de la división
   * @throws ArithmeticException si el divisor es cero
   */
  public double dividir(double a, double b) {
      if (b == 0) {
          throw new ArithmeticException("No se puede dividir por cero.");
      }
      return a / b;
  }


## Explicación del workflow:
Se a implementado un flujo moderno de Github Pages(Artifacts) en lugar del pedido, ya que tenia errores de los que era incapaz de resolver.
### Pasos del Jobs:
  - Checkout: Descarga el codigo
  - Setup Java: Instala el JDK 21
  - Generar Javadoc: Crear la web HTML
  - Actions configure: Configura Github Pages
  - Upload Pages Artifact: Empaqueta la carpeta docs/api en un archivo comprimido
  - Deploy Pages: Despliega ese archivo comprimido a Github Pages

## Como usar en local:
  1. Clonar
      git clone https://github.com/fpercep/mi-proyecto-doc.git
      cd mi-proyecto-doc
     
  2. Compilar y ejecutar
      javac src/*.java
      java -cp src CalculadoraCientifica
     
  3. Generar Documentación
      javadoc -d docs/api -encoding UTF-8 -charset UTF-8 -author -version src/*.java


Cuestionario: 
  -  Identificación de herramientas de generación de documentación: He utilizado Javadoc
  -  Documentación de componentes: Utlizo el estilo Javadoc. En la sección "Ejemplos código documentado" se muestra el uso de docstrings estructurados
  -  Publicación en GitHub Pages: Aunque el enunciado dice peaceiris, he utilizado GitHub Actions Artifacts.
        Configuración Repo: Settings > Pages > Build and deployment, eligue Source: GitHub Actions
  -  Colaboración: GitHub Pages permite que cualquier persona que dicida usar mi codigo, tengo acceso a su documentación
  -  Control de versiones: Casi todos los mensajes de commit, evendecian que cambios se hicieron
  -  Accesibilidad y segurida: Al ser publico, la documetación es accesible globalmente.
  -  Instalación/uso documentados: Las instruciones estan en el apartado de enlaces y la instalción es como la de cualquier otro repositorio
  -  Integración continua y despliegue continuo (CI/CD): Al hacer push, Github Actions compila la documentación y asegura que el código es documentable y no tiene errores
