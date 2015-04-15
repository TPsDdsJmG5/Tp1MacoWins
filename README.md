# Tp1MacoWins
<h2> Primer TP de Dds, resolución e implementación de la primera parte del ejercicio MacoWins </h2>

<h3> Justificaciones de las decisiones tomadas:</h3>

-	A la hora de separar los tipos de prendas (Sacos, Pantalones, Camisas) nos planteamos dos posibilidades, una consistía en agregar una clase por cada tipo de prenda, así separándolas ya que cada una tiene un precio base distinto. En cambio, en la otra tendríamos una sola clase genérica Prenda, en la cual sus instancias serian cada tipo de prenda, siendo el precio base un atributo que se inicializa en cada instancia de Prenda, en vez de ser un atributo de Clase (como seria en la primera opción).

>Luego de discutirlo llegamos a la conclusión de que la segunda opción era mejor en este caso, porque en realidad el comportamiento de las prendas no es distinto, y se deberían crear clases distintas cuando estas tengan un comportamiento distinto, como lo único que difiere en las prendas es el precio, nos pareció más razonable ponerlo en un Atributo, que en cada instancia sea inicializado distinto, ya que en realidad el comportamiento de las distintas prendas es el mismo y raramente se modificaría con una nueva prenda, solo tendría un precio distinto.


-	A la hora de crear el método precioFinal comenzamos a discutir si debería ser un método del negocio o de la prenda, nos pareció que la responsabilidad real de determinar su precio final es de la prenda, de hecho es el precio final de esa prenda específica, en cambio el negocio solo pone un valor fijo, el precio nos pareció más dependiente de la prenda que posee un precio base, y es importada o no.


-	Con respecto a la diferencia de precios, cuando una prenda es importada o nacional, nos topamos con otro punto conflictivo. Nos planteamos tres opciones, utilizar un if, separando el comportamiento de manera sencilla y directa, teniendo un atributo que dice si es importada o no. La segunda opción consistía en realizar dos clases, una clase Prenda y una subclase PrendaImportada que hereda de Prenda, y redefine el método precioFinal. Y como última opción, nos planteamos usar composición, teniendo una sola clase Prenda con un atributo llamado Procedencia que termina definiendo cual es el factor multiplicativo dependiendo si éste es internacional o nacional.

>La decisión final fue utilizar la tercera opción, por un lado descartamos el if porque es una decisión bidireccional que para este caso sería totalmente factible, pero nos pareció que era demasiado estático, haciendo que en caso de necesitar modificarlo deberíamos anidar o rediseñar esta parte. Luego al compararlo con herencia nos encontramos que también nos dificultaría agregar alguna otra procedencia o agregar algún otro tipo de diferenciación, como una prenda de alguna tela especial. Por lo que concluimos que el state pattern nos permitiría hacer más flexible la implementación sin agregar una gran dificultad (de hecho es quizás, hasta más sencillo que la herencia).


-	A la hora de calcular las ganancias nos pareció conveniente que el negocio tenga una colección de las ventas realizadas, para luego para calcular la ganancia total de una fecha filtrando las de ese día delegando la responsabilidad de la ganancia propiamente en la Venta ya que es la que posee los datos reales para poder calcular el total ganado (que prenda y en qué cantidad). Es decir nos pareció que la responsabilidad de saber lo ganado en esa venta, es de la Venta propiamente dicha, y que en cambio, la responsabilidad de saber las ganancias totales de una fecha si es una responsabilidad del negocio ya que depende de las Ventas que tenga en su colección que sean de esa fecha.


# Tp1MacoWins(2)
<h2>Primer TP de Dds, resolución e implementación de la segunda entrega del ejercicio MacoWins</h2>

<h3> Justificaciones de las decisiones tomadas:</h3>

- *Cambiar de recibir un precio base a travez de un setter a hacerlo por herencia por el tipo (relacionar con extensibilidad y mantenibilidad como pide el enunciado)*

- *Implementar el coeficienteMarca por composición*

- *Dejar el coeficienteProcedencia por composición (Consistencia con el item de arriba (problemas similares => soluciones similares))*


