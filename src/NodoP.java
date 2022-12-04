/**
 * @author Francisco
**/
public class NodoP {
    private NodoP sig, ant;
    private String ApellidoP, ApellidoM, Nombre, Carrera;
    private int Matricula;

    //Constructor.
    public NodoP(String ApellidoP, String ApellidoM, String Nombre, String Carrera, int Matricula) {
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Nombre = Nombre;
        this.Carrera = Carrera;
        this.Matricula = Matricula;
        this.sig = null;
        this.ant = null;
    }
    
    //Constructor.
    public NodoP(){
        
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }

    public NodoP getAnt() {
        return ant;
    }

    public void setAnt(NodoP ant) {
        this.ant = ant;
    }
    
    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }
}
