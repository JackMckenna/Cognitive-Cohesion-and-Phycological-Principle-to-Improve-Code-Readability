package testing.builder;
//proof of shortest path dijkstra 
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class ShortestPathTest {

	@Test
	void test() {
		Node one = new Node(1, 1, 0);
		Node two = new Node(2, 2, 0);
		Node three = new Node(3,3, 0);
		Node four = new Node(4, 4, 0);
		Node five = new Node(5, 5, 0);
		Link linkA = new Link(one, two);
		Link linkB = new Link(one, three);
		Link linkC = new Link(three, four);
		Link linkD = new Link(four, five);
		Link linkE = new Link(two, five);
		
		
		Map<Node,List<Link>> linksForMap = new HashMap<>();
		linksForMap.put(one,List.of(linkA, linkB));
		linksForMap.put(two,List.of(linkA, linkE));
		linksForMap.put(three,List.of(linkB, linkC));
		linksForMap.put(four,List.of(linkC, linkD));
		linksForMap.put(five,List.of(linkD, linkE));
		ShortestPath shortestPath = new ShortestPath(linksForMap);
		
		assertEquals(2, shortestPath.shortestPath(one, five));
		assertEquals(1, shortestPath.shortestPath(one, two));
		assertEquals(1, shortestPath.shortestPath(one, three));
		assertEquals(2, shortestPath.shortestPath(one, four));
	}
	@Test
	void testComplex() {
		Node one = new Node(1, 1, 0);
		Node two = new Node(2, 2, 0);
		Node three = new Node(3,3, 0);
		Node four = new Node(4, 4, 0);
		Node five = new Node(5, 5, 0);
		Node six = new Node (6,6, 0);
		Node seven = new Node (7,7, 0);
		Link linkA = new Link(one, two);
		Link linkB = new Link(two, three);
		Link linkC = new Link(three, four);
		Link linkD = new Link(four, seven);
		Link linkE = new Link(two, six);
		Link linkF = new Link(one, five);
		Link linkG = new Link (five, six);
		Link linkH = new Link (six, seven);
		
		
		Map<Node,List<Link>> linksForMap = new HashMap<>();
		linksForMap.put(one,List.of(linkA, linkE));
		linksForMap.put(two,List.of(linkA, linkE , linkB));
		linksForMap.put(three,List.of(linkB, linkC));
		linksForMap.put(four,List.of(linkC, linkD));
		linksForMap.put(five,List.of(linkF, linkG));
		linksForMap.put(six,List.of(linkE, linkG, linkH));
		linksForMap.put(seven,List.of(linkD, linkH));
		ShortestPath shortestPath = new ShortestPath(linksForMap);
		
		assertEquals(3, shortestPath.shortestPath(one, seven));
		
	}
	
}

