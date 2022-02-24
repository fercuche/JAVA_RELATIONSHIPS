/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package relaciones_1;

public class Main {

    public static void main(String[] args) {
        
        //Perros
        Perro perro1 = new Perro("Fluffy", "beagle", 5, "mediano");
        Perro perro2 = new Perro("Guardian", "caniche", 3, "chico");
        
        
        //Personas
        Persona persona1 = new Persona("Juan", "Perez", 27, 36000111, perro1);
        Persona persona2 = new Persona("Rosa", "Alonso", 30, 30222333, perro2);
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        
        
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

    }

}
