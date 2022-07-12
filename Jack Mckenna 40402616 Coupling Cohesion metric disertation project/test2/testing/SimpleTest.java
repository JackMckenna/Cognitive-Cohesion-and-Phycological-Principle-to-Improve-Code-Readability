package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.junit.jupiter.api.Test;

import testing.builder.JacksAstVisitor;
import testing.builder.Link;
import testing.builder.Node;

public class SimpleTest {
	@Test
	// test that there are three link k, i and j and that i and j are connected and
	// that k goes to a infixs node
	// create a constructor in jacks ast vistior that passes the link and the node
	// cache
	// k=i+j+l
	// k=(i+j)*l

	public void simpleAddition() {

		String source = "package d.c.b; public class A {int i; int j; int k; public void parenthesized() {k=i+j;}}";
		ASTParser parser = ASTParser.newParser(AST.JLS13);

		parser.setSource(source.toCharArray());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		Map<String, String> options = new HashMap<>();
		parser.setCompilerOptions(options);
		String[] classpath = { "./" };
		parser.setEnvironment(classpath, null, null, true);
		parser.setUnitName("d.c.b.A.java");
		parser.setResolveBindings(true);

		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		Map<Node, Node> nodeCache = new HashMap<>();
		Map<Link, Link> linkCache = new HashMap<>();
		JacksAstVisitor visitor = new JacksAstVisitor(nodeCache, linkCache, null, null);

		cu.accept(visitor);
		assertEquals("Checking linkCache size", 3, linkCache.size());
		assertEquals("Checking nodeCache size", 12, nodeCache.size());

		// add assersions tests for k i and j

		assertEquals(3, linkCache.size());

		// check i to node
		Node infix = null;
		Collection<Link> values = linkCache.values();
		boolean linkFound = false;
		for (Link link : values) {
			Node nodeFrom = link.getFrom();
			String labelOfFromNode = nodeFrom.getLabel();

			Node nodeTo = link.getTo();
			String labelOfToNode = nodeTo.getLabel();

			if (labelOfFromNode != null && labelOfFromNode.equals("i")) {
				infix = nodeTo;
				linkFound = true;
			}

		}

		assertTrue(linkFound);

		// check j to k
		linkFound = false;
		for (Link link : values) {
			Node nodeFrom = link.getFrom();
			String labelOfFromNode = nodeFrom.getLabel();

			Node nodeTo = link.getTo();
			String labelOfToNode = nodeTo.getLabel();

			if (labelOfFromNode != null && labelOfFromNode.equals("j") && nodeTo.equals(infix)) {
				linkFound = true;
			}
		}

		assertTrue(linkFound);

		linkFound = false;
		for (Link link : values) {
			Node nodeFrom = link.getFrom();
			String labelOfFromNode = nodeFrom.getLabel();

			Node nodeTo = link.getTo();
			String labelOfToNode = nodeTo.getLabel();

			if (nodeFrom.equals(infix) && "k".equals(labelOfToNode)) {
				linkFound = true;
			}
		}

		assertTrue(linkFound);

	}

