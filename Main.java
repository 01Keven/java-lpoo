import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Keven", 2, 15, 0, 14, 6);
        
        Mago mago = new Mago("Fernanda", 2, 8, 6, 10, 8);

        Scanner scanner = new Scanner(System.in);

        int opcao = 1;
        while (opcao != 0) {
            System.err.println("Escolha umsa opção");
            System.err.println("1. Ver Guerreiro");
            System.err.println("2. Ver Mago");
            System.err.println("0. Sair");

            System.out.print("Digite a opção -> ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            OUTER:
            switch (opcao) {
                case 1 -> {
                    System.out.println(">Atributos do Guerreiro<");
                    System.out.println("Nome: " + guerreiro.getNome());
                    System.out.println("Nível: " + guerreiro.getNivel());
                    System.out.println("Vida: " + guerreiro.getVida());
                    System.out.println("Mana: " + guerreiro.getMana());
                    System.out.println("Defesa: " + guerreiro.getDefesa());
                    System.out.println("Dano: " + guerreiro.getDano());

                    // Menu de level up e dano
                    System.err.println("Escolha uma opção");
                    System.err.println("1. LEVEL UP");
                    System.err.println("2. tomar DANO");
                    System.err.println("0. retornar ao MENU");

                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcao) {
                        case 1 -> {
                            guerreiro.Evoluir(1, 30, 18, 5, 7);
                            System.out.println("LEVEL UP!!!!");
                            break OUTER;
                    }
                        case 2 -> {
                            guerreiro.SofrerDano(5);
                            System.out.println("Voce tomou dano!");
                            break OUTER;
                    }
                        case 0 -> {
                            System.out.println("Retornando ao MENU...");
                            break;
                        }
                        default -> {
                            System.out.println("Opção invalida! Tente de novo...");
                    }
                    }
                    
                }
                case 2 -> {
                    System.out.println(">Atributos do Mago<");
                    System.out.println("Nome: " + mago.getNome());
                    System.out.println("Nível: " + mago.getNivel());
                    System.out.println("Vida: " + mago.getVida());
                    System.out.println("Mana: " + mago.getDefesa());
                    System.out.println("Dano: " + mago.getDano());
                    System.out.print("Digite a opção -> ");
                    
                    // Menu de level up e dano
                    System.err.println("Escolha uma opção");
                    System.err.println("1. LEVEL UP!!!!");
                    System.err.println("2. tomar DANO");
                    System.err.println("0. retornar ao MENU");
                    
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcao) {
                        case 1 -> {
                            mago.Evoluir(1, 30, 18, 5, 7);
                            System.out.println("LEVEL UP");
                            break OUTER;
                    }
                        case 2 -> {
                            mago.SofrerDano(5);
                            System.out.println("Voce tomou dano!");
                            break OUTER;
                    }
                        case 0 -> {
                            System.out.println("Retornando ao MENU...");
                            break;
                        }
                        default -> {
                            System.out.println("Opção invalida! Tente de novo...");
                            break OUTER;
                    }
                    }
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção invalida!");
            }
            }

            scanner.close();
        }
        
    }

