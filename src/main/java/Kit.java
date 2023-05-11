import java.util.ArrayList;

public class Kit implements Componente{
    private int codigo;
    private ArrayList<Componente> componentes;

    public Kit(){
        this.codigo = (int)(Math.random()*999);
        componentes = new ArrayList<Componente>();
    }

    public void addComponente(Componente c){
        componentes.add(c);
    }

    public double getPrecio(){
        double precio = 0;
        for(Componente c : componentes){
            precio += c.getPrecio();
        }
        return precio * 0.9;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
