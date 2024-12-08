

public class Animal {
    //atributos:
    String nome;
    String raca;
    String cor;
    String tmh;//PEQUENO, MEDIO E GRANDE
    int qntsPatas;
    boolean voador;
    boolean aquatico;
    boolean terrestre;

   
   
    //CONSTRUTOR
    public  Animal(String nome,String raca, String cor,String tmh,int qntsPatas, boolean voador, boolean aquatico, boolean terrestre){
        this.raca = raca;
        this.cor = cor;
        this.tmh = tmh;
        this.qntsPatas = qntsPatas;
        this.voador = voador;
        this.aquatico = aquatico;
        this.terrestre = terrestre;
        this.nome = nome;
    }
    //METODOS
    public void setvoador(boolean voador){
        
        this.voador = voador;
    }
    public void setnome(String nome){
        this.nome=nome;
    }
    public void setaquatico(boolean aquatico){
       
        this.aquatico = aquatico;
    }
    public void setterrestre(boolean terrestre){
    
        this.terrestre = terrestre;
    }
    public void setraca(String raca){
        this.raca = raca;
    }
    public void setcor(String cor){
        this.cor = cor;
    }
    public void settmh(String tmh){
        this.tmh = tmh;
    }
    public void setqntspatas(int qntsPatas){
        this.qntsPatas = qntsPatas;
    }
    public String getnome(String nome){
        return this.nome;
    }
    public String getraca(String raca){
        return this.raca;
    }
    public String getcor(String cor){
        return this.cor;
    }
    public String gettmh(String tmh){
        return this.tmh;
    }
    public int getqntsPatas(int qntsPatas){
        return this.qntsPatas;
    }
    public boolean  getvoador(boolean voador){
        return this.voador;
    }
    public boolean  getaquatico(boolean aquatico){
        return this.aquatico;
    }
    public Boolean getterrestre(boolean terrestre){
        return this.terrestre;
    }

    @Override
    public String toString(){
         String voa = voador? "Voa" : "Não voa";
         String nada = aquatico? "Nada" : "Não nada";
         String corre = terrestre? "É terrestre" : "Não é terrestre";

         return"O animal: " + nome + "\n" +
         " Raca: " + raca + "\n" +
         "Tamanho: " + tmh + "\n" +
         "Cor: " + cor + "\n" +
         "Quantidade de patas: " + qntsPatas + "\n" +
         "O animal: " + voador + "\n" +
         "O animal: " + aquatico + "\n" +
         "O animal: " + terrestre + "\n";  
         
    }


    public String voa() {
       return "Animal voa";
    }
    public String nadar() {
        return "Animal nada";
     }
     public String terrestre() {
        return "Animal corre";
     }
}

    

   




    
    

