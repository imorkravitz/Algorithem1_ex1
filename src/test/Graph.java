package test;

import java.util.*;

public class Graph {
    static class Node{
        public Node(int value, int weight, List<Node> vertex;) {
            this.value = value; // the vertex that i'm pointing to
            this.weight = weight; // weight of the edge
            for (int i=0;i<vertex.size();i++){
                vertex.add(i,new Node);
            }
        }
        int value, weight;
        List<Node> vertex;
    }
    List<List<Node>> adj = new ArrayList<>();
    /**
     * Graph Constructor
     * G=(V,E)
     */
    public Graph (List<Edge> edges){
        for (int i=0;i<edges.size();i++){ // V
            adj.add(i, new ArrayList<>()); /** list memory allocation */
        }
        for (Edge e : edges){ // E
            /** allocate new node and src and dest = edge and his weight */
            adj.get(e.src).add(new Node(e.dest,e.weight));
        }
    }
    public static void printG(Graph graph){
        int src_V=0;
        int list_size = graph.adj.size();
        while(src_V < list_size){
            for (Node edge : graph.adj.get(src_V)){ /** Running from Vertex 0 all over edges   */
                System.out.println("Vertex:"+ src_V + "-->" + edge.value +"("+ edge.weight +")\t");
            }
            System.out.println();
            src_V++;
        }
    } // Print Function
}
