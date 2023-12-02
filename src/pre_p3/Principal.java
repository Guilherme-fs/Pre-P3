/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pre_p3;

import java.io.IOException;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Fernanda
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, IOException {
        
        Controle c = new Controle();
        String arquivo  = "C:\\Windows\\Temp\\beer.json";
        c.lerJSON(arquivo);
    
    }
}
