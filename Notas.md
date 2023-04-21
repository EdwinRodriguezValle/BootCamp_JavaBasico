## Notes first week and second week: 

### This I should learn to learn very fast: 

# 1. Composer 
docker  - composer curse ()
- `composer dump` : Limpia el cache, después de modificar la base de datos hay que actualizar
- `composer install`: Instala el paquete de composer,
- `composer install` --ignore-platform-reqs


# 2. pdbuilder
pdbuilder (Converts data schema from an ORM (Object Relational ) schema definition file to PHP classes, and
   creates the tables in a database.). Es parte de Pereci, el crea para ti las clases que van a conectar con la base de datos. 
Comandos para ejecutar desde consola: 
 - `$ vendor/bin/pdbuild -help` : Te da todo los comando para crear la base de datos
 - `vendor/bin/pdbuild` 
 - `vendor/bin/pdbuild -d` : crea la base de datos
 - `vendor/bin/pdbuild -F` : conecta a la base de datos, y migra a la última version

# 3. Git bash comandos

- `pwd` : te muestra la carpeta en la que estas
- `cd`: te permite cambiar de directorios: Por ejemplo`cd c`: entra en el disco c, `cd xampp`: entra en el directorio xampp, `cd edwin`: entra en el directorio edwin.
-  `cd ..` : te permite regresar un nivel para atrás
- `$ tail -f logs/framework.log`: esto te permite ver los log de tu proyecto
- Una manera de usar el bash es iniciar en la carpeta que quieres usar. 
- Hay que tener en cuenta que tienes que estar en la carpeta correcta. Porque después de ejecutar el anterior comando te quedas en una carpeta pero no lo vez. Entonces, hay que tener en cuenta que y mirar bien que carpeta estas ubicado, sabien eso puedes ejecutar cualquier comando.
- `ctrl + flecha arriva o abajo`: Te permite subir o bajar en los comandos que yas ejecutado anteriormente en la consola. 
- `git stash`: Guarda los cambios el los commit y te permite cambiar entre directorios. En realidad tiene varias funciones en combinación con otros comandos. como `git stash list` que te lista los cambios guardado, `git stash show`te muestra los cambios `git stash apply` restaura los diferentes commit
- `git diff`: se utiliza cuando deseas ver las diferencias entre dos ramas. Esto prodría ser la diferencia entre tu entorno de trabajo y tu área de ensayo (git diff por sí mismo), entre tu área de ensayo y tu última confirmación o commit (git diff --staged), o entre dos confirmaciones (git diff master branchB).
- diff ayuda a encontrar diferencias entre los estados de un repositorio/unos archivos. Esto es útil para predecir y evitar conflictos de fusión.
- `git fetch`: descarga commits, archivos y referenicas de un repositorio remoto a tu repositorio local. A diferenica de git pull, `git fetch`hace que tu repositorio local se actualice con la última información que hay en el repositorio remoto, pero no hace ninguna transferncia de archivos a tu espacio de trabajo local, sirve par aver si hay algún cmabio y si es bueno traerlo a tu repositorio local.
- `git pull` : comprueba si hay cambios en el repositorio remoto y, en caso de que haya, se trae eso archivos a tu repositorio local y tu espacio de trabajo.
- `git checkout + el numero de issue`: este to permite crear un uno branch en git para el issue en la que estas trabajando.
- `git add -p`: agrega todos los cambios a git uno por uno, así te permite revisar cada cambio y aceptar o rechazar el cambio que has hecho antes de hace `git push`.
- `q` : es similar a quiet.
- `git push origin --delete + numero de issue o branch a borrar`: Este comando se usa para borrar un repositorio en particular.
- `git cherry-pick`: es un potente comando que permite que las confirmaciones arbitrarias de Git se elijan por referencia y se añadan al actual HEAD de trabajo. La ejecución de cherry-pick es el acto de elegir una confirmación de una rama y aplicarla a otra. git cherry-pick puede ser útil para deshacer cambios
- `git commit -m`: Para hacer comentarios preferiblemente hacer precios y no más de 75 caracteres. Indicar con precición los que has cambiado.
- `git push ` : se usa en el proyecto git push sin ningún otro ruta de repositorio para subir los cambios al repositorio. cuando ejecutar este comando, defrente empuja a la rama en la que estas trabajando.
- `git rebase` : pone tu branch en un punto determinado del master o de una rama que se ha creado como master en una subrama.

