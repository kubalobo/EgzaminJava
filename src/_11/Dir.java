package _11;

import java.io.File;
import java.nio.file.Files;

/**
 * Created by Kuba on 22.06.2017.
 * 11. Program typu dir (ls) listujący zawartość katalogu wraz z dodatkowymi atrybutami plików
 * (wielkość, data/czas utworzenia, data/czas ostatniego dostępu, prawa dostępu itp.)
 * Program napisz w dwóch wersjach, tylko z użyciem klasy File i tylko z
 * użyciem klasy java.nio.files.Files.
 */
public class Dir {
    public static void list(String path) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println("File " + file.getName() +
                        " Size: " + file.getTotalSpace() +
                        " Last modified: " + file.lastModified());
            } else if (file.isDirectory()) {
                System.out.println("Directory " + file.getName() );
            }
        }

    }
    /*public static void list2(String path) {
        Files folder = new Files(path);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println("File " + file.getName() +
                        " Size: " + file.getTotalSpace() +
                        " Date: " + file.);
            } else if (file.isDirectory()) {
                System.out.println("Directory " + file.getName() );
            }
        }

    }*/
}
