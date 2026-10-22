package friday;

import java.util.Scanner;

public class Friday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String comandos;
        AcoesComputador acoes = new AcoesComputador();

        acoes.saudacao("Cássio");

        do {

            comandos = scanner.nextLine();
            System.out.println("\nVocê: " + comandos);
            String comandoNormalizado = comandos.trim().toLowerCase();
            boolean comandoReconhecido = false;

            if (comandoNormalizado.contains("youtube")) {
                acoes.abrirSite("https://www.youtube.com");
                comandoReconhecido = true;

            }

            if (comandoNormalizado.contains("google")) {
                acoes.abrirSite("https://www.google.com");
                comandoReconhecido = true;

            }

            if (comandoNormalizado.contains("github")) {
                acoes.abrirSite("https://github.com/CassioMarcos");
                comandoReconhecido = true;
            }

            if (comandoNormalizado.contains("vs code")) {
                acoes.abrirVsCode();
                comandoReconhecido = true;
            }

            if (comandoNormalizado.equals("fechar")) {
                comandoReconhecido = true;
            }

            if (!comandoReconhecido) {
                System.out.println("Comando não reconhecido, senhor.");
            }

        } while (!comandos.trim().equalsIgnoreCase("Fechar"));

        System.out.println("Encerrando...");

        scanner.close();

    }
}