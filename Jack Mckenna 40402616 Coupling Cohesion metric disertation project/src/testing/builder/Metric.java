package testing.builder;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
//this takes a dependancy and a structural graph 
//two elements to this metric coupling and cohesion 
//coupling is calculated for each dependancy edge and i the distance on the structural graph or the two node on the edge 
//cohesion is calculated for sibling on the structured graph and is the distance on the dependancy graph for those siblings 

public class Metric {
	List<Link> dependancies;
	List<Link> structural;
	Map<Node, List<Link>> linksForNodeStructural;
	Map<Node, List<Link>> linksForNodeDependancies;
	
	ShortestPath shortestPathDependancies;
	ShortestPath shortestPathStructural;

	public Metric(List<Link> dependancies, List<Link> structural) {
		super();
		this.dependancies = dependancies;
		this.structural = structural;
		intitialize();
	}

	private void intitialize() {
		// TODO Auto-generated method stub
		linksForNodeDependancies = new HashMap<>();
		for (Link link : dependancies) {
			List<Link> list = linksForNodeDependancies.get(link.getTo());
			if (list == null) {
				list = new ArrayList<>();
				linksForNodeDependancies.put(link.getTo(), list);
			}
			list.add(link);
			list = linksForNodeDependancies.get(link.getFrom());
			if (list == null) {
				list = new ArrayList<>();
				linksForNodeDependancies.put(link.getFrom(), list);
			}
			list.add(link);
		}
		// TODO Auto-generated method stub
		linksForNodeStructural = new HashMap<>();
		for (Link link : structural) {
			List<Link> list = linksForNodeStructural.get(link.getTo());
			if (list == null) {
				list = new ArrayList<>();
				linksForNodeStructural.put(link.getTo(), list);
			}
			list.add(link);
			list = linksForNodeStructural.get(link.getFrom());
			if (list == null) {
				list = new ArrayList<>();
				linksForNodeStructural.put(link.getFrom(), list);
			}
			list.add(link);
		}
		shortestPathDependancies = new ShortestPath(linksForNodeDependancies);
		shortestPathStructural = new ShortestPath(linksForNodeStructural);
	}

	public int calculateCoupling() {
		int total = 0;
		for (Link link : dependancies) {
			
			int shortestPath = shortestPathStructural.shortestPath(link.getFrom(), link.getTo());
		//	System.out.print(  ": from[" + link.getFrom().getStart()+"] to["+ link.getTo().getStart()+"] = ");
		//	System.out.println(shortestPath);
			total = total + shortestPath;
		}
		return total;
	}
	public int calculateCohesion() {
		Set<Node> leafParents = new HashSet<>();
		for (Node node : linksForNodeStructural.keySet()) {
			List<Link> links = linksForNodeStructural.get(node);
			Link firstLink = links.get(0);
			if(links.size() ==1 && firstLink.getTo().equals(node)) {
				leafParents.add(firstLink.getFrom());
			}
		}
		int total =0 ;
		for (Node parent : leafParents) {
			
			for (Link leafLink1 : linksForNodeStructural.get(parent)) {
				if(!leafLink1.getTo().equals(parent)) {
					for (Link leafLink2 : linksForNodeStructural.get(parent)) {
						if(!leafLink2.getTo().equals(parent)) {
						Node child1 = leafLink1.getTo();
						Node child2 = leafLink2.getTo();
						//not intrested in the infix nodes
						if(child1.getKey()!=null&&child2.getKey()!=null) {
							int shortestPath = shortestPathDependancies.shortestPath(child1, child2);
							//System.out.println(child1.getLabel()+ child1.getStart()+" " + child1.getLength()+ "->" + child2.getLabel() + child2.getStart()+" " + child2.getLength()+  "= "+shortestPath);
							total= total + shortestPath; 
						}
						
						}
					}
				}
				
			}
		}
		return total/2;
	}
	public int calculate() {
		return (calculateCohesion() + calculateCoupling());
	}

}
