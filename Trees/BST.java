public class BST {
  public class Node {
    private int value;
    private Node left;
    private Node right;
    private int height;

    public Node(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }

  private Node root;

  public BST() {}

  public int height(Node node) {
    if (node == null) {
      return -1;
    }
    return node.height;
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void insert(int value) {
    root = insert(value, root);
  }

  private Node insert(int value, Node node) {
    if (node == null) {
      node = new Node(value);
      return node;
    }

    if (value < node.value) {
      node.left = insert(value, node.left);
    }

    if (value > node.value) {
      node.right = insert(value, node.right);
    }

    node.height = Math.max(height(node.left), height(node.right)) + 1;
    return node;
  }

  public void populate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      this.insert(nums[i]);
    }
  }

  public void populatedSorted(int[] nums) {
    populatedSorted(nums, 0, nums.length);
  }

  private void populatedSorted(int[] nums, int start, int end) {
    if (start >= end) {
      return;
    }

    int mid = (start + end) / 2;

    this.insert(nums[mid]);
    populatedSorted(nums, start, mid);
    populatedSorted(nums, mid + 1, end);
  }

  public boolean balanced() {
    return balanced(root);
  }

  private boolean balanced(Node node) {
    if (node == null) {
      return true;
    }
    return Math.abs(height(node.left) - height(node.right)) <= 1
        && balanced(node.left)
        && balanced(node.right);
  }

  public void display() {
    display(this.root, "Root Node: ");
  }

  private void display(Node node, String details) {
    if (node == null) {
      return;
    }
    System.out.println(details + node.value);
    display(node.left, "Left child of " + node.value + " : ");
    display(node.right, "Right child of " + node.value + " : ");
  }

  // ✅ MAIN METHOD IN SAME FILE
  public static void main(String[] args) {
    BST tree = new BST();

    // Insert values
    tree.insert(10);
    tree.insert(5);
    tree.insert(15);
    tree.insert(3);
    tree.insert(7);
    tree.insert(12);
    tree.insert(18);

    System.out.println("Tree 1:");
    tree.display();
    System.out.println("Balanced? " + tree.balanced());

    // Using populate
    int[] arr = {20, 10, 30, 5, 15, 25, 35};
    BST tree2 = new BST();
    tree2.populate(arr);

    System.out.println("\nTree 2 (populate):");
    tree2.display();

    
    int[] sortedArr = {1, 2, 3, 4, 5, 6, 7};
    BST tree3 = new BST();
    tree3.populatedSorted(sortedArr);

    System.out.println("\nTree 3 (sorted -> balanced):");
    tree3.display();
    System.out.println("Balanced? " + tree3.balanced());
  }
}
