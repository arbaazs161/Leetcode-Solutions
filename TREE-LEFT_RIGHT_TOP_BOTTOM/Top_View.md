We'll use the same approach as vertical order traversal. i.e., Start from left most node to right most node.

1. Mark all nodes as coordinates on a graph. (x, y).

    #Root will be (0,0)
    #Nodes left to root will go like (node.x - 1, node.y+1);
    #Nodes right to root will go like (node.x + 1, node.y+1);

2. Store these nodes along with coordinates in a map.
3. If there exists a node with same x coordinate as present in map, skip it.
4. Sort the map based on x coordinate and print the values.
