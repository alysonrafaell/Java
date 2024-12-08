
public class Carro {
    
    String nome;
    String marca;
    int ano;
    int vel;
    public String modelo;
    public String cor;
    //métodos 
    void acelerar (int aceleracao){
        vel+=aceleracao;
    }
    void freiar (int reduzir){
        vel-=reduzir;
    }
    void buzinar(){
        System.out.println("bibibi");
    }
}
