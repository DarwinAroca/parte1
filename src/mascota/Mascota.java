package mascota;


public class Mascota {
    //  Agregado: atributo nombre
    protected String nombre;

    private String nombrePrivado = "Privado";
    String nombreDefault = "Default";
    protected String nombreProtegido = "Protegido";
    public String nombrePublico = "Público";

    //  Constructor que inicializa nombre
    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    private void metodoPrivado() {
        System.out.println("Método privado");
    }

    void metodoDefault() {
        System.out.println("Método default");
    }

    protected void metodoProtegido() {
        System.out.println("Método protegido");
    }

    public void metodoPublico() {
        System.out.println("Método público");
    }

    //  Método saludar() funcional
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
}
}