
public class Gato extends Animal{
    boolean e_domestico;
    String tipo_miar;//agudo, suave e médio 
    public  Gato(String nome, String raca, String cor,String tmh,int qntsPatas, boolean  e_domestico, boolean se_voador, boolean se_aquatico, boolean se_terrestre,String tipo_miar){
        super(nome, raca, cor, tmh, qntsPatas, se_voador, se_aquatico, se_terrestre);
        this.e_domestico=e_domestico;
        this.tipo_miar = tipo_miar;
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
        return voador ? "O gato voa!" : "O gato não voa!";
    }
    
    @Override
    public String nadar() {
        return aquatico ? "O gato nada!" : "O gato não nada!";
    }
    
    @Override
    public String terrestre() {
        return terrestre ? "O gato é terrestre!" : "O gato não é terrestre!";
    }
    
    public String Miar() {
        switch (tipo_miar) {
            case "alto":
                return "MIAU! MIAU!";
            case "médio":
                return "miau! miau!";
            default:
                return "miaaau! miaaaau!";
        }
    }
}

