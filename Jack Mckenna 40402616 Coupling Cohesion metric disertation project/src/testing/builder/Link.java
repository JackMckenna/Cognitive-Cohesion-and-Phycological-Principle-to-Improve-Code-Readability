package testing.builder;

import java.util.Objects;

public class Link {
	private Node from;
	private Node to;
	public Link(Node from, Node to) {
		super();
		this.from = from;
		this.to = to;
	}
	public Node getFrom() {
		return from;
	}
	public Node getTo() {
		return to;
	}
	@Override
	public int hashCode() {
		return Objects.hash(from, to);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Link other = (Link) obj;
		return Objects.equals(from, other.from) && Objects.equals(to, other.to);
	}
	@Override
	public String toString() {
		return "Link [from=" + from + ", to=" + to + "]";
	}
	
}
