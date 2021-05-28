package cobol;
import parse.*;
import parse.tokens.*;
public class ConstantValueAssembler extends Assembler {
public void workOn(Assembly a) {
	Cobol c = new Cobol();
	Token t = (Token) a.pop();
	c.setConstantValue( t.nval() );

	t = (Token) a.pop();
	//This should be the word "value" so we don't need any action here
	t = (Token) a.pop();
	c.setConstantName(t.sval() );
	//t = (Token) a.pop();
	//c.setLineNumber( (int) Math.round(t.nval()) );
	// ^ is currently showing the string "88" which is not the line number
	//System.out.println("Token string[2]: " + c.getLineNumber() );
	a.setTarget(c);
}
}