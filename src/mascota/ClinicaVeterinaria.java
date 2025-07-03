package mascota;

public class ClinicaVeterinaria {
    public void recibirMascota(Mascota m) {
        System.out.println("Recibiendo a: " + m.nombrePublico);
        m.saludar();

        if (m instanceof Perro) { //si es un perro
            ((Perro) m).ladrar(); //que ladre
        } else if (m instanceof Gato) { //si es un gato
            ((Gato) m).maullar(); //que maulle
        } else {
            System.out.println("Tipo de mascota no reconocido.");
}
}
}