# 4 Comando en PHP
 Para que te muestre más informacion sobre las variables poner: `/**`  al inicio del código y luego precionar enter. Y te muestra si es un parameto o argumento, etc.
 * Operadores php:
      - -> Se usa com el punto en java u otro lenguajes, te permite acceder a una función o método de un objeto
      - ** : exponencial
      - <> : Not equal 
      - != : Not equal 
      - <=> : Spaceship
      - xor : te devuelve true solo si las dos variables comparadas son verdaderos
      - . : El punto se usa para concatenar 
      - .= : Asignar concatenacion
      - ?? : Si el valor anterior que buscas no es asignado entonces te da por defecto el string que le asignas (// variable $color is "red" if $color does not exist or is null
        echo $color = $color ?? "red";)
      - $cars = array("Volvo", "BMW", "Toyota"); El array se escribe entre parentesis y se index con los corchetes. 
      - Esto son variables globales: 
        * $GLOBALS
        * $_SERVER
        * $_REQUEST
        * $_POST
        * $_GET
        * $_FILES
        * $_ENV
        * $_COOKIE
        * $_SESSION
      - Cuando atecedes un argumento con el signo "&" en PHP este no nodifica el valor inicial, sino unicamente hace una 
- `strtotime()` function is used to convert a human readable date string into a Unix timestamp (the number of seconds since January 1 1970 00:00:00 GMT).
- Uso del `this`: This se usa para senalar un objeto. This apunta al objeto que estas trabajando o el lugar donde se almacena el objeto. This va hacer mensión a la funcion, a la clase o al objeto con la cual estas trabajando.
- Uso del `privata`: La clase privada significa que las variables son unicamente usable en la misma clase, y no pueden ser heredadas. Solo se puede usar con get y set.
- Uso del `protected`: Es casi similar a private, se puede usar dentro de la misma clase, pero se puede heredar a las clases hijas. 
- Porque usar una clase o funcion protegido o privado?: Se usa protegido porque cuando defines una función protegido se guarda una sola vez en la memoria, y cualquier cambio que hagas desde otro lado o fuera de la clase puede afectar a la función y eso puede generar error en el sistema. Por eso, la idea de hacerlos protegido o privado para que no varie la información y no termine por caussar porblemas en el sistema. 
- `Static`: Una función o clase estatico no necesita una tipo especifico de objeto o dato que le desde, Por ejemplo, puedes darle como parametro o imput cualquier cosas y el te va procesar. Y puedes llamar con los dos punto '::'. Además, no es necesario crear intancias del objeto cuando trabajas con clases staticas. Una función estatica también se puede escribir fuera de la clase en PHP y se puede definir la misma función dos veces. Pero esto no es reocmendable porque puede llevar a gener complicaciones en el software. 
- En PHP, una función o clase estática es una función o clase que se puede invocar o utilizar sin necesidad de crear una instancia del objeto que la contiene. Esto significa que no es necesario crear un objeto a partir de una clase para acceder a sus funciones o propiedades estáticas, sino que se pueden llamar directamente desde la clase misma.

```php
class MiClase {
    public static $miPropiedad;

    public static function miMetodo() {
       // Código del método
    }
}
// Acceso a una propiedad y llamada a un método estático
MiClase::$miPropiedad = "Valor";
MiClase::miMetodo();
```

