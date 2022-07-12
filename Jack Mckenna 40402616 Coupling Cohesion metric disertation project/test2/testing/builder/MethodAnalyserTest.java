package testing.builder;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.junit.jupiter.api.Test;

public class MethodAnalyserTest {
	private static final String source = "package d.c.b;\r\n"
			+ "\r\n"
			+ "public class SimpleMethodAnalysis {\r\n"
			+ "	double a= 0 ;\r\n"
			+ "	double b = 0;\r\n"
			+ "	double c = 0;\r\n"
			+ "	double d = 0;\r\n"
			+ "\r\n"
			+ "	double calc() {\r\n"
			+ "		double x = a+b;\r\n"
			+ "		double y = c+d;\r\n"
			+ "		double result = x + y;\r\n"
			+ "		return result;\r\n"
			+ "	}\r\n"
			+ "\r\n"
			+ "}\r\n"
			+ "";
	
//	private static final String source = "package d.c.b;\r\n"
//			+ "\r\n"
//			+ "public class TestAnalysis {\r\n"
//			+ "	private double s_monthToDate =0;\r\n"
//			+ "	private double u_monthDiscount= 0;\r\n"
//			+ "	private double v_customerDiscount= 0;\r\n"
//			+ "	private double w_taxRate= 0;\r\n"
//			+ "\r\n"
//			+ "	double calc(double lineItemPrice, double quantity) {\r\n"
//			+ "		double a_lineCost = lineItemPrice * quantity;\r\n"
//			+ "		s_monthToDate += a_lineCost;\r\n"
//			+ "		double b_monthPercentSaving =  u_monthDiscount;\r\n"
//			+ "		double c_monthMonetarySaving = a_lineCost * b_monthPercentSaving / 100;\r\n"
//			+ "		double d_customerMonetarySaving = a_lineCost * v_customerDiscount / 100;\r\n"
//			+ "		double f_gross = a_lineCost - d_customerMonetarySaving - c_monthMonetarySaving;\r\n"
//			+ "		double e_tax = f_gross * w_taxRate;\r\n"
//			+ "		double result = f_gross + e_tax;\r\n"
//			+ "		return result;\r\n"
//			+ "	}\r\n"
//			+ "\r\n"
//			+ "}\r\n"
//			+ "";

	@Test
	public void test() {

		ASTParser parser = ASTParser.newParser(AST.JLS13);

		parser.setSource(source.toCharArray());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		Map<String, String> options = new HashMap<>();
		parser.setCompilerOptions(options);
		String[] classpath = { "./" };
		parser.setEnvironment(classpath, null, null, true);
		parser.setUnitName("d.c.b.SimpleMethodAnalysis.java");
		parser.setResolveBindings(true);

		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		Map<Node, Node> nodeCache = new HashMap<>();
		Map<Link, Link> linkCache = new HashMap<>();
		JacksAstVisitor visitor = new JacksAstVisitor(nodeCache, linkCache, null, null);

		cu.accept(visitor);
		//assertEquals("Checking linkCache size", 25, linkCache.size());
		//assertEquals("Checking nodeCache size", 13, nodeCache.size());

		// add assersions tests for k i and j

		//assertEquals(4, linkCache.size());
	}

}
