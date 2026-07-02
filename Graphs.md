# GRAPHS
## Representing graphs
### Adjacency Matrix
An adjacency matrix uses a 2D array of size V X V (where V is the number of vertices).
If there is an edge between vertex i and j, the cell at matrix[i][j] is marked (e.g., 1 or true), 
otherwise it is 0 or false.

#### Feature Characteristics
Space Complexity -> O(V2),
Check Edge (i, j) -> O(1),
Find Neighbors -> O(V),
Best For Dense graphs (where the number of edges E is close to V2)
<hr>

### Adjacency List
An adjacency list stores a list (or array of lists/sets) for every vertex.
Each index i in the main array holds a list of all vertices j that are directly connected to i.
visualization = [list,list,list,list] <- array of lists
#### Feature Characteristics 
Space Complexity -> O(V+E),
Check Edge (i, j) -> O(degree of i),
Find Neighbors -> O(degree of i),
Sparse graphs (where E is much smaller than V2)

  List<Integer>[] adj = new ArrayList[V];
  for( int i=0;i<V;i++){
    adj[i] = new ArrayList<>();
  }
  adj[u].add(v);
<hr>
