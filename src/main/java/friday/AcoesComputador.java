package friday;

import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;

public class AcoesComputador {

    public void saudacao(String nome) {
        System.out.println("Bom dia, " + nome + "!");
    }

    public void abrirSite(String endereco) {

        try {
            Desktop.getDesktop().browse(
                    URI.create(endereco));

            System.out.println("Abrindo site, senhor.");

        } catch (IOException e) {

            System.out.println("Não foi possível abrir o site, senhor.");
            System.out.println("Detalhes: " + e.getMessage());

        }

    }

    public void abrirVsCode() {

        try {

            new ProcessBuilder("cmd", "/c", "code").start();

            System.out.println("Abrindo o VS Code, senhor!");

        } catch (IOException e) {
            System.out.println("Não foi possível abrir o VS Code, senhor.");
            System.out.println("Detalhes: " + e.getMessage());
        }
    }

}
