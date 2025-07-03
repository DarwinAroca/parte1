package mascota;

public class Main {
    public static void main(String[] args) {
        ClinicaVeterinaria c = new ClinicaVeterinaria();

        Mascota m1 = new Perro("Toby");
        Mascota m2 = new Gato("Pelusa");

        c.recibirMascota(m1);
        c.recibirMascota(m2);
    }
}

/* ¿Qué pasa si se envía una clase que no hereda de `Mascota`?
 R:El programa no compila


¿Cómo se comporta si eliminas el `instanceof` y casteas directamente?
R:habria una falla en la clase classcastException

 */