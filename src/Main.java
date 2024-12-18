import java.util.List;

import parser.Lexer;
import parser.Token;

public final class Main {
    public static void main(String[] args) {
        final String input = "2 + 2";
        final List<Token> tokens = new Lexer(input).tokenize();
        for (Token token : tokens) {
            System.out.println(token.getType());
        }
    }
}