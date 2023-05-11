import java.util.ArrayList;

public class Kit implements Componente{
    private ArrayList<Componente> componentes;

    public Kit(){
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
}
