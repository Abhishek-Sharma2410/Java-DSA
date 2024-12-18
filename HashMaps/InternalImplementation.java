import java.util.ArrayList;
import java.util.LinkedList;
public class InternalImplementation{
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap();
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("United States", 50);
        hm.put("Nepal", 20);
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
        ArrayList<String> keys = hm.keySet();
        for(int i=0; i<keys.size(); i++){
            System.out.print(keys.get(i) + " ");
        }
    }
}

class HashMap<K, V>{
    private class Node{
        K key;
        V value;

        Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    public int size;
    private LinkedList<Node> buckets[];
    
    @SuppressWarnings("unchecked")
    public HashMap(){
        this.size = 4;
        this.buckets = new LinkedList[4];
        for(int i=0; i<buckets.length; i++){
            buckets[i] = new LinkedList<>();
        }
    }

    public int hashfunction(K key){
        int index = Math.abs(key.hashCode());
        return index % buckets.length;
    }
    public int dataIndex(K key, int bucketIndex){
        LinkedList<Node> ll = buckets[bucketIndex];
        int dataIndex = 0;
        for(int i=0; i<ll.size(); i++){
            Node node = ll.get(i);
            if(node.key == key){
                return dataIndex;
            }
            dataIndex++;
        }
        return -1;
    }
    public void put(K key, V value){
        int bucketIndex = hashfunction(key);
        int dataIndex = dataIndex(key, bucketIndex);

        if(dataIndex != -1){
            Node node = buckets[bucketIndex].get(dataIndex);
            node.key = key;
        }
        else{
            buckets[bucketIndex].add(new Node(key, value));
            size++;
        }
    }
    public V get(K key){
        int bucketIndex = hashfunction(key);
        int dataIndex = dataIndex(key, bucketIndex);

        if(dataIndex!=-1){
            Node node = buckets[bucketIndex].get(dataIndex);
            return node.value;
        }
        else{
            return null;
        }
    }
    public boolean containsKey(K key){
        int bucketIndex = hashfunction(key);
        int dataIndex = dataIndex(key, bucketIndex);
        return dataIndex!=-1;
    }
    public V remove(K key){
        int bucketIndex = hashfunction(key);
        int dataIndex = dataIndex(key, bucketIndex);

        if(dataIndex != -1){
            Node node = buckets[bucketIndex].remove(dataIndex);
            size--;
            return node.value;
        }
        else{
            return null;
        }
    }
    public boolean isEmpty(){
        return size==0;
    }
    public ArrayList<K> keySet(){
        ArrayList<K> list = new ArrayList<>();
        for(int i=0; i<buckets.length; i++){
            LinkedList<Node> ll = buckets[i];
            for(int j=0; j<ll.size(); j++){
                list.add(ll.get(j).key);
            }
        }
        return list;
    }
}