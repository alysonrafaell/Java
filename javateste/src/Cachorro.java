import java.util.Scanner;

public class Cachorro extends  Animal {
    //atributos
    boolean e_Adestrado;
    String tipoLatido;//ALTO, MÉDIO E SUAVE
    boolean se_voador;
    boolean se_aquatico;
    boolean se_terrestre;
    //construtor
    public  Cachorro(String nome, String raca, String cor,String tmh,int qntsPatas, boolean  e_Adestrado, boolean se_voador, boolean se_aquatico, boolean se_terrestre){
        super(nome, raca, cor, tmh, qntsPatas, se_voador, se_aquatico, se_terrestre);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, insira o tipo de latido (ALTO, MÉDIO ou SUAVE):");
        tipoLatido = scanner.nextLine().toUpperCase();  // Coloca a entrada em maiúsculas para evitar problemas com case

        // Validação do tipo de latido usando if/else
        if (tipoLatido.equals("ALTO") || tipoLatido.equals("MÉDIO") || tipoLatido.equals("SUAVE")) {
            // Se a entrada for válida, o tipo de latido é aceito
            System.out.println("Tipo de latido válido.");
        } 
    }

    // Método para retornar o tipo de latido
    public String getTipoLatido() {
        return tipoLatido;
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
               switch (tipoLatido) {
                   case "ALTO":
                       return "Rooof Rooof!";
                   case "MEDIO":
                       return "Woof Woof!";
                   default:
                       return "au au!";
               }
           }
}