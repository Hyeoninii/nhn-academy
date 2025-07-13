package Map;

import java.util.HashSet;
import java.util.Set;

public class XTreeMap<K extends Comparable<K>, V> implements XMap<K, V> {
    private Node<K, V> root;
    private int size;
    
    public XTreeMap() {
        this.root = null;
        this.size = 0;
    }
    
    private void validateKey(K key) {
        if (key == null) {
            throw new NullPointerException("Null key");
        }
    }
    
    private void validateValue(V value) {
        if (value == null) {
            throw new NullPointerException("Null value");
        }
    }
    
    @Override
    public V put(K key, V value) {
        validateKey(key);
        validateValue(value);
        
        if (root == null) {
            root = new Node<>(key, value);
            size++;
            return null;
        }
        
        Node<K, V> node = findNode(key);
        if (node != null) {
            V oldValue = node.value;
            node.value = value;
            return oldValue;
        }
        
        root = insert(root, key, value);
        size++;
        return null;
    }
    
    private Node<K, V> insert(Node<K, V> node, K key, V value) {
        if (node == null) {
            return new Node<>(key, value);
        }
        
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = insert(node.left, key, value);
        } else if (cmp > 0) {
            node.right = insert(node.right, key, value);
        } else {
            node.value = value;
        }
        
        return node;
    }
    
    @Override
    public V get(K key) {
        validateKey(key);
        
        Node<K, V> node = findNode(key);
        return node != null ? node.value : null;
    }
    
    private Node<K, V> findNode(K key) {
        Node<K, V> current = root;
        while (current != null) {
            int cmp = key.compareTo(current.key);
            if (cmp < 0) {
                current = current.left;
            } else if (cmp > 0) {
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }
    
    @Override
    public boolean containsKey(K key) {
        validateKey(key);
        return findNode(key) != null;
    }
    
    @Override
    public boolean containsValue(V value) {
        validateValue(value);
        return containsValue(root, value);
    }
    
    private boolean containsValue(Node<K, V> node, V value) {
        if (node == null) {
            return false;
        }
        
        if (node.value.equals(value)) {
            return true;
        }
        
        return containsValue(node.left, value) || containsValue(node.right, value);
    }
    
    @Override
    public V remove(K key) {
        validateKey(key);
        
        Node<K, V> node = findNode(key);
        if (node == null) {
            return null;
        }
        
        V removedValue = node.value;
        root = delete(root, key);
        size--;
        
        return removedValue;
    }
    
    private Node<K, V> delete(Node<K, V> node, K key) {
        if (node == null) {
            return null;
        }
        
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = delete(node.left, key);
        } else if (cmp > 0) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            } else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node<K, V> successor = findMin(node.right);
                node.key = successor.key;
                node.value = successor.value;
                node.right = delete(node.right, successor.key);
            }
        }
        
        return node;
    }
    
    private Node<K, V> findMin(Node<K, V> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
    
    @Override
    public void clear() {
        root = null;
        size = 0;
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        inorderTraversal(root, keys, null);
        return keys;
    }
    
    @Override
    public Set<V> values() {
        Set<V> values = new HashSet<>();
        inorderTraversal(root, null, values);
        return values;
    }
    
    private void inorderTraversal(Node<K, V> node, Set<K> keys, Set<V> values) {
        if (node != null) {
            inorderTraversal(node.left, keys, values);
            if (keys != null) {
                keys.add(node.key);
            }
            if (values != null) {
                values.add(node.value);
            }
            inorderTraversal(node.right, keys, values);
        }
    }
    
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> left, right;
        
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
} 