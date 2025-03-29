# Teoria-java
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)


**🔹T1 [Identificación de los elementos de un programa informático. Lenguaje Java](https://github.com/nicgrefer/ejercicios-java/blob/main/README.md#-tema-1-identificaci%C3%B3n-de-los-elementos-de-un-programa-inform%C3%A1tico-lenguaje-java)**

**🔹T2 [Elementos Básicos del Lenguaje Java](https://github.com/nicgrefer/ejercicios-java/blob/main/README.md#-tema-2-elementos-b%C3%A1sicos-del-lenguaje-java)**

**🔹T3 [Estructuras de Control](https://github.com/nicgrefer/ejercicios-java/blob/main/README.md#-tema-3-estructuras-de-control)**

**🔹T4 [Utilización de Objetos](https://github.com/nicgrefer/ejercicios-java/blob/main/README.md#-tema-4-utilizaci%C3%B3n-de-objetos)**

**🔹T5 [Introducción a la Programación Orientada a Objetos (POO)](https://github.com/nicgrefer/ejercicios-java/blob/main/README.md#-tema-5-introducci%C3%B3n-a-la-programaci%C3%B3n-orientada-a-objetos-poo)**

**🔹T6 [Programación Orientada a Objetos Avanzada en Java](https://github.com/nicgrefer/ejercicios-java/blob/main/README.md#tema-6---programaci%C3%B3n-orientada-a-objetos-avanzada-en-java)**

**🔹T7 [Arrays y Ventanas](https://github.com/nicgrefer/ejercicios-java/blob/main/README.md#-tema-7-arrays-y-ventanas)**

**🔹T10 Bincular con Bases de datos**

>[!NOTE]
> La siguiente informacion ha sido redactada por CHat

# 🎯 **Tema 1: Identificación de los elementos de un programa informático. Lenguaje Java**


## 💻 **1. Programas y Aplicaciones**

- Un **programa** es un conjunto de instrucciones ejecutables por un ordenador.
- Una **aplicación** es un software formado por uno o más programas + documentación + archivos necesarios.

📌 **Ejemplo:** Un editor de texto como Microsoft Word es una **aplicación**, ya que no solo contiene el código del programa, sino también configuraciones, plantillas y recursos adicionales.

---

## 🔄 **2. Ciclo de Vida de una Aplicación**

El desarrollo de software sigue varias fases:
1️⃣ **Análisis** 🧐 → Se identifican los requisitos.
2️⃣ **Diseño** 🎨 → Se planea la estructura del programa.
3️⃣ **Codificación** 💻 → Se escribe el código en un lenguaje de programación.
4️⃣ **Pruebas** 🧪 → Se verifica que funciona correctamente.
5️⃣ **Mantenimiento** 🔧 → Se actualiza y mejora.

---

## ❌ **3. Errores en la Programación**

Al programar, podemos encontrar varios tipos de errores:

- **Errores de usuario**: Datos mal introducidos.
- **Errores de programador**: Fallos en la lógica del código.
- **Errores de documentación**: Instrucciones incorrectas o incompletas.
- **Errores de interfaz**: Problemas en la interacción con el usuario.
- **Errores de E/S o comunicaciones**: Fallos en la entrada/salida de datos.
- **Errores fatales**: Provocan que el programa se cierre abruptamente.
- **Errores de ejecución**: Ocurren mientras el programa se está ejecutando.

---

## 🏗 **4. Historia de los Lenguajes de Programación**

🔹 **1ª generación**: Lenguaje máquina (0s y 1s) 🏴‍☠️.
🔹 **2ª generación**: Lenguaje ensamblador (SUM, MOV) ⚙️.
🔹 **3ª generación**: Lenguajes de alto nivel (FORTRAN, COBOL, BASIC, Pascal) 🚀.
🔹 **4ª generación**: Lenguajes más cercanos al usuario (SQL, lenguajes visuales) 📊.
🔹 **5ª generación**: Lenguajes de inteligencia artificial y programación declarativa (Prolog, LISP) 🤖.

---

# 🎯 **Tema 2: Elementos Básicos del Lenguaje Java**


## 🏷 **1. Identificadores en Java**

Los identificadores son los nombres de variables, métodos y clases. Deben seguir estas reglas:
✅ Pueden contener letras, dígitos, `_` o `$`.
❌ No pueden comenzar con un número.
❌ No pueden ser palabras reservadas (`class`, `int`, `public`, etc.).
✅ Java distingue entre mayúsculas y minúsculas: `HolaMundo` ≠ `holamundo`.

---

## 🎭 **2. Tipos de Datos en Java**

| Tipo      | Tamaño  | Rango                          |
| --------- | ------- | ------------------------------ |
| `byte`    | 1 byte  | -128 a 127                     |
| `short`   | 2 bytes | -32,768 a 32,767               |
| `int`     | 4 bytes | -2,147,483,648 a 2,147,483,647 |
| `long`    | 8 bytes | -9 \* 10¹⁸ a 9 \* 10¹⁸         |
| `float`   | 4 bytes | Precisión simple               |
| `double`  | 8 bytes | Precisión doble                |
| `boolean` | 1 bit   | `true` o `false`               |
| `char`    | 2 bytes | Caracteres Unicode             |

---

## 🔢 **3. Variables y Operadores**

📌 **Ejemplo de declaración de variables:**

```java
int edad = 25;
float precio = 9.99F;
boolean activo = true;
char letra = 'A';
```

✏️ **Operadores básicos:**

- Aritméticos: `+`, `-`, `*`, `/`, `%`
- Comparación: `==`, `!=`, `>`, `<`, `>=`, `<=`
- Lógicos: `&&`, `||`, `!`

🔢 **Ejemplo:**

```java
int suma = 5 + 3;
boolean mayor = (suma > 7) && (suma < 10);
System.out.println(mayor); // true
```

---

# 🎯 **Tema 3: Estructuras de Control**


## 🔍 **1. Estructuras de Selección (if-else, switch)**

### ✅ **Ejemplo de \*\*\*\*\*\*\*\*\*\*\*\*****`if-else`**:

```java
int edad = 18;
if (edad >= 18) {
    System.out.println("Eres mayor de edad");
} else {
    System.out.println("Eres menor de edad");
}
```

### 🔄 **Ejemplo de \*\*\*\*\*\*\*\*\*\*\*\*****`switch`**:

```java
int opcion = 2;
switch (opcion) {
    case 1:
        System.out.println("Opción 1 seleccionada");
        break;
    case 2:
        System.out.println("Opción 2 seleccionada");
        break;
    default:
        System.out.println("Opción no válida");
}
```

---

## 🔁 **2. Estructuras de Iteración (Bucles)**

### 🔄 **Ejemplo de \*\*\*\*\*\*\*\*\*\*\*\*****`while`**:

```java
int i = 1;
while (i <= 5) {
    System.out.println("Número: " + i);
    i++;
}
```

### 🔄 **Ejemplo de \*\*\*\*\*\*\*\*\*\*\*\*****`for`**:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}
```

### 🔄 **Ejemplo de \*\*\*\*\*\*\*\*\*\*\*\*****`do-while`**:

```java
int i = 1;
do {
    System.out.println("Número: " + i);
    i++;
} while (i <= 5);
```

---


# 🎯 **Tema 4: Utilización de Objetos**

---

## ✨ **1. Clase String: Manipulación de Cadenas**
La clase `String` en Java es **inmutable**, lo que significa que sus valores **no pueden cambiar** una vez creados. Vamos a ver algunos usos comunes. 🔠

### 🔍 **Ejemplo 1: Contar ocurrencias de una subcadena**
Este programa busca cuántas veces aparece una subcadena dentro de otra:
```java
public class Busqueda {
    public static void main(String[] args) {
        String texto = "hola caracola";
        String subcadena = "la";
        int index = texto.indexOf(subcadena);
        int count = 0;
        
        while (index != -1) {
            System.out.println("Aparece en la posición: " + index);
            count++;
            index = texto.indexOf(subcadena, index + 1);
        }
        System.out.println("Número de ocurrencias: " + count);
    }
}
```
👀 **¿Cómo funciona?**
1. `indexOf(subcadena)` busca la primera aparición de `"la"`.
2. Se usa un bucle `while` para encontrar más apariciones.
3. Se imprime la posición y el número total de veces que aparece.

---

### 🔄 **Ejemplo 2: Invertir mayúsculas y minúsculas**
Este código cambia las letras minúsculas a mayúsculas y viceversa:
```java
public class Invertir {
    public static void main(String[] args) {
        String texto = "Hola Macarena";
        StringBuilder resultado = new StringBuilder();
        
        for (char c : texto.toCharArray()) {
            if (Character.isUpperCase(c)) {
                resultado.append(Character.toLowerCase(c));
            } else {
                resultado.append(Character.toUpperCase(c));
            }
        }
        
        System.out.println("Cadena invertida: " + resultado.toString());
    }
}
```
🧐 **Explicación:**
- Se recorre la cadena con un `for`.
- Se usa `Character.isUpperCase()` y `Character.toLowerCase()` para hacer los cambios.

---

## 🎲 **2. Clase Random: Generación de Números Aleatorios**
`Random` nos permite generar números aleatorios en un rango específico. ¡Muy útil para juegos o simulaciones! 🎰

### 🎲 **Ejemplo: Encontrar el número más alto en una lista aleatoria**
```java
import java.util.Random;

public class Mayor {
    public static void main(String[] args) {
        Random rand = new Random();
        int mayor = 0;
        
        for (int i = 0; i < 20; i++) {
            int num = rand.nextInt(1000) + 1;
            System.out.println("Número generado: " + num);
            if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("El mayor número es: " + mayor);
    }
}
```
✅ **¿Qué hace este código?**
- Genera 20 números entre 1 y 1000.
- Guarda el mayor número encontrado.

---

## 📅 **3. Manejo de Fechas con `LocalDate`**
Java tiene una API moderna para fechas. 📆 Veamos cómo manejar fechas con `LocalDate`.

### 📅 **Ejemplo: Mostrar una fecha en formato corto y largo**
```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha1 {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(1990, 8, 5);
        System.out.println("Formato corto: " + fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Formato largo: " + fecha);
    }
}
```
📌 **Puntos clave:**
- `LocalDate.of(1990, 8, 5);` crea una fecha específica.
- `DateTimeFormatter.ofPattern("dd/MM/yyyy")` formatea la fecha de manera personalizada.

---

# 🎭 **Tema 5: Introducción a la Programación Orientada a Objetos (POO)**
La **POO** nos permite organizar nuestro código en **clases** y **objetos**. 💡

---

## 🔹 **1. Concepto de Objetos y Clases**
- Un **objeto** es una entidad con **estado** (atributos) y **comportamiento** (métodos).
- Una **clase** es el modelo a partir del cual se crean objetos. 🏗️

🔍 **Ejemplo: Crear una clase `Persona` y un objeto de ella**
```java
class Persona {
    String nombre;
    int edad;
    
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Juan";
        p1.edad = 25;
        p1.mostrarInfo();
    }
}
```

---

## 🏗 **2. Constructores: Creación de Objetos**
Un **constructor** inicializa un objeto cuando se crea. 🏠
```java
class Persona {
    String nombre;
    int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
```
📌 **Puntos clave:**
- El constructor tiene el mismo nombre que la clase.
- Se usa `this` para diferenciar entre variables de instancia y parámetros.

---

## 🎭 **3. Excepciones y Manejo de Errores**
Los errores pueden ocurrir en tiempo de ejecución. Java maneja estos problemas con `try-catch`. 🚨

### ⚠️ **Ejemplo: Capturar una excepción aritmética**
```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
}
```
🧐 **¿Qué pasa aquí?**
- `10 / 0` genera una `ArithmeticException`.
- El bloque `catch` la captura y muestra un mensaje amigable.


---

# **Tema 6 - Programación Orientada a Objetos Avanzada en Java**
## 🏰 **1. Herencia: ¿Qué es y para qué sirve?**
### 🎯 **Definición:**
La herencia es un mecanismo que nos permite crear una nueva clase (clase hija o derivada) a partir de otra ya existente (clase padre o base). La clase hija hereda los atributos y métodos de la clase padre, evitando repetir código.

### 🛠 **¿Para qué se usa?**
- Reutilizar código sin tener que copiar y pegar.
- Crear una jerarquía de clases organizada.
- Evitar redundancia y mejorar mantenimiento del código.

### 📌 **Ejemplo práctico**
Imagina que estamos programando un sistema para una empresa. Tenemos una clase `Empleado` con atributos y métodos generales:

```java
public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}
```
Ahora, queremos crear una clase `Programador`, que también es un `Empleado`, pero con habilidades específicas:

```java
public class Programador extends Empleado {
    private String lenguaje;

    public Programador(String nombre, double salario, String lenguaje) {
        super(nombre, salario);  // Llamamos al constructor de la clase padre
        this.lenguaje = lenguaje;
    }

    public void mostrarInfo() {  // Sobrescribimos el método para incluir el lenguaje
        super.mostrarInfo();
        System.out.println("Lenguaje: " + lenguaje);
    }
}
```

### 🚀 **¿Qué está pasando aquí?**
1. `Programador` hereda de `Empleado` gracias a `extends Empleado`.
2. Usa `super(nombre, salario);` para llamar al constructor de `Empleado`.
3. Sobrescribimos (`override`) el método `mostrarInfo()` para agregar el lenguaje.

---

## 🎭 **2. Clases Derivadas y Accesibilidad**
En herencia, hay reglas sobre qué atributos y métodos puede usar una clase hija:

| Modificador | Accesible en la Clase Hija | Explicación |
|------------|--------------------------|------------|
| `public`   | ✅ Sí | Se puede acceder desde cualquier parte del código. |
| `protected`| ✅ Sí | Solo accesible dentro del mismo paquete y por clases hijas. |
| `private`  | ❌ No | Solo accesible dentro de la propia clase base. |

### 💡 **Ejemplo con `protected`**
Si usamos `private`, `Programador` no podría acceder a `nombre` en `Empleado`. En cambio, con `protected`, sí podemos:

```java
protected String nombre;
```

---

## 🔨 **3. Constructores y `super()`**
### 📌 **Reglas clave:**
1. El constructor de la clase hija debe llamar primero al constructor de la clase base usando `super()`.
2. Si la clase base no tiene un constructor sin parámetros, la clase hija debe llamar explícitamente a uno con `super(atributos...)`.

#### 📌 **Ejemplo con `super()`**
```java
public class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}

public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String curso) {
        super(nombre);  // Llamamos al constructor de Persona
        this.curso = curso;
    }
}
```

---

## 🎭 **4. Sobrescritura de Métodos (`@Override`)**
Cuando una clase hija necesita modificar el comportamiento de un método heredado, lo sobrescribe usando `@Override`.

### 📌 **Ejemplo:**
```java
public class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }
}

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}
```
Si hacemos:
```java
Animal miPerro = new Perro();
miPerro.hacerSonido();
```
👉 Imprime **"Guau guau"**, no el sonido genérico.

---

## 🎭 **5. Sobrecarga de Métodos (`Overloading`)**
Es cuando tenemos varios métodos con el mismo nombre, pero diferentes parámetros.

### 📌 **Ejemplo:**
```java
public class Calculadora {
    public int suma(int a, int b) {
        return a + b;
    }

