
package practica.pkg1;
import java.util.Scanner;
/**
 *
 * Hector Caleb Mosqueda Santes N°control.25260872
 */
public class Practica1 {






    public static void main(String[] args) {
 float num1;
 float num2;
Scanner scanner=new Scanner(System.in);
    int op=0;
    int ope=0;
    int opr=0;
        do {             
            System.out.println("Ingresa el primer numero:");
            num1= scanner.nextInt();
            System.out.println("Ingresa el segundo numero:");
            num2=scanner.nextInt();
            System.out.println("Operacion a realizar\n1.SUMA\n2.RESTA\n3.Multiplicacion\n4.Division");
            ope=scanner.nextInt();
            switch(ope){
                case 1:
                opr=(int) (num1+num2);
                    System.out.println("Tu resultado es:"+opr);
                    break;
                case 2:
                 opr=(int) (num1-num2);
                    System.out.println("Tu resultado es:"+opr);
                    break;
                case 3:
                    opr=(int) (num1*num2);
                    System.out.println("Tu resultado es:"+opr);
                    break;
                case 4:
                     opr=(int) (num1/num2);
                     System.out.println("Tu resultado es:"+opr);
                     break;
                 default:System.out.println("No existe esa operacion");
                 break;
            }
        } while (op>2);
    }
    
}
