public class Temperatura {

    public static void main(String[] args){

        double celsius = 30.4;
        double fahrenheit = (celsius * 1.8) + 32;
        String mensagem = String.format("A temperatura %.2f em Celsius foi transformada em %.2f fahrenheit",celsius,fahrenheit);
        System.out.println(mensagem);

        int fahrenheitInteira = (int) ((celsius * 1.8) + 32);
        System.out.println("A temperatura em Fahrenheit inteira é: "+fahrenheitInteira );
    }
}