- Que es un objeto?
  En PHP, un objeto es una instancia de una clase que representa una entidad del mundo real con sus propiedades (también conocidas como atributos) y sus comportamientos (también conocidos como métodos). Una clase, por otro lado, es un conjunto de definiciones que describe la estructura y el comportamiento de un objeto.

En otras palabras, una clase en PHP es un plano o una plantilla que define la estructura y el comportamiento de un objeto, mientras que un objeto es una instancia concreta de esa clase que puede almacenar datos en sus propiedades y ejecutar código en sus métodos.

La creación de un objeto en PHP implica crear una instancia de una clase utilizando el operador "new", seguido del nombre de la clase y paréntesis. Por ejemplo:

```php
Copy code
class MiClase {
// Propiedades y métodos de la clase
}

// Creación de un objeto
$miObjeto = new MiClase();
Una vez que se crea un objeto, se puede acceder a sus propiedades y métodos utilizando la notación de flecha "->". Por ejemplo:

php
Copy code
$miObjeto->propiedad = "Valor"; // Asignación de valor a una propiedad
echo $miObjeto->propiedad; // Acceso al valor de una propiedad
$miObjeto->metodo();// Llamada a un método
```

En PHP, un objeto es una instancia de una clase que representa una entidad del mundo real con sus propiedades y métodos. En la programación orientada a objetos, un objeto es una unidad autónoma que encapsula datos y comportamientos relacionados en una sola entidad.

En PHP, se puede crear una clase utilizando la palabra clave "class", seguida del nombre de la clase y su definición, que puede incluir propiedades (también conocidas como atributos) y métodos. Por ejemplo:

```php
Copy code
class MiClase {
public $propiedad1;
private $propiedad2;

    public function metodo1() {
        // Código del método
    }
    
    private function metodo2() {
        // Código del método
    }
}
````
Una vez que se define una clase, se puede crear un objeto a partir de ella utilizando el operador "new", seguido del nombre de la clase y paréntesis. Por ejemplo:

```php
php
Copy code
$miObjeto = new MiClase();
````

El objeto creado, en este caso "$miObjeto", es una instancia de la clase "MiClase", y puede acceder a sus propiedades y métodos utilizando la notación de flecha "->". Por ejemplo:

```php
php
Copy code
$miObjeto->propiedad1 = "Valor"; // Asignación de valor a una propiedad
echo $miObjeto->propiedad1; // Acceso al valor de una propiedad
$miObjeto->metodo1(); // Llamada a un método
```

En resumen, en PHP, un objeto es una instancia de una clase que representa una entidad del mundo real con sus propiedades y métodos, y se crea utilizando el operador "new" seguido del nombre de la clase.

- 

# 5 DQL: Doctrine Query Language
Doctrine Query Language (DQL) is an Object Query Language created for helping users in complex object retrieval.

- fetch: Te permite realizar una llamada a una API externa sin detener la ejecución de otras instrucciones. En git refresca todo el rama de trabajo o carpeta.
- relations: Las relaciones en DQL se escriben con la palabra `relacion` y ya no necesitas hacer las relaciones de join (left join, )

