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
 * Create tokens of any expression
 * @TheKiesling
 * @since 1.0
 */
public class Tokens {
    
    //---------------------------METHODS------------------------------
    /*****************************************************************
     * makes tokens of an expression
     * @param expression
     * @return each token of the expression
     */
    public ArrayList<Character> Tokenizer(String expression){
        ArrayList<Character> tokens = new ArrayList<Character>();
        for(int i = 0; i < expression.length(); i++)
            if (expression.charAt(i) != ' ')
                tokens.add(expression.charAt(i));
        return tokens; 
    }
    //****************************************************************
}
