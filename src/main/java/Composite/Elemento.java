package Composite;

public class Elemento implements Componente{
    private double precio;
    private int codigo;

    public Elemento(){

    }

    public Elemento(double precio, int codigo){
        this.precio = precio;
        this.codigo = codigo;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }
}
