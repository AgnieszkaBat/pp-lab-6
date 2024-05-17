import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UtworzKatalogIInterfejs {

    public static void main(String[] args) {
        // Tworzenie katalogu company
        String sciezkaDoKataloguCompany = "company";
        File katalogCompany = new File(sciezkaDoKataloguCompany);
        if (!katalogCompany.exists()) {
            if (katalogCompany.mkdir()) {
                System.out.println("Katalog 'company' został utworzony.");
            } else {
                System.out.println("Wystąpił błąd podczas tworzenia katalogu 'company'.");
            }
        } else {
            System.out.println("Katalog 'company' już istnieje.");
        }

        // Tworzenie katalogu interfaces wewnątrz katalogu company
        String sciezkaDoKataloguInterfaces = sciezkaDoKataloguCompany + File.separator + "interfaces";
        File katalogInterfaces = new File(sciezkaDoKataloguInterfaces);
        if (!katalogInterfaces.exists()) {
            if (katalogInterfaces.mkdir()) {
                System.out.println("Katalog 'interfaces' został utworzony w katalogu 'company'.");
            } else {
                System.out.println("Wystąpił błąd podczas tworzenia katalogu 'interfaces'.");
            }
        } else {
            System.out.println("Katalog 'interfaces' już istnieje w katalogu 'company'.");
        }

        // Tworzenie pliku Employable.java w katalogu interfaces
        String sciezkaDoPlikuEmployable = sciezkaDoKataloguInterfaces + File.separator + "Employable.java";
        File plikEmployable = new File(sciezkaDoPlikuEmployable);
        if (!plikEmployable.exists()) {
            try {
                if (plikEmployable.createNewFile()) {
                    System.out.println("Plik 'Employable.java' został utworzony w katalogu 'interfaces'.");
                    // Zapisanie interfejsu Employable do pliku
                    FileWriter writer = new FileWriter(plikEmployable);
                    writer.write("public interface Employable {\n");
                    writer.write("    void work();\n");
                    writer.write("}");
                    writer.close();
                    System.out.println("Interfejs 'Employable' został zapisany do pliku 'Employable.java'.");
                } else {
                    System.out.println("Wystąpił błąd podczas tworzenia pliku 'Employable.java'.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Plik 'Employable.java' już istnieje w katalogu 'interfaces'.");
        }
    }
}

