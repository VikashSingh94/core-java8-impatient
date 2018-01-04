/**
 *
 * @author Vikash Singh
 * @Date    04 Jan 2018
 *
 * Implement a class Table<K, V> that manages an array list of Entry<K, V> elements.
 *  Supply methods to get the value associated with a key, to put a value for a key, and to remove a
 *  key.
 *
 */

package chapter6;

import java.util.ArrayList;

class Table<K,V>
{
    ArrayList< Entry<K,V> > arrayList = new ArrayList<>();

    public  V get(K key)
    {
        for(Entry<K,V> i : arrayList)
        {
            if(i.getKey() == key)
                return i.getValue();
        }

        throw new IllegalStateException("Key not found");
    }

    public void remove(K key)
    {
        arrayList.remove(key);
    }

    public void set(K key , V value)
    {
        for(Entry<K,V> i : arrayList)
        {
            if(i.getKey() == key)
                i.setValue(value);
        }
    }



}

class Entry<K,V>
{
    K key;
    V value;

    public Entry(K key ,V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
