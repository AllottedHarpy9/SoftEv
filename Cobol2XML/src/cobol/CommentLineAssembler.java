package cobol;
import parse.*;
import parse.tokens.*;
public class CommentLineAssembler extends Assembler {
	/**
	 * Pop a word, then grab the next elements and set the target
	 * commentLine to the full string.
	 *
	 * @param Assembly the assembly to work on
	 */
	public void workOn(Assembly a) {
		//System.out.println("commentLineAssembler");
		StringBuilder comment = new StringBuilder();
		Cobol c = new Cobol();
		comment.append(a.pop());
		while (a.hasMoreElements()) {
			comment.append(" ");
			Token t = (Token) a.nextElement();
				comment.append(t);
		}
		String comments = comment.toString();
		c.setCommentLine(comments);
		a.setTarget(c);
	}
}

