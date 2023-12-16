package graph;

public class Graph {
	int source,destination;
	public Graph(int source,int destination) {
		this.source=source;
		this.destination=destination;
	}
	public int getsource() {
		return source;
	}
	public int getdestination() {
		return destination;
	}
	public void setsource(int source) {
		this.source = source;
	}
	public void setdestination(int destination) {
		this.destination = destination;
	}

}
