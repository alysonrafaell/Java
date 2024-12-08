import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        Animal animal = null;

        while (continuar) {
            // Menu
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar Gato");
            System.out.println("2. Criar Cachorro");
            System.out.println("3. Exibir informações do animal");
            System.out.println("4. Fazer o animal fazer ação");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer de entrada

            switch (opcao) {
                case 1:  // Criar Gato
                    System.out.println("Digite o nome do gato:");
                    String nomeGato = scanner.nextLine();
                    System.out.println("Digite a raça do gato:");
                    String racaGato = scanner.nextLine();
                    System.out.println("Digite a cor do gato:");
                    String corGato = scanner.nextLine();
                    System.out.println("Digite o tamanho do gato:");
                    String tmhGato = scanner.nextLine();
                    System.out.println("Digite a quantidade de patas do gato:");
                    int qntsPatasGato = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("O gato é doméstico? (true/false):");
                    boolean eDomestico = scanner.nextBoolean();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Tipo de miado (alto/médio/suave):");
                    String tipoMiar = scanner.nextLine();

                    // Criar o objeto Gato
                    animal = new Gato(nomeGato, racaGato, corGato, tmhGato, qntsPatasGato, eDomestico, false, false, true, tipoMiar);
                    break;

                case 2:  // Criar Cachorro
                    System.out.println("Digite o nome do cachorro:");
                    String nomeCachorro = scanner.nextLine();
                    System.out.println("Digite a raça do cachorro:");
                    String racaCachorro = scanner.nextLine();
                    System.out.println("Digite a cor do cachorro:");
                    String corCachorro = scanner.nextLine();
                    System.out.println("Digite o tamanho do cachorro:");
                    String tmhCachorro = scanner.nextLine();
                    System.out.println("Digite a quantidade de patas do cachorro:");
                    int qntsPatasCachorro = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("O cachorro é adestrado? (true/false):");
                    boolean eAdestrado = scanner.nextBoolean();
                    scanner.nextLine(); // Limpar o buffer

                    // Solicitar o tipo de latido do cachorro
                      // Garantir que a entrada seja em maiúsculas

                    // Criar o objeto Cachorro
                    animal = new Cachorro(nomeCachorro, racaCachorro, corCachorro, tmhCachorro, qntsPatasCachorro, eAdestrado, false, false, true);
                    break;

                case 3:  // Exibir informações
                    if (animal != null) {
                        System.out.println(animal.toString());
                    } else {
                        System.out.println("Nenhum animal criado ainda.");
                    }
                    break;

                case 4:  // Fazer o animal fazer ação
                    if (animal != null) {
                        if (animal instanceof Gato) {
                            System.out.println(((Gato) animal).Miar());
                        } else if (animal instanceof Cachorro) {
                            System.out.println(((Cachorro) animal).latir());
                        }
                    } else {
                        System.out.println("Nenhum animal criado ainda.");
                    }
                    break;

                case 5:  // Sair
                    continuar = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}