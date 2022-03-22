/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package psintatico;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
/**
 *
 * @author ander
 */
public class PSintatico {

    public static void main(String args[]) throws IOException {
        try ( PrintWriter pw = new PrintWriter(new File(args[1]))) {
            CharStream cs = CharStreams.fromFileName(args[0]);
            PLexer lexer = new PLexer(cs);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PParser parser = new PParser(tokens);

            // Registrar o error lister personalizado aqui
            MyCustomErrorListener mcel = new MyCustomErrorListener(pw);
            parser.addErrorListener(mcel);

            try {
                parser.programa();
            } catch (RuntimeException re) {
                if (re.getMessage().equals("Parar")) {
                    // não faz nada, apenas para
                } else {
                    throw re; // não era a nossa exception! re-lança para que o erro apareça
                }
            }
            pw.println("Fim da compilacao");
        }
    }
}
