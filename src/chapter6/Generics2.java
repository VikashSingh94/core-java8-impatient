package chapter6;

/**
 *
 * Create a generics class with sort method which uses the Comparable or Comparator Interface method
 * @author Vikash Singh
 * @Date   4 Jan 2018
 *
 */


import java.util.ArrayList;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Comparator;

class WarHouse<T extends Comparable>
{


    private ArrayList<T> items = new ArrayList<T>();

    public void add(T item)
    {
        this.items.add(item);
    }

    public int getSize() {
        return items.size();
    }

    //sorting using the Comparable
    public ArrayList<T> sort(){
        for(int i = 0 ;i < items.size();i++)
        {
            for(int j = 0 ;j< items.size();j++)
            {
                if(items.get(i).compareTo(items.get(j)) >= 0)
                {
                    Collections.swap(items, i ,j);
                }
            }
        }
        return items;
    }

    //sorting using the Comparator
    public ArrayList<T> sort(Comparator comparator){
        for(int i = 0 ;i < items.size();i++)
        {
            for(int j = 0 ;j< items.size();j++)
            {
                if(comparator.compare(items.get(i),items.get(j)) >= 0)
                {
                    Collections.swap(items, i ,j);
                }

            }
        }
        return items;
    }
}


class Cycle implements Comparable<Cycle>
{
    private String name;
    private int  price;

    public Cycle(String name , int  price )
    {
        this.name  = name ;
        this.price = price;
    }

    @Override
    public int compareTo(Cycle obj){
        return obj.getName().compareTo(this.getName());
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class CycleComparator implements Comparator<Cycle>
{
    @Override
    public int compare(Cycle obj1 , Cycle obj2)
    {
        return obj1.getPrice()  -  obj2.getPrice();
    }
}



public class Generics2 {

    public static void main(String arg[])
    {
        WarHouse<Cycle> warHouse = new WarHouse<>();
        warHouse.add(new Cycle("Hero", 3200));
        warHouse.add(new Cycle("Vik", 10000000));
        warHouse.add(new Cycle("Vic", 5200000));
        warHouse.add(new Cycle("Abc", 30000));


        ArrayList<Cycle> array1 = warHouse.sort();
        System.out.println("\n Ascending with name \n");
        array1.stream().forEach(i -> System.out.println(i.getName() + " " + i.getPrice()));


        CycleComparator cycleComparator = new CycleComparator();

        ArrayList<Cycle> array2 = warHouse.sort(cycleComparator);
        System.out.println("\n Descending with price \n");
        array1.stream().forEach(i -> System.out.println(i.getName() + " " + i.getPrice()));

    }
}
