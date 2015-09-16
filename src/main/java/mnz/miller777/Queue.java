package mnz.miller777;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by mille_000 on 17.09.2015.
 */
public class Queue <T> {


    ArrayList<T> list;

    public Queue() {
        list = new ArrayList<T>();
    }

    public void put(T x){

        list.add(0, x);
    }

    public T get(){

        T x;


        if(list.isEmpty()) {return null;}

        else {
            x = list.get(list.size() - 1);
            list.remove(list.size() - 1);


            return x;}
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
