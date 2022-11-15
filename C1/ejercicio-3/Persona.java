class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return telefono;
    }
    public static void main(String[] args) {

        Persona diego = new Persona();

        diego.setEdad(15);
        diego.setNombre("Diego Zapata");
        diego.setTelefono(312468456);

        System.out.println("Nombre: " + diego.getNombre() + " Edad: " + diego.getEdad() + " Telefono: " + diego.getTelefono());
        
    }
}