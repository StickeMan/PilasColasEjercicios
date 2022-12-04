import javax.swing.JOptionPane;

/**
 * @author Francisco
**/
public class ListaPila_Cola {
    
    NodoP start, last;
    
    //Constructor.
    public ListaPila_Cola(){
        this.start = null;
        this.last = null;
    }
    
    //Método para agregar un estudiante a la cola.
    public void insert(String ApellidoP, String ApellidoM, String Nombre, int Matricula, String Carrera) {
        NodoP nuevo = new NodoP();
        nuevo.setApellidoP(ApellidoP);
        nuevo.setApellidoM(ApellidoM);
        nuevo.setNombre(Nombre);
        nuevo.setMatricula(Matricula);
        nuevo.setCarrera(Carrera);
        
        if (start == null) {
            start = nuevo;
            last = nuevo;
        } else {
            last.setSig(nuevo);
            nuevo.setAnt(last);
            last = nuevo;
        }
    }
    
    
    //Método para eliminar un estudiante de la pila.
    public void desapilar() {
        if (start == null) {
            JOptionPane.showMessageDialog(null, "La pila está vacía");
        } 
        if (start.getAnt()==null && start.getSig()==null) {
            start = null;
            last = null;
        }else{
            start=start.getSig();
            start.setAnt(null);
        }
    }
    
    //Método para eliminar un estudiante de la cola.
    public void extract(){
        if (start == null){
            JOptionPane.showMessageDialog(null, "La cola está vacía");
            start = null;
            last = null;
        }else{
            last = last.getAnt();
            last.setSig(null);
        }
    }
    
    //Método para mostrar los datos de los estudiantes que se guardaron en la pila.
    public String imprimir() {
        NodoP Aux = start;
        int i = 1;
        String cad="";
        while (Aux != null) {
            cad +="\nEstudiante No. "+i+
                    "\nApellido Paterno: "+Aux.getApellidoP()+
                    "\nApellido Materno: "+Aux.getApellidoM()+
                    "\nNombre: "+Aux.getNombre()+
                    "\nMatricula: "+Aux.getMatricula()+
                    "\nCarrera: "+Aux.getCarrera();
            Aux = Aux.getSig();
            i += 1;
        }
        return cad;
    }
}
