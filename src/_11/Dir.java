package _11;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
    public static void list2(String directory) {
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directory))) {
            for(Path path : directoryStream) {
                System.out.println(
                        path.getFileName() +
                                " Rozmiar: " + Files.size(path) +
                                " Modyfikacja: " + Files.getLastModifiedTime(path).toString() +
                                " Prawa: " + "exe: " + Files.isExecutable(path) +
                                " read: " + Files.isReadable(path) +
                                " writable: " + Files.isWritable(path));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

