/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/*********************************************************************
 * Allows the read of a Common Lisp program
 * @TheKiesling
 * @since 1.0
 */
public class FileReader{

    //---------------------------PROPERTIES---------------------------
    private File file = new File("programLisp.lsp");
    private Scanner scanner;

    //---------------------------METHODS------------------------------
    /*****************************************************************
     * read a Common Lisp program
     * @return each line of the file as element of an array
     * @throws FileNotFoundException
     */
    public ArrayList<String> read(){
        ArrayList<String> lines = new ArrayList<String>();
        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                lines.add(line);
            }
        scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lines;
    }
    //****************************************************************
}