    public double suma(double a, double b) {
        return a + b;
    }

    public int suma(int a, int b, int c) {
        return a + b + c;
    }
}
```
💡 **Mismo nombre, distintos parámetros** = Sobrecarga.

---

## 🔄 **6. Conversión entre Objetos Derivados y Objetos Base (Casting de Objetos)**
En Java, las clases derivadas son **una especialización** de la clase base. Como resultado, podemos tratar un objeto de una clase hija como si fuera de la clase padre. Esto se conoce como **upcasting** y **downcasting**.

---

### 🔼 **Upcasting (Conversión de Hija a Base)**
Es cuando asignamos un objeto de una clase hija a una variable de la clase base. **Se hace automáticamente porque una clase hija "es un" tipo de su clase base.**

#### 📌 **Ejemplo:**
```java
class Empleado {
    public void trabajar() {
        System.out.println("Empleado trabajando...");
    }
}

class Programador extends Empleado {
    public void programar() {
        System.out.println("Escribiendo código...");
    }
}

public class Main {
    public static void main(String[] args) {
        Empleado emp = new Programador();  // Upcasting automático
        emp.trabajar();  // "Empleado trabajando..."
        // emp.programar();  // ❌ Error, porque la referencia es de tipo Empleado
    }
}
```

#### 🔍 **¿Qué pasó aquí?**
1. Creamos un objeto `Programador`, pero lo guardamos en una variable de tipo `Empleado`.
2. `emp` puede usar solo los métodos de `Empleado`, aunque realmente es un `Programador`.

---

### 🔽 **Downcasting (Conversión de Base a Hija)**
Es cuando convertimos una referencia de la clase base a una referencia de una clase hija. **Java no permite hacerlo automáticamente** porque podría generar errores en tiempo de ejecución.

#### 📌 **Ejemplo:**
```java
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Programador();  // Upcasting automático
        Programador prog = (Programador) emp;  // Downcasting explícito
        prog.programar();  // "Escribiendo código..."
    }
}
```

#### 🚨 **Peligro del Downcasting**
Si intentamos hacer `downcasting` de un objeto que **NO** es realmente de la clase hija, Java lanzará una **ClassCastException**.

```java
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado();  
        Programador prog = (Programador) emp;  // ❌ ERROR en tiempo de ejecución
        prog.programar();
    }
}
```

💡 Para evitar errores, podemos usar `instanceof` antes de hacer `downcasting`:
```java
if (emp instanceof Programador) {
    Programador prog = (Programador) emp;
    prog.programar();
}
```
> Si esta interesado en ver un ejemplo aplicado pinche [aquí](https://github.com/nicgrefer/ejercicios-java/tree/main/ejercicios/src/T7ejemplos/Barco_Herencia_casting_polimorfico)
---

## 🔗 **7. Ligadura Dinámica**
La **ligadura** es el proceso de conectar una llamada a un método con su implementación real.

### 🏗 **Tipos de Ligadura en Java**
| Tipo | Cuándo se resuelve | Ejemplo |
|------|-------------------|---------|
| **Ligadura Estática** | En tiempo de compilación | Métodos `final` (evita que tenga erencia), `static` o `private`. |
| **Ligadura Dinámica** | En tiempo de ejecución | Métodos sobrescritos en clases hijas (como con los [metodos abstractos](https://github.com/nicgrefer/ejercicios-java?tab=readme-ov-file#-8-clases-y-m%C3%A9todos-abstractos) )|

---

### 🔥 **Ejemplo de Ligadura Estática**
Si un método es `static`, `final` o `private`, la decisión de qué método ejecutar se hace **en tiempo de compilación**.

```java
class Vehiculo {
    public static void mensaje() {
        System.out.println("Mensaje de Vehiculo");
    }
}

