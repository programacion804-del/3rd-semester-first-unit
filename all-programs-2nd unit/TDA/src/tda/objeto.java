
package tda;

/**
 *
 * Hector Caleb Mosqueda Santes N° control:25260872
 */
public class objeto {
    //siempre es public o private,tipo de dato y nombre de la variable
    private int numext;
    private String calle,dueño;
    private double precio;
    //el contructor sirve para darle valores a nuestro objeto 
    public objeto(int numext, String calle, String dueño){
    //this cumple con la funcion dde mandar a llamar el atributo que ya creamos y darle el valor
    this.numext=20;
    this.dueño="Hector";
    this.precio=200000;
    this.calle="Roberto Guerra";
    }
    //public por que quiero acceder a el desde afuera esa es su funcion
    //y void pro que solo se encarga de trabajar con las datos con los que ya cuenta
    public void mostrarDatos(){
    System.out.println("NUmero:"+this.numext);
        System.out.println("Dueño"+this.dueño);
    }
}
