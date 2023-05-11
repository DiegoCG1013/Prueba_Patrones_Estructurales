public class Elemento implements Componente{
    private double precio;
    private int codigo;

    public Elemento(double precio, int codigo){
        this.precio = precio;
        this.codigo = codigo;
    }

    public double getPrecio(){
        return precio;
    }
}
