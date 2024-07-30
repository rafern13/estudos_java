package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta/subpasta1/subsubpasta1");
        zip(arquivoZip, arquivosParaZipar);
    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar) {
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) {

            for(Path file : directoryStream) { //passa por todos os diretorios de 'arquivosParaZipar'

                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());//pega nome do file e cria um zip entry
                zipStream.putNextEntry(zipEntry);//começa a escrever um novo arquio zip e seta a stream no inicio, porem nao escreve o conteudo dos arquivos zipados
                Files.copy(file, zipStream); //copia o conteudo para os arquivo
                zipStream.closeEntry();//fecha a entry de escrever

            }
            System.out.println("Arquivo criado com sucesso");

        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
