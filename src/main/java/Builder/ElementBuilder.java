package Builder;

import Composite.Elemento;

public class ElementBuilder implements ComponentBuilder {

    private Elemento element;

    public ElementBuilder(){
        element = new Elemento();
    }

    public void buildPrecio(double precio){
        element.setPrecio(precio);
    }

    public void buildCodigo(int codigo){
        element.setCodigo(codigo);
    }

    @Override
    public Elemento getComponente(){
        Elemento elementr = this.element;
        this.element = new Elemento();
        return elementr;
    }

}
