package mnz.miller777;

import java.util.ArrayList;

/**
 * Created by mille_000 on 17.09.2015.
 */
public class Stack <T>{

    ArrayList<T> list;

    public Stack() {
        list = new ArrayList<T>();
    }

    public void push(T x){

        list.add(0, x);
    }

    public T pop(){

        T x;


        if(list.isEmpty()) {return null;}

        else {
            x = list.get(0);
            list.remove(0);


            return x;}
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
