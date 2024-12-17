public class SequenciasCaracteres {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("O comprimento da string txt é: " + txt.length());


        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase()); // Saída: "HELLO WORLD"
        System.out.println(txt1.toLowerCase()); // Saída: "hello world


        // metodo index of
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Saída: 7

        // concatenção de integers
        int x = 10;
        int y = 20;
        int z = x + y; // z será 30 (um inteiro/número)

        // Concatenação de strings
        String x1 = "10";
        String y1 = "20";
        String z1 = x1 + y1; // z será 1020 (uma String)

        // mesmo adicionando um int ainda continua uma concatenação de strings
        String x2 = "10";
        int y2 = 20;
        String z2 = x2 + y2; // z será 1020 (uma String)




    }
}
