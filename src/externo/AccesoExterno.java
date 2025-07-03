package externo;

import mascota.Mascota;

public class AccesoExterno {
    public static void main(String[] args) {
        Mascota m = new Mascota("Nombre que quieras");

        System.out.println(m.nombrePublico); // OK
        m.metodoPublico();//OK
    }
}