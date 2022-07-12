package testing.builder;
import java.util.Comparator;
import java.util.HashMap;
//dijkstra to work out for shortest path
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class ShortestPath {
	Map<Node,List<Link>> linksForNode;
	PriorityQueue<QuickestNode> pq;
	Map<Node, QuickestNode> quickestNodeFromNode;
//Dijkstras algorithm simpler with edges =1 	
	
	public ShortestPath(Map<Node, List<Link>> linksForNode) {
		super();
		this.linksForNode = linksForNode;
	}

	public int shortestPath(Node from, Node to) {
		seedPriorityQueue(from);
		QuickestNode currentNode = pq.poll();
		Node node = currentNode.getNode();
		while (!node.equals(to)) {
			List<Link> edges = linksForNode.get(node);
			int currentDistance = currentNode.getDistance() + 1;
			for (Link link : edges) {
				Node linkNode = link.getFrom();
				if (linkNode.equals(node)) {
					linkNode = link.getTo();
				}
				QuickestNode linkQuickestNode = quickestNodeFromNode.get(linkNode);//checks that quickest node will be improvement from current path 
				if(linkQuickestNode.getDistance()> currentDistance) {
					pq.remove(linkQuickestNode);//update distance value 
					linkQuickestNode.setDistance(currentDistance);
					pq.add(linkQuickestNode);//nodes in correct order with shortest value first
				}
//pq used for the speed of the algrithm as it keeps the collection in a sortable order whihc in this case the path length
//didnt use floyd warshall can be more efficient but only for all the paths
			}
			currentNode = pq.poll();
			if(currentNode == null) {
		
				System.out.println("current node is null to[" +to.getStart() + "] from[" + from.getStart() + "]");
			}
			node = currentNode.getNode();
		}

		return currentNode.getDistance();
	}

	private void seedPriorityQueue(Node from) {
		quickestNodeFromNode = new HashMap<>();
		pq = new PriorityQueue<>();
		for (Node node : linksForNode.keySet()) {
			QuickestNode quickestNode = new QuickestNode(node);
			quickestNodeFromNode.put(node, quickestNode); //populate to get quickest node frm node
			if(node.equals(from)) {
				quickestNode.setDistance(0);
			}
			pq.add(quickestNode);
		}
	}

	private static class QuickestNode implements Comparable<QuickestNode>{
		private Node node;
		private int distance;
		public QuickestNode(Node node) {
			super();
			this.node = node;
			distance = Integer.MAX_VALUE; // infintiy value
		}
		
		public int getDistance() {
			return distance;
		}
		public void setDistance(int distance) {
			this.distance = distance;
		}
		public Node getNode() {
			return node;
		}

		@Override
		public int compareTo(QuickestNode o) {
			// TODO Auto-generated method stub
			return this.distance- o.distance;
		}
		
		
	}
	
}
