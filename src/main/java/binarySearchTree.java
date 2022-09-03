public class binarySearchTree {

    public Node search(int searchValue, Node node) {
        if (node == null || node.val == searchValue) {
            return node;
        } else if (searchValue < node.val) {
            return search(searchValue, node.leftChild);
        } else {
            return search(searchValue, node.rightChild);
        }
    }

    public void insert(int value, Node node) {
        if (value < node.val) {
            if (node.leftChild == null) {
                node.leftChild = new Node(value);
            } else {
                insert(value, node.leftChild);
            }
        } else if (value > node.val) {
            if (node.rightChild == null) {
                node.rightChild = new Node(value);
            } else {
                insert(value, node.rightChild);
            }
        }
    }

//    public Node delete(int valueToDelete, Node node) {
//        if (node == null) {
//            return null;
//        } else if (valueToDelete < node.val) {
//            node.leftChild = delete(valueToDelete, node);
//
//        } else if (){
//
//        }
//    }

    public class Node {
        int val;
        Node leftChild;
        Node rightChild;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node leftChild, Node rightChild) {
            this.val = val;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }
}