	@Test
	public void simpleAdditionParenthesized() {

		String source = "package d.c.b; public class A {int i; int j; int k; public void parenthesized() {k=(i+j);}}";
		ASTParser parser = ASTParser.newParser(AST.JLS13);

		parser.setSource(source.toCharArray());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		Map<String, String> options = new HashMap<>();
		parser.setCompilerOptions(options);
		String[] classpath = { "./" };
		parser.setEnvironment(classpath, null, null, true);
		parser.setUnitName("d.c.b.A.java");
		parser.setResolveBindings(true);

		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		Map<Node, Node> nodeCache = new HashMap<>();
		Map<Link, Link> linkCache = new HashMap<>();
		JacksAstVisitor visitor = new JacksAstVisitor(nodeCache, linkCache, null, null);

		cu.accept(visitor);
		assertEquals("Checking linkCache size", 4, linkCache.size());
		assertEquals("Checking nodeCache size", 13, nodeCache.size());

		// add assersions tests for k i and j

		assertEquals(4, linkCache.size());

		// check i to node
		Node infix = null;
		Node parenthesized = null;
		Collection<Link> values = linkCache.values();
		boolean linkFound = false;
		for (Link link : values) {
			Node nodeFrom = link.getFrom();
			String labelOfFromNode = nodeFrom.getLabel();

			Node nodeTo = link.getTo();
			String labelOfToNode = nodeTo.getLabel();

			if (labelOfFromNode != null && labelOfFromNode.equals("i")) {
				infix = nodeTo;
				linkFound = true;
			}

		}

		assertTrue(linkFound);

		// check j to k
		linkFound = false;
		for (Link link : values) {
			Node nodeFrom = link.getFrom();
			String labelOfFromNode = nodeFrom.getLabel();

			Node nodeTo = link.getTo();
			String labelOfToNode = nodeTo.getLabel();

			if (labelOfFromNode != null && labelOfFromNode.equals("j") && nodeTo.equals(infix)) {
				linkFound = true;
			}
		}

		assertTrue(linkFound);

		// nodefrom.equlas infix node to parenthasised

		linkFound = false;
		for (Link link : values) {
			Node nodeFrom = link.getFrom();
			String labelOfFromNode = nodeFrom.getLabel();

			Node nodeTo = link.getTo();
			String labelOfToNode = nodeTo.getLabel();

			if (nodeFrom.equals(infix)) {
				linkFound = true;
				parenthesized = nodeTo;
			}
		}

		assertTrue(linkFound);

		linkFound = false;
		for (Link link : values) {
			Node nodeFrom = link.getFrom();
			String labelOfFromNode = nodeFrom.getLabel();

			Node nodeTo = link.getTo();
			String labelOfToNode = nodeTo.getLabel();

			if (nodeFrom.equals(parenthesized) && "k".equals(labelOfToNode)) {
				linkFound = true;
			}
		}

		assertTrue(linkFound);

		// node from infix parenthesized k

	}
	@Test
	public void simpleAddition3Operands() {
		
		String source = "package d.c.b; public class A {int i; int j; int k; int l; public void parenthesized() {k=i+j+l;}}";
		ASTParser parser = ASTParser.newParser(AST.JLS13);

		parser.setSource(source.toCharArray());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		Map<String, String> options = new HashMap<>();
		parser.setCompilerOptions(options);
		String[] classpath = { "./" };
		parser.setEnvironment(classpath, null, null, true);
		parser.setUnitName("d.c.b.A.java");
		parser.setResolveBindings(true);

		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		Map<Node, Node> nodeCache = new HashMap<>();
		Map<Link, Link> linkCache = new HashMap<>();
		JacksAstVisitor visitor = new JacksAstVisitor(nodeCache, linkCache, null, null);

		cu.accept(visitor);
		assertEquals("Checking linkCache size", 4, linkCache.size());
		assertEquals("Checking nodeCache size", 13, nodeCache.size());

		// add assersions tests for k i and j

		assertEquals(4, linkCache.size());

		// check i to node
		Node infix = null;
		Node parenthesized = null;
		Collection<Link> values = linkCache.values();
		boolean linkFound = false;
		for (Link link : values) {
			Node nodeFrom = link.getFrom();
			String labelOfFromNode = nodeFrom.getLabel();

			Node nodeTo = link.getTo();
			String labelOfToNode = nodeTo.getLabel();

			if (labelOfFromNode != null && labelOfFromNode.equals("i")) {
				infix = nodeTo;
				linkFound = true;
			}

		}

		assertTrue(linkFound);

		// check j to k
		linkFound = false;
		for (Link link : values) {
			Node nodeFrom = link.getFrom();
			String labelOfFromNode = nodeFrom.getLabel();

			Node nodeTo = link.getTo();
			String labelOfToNode = nodeTo.getLabel();

			if (labelOfFromNode != null && labelOfFromNode.equals("j") && nodeTo.equals(infix)) {
				linkFound = true;
			}
		}

		assertTrue(linkFound);

		// nodefrom.equlas infix node to parenthasised

		linkFound = false;
		for (Link link : values) {
			Node nodeFrom = link.getFrom();
			String labelOfFromNode = nodeFrom.getLabel();

			Node nodeTo = link.getTo();
			String labelOfToNode = nodeTo.getLabel();

			if (nodeFrom.equals(infix)) {
				linkFound = true;
				parenthesized = nodeTo;
			}
		}

		assertTrue(linkFound);

		linkFound = false;
		for (Link link : values) {
			Node nodeFrom = link.getFrom();
			String labelOfFromNode = nodeFrom.getLabel();

			Node nodeTo = link.getTo();
			String labelOfToNode = nodeTo.getLabel();

			if (nodeFrom.equals(parenthesized) && "k".equals(labelOfToNode)) {
				linkFound = true;
			}
		}

		assertTrue(linkFound);

		// node from infix parenthesized k

	}

}