class Coche extends Vehiculo {
    public static void mensaje() {
        System.out.println("Mensaje de Coche");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Coche();
        v.mensaje();  // "Mensaje de Vehiculo"
    }
}
```
🔍 Como `mensaje()` es `static`, se usa la versión de `Vehiculo`, aunque el objeto es un `Coche`.

---

### 🔥 **Ejemplo de Ligadura Dinámica**
Si sobrescribimos un método en una clase hija, **la versión que se ejecuta depende del objeto en tiempo de ejecución**.

```java
class Animal {
    public void hacerSonido() {
        System.out.println("Sonido de animal");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();  // Upcasting
        miAnimal.hacerSonido();  // "Guau guau" (ligadura dinámica)
    }
}
```

🔍 Aunque `miAnimal` es de tipo `Animal`, en tiempo de ejecución Java sabe que es un `Perro`, así que ejecuta `hacerSonido()` de `Perro`.

---


Por lo tanto una **`ESTATICA`** a parte de tener como método `estatico`  como se ve en el ejemplo para que muestre el cambio a de llamar a la clase, es decir `Coche c = new Coche()` por eso es *estática*, porque *No va a cambiar*. 

Sin embargo la **`DINÁMICA`** baria dependiendo del *`tipo`* que sea.

---

## 🏛 **8. Clases y Métodos Abstractos**
Una **clase abstracta** es aquella que no se puede instanciar directamente. Se usa como una **plantilla** para otras clases.

### 📌 **Ejemplo de Clase Abstracta**
```java
abstract class Figura {
    abstract double calcularArea();  // Método abstracto, no tiene implementación
}

