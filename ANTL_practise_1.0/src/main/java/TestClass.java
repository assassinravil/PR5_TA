import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
public class TestClass {
    public static void main(String[] args) {
//        String text = "5 + 3 * 2 - 1 + 10 / 2";
        String text = "hello";
        ExprLexer lexer = new ExprLexer(CharStreams.fromString(text));
        ExprParser parser = new ExprParser(new CommonTokenStream(lexer));
        System.out.println(parser.toString());
    }
}
