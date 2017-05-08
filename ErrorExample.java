/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Aaron
 */
public class ErrorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path file = Paths.get("/fakefile.txt");
        try (InputStream in = Files.newInputStream(file);
            BufferedReader reader =
              new BufferedReader(new InputStreamReader(in))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.println(x);
        } catch (Exception ex) {
            System.err.println(ex);
        }
            finally {
            System.out.println("This finally block will always happen");
        }
    }
    
}