class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio) { this.radio = radio; }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        System.out.println("Área del círculo: " + c.calcularArea());
    }
}

```
> [Aquí esta resuelto](https://github.com/nicgrefer/ejercicios-java/tree/main/ejercicios/src/T7ejemplos/Areas_Metosos_abstractos)


#### 🛠 **Reglas de las Clases Abstractas**
1. No se pueden instanciar (`new Figura();` da error).
2. Pueden contener métodos **abstractos** (sin cuerpo).
3. Pueden contener métodos normales con implementación.
4. Una clase hija **debe sobrescribir** los métodos abstractos.

---

## 🎭 **9. Polimorfismo**
El **polimorfismo** permite tratar diferentes objetos de manera uniforme, usando una referencia común.

### 📌 **Ejemplo sin Polimorfismo (Mal Diseño)**
```java
class Circulo {
    double calcularArea() {
        return 3.14 * 5 * 5;
    }
}

class Rectangulo {
    double calcularArea() {
        return 10 * 5;
    }
}

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo();
        System.out.println("Área del círculo: " + c.calcularArea());
        System.out.println("Área del rectángulo: " + r.calcularArea());
    }
}
```
🚨 **Problema:** Tenemos que escribir código diferente para cada tipo de figura.

---

## ✅ **Ejemplo con Polimorfismo**
```java
abstract class Figura {
    abstract double calcularArea();
}

class Circulo extends Figura {
    private double radio;
    public Circulo(double radio) { this.radio = radio; }
    public double calcularArea() { return Math.PI * radio * radio; }
}

class Rectangulo extends Figura {
    private double base, altura;
    public Rectangulo(double base, double altura) { this.base = base; this.altura = altura; }
    public double calcularArea() { return base * altura; }
}

