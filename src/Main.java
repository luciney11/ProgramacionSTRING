import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String cadena = "Hola";
        String cadena2 = cadena.substring(0,4);
        //System.out.println(cadena2.charAt(2));
        //System.out.println("dada".compareTo("dado"));
        System.out.println(cadena2);
        System.out.println(cadena.indexOf('a'));
        System.out.println(cadena);
        System.out.println(cadena.length());
        //cadena += ", qué tal?";
        //cadena += ", qué tal?";



        cadena = cadena.concat(", qué tal?");
        System.out.println(cadena);
        System.out.println(cadena.length());
        cadena = cadena.concat(cadena2);
        System.out.println(cadena);
        //Esto es para sacar la palabra "qué" sin ponerle explícitamente la posición dónde está
        System.out.println(cadena.substring(cadena.indexOf("qué")+1));
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce usuario");
        String usuario1 = teclado.nextLine();
        System.out.println(usuario1);
        Scanner teclado2 = new Scanner(usuario1);
        int i=0;
        String limpio = new String();
        while(teclado2.hasNext()) {
            limpio +=teclado2.next() + " ";
            limpio += " 6";
            i++;
        }
        System.out.println(i);
        System.out.println(limpio);
        System.out.println(limpio);

//        System.out.println("Introduce su password");
//        String password = teclado.nextLine();
//        String usuario2 = "cacatua";
//
//        System.out.println(usuario2.toUpperCase());
//        usuario2 = usuario2.toUpperCase();
//        System.out.println(usuario2);
//
//
//        System.out.println(usuario2.replace('a','1'));
//        if (usuario2.equals(usuario1))
//            System.out.println("Usuarios coinciden");
//        System.out.println(usuario1.compareTo(usuario2));
//        System.out.println("Introduce frase");
//        String frase = teclado.nextLine();
//        String[] trozos = frase.split(" ");
//        System.out.println(trozos.length);
//
//        Scanner teclado2 = new Scanner("HOla asdf asdf           asdf sadf");
//        int i=0;
//        int i=0;
//        while(teclado2.hasNext()) {
//            System.out.println(teclado2.next());
//            i++;
//        }
//        System.out.println(i);
        /*System.out.println("Introduce su password");
        String password = teclado.nextLine();
        String usuario2 = "cacatua";

        System.out.println(usuario2.toUpperCase());
        usuario2 = usuario2.toUpperCase();
        System.out.println(usuario2);


        System.out.println(usuario2.replace('a','1'));
        if (usuario2.equals(usuario1))
            System.out.println("Usuarios coinciden");
        System.out.println(usuario1.compareTo(usuario2));
        System.out.println("Introduce frase");
        String frase = teclado.nextLine();
        String[] trozos = frase.split(" ");
        System.out.println(trozos.length);

        Scanner teclado2 = new Scanner("HOla asdf asdf           asdf sadf");
        int i=0;
        while(teclado2.hasNext()) {
            System.out.println(teclado2.next());
            i++;
        }
        System.out.println(i);
*/
    }

}