# SQL
- Cuando igualas dos ids solo va filtrar esa condición que cumple con la igualdad (por ejemplo: si dices que:  `INNER JOIN tblpersoon ON kps_per_id = per_id` 

```sql
SET @datum_start = '2019-09-09 00:00:00';
SET @datum_eind = '2020-05-09 00:00:00';

SELECT
  per_id as id,
  per_geboortedatum as geboortedatum,
  gsl_token as geslacht,
  lnd_omschrijving as geboorteland,
  DATE(kps_created_at) as `datum ingelogd`,
  COUNT(DISTINCT kps_id) AS `# ingelogd`
FROM tblklantportaalsessie
  INNER JOIN tblpersoon ON kps_per_id = per_id
  LEFT JOIN tbldossier ON dos_per_id = per_id AND dos_deleted_at IS NULL
  LEFT JOIN tblzorggeschiedenis ON zgg_dos_id = dos_id AND (zgg_datum_einde IS NULL OR zgg_datum_einde > kps_created_at)
  LEFT JOIN tblgeslacht ON per_gsl_id = gsl_id
  LEFT JOIN tblland ON per_geboorte_lnd_id = lnd_id
  WHERE kps_created_at BETWEEN @datum_start AND @datum_eind

  GROUP BY id, `datum ingelogd`
  ORDER BY `datum ingelogd`, geboortedatum
  ;
```

# 6 Pereci
Prefijos que usan para acompanar la description de textos, id, etc. Si ves esta indicación sabes a que acción hace referencia la clave o nombre. 
* or : Object Resource
* a : action 
* fl : form layout
* lb : links button
* m = mensaje
* val : validator

- Context : dirige el objeto resources o también te permite ubicarte o consumir un tipo de dato en una tabla, etc
- Metodo : Por ejemplo, el método te puede mostrar todos los datos del objeto o tabla en el output o tabla
- valor : tiene que ser escrito igual que en la base de datos 
- newObject : introduce un nuevo método
- En action: tiene que refrescar todos los vínculos donde estas trabajando con los datos: por ejemplo, refrescaqr el objeto si ingresar el dato, refrescar el output o table si muesytras los datos en una tabla, también refrescar el ingreso si estas usando para ingresar datos. Para que no se quede el texto o dato que has ingresado. 
- class : solo sirve para formatear y conectar con el archivo CSS.

- En el código de abajo solo para poner un signo de admiración en la etiqueta y que funcione bien   
todo el textoutput lo puso dentro de un Stack con una formato de layoutMode de "Flat" con el valor de value="schooljaar" y formato class="nbsp", 
luego  pone en un outpur el  <TextOutput class="far fa-question-circle" y en tolltip = el nombre del texto que saldrá. tooltip="vul hier het eerste jaartal in van het schooljaar, dus 2023 voor schooljaar 2023-2024, enz." />


` <NumberInput clientThousandSeparator="=null" value="{psc_schooljaar}" validator="{#valNotNull}"
  width="50px" extension="{#eSchooljaren}" condition="=NOT{#mVVE.value}">
  <NumberInput.label>
  <Stack layoutMode="Flat">
  <TextOutput value="schooljaar" class="nbsp" />
  <TextOutput class="far fa-question-circle"
  tooltip="vul hier het eerste jaartal in van het schooljaar, dus 2023 voor schooljaar 2023-2024, enz." />
  </Stack>
  </NumberInput.label>
  </NumberInput>`

# 6 Build database and relations
La base de datos se crea el modelo `models.yml` archivo.
- Primero se escribe en formato de sql en el modelo,
- Segundo, después de haber construido de manera textual la base de datos se construye con los comando de `pdbuilder`
  - Primero: `$ vendor/bin/pdbuild -d` : Esto construye la base de datos
  - Segundo: `$ vendor/bin/pdbuild -F` :Esto construye la base de datos y las conexiones
  - Terner cuidado con la 'f' `$ vendor/bin/pdbuild -f`: la b chica va forzar que la base de datos se borre. -f pequena es para forza en git
- 

# 6 Comando generales
- `ctrl + c` : cancel
-  con una variable de tipo booleano `if($Student){ejecutamos un querry}` en este if, si estudiante es null, me va dar falso, para evitar que me de falso la forma de escribir el boolens es `if(!is_null($Student)){ejeructar qwuerry}` . Con esto me aseguro me va dar devolver un valor,
- Todos los objetos siempre hay que escribirlos en singular.  
- shift + tab: en la creación de los modelos sirve para saltar un espacio atrás.
- `ctrl + l` : lock
- `ctrl`  d = duplicate
- `ctrl + f`: Busca 
- `ctrl + shift +` : Si bloqueas o marcas con doble click una propiedad y luego haces `ctrl + shift + f` entonces va marcar todo los valores a lo largo de todo el documento.
- `{ }` : En Pereci y otros softwares este símbolo te permite conectar valores
- `ctrl +  shif = f` : busca los archivos en todo el proyecto
- `doble shift`: busca el elemento resaltado.
- `ctrl + enter`: te muestra las ocurrencias o las veces que un elemento se repite o la busqueda se muestra.
- `alt + j` : selecciona todos los comandos similares para abajo.
- `f 4`: Cuando estas en la tabla coge todos los valores presentes que hay en la tabla.
- `Shift + windows + s` : es la ruta corta a la herramienta cortados de pantalla fde windows.
- `ctrl + click` : vez a la función sobre la cual cliqueas.

# Procedimiento para trabajar los issues.
## Primera etapa: Resolver el problema
1. Revisar muy bien el issue asignado.
2. Ir al proyecto y buscar el problema y resolver el problema (hay que buscar las fallas y comparar con anteriores resoluciones).
3. Crear merge: Con el botton azul que esta en la parte infierior del issue.
4. Una vez creado el merge, en la sección de comentarios del issue, hacer una descripción clara del problema de: 
   - De lo que es capaz de hacer el software después de los cambios que hiciste.
   - Luego hay que describir el problema que has resuelto muy aprecido al issue.
   - limpiar las otras parte del formulario que no vas usar.
   - Chequear que todo este limpio y bien claro.
4. `git fetch --all`: Actualiza el branch con todo los cambios que has y baja la información a tu ordenador. 
5. `git add -p` : agregar uno por uno los archivos que has modificado al branch confirmando o rechazando los combios con un "y" o "n" mas enter.
6. `git commit -m`: comentar los cambios que has hecho. El comentario debe ser corto claro y conciso.
7. `git push` : unicamente git push, porque ya estas ubicado en el banch del issue. Siempre puedes chequear el branch con `git branch`
8. Después de terminar todo el comentario presionar el el boton de create `merge request` y va correr el pilene
8. Luego correr todo los test o el `pipeline`. Toma un poco de tiempo porque ejecuta todo los test. Si las modificacines que has hecho pasan todo los test siguiente paso.
9. En la casilla final porner tu nombre que para saber que tu fuiste quien resolvio el problema.
10. Luego markar como `mark as ready`.
10. Luego en la parte derecha superior asignar tu resolucion a un revisor para que haga el control.
11. El revisa y puede aprovar o dar comentarios para mejorar la solucin del problema 
12. Si tiene visto bueno, entonces se asigna a un merge partner para que revise y haga el merge. 

## Segunda etapa: Merge Request  MR
1. Resvisar las categorias que están pendientes para hacer el merge en la esquina superior del git.eljakim
2. Abrir los isuues pendientes para hacer el merge (cuando esta pendiente esta en modus draft. Para cambiar hay que abrir el modo edit merge !xxxx numero del issue y deschequear el casillero de mark as draft)
3. Ver si hay discusiones abiertas. Si hay que ir al boton resolver discusion y en la paste superior hay que ajustar el boton refres que tiene un simbolo circular y con eso se terminar de resolver el discusion.
4. Finalmente, asignar la responsabilidad de hacer el merge al collega que esta siendo senalado al azar por bot.
5. Con eso termina el issue en tu caso. 

# MarkDawn
- Here's a sentence with a footnote. [^1]
- ~~The world is flat.~~ : Para tachar texto

[^1]: This is the footnote.
- Doble espacio en blanco despues de una linia de texto te pemrite bajar a la siguiente linea.
- Tres bloques de back tik ```sql (o la extensión de código que deseas enviar) + codigo ``` te permite enviar el código en formato de código y con la sintaxis de lengua en la que estas escribiendo. Los tres back tikies construyen un bloquer de código. 


!1 Este seria el pie de página.