public class Main {
    public static void main(String[] args) {
        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(10, 5);

        System.out.println("Área: " + f1.calcularArea());
        System.out.println("Área: " + f2.calcularArea());
    }
}
```
💡 **Ventaja:** Ahora todas las figuras usan `Figura` como referencia, sin importar el tipo real.

---
## 📡 **10. Interfaces (Simulan Herencia Múltiple)**
#### 🎯 **1. ¿Qué es una interfaz en Java?**

Una **interfaz** en Java es un **contrato** que define qué métodos debe tener una clase, pero **sin implementar** su comportamiento.

👉 Es como un **manual de instrucciones** 📖: establece qué métodos deben existir, pero no dice cómo deben funcionar.

📌 **Ejemplo en la vida real**:\
Imagina que tienes un **enchufe** en la pared. Sabes que tiene **dos agujeros** y una **toma de tierra**, pero **no te importa cómo la electricidad fluye por dentro**. Lo importante es que cualquier **dispositivo compatible** con ese enchufe podrá usarse.

De la misma manera, una **interfaz** define los métodos que deben estar en una clase, pero **no su implementación**.

---

#### 🏗 **2. Sintaxis de una Interfaz en Java**

📌 Una interfaz se declara con la palabra clave `interface`.

```java
// Definimos una interfaz
interface Vehiculo {
    void acelerar(int velocidad); // Método sin implementación
    void frenar(); // Método sin implementación
}
```

💡 **Claves importantes:**\
✅ Los métodos de una interfaz son **abstractos por defecto** (no necesitan `abstract`).\
✅ Una interfaz **no puede tener atributos normales**, solo constantes (`final`).\
✅ Las clases que la usen **deben implementar todos sus métodos**.

---

#### 🚗 **3. Implementación de una Interfaz**

Una clase usa la palabra clave `implements` para **implementar** una interfaz:

```java
// Clase que implementa la interfaz
class Coche implements Vehiculo {
    
    private int velocidad;

    @Override
    public void acelerar(int velocidad) {
        this.velocidad += velocidad;
        System.out.println("El coche acelera a " + this.velocidad + " km/h");
    }

    @Override
    public void frenar() {
        this.velocidad = 0;
        System.out.println("El coche se ha detenido.");
    }
}
```

📌 **Explicación:**\
1️⃣ `Coche` usa `implements Vehiculo` para indicar que **implementa la interfaz**.\
2️⃣ Implementa **todos los métodos** (`acelerar()` y `frenar()`).\
3️⃣ Se puede crear un objeto `Coche` y usarlo:

```java
public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.acelerar(50);
        miCoche.frenar();
    }
}
```

🛠 **Salida esperada:**

```
El coche acelera a 50 km/h
El coche se ha detenido.
```

---

#### 🏆 **4. ¿Para qué se usan las Interfaces?**

Las interfaces se usan cuando queremos que **diferentes clases compartan un conjunto de métodos**, sin importar cómo los implementen.

Ejemplo: Una **bicicleta y un coche** pueden acelerar y frenar, pero lo hacen de manera diferente.

```java
class Bicicleta implements Vehiculo {
    private int velocidad;

    @Override
    public void acelerar(int velocidad) {
        this.velocidad += velocidad;
        System.out.println("La bicicleta acelera a " + this.velocidad + " km/h");
    }

