
package PaqueteA;

/**
 *
 * @author Miguel Antonio
 */
public class Operaciones {
    
    //Atributos
    
    public double resultado;
    private String opciones;

    
    
        
    //Metodo get y set de operaciones

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones, double a, double b) {
        
        switch(opciones){
            case "sumar":
                this.opciones="sumar";
                resultado = a + b;
                break;
            case "restar":
                this.opciones= "restar";
                resultado= a - b;
                break;
            case "multiplicar":
                this.opciones="multiplicar";
                resultado= a * b;
                break;
            default:
                this.opciones="dividir";
                resultado= a / b;
                break;
        }
    }    
}
