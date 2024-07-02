package SistemaRPG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SistemaDialogo {

    // Método para ler o arquivo e imprimir o diálogo na tela
    public void lerArquivoEDialogar(String caminhoArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SistemaDialogo sistemaDialogo = new SistemaDialogo();
        sistemaDialogo.lerArquivoEDialogar("dialogo.txt");
    }
}