    @Override
    public void frenar() {
        this.velocidad = 0;
        System.out.println("La bicicleta se ha detenido.");
    }
}
```

Ahora, tanto `Coche` como `Bicicleta` pueden ser tratados como `Vehiculo`:

```java
public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Coche();
        Vehiculo v2 = new Bicicleta();

        v1.acelerar(100);  // El coche acelera a 100 km/h
        v2.acelerar(20);   // La bicicleta acelera a 20 km/h

        v1.frenar();  // El coche se ha detenido.
        v2.frenar();  // La bicicleta se ha detenido.
    }
}
```

🔹 **Polimorfismo en acción**: `v1` y `v2` son del tipo `Vehiculo`, pero pueden ser un `Coche` o una `Bicicleta` sin importar la implementación interna.

---

#### 🏛 **5. Diferencia entre una Interfaz y una Clase Abstracta**

📊 **Tabla comparativa**:

| Característica             | Interfaz                                        | Clase Abstracta                           |
| -------------------------- | ----------------------------------------------- | ----------------------------------------- |
| Métodos                    | Solo abstractos (hasta Java 7)                  | Puede tener métodos abstractos y normales |
| Atributos                  | Solo constantes (`final`)                       | Puede tener atributos normales            |
| Constructores              | ❌ No tiene                                      | ✅ Puede tener                             |
| Herencia                   | Se implementa con `implements`                  | Se hereda con `extends`                   |
| Múltiples implementaciones | ✅ Una clase puede implementar varias interfaces | ❌ Solo puede extender una clase abstracta |

📌 **¿Cuándo usar una interfaz y cuándo una clase abstracta?**

- Usa una **interfaz** cuando varias clases **comparten comportamiento** pero no relación jerárquica.
- Usa una **clase abstracta** cuando tienes una estructura común entre clases que comparten atributos y métodos.

---

#### 🔄 **6. Interfaces con Métodos por Defecto (Java 8+)**

Desde Java 8, las interfaces pueden tener **métodos por defecto (**\`\`**)** que incluyen implementación.

```java
interface Animal {
    default void respirar() {
        System.out.println("Este animal respira.");
    }
}
```

📌 **Beneficio:** Ahora las clases que implementan `Animal` no tienen que sobrescribir `respirar()`, pero pueden hacerlo si quieren.

---

#### 🎯 **Resumen Final interfaz**

✅ Una **interfaz** es un conjunto de métodos sin implementación.\
✅ Se usa `implements` para que una clase la implemente.\
✅ Se pueden crear objetos de una clase que implemente la interfaz.\
✅ Permiten el **polimorfismo**, haciendo que distintas clases sean tratadas por igual.\
✅ Desde Java 8, pueden tener métodos `default`.\
✅ Son diferentes a las **clases abstractas**, ya que **no tienen atributos ni constructores**.

---

## 🎯 **Resumen Final**
| Concepto | Descripción |
|----------|-------------|
| **Herencia** | Reutiliza código entre clases. |
| **Sobrescritura** | Modifica métodos heredados (`@Override`). |
| **Sobrecarga** | Métodos con el mismo nombre pero diferentes parámetros. |
| **Ligadura dinámica** | Decide qué método llamar en tiempo de ejecución. |
| **Clases abstractas** | No pueden instanciarse, definen métodos comunes. |
| **Interfaces** | Definen métodos sin implementación. |

---
# 🎯 **Tema 7: Arrays y Ventanas**

¡Por supuesto! Te lo detallo un poco más para que lo tengas aún más claro y completo. 🚀📚  

---

# **📌 Tema 7: Estructuras de Almacenamiento en Java**  

Cuando programamos en Java, es fundamental conocer cómo almacenar y organizar datos eficientemente. En este tema exploramos diferentes estructuras de almacenamiento, desde los **arrays**, que tienen un tamaño fijo, hasta las **colecciones dinámicas**, que pueden crecer y adaptarse según las necesidades del programa.

---

## **1️⃣ Arrays**
Los **arrays** son una estructura básica que permite almacenar múltiples valores del mismo tipo dentro de una sola variable. Son útiles cuando sabemos de antemano cuántos elementos necesitamos.

📌 **Características:**
- Todos los elementos son del **mismo tipo** (int, String, etc.).
- Su tamaño es **fijo** (no se puede modificar después de la creación).
- Se accede a los elementos mediante un **índice** (empieza en 0).
- Son más eficientes en memoria en comparación con estructuras dinámicas.

🔹 **Ejemplo de declaración y uso de un array de enteros**:
```java
int[] numeros = new int[5];  // Se crea un array con 5 posiciones
numeros[0] = 10;  // Asignamos valores
numeros[1] = 20;
System.out.println(numeros[0]);  // Imprime 10
```

### **📍 Recorrido de un array**
Para acceder a todos los elementos, usamos un bucle `for`:
```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println("Elemento en posición " + i + ": " + numeros[i]);
}
```

📌 **Puntos importantes sobre los arrays**:
✅ Son eficientes para acceder a datos mediante su índice.  
❌ No se pueden redimensionar después de su creación.  
❌ Se debe manejar con cuidado el acceso a índices fuera de rango (`ArrayIndexOutOfBoundsException`).  

---

## **2️⃣ Arrays Bidimensionales (Matrices)**
Cuando queremos manejar datos en forma de **tablas** (filas y columnas), utilizamos arrays bidimensionales.

📌 **Ejemplo:**
```java
int[][] matriz = {
    {1, 2, 3}, 
    {4, 5, 6}, 
    {7, 8, 9}
};
System.out.println(matriz[1][2]);  // Salida: 6 (fila 1, columna 2)
```

Para recorrer todos los elementos:
```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

📌 **Uso común:** Tablas de datos, tableros de juegos, gráficos en 2D, etc.

---

## **3️⃣ Búsqueda en Arrays**
A veces necesitamos encontrar un dato dentro de un array. Existen dos métodos principales:

### 🔎 **Búsqueda Secuencial**
Es útil para **arrays desordenados**, ya que busca elemento por elemento.
```java
public static int busquedaSecuencial(int[] lista, int dato) {
    for (int i = 0; i < lista.length; i++) {
        if (lista[i] == dato) return i;  // Si lo encuentra, retorna el índice
    }
    return -1;  // No encontrado
}
```

### 🔎 **Búsqueda Binaria**
Más rápida, pero requiere que el **array esté ordenado**. Se basa en dividir repetidamente la lista en mitades.
```java
import java.util.Arrays;

int[] lista = {1, 3, 5, 7, 9};
int index = Arrays.binarySearch(lista, 5);  // Devuelve 2 (posición del 5 en el array)
```

📌 **Consejo:** Para una gran cantidad de datos, la búsqueda binaria es mucho más eficiente que la secuencial. ⚡

---

## **4️⃣ Ordenación de Arrays**
Ordenar un array ayuda a organizar los datos y facilita búsquedas eficientes.

### 🔄 **Ordenación con el Algoritmo de la Burbuja**
Funciona comparando elementos adyacentes y reordenándolos si es necesario.  
```java
public static void burbuja(int[] lista) {
    int n = lista.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - 1 - i; j++) {
            if (lista[j] > lista[j + 1]) {  // Intercambiar si está desordenado
                int temp = lista[j];
                lista[j] = lista[j + 1];
                lista[j + 1] = temp;
            }
        }
    }
}
```

📌 **Ordenación rápida con `Arrays.sort()`**
```java
Arrays.sort(lista);  // Ordena en orden ascendente
```
⚠ `Arrays.sort()` usa el algoritmo Quicksort, que es mucho más rápido que la burbuja.

---

## **5️⃣ Estructuras Dinámicas (Colecciones en Java)**
Los **arrays** tienen una limitación importante: **su tamaño es fijo**.  
Para solucionar esto, Java proporciona **colecciones dinámicas**.

