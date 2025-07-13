package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class XBinarySearchTree<T extends Comparable<T>> implements XBinaryTree<T> {
    Node<T> root;
    int size;

    @Override
    public void insert(T value) {
        Objects.requireNonNull(value, "Value cannot be null");
        root = insertRecursive(root, value);
    }

    private Node<T> insertRecursive(Node<T> node, T value) {
        if(node == null) {
            size++;
            return new Node<>(value);
        }
        int cmp = value.compareTo(node.data);
        if(cmp < 0) {
            node.left = insertRecursive(node.left, value);
        } else if(cmp > 0) {
            node.right = insertRecursive(node.right, value);
        } // 중복은 무시
        return node;
    }

    @Override
    public boolean search(T value) {
        Objects.requireNonNull(value, "Value cannot be null");
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(Node<T> node, T value) {
        if(node == null) return false;
        int cmp = value.compareTo(node.data);
        if(cmp == 0) return true;
        return cmp < 0 ? searchRecursive(node.left, value) : searchRecursive(node.right, value);
    }

    @Override
    public void delete(T value) {
        Objects.requireNonNull(value, "Value cannot be null");
        root = deleteRecursive(root, value);
    }

    private Node<T> deleteRecursive(Node<T> node, T value) {
        if(node == null) return null;

        int cmp = value.compareTo(node.data);
        if(cmp < 0) {
            node.left = deleteRecursive(node.left, value);
        } else if(cmp > 0) {
            node.right = deleteRecursive(node.right, value);
        } else {
            if (node.left == null && node.right == null) {
                size--;
                return null;
            } else if(node.left == null) {
                size--;
                return node.right;
            } else if(node.right == null) {
                size--;
                return node.left;
            } else {
                Node<T> minNode = findMin(node.right);
                node.data = minNode.data;
                node.right = deleteRecursive(node.right, minNode.data);
            }
        }
        return node;
    }

    private Node<T> findMin(Node<T> node) {
        while(node.left != null) node = node.left;
        return node;
    }

    @Override
    public List<T> inorderTraversal() {
        List<T> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private void inorderHelper(Node<T> node, List<T> result) {
        if(node == null) return;
        inorderHelper(node.left, result);
        result.add(node.data);
        inorderHelper(node.right, result);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int height() {
        return heightRecursive(root);
    }

    private int heightRecursive(Node<T> node) {
        if(node == null) return -1;
        return 1 + Math.max(heightRecursive(node.left), heightRecursive(node.right));
    }
}

class Node<T> {
    T data;
    Node<T> left, right;

    Node(T data) {
        this.data = data;
    }
}