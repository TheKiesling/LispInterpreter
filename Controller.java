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

/*********************************************************************
 * Control the program coneccting all the classes of the solution
 * @TheKiesling
 * @since 1.0
 */
public class Controller {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        Tokens tokens = new Tokens();
        ArrayList<String> lines = fileReader.read();
        for(String expression : lines)
            System.out.println(tokens.Tokenizer(expression));
    }
}