### 📍 **Principales tipos de colecciones:**
| Tipo | Descripción |
|------|------------|
| `ArrayList` | Lista dinámica que crece automáticamente. |
| `LinkedList` | Lista enlazada eficiente para inserciones y eliminaciones. |
| `HashSet` | Conjunto de datos sin duplicados. |
| `TreeSet` | Conjunto ordenado sin duplicados. |
| `HashMap` | Diccionario de pares clave-valor. |

📌 **Ejemplo de `ArrayList`**
```java
import java.util.ArrayList;
ArrayList<String> nombres = new ArrayList<>();
nombres.add("Ana");
nombres.add("Carlos");
System.out.println(nombres.get(0));  // Ana
```

📌 **Ejemplo de `HashMap`**
```java
import java.util.HashMap;
HashMap<String, Integer> edades = new HashMap<>();
edades.put("Juan", 25);
System.out.println(edades.get("Juan"));  // 25
```

---

## **6️⃣ Pilas y Colas**
🔹 **Pila (LIFO - Último en entrar, primero en salir)**  
🔹 **Cola (FIFO - Primero en entrar, primero en salir)**

📌 **Ejemplo de Pila (`Stack`)**
```java
import java.util.Stack;
Stack<Integer> pila = new Stack<>();
pila.push(10);
pila.push(20);
System.out.println(pila.pop());  // 20
```

📌 **Ejemplo de Cola (`Queue`)**
```java
import java.util.LinkedList;
import java.util.Queue;

Queue<String> cola = new LinkedList<>();
cola.add("A");
cola.add("B");
System.out.println(cola.poll());  // A
```

---

## **📌 Esquema Resumen**
| Concepto               | Descripción |
|------------------------|------------|
| **Arrays** | Estructura de datos estática para almacenar valores del mismo tipo. |
| **Arrays bidimensionales** | Matrices que almacenan datos en filas y columnas. |
| **Búsqueda en Arrays** | Secuencial (para desordenados) y binaria (para ordenados). |
| **Ordenación** | Algoritmo de la burbuja, `Arrays.sort()`. |
| **Colecciones** | Estructuras dinámicas (`ArrayList`, `HashMap`, `HashSet`, `TreeSet`). |
| **Iteradores** | Permiten recorrer colecciones (`Iterator`, `ListIterator`). |
| **Pilas y Colas** | `Stack` (LIFO) y `Queue` (FIFO). |



---

# Introducción a `JFrame` y Swing en Java

## 1. Conceptos Básicos de Swing

Swing es una biblioteca de Java que permite desarrollar **interfaces gráficas de usuario (GUI, Graphical User Interface)**. Es una mejora de AWT (Abstract Window Toolkit) y proporciona componentes como botones, etiquetas, cuadros de texto, tablas, etc.

### Características de Swing:

✔ Más flexible y personalizable que AWT.\
✔ Independiente del sistema operativo.\
✔ Ofrece una amplia gama de componentes gráficos.

### `JFrame`

Un **JFrame** es la ventana principal de una aplicación Swing. Se utiliza para contener otros componentes.

---

## 2. Creación y Configuración de `JFrame`

### Ejemplo Básico:

```java
import javax.swing.JFrame;

public class MiVentana extends JFrame {
    public MiVentana() {
        setTitle("Mi Ventana Swing"); // Título
        setSize(400, 300); // Tamaño
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierre
        setLocationRelativeTo(null); // Centrar ventana
        setVisible(true); // Mostrar
    }
    
    public static void main(String[] args) {
        new MiVentana();
    }
}
```

---

## 3. Componentes de Swing (`JButton`, `JLabel`, `JTextField`, etc.)

Podemos agregar diferentes componentes a un `JFrame`:
✔ **JButton**: Botón interactivo.\
✔ **JLabel**: Etiqueta de texto.\
✔ **JTextField**: Campo de texto.\
✔ **JPanel**: Contenedor de componentes.

### Ejemplo con `JButton` y `JLabel`:

```java
import javax.swing.*;

public class VentanaConBoton extends JFrame {
    public VentanaConBoton() {
        setTitle("Ejemplo con botón");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JButton btnSaludar = new JButton("Saludar");
        btnSaludar.setBounds(50, 50, 100, 30);
        
        JLabel lblMensaje = new JLabel("Hola, mundo!");
        lblMensaje.setBounds(50, 100, 150, 30);
        
        add(btnSaludar);
        add(lblMensaje);
    }
    
    public static void main(String[] args) {
        new VentanaConBoton().setVisible(true);
    }
}
```

---

## 4. Layouts: Organización de Componentes

Los `JFrame` pueden organizar componentes con **layouts**:

| Layout         | Descripción                                                                   |
| -------------- | ----------------------------------------------------------------------------- |
| `FlowLayout`   | Organiza en fila (de izquierda a derecha).                                    |
| `BorderLayout` | Divide la ventana en 5 regiones (`NORTH`, `SOUTH`, `EAST`, `WEST`, `CENTER`). |
| `GridLayout`   | Organiza en una cuadrícula de filas y columnas.                               |

### Ejemplo con `FlowLayout`:

```java
import javax.swing.*;
import java.awt.*;

public class EjemploFlowLayout extends JFrame {
    public EjemploFlowLayout() {
        setTitle("Ejemplo de FlowLayout");
        setSize(300, 200);
        setLayout(new FlowLayout());
        
        add(new JButton("Botón 1"));
        add(new JButton("Botón 2"));
        add(new JButton("Botón 3"));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new EjemploFlowLayout();
    }
}
```

---

## 5. Manejo de Eventos (`ActionListener`, `FocusListener`)

Los eventos permiten que la GUI responda a interacciones del usuario.

### Ejemplo: Evento de clic con `ActionListener`:

