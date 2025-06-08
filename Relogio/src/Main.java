import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reloginho relogio = new Reloginho();
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        while (true) {
            relogio.inicio();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    if (!relogio.isHorarioDefinido()) {
                        System.out.println();
                        System.out.println("              Tabela de Horário          ");
                        System.out.println("------------------------------------------------");
                        System.out.print("Digite o Horário no formato HH:MM:SS: ");
                        String horarioBase = scanner.nextLine();
                        if (relogio.opcao(horarioBase)) {
                            System.out.println("Horário definido com sucesso!");
                            System.out.print("Aperter ENTER para Continuar...");
                            scanner.nextLine();
                            System.out.println();
                        }
                    } else {
                        System.out.println("O horário já foi definido e não pode ser redefinido.");
                        System.out.print("Aperter ENTER para Continuar...");
                        scanner.nextLine();
                        System.out.println();
                    }
                }
                case 2 -> {
                    if (relogio.isHorarioDefinido()) {
                        relogio.horario();
                        System.out.print("Aperter ENTER para Continuar...");
                        scanner.nextLine();
                        System.out.println();
                    } else {
                        System.out.println("Você precisa definir o horário antes de usar esta opção.");
                        System.out.print("Aperter ENTER para Continuar...");
                        scanner.nextLine();
                        System.out.println();
                    }
                }
                case 3 -> {
                    if (relogio.isHorarioDefinido()) {
                        System.out.print("Digite o Horário no formato HH:MM:SS: ");
                        String horarioBase = scanner.nextLine();
                        relogio.opcao(horarioBase);
                        System.out.print("Aperter ENTER para Continuar...");
                        scanner.nextLine();
                        System.out.println();
                    } else {
                        System.out.println("Você precisa definir o horário antes de usar esta opção.");
                        System.out.print("Aperter ENTER para Continuar...");
                        scanner.nextLine();
                        System.out.println();
                    }
                }
                case 4 -> {
                    System.out.println("O programa terminou...");
                    return;
                }
                default -> relogio.errado();
            }
        }
    }
}