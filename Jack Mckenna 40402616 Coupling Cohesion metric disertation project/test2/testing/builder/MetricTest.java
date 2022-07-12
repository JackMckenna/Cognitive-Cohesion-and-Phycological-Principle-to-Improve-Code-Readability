package testing.builder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class MetricTest {

	private Node addKey(Node node) {
		node.setKey("hello");
		return node;
	}
	@Test
	void testCoupling() {
		Node one = addKey(new Node(1, 1, 0));
		Node two = addKey(new Node(2, 2, 0));
		Node three = addKey(new Node(3,3, 0));
		Node four =  addKey(new Node(4, 4, 0));
		Node five =  addKey(new Node(5, 5, 0));
		Node six =   addKey(new Node(6, 6, 0));
		Node seven = addKey(new Node(7, 7, 0));
		Link linkA = new Link(one, two);
		Link linkB = new Link(two, three);
		Link linkC = new Link(one, four);
		Link linkD = new Link(five, six);
		Link linkE = new Link(five, seven);
		Link linkF = new Link(six, one);
		Link linkG = new Link(six, two);
		Link linkH = new Link(seven, four);
		Link linkI = new Link(seven, three);
		
		
		List<Link> despendancies= List.of(linkA, linkB, linkC);
		List<Link> structural= List.of(linkD, linkE, linkF, linkG, linkH, linkI);
		Metric metric = new Metric(despendancies, structural);
		assertEquals(10,metric.calculateCoupling());
		assertEquals(4,metric.calculateCohesion());
	}

}
