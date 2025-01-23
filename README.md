# ejercicios-java
>[!CAUTION]
>
>es Metodo polimorfico --> Depends del objeto que se pase llamara a un metodo u otro
>
		barco.alarma();// Metodo polimorfico --> Depends del objeto que se pase llamara a un metodo u otro
				if (barco instanceof Velero) {
					//casting
					((Velero)barco).arriar();
				}
				if (barco instanceof Yate) {
					//casting
					((Yate)barco).lanzarBengala();
				}
>[!CAUTION]
>  **IMPORTANTE** mirar para exame teoria



>[!NOTE]
> La siguiente informacion ha sido redactada por CHat


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
¡Genial! Vamos a profundizar en los puntos **6 al 9** con más explicaciones y ejemplos prácticos.

---

# 🔄 **6. Conversión entre Objetos Derivados y Objetos Base (Casting de Objetos)**
En Java, las clases derivadas son **una especialización** de la clase base. Como resultado, podemos tratar un objeto de una clase hija como si fuera de la clase padre. Esto se conoce como **upcasting** y **downcasting**.

---

## 🔼 **Upcasting (Conversión de Hija a Base)**
Es cuando asignamos un objeto de una clase hija a una variable de la clase base. **Se hace automáticamente porque una clase hija "es un" tipo de su clase base.**

### 📌 **Ejemplo:**
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

### 🔍 **¿Qué pasó aquí?**
1. Creamos un objeto `Programador`, pero lo guardamos en una variable de tipo `Empleado`.
2. `emp` puede usar solo los métodos de `Empleado`, aunque realmente es un `Programador`.

---

## 🔽 **Downcasting (Conversión de Base a Hija)**
Es cuando convertimos una referencia de la clase base a una referencia de una clase hija. **Java no permite hacerlo automáticamente** porque podría generar errores en tiempo de ejecución.

### 📌 **Ejemplo:**
```java
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Programador();  // Upcasting automático
        Programador prog = (Programador) emp;  // Downcasting explícito
        prog.programar();  // "Escribiendo código..."
    }
}
```

### 🚨 **Peligro del Downcasting**
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

---

# 🔗 **7. Ligadura Dinámica**
La **ligadura** es el proceso de conectar una llamada a un método con su implementación real.

## 🏗 **Tipos de Ligadura en Java**
| Tipo | Cuándo se resuelve | Ejemplo |
|------|-------------------|---------|
| **Ligadura Estática** | En tiempo de compilación | Métodos `final`, `static` o `private`. |
| **Ligadura Dinámica** | En tiempo de ejecución | Métodos sobrescritos en clases hijas. |

---

## 🔥 **Ejemplo de Ligadura Estática**
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

## 🔥 **Ejemplo de Ligadura Dinámica**
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

# 🏛 **8. Clases y Métodos Abstractos**
Una **clase abstracta** es aquella que no se puede instanciar directamente. Se usa como una **plantilla** para otras clases.

## 📌 **Ejemplo de Clase Abstracta**
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

### 🛠 **Reglas de las Clases Abstractas**
1. No se pueden instanciar (`new Figura();` da error).
2. Pueden contener métodos **abstractos** (sin cuerpo).
3. Pueden contener métodos normales con implementación.
4. Una clase hija **debe sobrescribir** los métodos abstractos.

---

# 🎭 **9. Polimorfismo**
El **polimorfismo** permite tratar diferentes objetos de manera uniforme, usando una referencia común.

## 📌 **Ejemplo sin Polimorfismo (Mal Diseño)**
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

