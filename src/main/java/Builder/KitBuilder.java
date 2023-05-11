package Builder;

import Composite.Componente;
import Composite.Kit;

public class KitBuilder {

        private Kit kit;

        public KitBuilder(){
            kit = new Kit();
        }

        public void buildCodigo(int codigo){
            kit.setCodigo(codigo);
        }

        public void buildElemento(Componente component){
            kit.addComponente(component);
        }

        public Kit getComponente(){
            Kit kitr = this.kit;
            this.kit = new Kit();
            return kitr;
        }
}
