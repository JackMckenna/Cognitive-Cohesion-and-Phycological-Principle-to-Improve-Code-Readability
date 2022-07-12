package testing.builder;

import java.util.Objects;

public class Node {
	private int start;
	private int length;
	private String key;
	private String label;
	private int astNodeType;
	@Override
	public int hashCode() {
		return Objects.hash(length, start);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		return length == other.length && start == other.start;
	}
	public Node(int start, int length, int astNodeType) {
		super();
		this.start = start;
		this.length = length;
		this.astNodeType = astNodeType;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getStart() {
		return start;
	}
	public int getLength() {
		return length;
	}
	
	@Override
	public String toString() {
		return "Node [start=" + start + ", length=" + length + ", key=" + key + ", label=" + label + ", astNodeType="
				+ astNodeType + "]";
	}
	public int getAstNodeType() {
		return astNodeType;
	}
	
}
