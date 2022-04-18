/*
 * generated by Xtext 2.25.0
 */
package greenhouse.parser.antlr;

import com.google.inject.Inject;
import greenhouse.parser.antlr.internal.InternalGreenHouseParser;
import greenhouse.services.GreenHouseGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class GreenHouseParser extends AbstractAntlrParser {

	@Inject
	private GreenHouseGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGreenHouseParser createParser(XtextTokenStream stream) {
		return new InternalGreenHouseParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public GreenHouseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GreenHouseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}