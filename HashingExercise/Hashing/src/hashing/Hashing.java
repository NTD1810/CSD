/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class Hashing {
    Hashing next;
    Student data;
  
    Hashing(Student data)
    {
        this.data = data;
        next = null;
       
    }
}
class HashTableChainingSinglyLinkedList {
    
    Hashing[] hashTable;
  

    int size;
  
    HashTableChainingSinglyLinkedList(int hashTableSize)
    {

        hashTable = new Hashing[hashTableSize];
        size = 0;
    }
  
    
    public boolean isEmpty() { 
        return size == 0; 
    }
  
    
    public void clear() {
    
        int len = hashTable.length;
  
        hashTable = new Hashing[len];
        size = 0;
    }
  
   
    public int getSize() { 
        return size; 
    }
  
  
    public void insert(Student st) {
        size++;
  
        int position = hash(st.getName());
      
        Hashing node = new Hashing(st);
  
        Hashing start = hashTable[position];
  
        if (hashTable[position] == null)
            hashTable[position] = node;
        else {
            node.next = start;
            hashTable[position] = node;
        }
    }
  
    public void remove(Student st)
    {
        try {
          
            int position = hash(st.getName());
  
            Hashing start
                = hashTable[position];
  
            Hashing end = start;
  
            if (start.data == st) {
                size--;
                if (start.next == null) {
                    hashTable[position] = null;
                    return;
                }
  
                start = start.next;
                hashTable[position] = start;
  
                return;
            }
  
            
            while (end.next != null
                   && end.next.data != st)
                end = end.next;
 
            if (end.next == null) {
                System.out.println("\nElement not found\n");
                return;
            }
  
            size--;
  
            if (end.next.next == null) {
                end.next = null;
                return;
            }
            end.next = end.next.next;
  
            hashTable[position] = start;
        }
        catch (Exception e) {
            System.out.println("\nElement not found\n");
        }
    }
  
    private int hash(String x) {
        int hashValue = x.toUpperCase().hashCode() - 13;

        hashValue %= hashTable.length;
     
        if (hashValue < 0)
            hashValue += hashTable.length;
  
        return hashValue;
    }
  
    
   

    public void printHashTable()
    {
        System.out.println();
        for (int i = 0; i < hashTable.length; i++) {
            System.out.print("At " + i + ":  ");
  
            Hashing start = hashTable[i];
  
            while (start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
  
            System.out.println();
        }
    }
  

    public static void main(String[] args) {
        HashTableChainingSinglyLinkedList hashTab
            = new HashTableChainingSinglyLinkedList(26);
        Student st = new Student("b", 10, 12);
        Student st1 = new Student("A", 10, 12);
        Student st2 = new Student("B", 10, 11);
        Student st3 = new Student("C", 11, 10);
        Student st4 = new Student("e", 11, 15);
        Student st5 = new Student("j", 12, 12); 
        Student st6 = new Student("d", 12, 15);  
        Student st7 = new Student("k", 12, 15);  
        Student st8 = new Student("J", 12, 15);  
        hashTab.insert(st);
        hashTab.insert(st1);
        hashTab.insert(st2);
        hashTab.insert(st3);
        hashTab.insert(st4);
        hashTab.insert(st5);
        hashTab.insert(st6);
        hashTab.insert(st7);
        hashTab.insert(st8);
        hashTab.printHashTable();
  

    }
}
