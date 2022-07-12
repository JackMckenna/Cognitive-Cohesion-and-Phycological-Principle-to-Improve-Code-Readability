package testing.builder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
public class JacksAstVisitor extends ASTVisitor {

	Map<Node, Node> nodeCache;
	Map<Link, Link> linkCache;
	Map<Link, Link> methodLinkCache = new HashMap<>();
	IFile file;
	CompilationUnit compilationUnit ;


	public JacksAstVisitor(Map<Node, Node> nodeCache, Map<Link, Link> linkCache, IFile file, CompilationUnit compilationUnit ) {
		super();
		this.nodeCache = nodeCache;
		this.linkCache = linkCache;
		this.file = file;
		this.compilationUnit = compilationUnit;
	}
	
	private Node getNode(Node node) {
		if(!nodeCache.containsKey(node)) {
			nodeCache.put(node, node);
		}
		return nodeCache.get(node);
	}

	private Node getNode(int startPosition, int length, int astNodeType) {
		Node jacksNode = new Node(startPosition, length, astNodeType);
		return getNode(jacksNode);
	}



	private Link getLink(Link link) {
		if(!linkCache.containsKey(link)) {
			linkCache.put(link, link);
			methodLinkCache.put(link, link);
		}
		return linkCache.get(link);
	}

	private Link getLink(Node from, Node to) {
		Link jacksLink = new Link(from, to);
		return getLink(jacksLink);
	}

