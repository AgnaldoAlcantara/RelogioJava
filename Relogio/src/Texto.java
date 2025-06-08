import java.util.Scanner;
class Texto {
    Scanner scanner = new Scanner(System.in);
    public void inicio() {
        System.out.println("              Tabela de Horário          ");
        System.out.println("------------------------------------------------");
        System.out.println("1) Adicionar o Horário");
        System.out.println("2) Mostrar o Horário");
        System.out.println("3) Editar o Horário");
        System.out.println("4) Sair");
        System.out.println("------------------------------------------------");
        System.out.print("Digite a Opção: ");
    }

    public boolean opcao(String horarioBase, Reloginho relogio) {
        String horario = horarioBase.replaceAll(":", "");
        int quantData = horario.length();

        try {
            if (quantData == 6) {
                relogio.editTime(horario.substring(0, 2), horario.substring(2, 4), horario.substring(4, 6));
                return true;
            } else if (quantData == 5) {
                relogio.editTime(horario.substring(0, 1), horario.substring(1, 3), horario.substring(3, 5));
                return true;
            } else {
                System.out.println("Você digitou o horário errado.");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Formato inválido! Use apenas números.");
            return false;
        }
    }
    public void errado(){
        System.out.println("Opção inválida! Tente novamente.");
        System.out.print("Aperter ENTER para Continuar...");
        scanner.nextLine();
        System.out.println();
    }
}