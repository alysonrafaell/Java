
public class CarroTeste{
    public static void main(String[] args) {
        Carro c1 = new Carro();
       c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel = 100;

        c1.acelerar(10);
        System.out.println("Velocidade atual: " + c1.vel + "KM/HR");

        c1.freiar(30);
        System.out.println("Redução de: "+ c1.vel + "KM/HR");

        c1.buzinar();
        
    }
}