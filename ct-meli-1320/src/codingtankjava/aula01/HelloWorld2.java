package codingtankjava.aula01;

public class HelloWorld2 {
    public static void main(String[] args) {
        var version = "Java 23"; // syntax sugar
        //version = 8;// <- erro!
        System.out.println("Hello, " + version);
        String texto = "World"; //declaração + atribuição
        System.out.println("Hello " + texto);
        texto = "My Computer"; // atribuição
        System.out.println("Hello " + texto);
        var x = 10;
        //var y;//<- erro!
        //nome = "Jessé";//<- erro!
        String cor;//declaração
    }
}
