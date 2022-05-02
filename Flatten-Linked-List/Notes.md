The intuition is to use Merge function of Merge Sort.

Node 1 -> Node 2 -> Node 3
  |         |         |
Child1    Child2    Child3

Start by creating a recusrive function with a base case of returning when reached the last node of horizontal list(Node 3 in above visualisation).

Create a merge function that takes 2 list and returns a new list after merging them in sorted order.

Recusrively pass on every vertical list in the merge function till the base case is reached.
