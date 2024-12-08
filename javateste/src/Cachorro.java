import java.util.Scanner;

public class Cachorro extends  Animal {
    //atributos
    boolean e_Adestrado;
    String tipo_latido;//ALTO, MÉDIO E SUAVE
    boolean se_voador;
    boolean se_aquatico;
    boolean se_terrestre;
    //construtor
    public  Cachorro(String nome, String raca, String cor,String tmh,int qntsPatas, boolean  e_Adestrado, boolean se_voador, boolean se_aquatico, boolean se_terrestre){
        super(nome, raca, cor, tmh, qntsPatas, se_voador, se_aquatico, se_terrestre);
           while (true) {  // Laço para pedir ao usuário até que insira um valor válido
            if (tipo_latido == null || tipo_latido.isEmpty()) {
                // Se o valor for nulo ou vazio, pedimos ao usuário para digitar novamente
                System.out.println("Por favor, insira o tipo de latido (ALTO, MÉDIO ou SUAVE):");
                tipo_latido = new Scanner(System.in).nextLine();
            } else {
                tipo_latido = tipo_latido.toUpperCase(); // Converter para maiúsculas para evitar problemas com case
                if (tipo_latido.equals("ALTO") || tipo_latido.equals("MÉDIO") || tipo_latido.equals("SUAVE")) {
                    break;  // Se for válido, saímos do laço
                } 
            }
        }
        this.e_Adestrado = e_Adestrado;
            
            }
           //metodos
            public String getipo_latido(){
                return tipo_latido;
            }
           
           @Override
           public String toString() {
               String voa = voador ? "Voa" : "Não voa";
               String nada = aquatico ? "Nada" : "Não nada";
               String corre = terrestre ? "É terrestre" : "Não é terrestre";
               
               return "O animal: " + nome + "\n" +
                      "Raça: " + raca + "\n" +
                      "Tamanho: " + tmh + "\n" +
                      "Cor: " + cor + "\n" +
                      "Quantidade de patas: " + qntsPatas + "\n" +
                      "O animal: " + voa + "\n" +
                      "O animal: " + nada + "\n" +
                      "O animal: " + corre;
           }
           
           @Override
           public String voa() {
               return voador ? "O cachorro voa!" : "O cachorro não voa!";
           }
           
           @Override
           public String nadar() {
               return aquatico ? "O cachorro nada!" : "O cachorro não nada!";
           }
           
           @Override
           public String terrestre() {
               return terrestre ? "O cachorro é terrestre!" : "O cachorro não é terrestre!";
           }
           
           public String latir() {
               switch (tipo_latido) {
                   case "ALTO":
                       return "Rooof Rooof!";
                   case "MEDIO":
                       return "Woof Woof!";
                   default:
                       return "au au!";
               }
           }
}