	@Override
	public void endVisit(AnnotationTypeDeclaration node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(AnnotationTypeMemberDeclaration node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(AnonymousClassDeclaration node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ArrayAccess node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ArrayCreation node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ArrayInitializer node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ArrayType node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(AssertStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(Assignment node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(Block node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(BlockComment node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(BooleanLiteral node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(BreakStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(CastExpression node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(CatchClause node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(CharacterLiteral node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ClassInstanceCreation node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(CompilationUnit node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ConditionalExpression node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ConstructorInvocation node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ContinueStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(CreationReference node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(Dimension node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(DoStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(EmptyStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(EnhancedForStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(EnumConstantDeclaration node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(EnumDeclaration node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ExportsDirective node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ExpressionMethodReference node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ExpressionStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(FieldAccess node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(FieldDeclaration node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ForStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(IfStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ImportDeclaration node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(InfixExpression node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(Initializer node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(InstanceofExpression node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(IntersectionType node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(Javadoc node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(LabeledStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(LambdaExpression node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(LineComment node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(MarkerAnnotation node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(MemberRef node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(MemberValuePair node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(MethodDeclaration node) {
		Node jacksNode = getNode(node.getStartPosition(), node.getLength(), node.getNodeType());
		// TODO Auto-generated method stub
		Map <String,Node> keyToNode = new HashMap<>();
		Set <Node> structuralNodes = new HashSet<>();
		
		//we have multipul nodes pointing to do same key so 
		//eg. x=1 and y=x+2 will result in two nodes both with a key of "x"
		//link cache points to the earliest occurence of the key which is it definition
		
		for (Link link : linkCache.keySet()) {
			Node fromNode = link.getFrom();
			Node toNode = link.getTo();
			
			String key = fromNode.getKey();
			if(keyToNode.containsKey(key)) {
				Node exsitingNode = keyToNode.get(key);
				if(fromNode.getStart()< exsitingNode.getStart()) {
					keyToNode.put(key, fromNode);
				}
			}
			else {
				keyToNode.put(key, fromNode);
			}
			String key2 = toNode.getKey();
			if(keyToNode.containsKey(key2)) {
				Node exsitingNode = keyToNode.get(key2);
				if(toNode.getStart()< exsitingNode.getStart()) {
					keyToNode.put(key2, toNode);
				}
			}
			else {
				keyToNode.put(key2, toNode);
			}
		}
		// Contains the links that are within the method 
		Set<Link> links = Set.copyOf( methodLinkCache.keySet());
		for (Link link : links) {
			Node fromNode = link.getFrom();
			Node toNode = link.getTo();
			
			structuralNodes.add( getNode(fromNode));
			structuralNodes.add( getNode(toNode));
		}
		List<Link> structural= new ArrayList<>();
		for (Node structuralNode : structuralNodes) {
			Node toNode = structuralNode.getKey()==null?structuralNode:keyToNode.get(structuralNode.getKey());

			if(structuralNode.getStart() != jacksNode.getStart()) {
				structural.add( getLink(jacksNode, toNode));
			}				
		}
		List<Link> despendancies =new ArrayList<>();
		for (Link link : links) {
			Node fromNode = link.getFrom().getKey()==null?link.getFrom():keyToNode.get(link.getFrom().getKey());
			Node toNode = link.getTo().getKey()==null?link.getTo():keyToNode.get(link.getTo().getKey());
			Link link2 = getLink(fromNode, toNode);
			//System.out.println("dependancy From[" + getNode(fromNode) + "] to[" + getNode(toNode)+ "]");
			despendancies.add(link2);
			
		}
		//calculate the metric for the whole method as it stands 
		Metric metric = new Metric(despendancies, structural);
		System.out.println("Metric value [" + metric.calculate() + "]" );
		System.out.println("Coupling [" + metric.calculateCoupling() + "]");
		System.out.println("Cohesion [" + metric.calculateCohesion() + "]");
		//find a possible split point in the method that imroves the value of the metric 
		// The idea being that splitting the method into two at that point woud improve the readability 
		List<Node> variablesInMethod = new ArrayList<>();
		List<Node> variablesBeforeMethod = new ArrayList<>();
		List<Node> variablesAfterMethod = new ArrayList<>();
		int startOfMethod = node.getStartPosition();
		int endOfMethod = node.getStartPosition() + node.getLength();
		for (Node node2 : structuralNodes) {
			
			if(node2.getStart()> startOfMethod && node2.getStart()<endOfMethod) {
				variablesInMethod.add(node2);
			}
			else if(node2.getStart()<startOfMethod) {
				variablesBeforeMethod.add(node2);
			}
			else {
				variablesAfterMethod.add(node2);
			}
		}
		
		Comparator<Node> orderByStart = new Comparator<Node>() {

			@Override
			public int compare(Node n1, Node n2) {
				return n1.getStart()-n2.getStart();
			}
		};
		int optimalSplitPoint = 0;
		int optimumMetricValue= Integer.MAX_VALUE;
		variablesInMethod.sort(orderByStart);
		for (Node node2 : variablesInMethod) {
			List<Node> variablesInMethodUpper = new ArrayList<>();
			List<Node> variablesInMethodLower = new ArrayList<>();
			for (Node node3 : variablesInMethod) {
				if(node3.getStart()< node2.getStart()) {
					variablesInMethodUpper.add(node3);
				}
				else {
					variablesInMethodLower.add(node3);
				}
			}
			Node nodeBefore = new Node(jacksNode.getStart(), jacksNode.getLength()+1, jacksNode.getAstNodeType());
			Node nodeUpper = new Node(jacksNode.getStart(), jacksNode.getLength()+2, jacksNode.getAstNodeType());
			Node nodeLower = new Node(jacksNode.getStart(), jacksNode.getLength()+3, jacksNode.getAstNodeType());
			Node nodeAfter = new Node(jacksNode.getStart(), jacksNode.getLength()+4, jacksNode.getAstNodeType());
			List<Link> structuralTest= new ArrayList<>();
			structuralTest.add(getLink(jacksNode,nodeBefore));
			structuralTest.add(getLink(jacksNode,nodeUpper));
			structuralTest.add(getLink(jacksNode,nodeLower));
			structuralTest.add(getLink(jacksNode,nodeAfter));
			
			for (Node structuralNode : variablesBeforeMethod) {
				Node toNode = structuralNode.getKey()==null?structuralNode:keyToNode.get(structuralNode.getKey());
				structuralTest.add( getLink(nodeBefore, toNode));
			}
			for (Node structuralNode : variablesInMethodLower) {
				Node toNode = structuralNode.getKey()==null?structuralNode:keyToNode.get(structuralNode.getKey());
				structuralTest.add( getLink(nodeLower, toNode));
			}
			for (Node structuralNode : variablesInMethodUpper) {
				Node toNode = structuralNode.getKey()==null?structuralNode:keyToNode.get(structuralNode.getKey());
				structuralTest.add( getLink(nodeUpper, toNode));
			}
			for (Node structuralNode : variablesAfterMethod) {
				Node toNode = structuralNode.getKey()==null?structuralNode:keyToNode.get(structuralNode.getKey());
				structuralTest.add( getLink(nodeAfter, toNode));
			}
			Metric metricTest = new Metric(despendancies, structuralTest);
			for (Link link : structuralTest) {
				
				//System.out.println("structual From[" + getNode(link.getFrom()) + "] to[" + getNode(link.getTo())+ "]");
				
			}
			int metricValue = metricTest.calculate();
			if(metricValue<optimumMetricValue) {
				optimumMetricValue = metricValue;
				optimalSplitPoint = node2.getStart();
			}
			System.out.println("Metric value [" + metricTest.calculate() + "] position["+node2.getStart()+ "]" + "before [" + variablesBeforeMethod.size() + 
					"]" + " Lower {" + variablesInMethodLower.size() + "] upper [" + variablesInMethodUpper.size() +" ] after [ " + variablesAfterMethod.size());
		}
		
		if(file!= null) {
		
			try {
//markers
				IMarker marker = file.createMarker("testing.xmlProblem");
				marker.setAttribute(IMarker.MESSAGE, "Metric value [" + metric.calculate() + "]" );
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
				int lineNumber= compilationUnit.getLineNumber(jacksNode.getStart());
				marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(file!= null && optimalSplitPoint>0) {
			
			try {

				IMarker marker = file.createMarker("testing.xmlProblem");
				marker.setAttribute(IMarker.MESSAGE, "Split point [" + optimumMetricValue + "]" );
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
				int lineNumber= compilationUnit.getLineNumber(optimalSplitPoint);
				marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		super.endVisit(node);
	}

	@Override
	public void endVisit(MethodInvocation node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(MethodRef node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(MethodRefParameter node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(Modifier node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ModuleDeclaration node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ModuleModifier node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ModuleQualifiedName node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(NameQualifiedType node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(NormalAnnotation node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(NullLiteral node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(NumberLiteral node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(OpensDirective node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(PackageDeclaration node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ParameterizedType node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ParenthesizedExpression node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(PatternInstanceofExpression node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(PostfixExpression node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(PrefixExpression node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(PrimitiveType node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ProvidesDirective node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(QualifiedName node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(QualifiedType node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(RecordDeclaration node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(RequiresDirective node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ReturnStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(SimpleName node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(SimpleType node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(SingleMemberAnnotation node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(SingleVariableDeclaration node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(StringLiteral node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(SuperConstructorInvocation node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(SuperFieldAccess node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(SuperMethodInvocation node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(SuperMethodReference node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(SwitchCase node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(SwitchExpression node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(SwitchStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(SynchronizedStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(TagElement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(TextBlock node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(TextElement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ThisExpression node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(ThrowStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(TryStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(TypeDeclaration node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(TypeDeclarationStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(TypeLiteral node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(TypeMethodReference node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(TypeParameter node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(UnionType node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(UsesDirective node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(VariableDeclarationExpression node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(VariableDeclarationFragment node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(VariableDeclarationStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(WhileStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(WildcardType node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void endVisit(YieldStatement node) {
		// TODO Auto-generated method stub
		super.endVisit(node);
	}

	@Override
	public void postVisit(ASTNode node) {
		// TODO Auto-generated method stub
		super.postVisit(node);
	}

	@Override
	public void preVisit(ASTNode node) {
		// TODO Auto-generated method stub
		super.preVisit(node);
	}

	@Override
	public boolean preVisit2(ASTNode node) {
		// TODO Auto-generated method stub
		return super.preVisit2(node);
	}

	@Override
	public boolean visit(AnnotationTypeDeclaration node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(AnnotationTypeMemberDeclaration node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(AnonymousClassDeclaration node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ArrayAccess node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ArrayCreation node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ArrayInitializer node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ArrayType node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(AssertStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}
	@Override
	public boolean visit(Assignment node) {
		// TODO Auto-generated method stub
		Expression lhs = node.getLeftHandSide();
		Node jacksNodeL = getNode(lhs.getStartPosition(), lhs.getLength(), lhs.getNodeType());
		Expression rhs = node.getRightHandSide();
		Node jacksNodeR = getNode(rhs.getStartPosition(), rhs.getLength(), rhs.getNodeType());
		getLink(jacksNodeR, jacksNodeL);
		return super.visit(node);
	}

	@Override
	public boolean visit(Block node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(BlockComment node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(BooleanLiteral node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(BreakStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(CastExpression node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(CatchClause node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(CharacterLiteral node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ClassInstanceCreation node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(CompilationUnit node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ConditionalExpression node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ConstructorInvocation node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ContinueStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(CreationReference node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(Dimension node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(DoStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(EmptyStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(EnhancedForStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(EnumConstantDeclaration node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(EnumDeclaration node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ExportsDirective node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ExpressionMethodReference node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ExpressionStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(FieldAccess node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(FieldDeclaration node) {
		// TODO Auto-generated method stub
		Node jacksNode = getNode(node.getStartPosition(), node.getLength(), node.getNodeType());
		return super.visit(node);
	}

	@Override
	public boolean visit(ForStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(IfStatement node) {
		System.out.println("test");
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ImportDeclaration node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(InfixExpression node) {
		// TODO Auto-generated method stub
		Node jacksNode = getNode(node.getStartPosition(), node.getLength(), node.getNodeType());
		Expression rightOperand = node.getRightOperand();
		Expression leftOperand = node.getLeftOperand();
		Node jacksNodeL = getNode(leftOperand.getStartPosition(), leftOperand.getLength(),leftOperand.getNodeType());
		Node jacksNodeR = getNode(rightOperand.getStartPosition(), rightOperand.getLength(), rightOperand.getNodeType());
		getLink(jacksNodeL, jacksNode);
		getLink(jacksNodeR, jacksNode);
		return super.visit(node);
	}

	@Override
	public boolean visit(Initializer node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(InstanceofExpression node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(IntersectionType node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(Javadoc node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(LabeledStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(LambdaExpression node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(LineComment node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(MarkerAnnotation node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(MemberRef node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(MemberValuePair node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(MethodDeclaration node) {
		// TODO Auto-generated method stub
		methodLinkCache = new HashMap<>();
		return super.visit(node);
	}

	@Override
	public boolean visit(MethodInvocation node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(MethodRef node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(MethodRefParameter node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(Modifier node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ModuleDeclaration node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ModuleModifier node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ModuleQualifiedName node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(NameQualifiedType node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(NormalAnnotation node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(NullLiteral node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(NumberLiteral node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(OpensDirective node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(PackageDeclaration node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ParameterizedType node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ParenthesizedExpression node) {
		// TODO Auto-generated method stub
		//parenthesised expression node
		Node jacksNode = getNode(node.getStartPosition(), node.getLength(), node.getNodeType());
		//node.getexpresion 
		Expression expression = node.getExpression();
		Node jacksNode2 = getNode(expression.getStartPosition(), expression.getLength(), expression.getNodeType());
		getLink(jacksNode2, jacksNode);
		return super.visit(node);
		//create jacks node from to link
		
		
		
		
	}

	@Override
	public boolean visit(PatternInstanceofExpression node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(PostfixExpression node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(PrefixExpression node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(PrimitiveType node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ProvidesDirective node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(QualifiedName node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(QualifiedType node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(RecordDeclaration node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(RequiresDirective node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ReturnStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(SimpleName node) {
		// TODO Auto-generated method stub
		Node jacksNode = getNode(node.getStartPosition(), node.getLength(), node.getNodeType());
		IBinding binding = node.resolveBinding();
		jacksNode.setKey(binding.getKey());
		jacksNode.setLabel(node.toString());
		return super.visit(node);
	}

	@Override
	public boolean visit(SimpleType node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(SingleMemberAnnotation node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(SingleVariableDeclaration node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(StringLiteral node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(SuperConstructorInvocation node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(SuperFieldAccess node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(SuperMethodInvocation node) {
		// TODO Auto-generated method stub

		return super.visit(node);
	}

	@Override
	public boolean visit(SuperMethodReference node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(SwitchCase node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(SwitchExpression node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(SwitchStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(SynchronizedStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(TagElement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(TextBlock node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(TextElement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ThisExpression node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(ThrowStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(TryStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(TypeDeclaration node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(TypeDeclarationStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(TypeLiteral node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(TypeMethodReference node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(TypeParameter node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(UnionType node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(UsesDirective node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(VariableDeclarationExpression node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(VariableDeclarationFragment node) {
		// TODO Auto-generated method stub
		//node.getNodeType();
		//ASTNode.VARIABLE_DECLARATION_FRAGMENT;
		Node jacksNode = getNode(node.getStartPosition(), node.getLength(), node.getNodeType());
		IBinding binding = node.resolveBinding();
		jacksNode.setKey(binding.getKey());
		jacksNode.setLabel(node.getName().toString());
		Expression initilizer = node.getInitializer();
		if(initilizer != null) {
			Node jacksNodeI = getNode(initilizer.getStartPosition(), initilizer.getLength(), initilizer.getNodeType());
			getLink(jacksNodeI, jacksNode);
		}
		return super.visit(node);
		
	}

	@Override
	public boolean visit(VariableDeclarationStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(WhileStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(WildcardType node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	public boolean visit(YieldStatement node) {
		// TODO Auto-generated method stub
		return super.visit(node);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
