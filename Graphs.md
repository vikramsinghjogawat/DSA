# GRAPHS
## Representing graphs
### Adjacency Matrix
An adjacency matrix uses a 2D array of size V X V (where V is the number of vertices).
If there is an edge between vertex i and j, the cell at matrix[i][j] is marked (e.g., 1 or true), 
otherwise it is 0 or false.

Feature Characteristics <hr>
Space Complexity -> O(V2),
Check Edge (i, j) -> O(1),
Find Neighbors -> O(V),
Best For Dense graphs (where the number of edges E is close to V2)
<hr>