```java
import javax.swing.*;
import java.awt.event.*;

public class EventoBoton extends JFrame {
    public EventoBoton() {
        setTitle("Eventos en Swing");
        setSize(300, 200);
        setLayout(null);
        
        JButton boton = new JButton("Clic aquí");
        boton.setBounds(50, 50, 120, 30);
        
        boton.addActionListener(e -> JOptionPane.showMessageDialog(null, "¡Botón presionado!"));
        
        add(boton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new EventoBoton();
    }
}
```

---

## 6. Otros Conceptos Claves

| **Concepto**                  | **Descripción y Ejemplo**                                                                                  |
| ----------------------------- | ---------------------------------------------------------------------------------------------------------- |
| **`setEnabled(true/false)`**  | Activa o desactiva un control. `boton.setEnabled(false);`                                                  |
| **`requestFocus()`**          | Da el foco a un control. `campoTexto.requestFocus();`                                                      |
| **`focusGained / focusLost`** | Detectan cambios de foco. Ver ejemplo abajo.                                                               |
| **`JOptionPane`**             | Muestra cuadros de diálogo emergentes. `JOptionPane.showMessageDialog(null, "Hola!");`                     |
| **`setIcon()`**               | Asigna una imagen a un botón o etiqueta. `boton.setIcon(new ImageIcon("imagen.png"));`                     |
| **`JSpinner`**                | Selector de valores en un rango. `JSpinner spinner = new JSpinner(new SpinnerNumberModel(10, 0, 100, 5));` |

### Ejemplo de `focusGained / focusLost`:

```java
campoTexto.addFocusListener(new FocusAdapter() {
    public void focusGained(FocusEvent e) {
        campoTexto.setBackground(Color.YELLOW);
    }
    public void focusLost(FocusEvent e) {
        campoTexto.setBackground(Color.WHITE);
    }
});
```

---

## 7. Ejemplo Completo

```java
import javax.swing.*;
import java.awt.event.*;

public class VentanaCompleta extends JFrame {
    private JTextField campoTexto;
    private JLabel etiqueta;

    public VentanaCompleta() {
        setTitle("Ejemplo completo");
        setSize(400, 200);
        setLayout(null);
        
        etiqueta = new JLabel("Escribe algo:");
        etiqueta.setBounds(20, 20, 100, 30);
        
        campoTexto = new JTextField();
        campoTexto.setBounds(120, 20, 150, 30);
        
        JButton boton = new JButton("Mostrar");
        boton.setBounds(120, 60, 100, 30);
        
        boton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Texto: " + campoTexto.getText()));
        
        add(etiqueta);
        add(campoTexto);
        add(boton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new VentanaCompleta();
    }
}
```

# T10 Bincular con bases de datos

Para poder vincular java con `BBDD` ay que insertar el siguiente dependencia en el `maven proyect` 
````xml
<dependencies>
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <version>9.2.0</version>
        </dependency>
    </dependencies>
````

Con esto insertado ya podemos empezar.

***

Entre las cosas principales que se necesitan son:

- El nombre de la `base de datos`
- La url
- El usuario
- La contraseña
- La clase **`Conection`**

de esta forma queda algo tal que así 
````java
    public static String bd = "ejemplo";
    public static String urlBD = "jdbc:mysql://localhost:3306/" + bd;
    public static String user = "root";
    public static String passwd = "";
    public static Connection conn; 
````
>[!NOTE]
>Esto es siempre igual lo unico que cambia es el nombre de la **Base de datos**
---
Con estos datos ahora podemos *conectarnos* a la base de datos y hacer consultas.

## Conectarnos para hacer las *`operaciones`* 
Para esto se usa el `conn` anteriormente crerado y se le da valores 

````java
conn = DriverManager.getConnection(urlBD, user, passwd);
````

## Crerar la consulta

Para hacer esto tenemos que crear un `String` donde pongamos la consulta, pudiendo ser de dos estilos. 

- Que tenga ya todo puesto por codigo
- Que el usuario meta algun valor

### Usuario añade valores 

En este caso una consulta podreia quedar algo como: 
````java
String sql = "SELECT password FROM usuario WHERE login = ?";
````
Por lo tanto tenemos que dar valor a tosos los `?`  que ay. Esto se hace con el **Prepared** (`PreparedStatement ps = conn.prepareStatement(sql);`) y luego se usa el **ps** para ir dando valor a las incognitas ` ps.setString(1, usuario);`.

Una vez acabado se ejecuta con `ResultSet rs = ps.executeQuery();` y en este caso almacenamos la respuesta en **`rs`**
### Ya todo puesto

En este caso la unica diferencia es la forma de *ejecutarse*(`Statement st = conn.createStatement();`) en el amterior lo *preparas*(`prepareStatement`) y en este le *creas* 

````java
String sql = "select * from tabla_a";
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery(sql);
````

## A la hora de comprovar si nos da solucion la consulta **`rs`**

Usamos la funcion `next.rs()` de esta forma si es `true` significa que hay una fila mas de resultado ej:

````java
 try {
            //1.abrir conexion
            conn = DriverManager.getConnection(urlBD, user, passwd);
            //2.ejecutamos consulta SELECT
            String sql = "select * from tabla_a";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                //procesamos la fila actual del conjunto de filas
                int a1 = rs.getInt("a1");
                String a2 = rs.getString("a2");
                double a3 = rs.getDouble("a3");
                Date a4 = rs.getDate("a4");
                //mostramos la fila por consola
                System.out.printf("%d -- %s -- %.2f -- %s %n", a1, a2, a3, a4);
            }
````

Para ver ejemplos de uso pincha [aqí](Tema10/src/main/java)