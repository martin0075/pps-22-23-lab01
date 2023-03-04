package lab01Step2;

import java.util.Iterator;
import java.util.List;

public class CircularListStep2Impl implements CircularListStep2{

    private List<Integer> listOfElement;
    private int indexOfElement=0;

    public CircularListStep2Impl(List<Integer> list) {
        this.listOfElement=list;
    }

    @Override
    public void add(int element) {
        this.listOfElement.add(element);
    }

    @Override
    public int size() {
        return this.listOfElement.size();
    }

    @Override
    public boolean isEmpty() {
        if(this.listOfElement.size()==0){
            return true;
        }
        else
            return false;
    }

    @Override
    public Iterator forwardIterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                if(indexOfElement ==listOfElement.size()-1){
                    indexOfElement =0;
                }
                else{
                    indexOfElement = indexOfElement +1;
                }
                return listOfElement.get(indexOfElement);
            }
        };
    }

    @Override
    public Iterator backwardIterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                if(indexOfElement==0){
                    indexOfElement=listOfElement.size()-1;
                }
                else{
                    indexOfElement=indexOfElement-1;
                }
                return listOfElement.get(indexOfElement);
            }
        };
    }

    @Override
    public List<Integer> getList() {
        return listOfElement;
    }
}
