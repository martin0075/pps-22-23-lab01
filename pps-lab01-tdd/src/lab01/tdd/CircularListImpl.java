package lab01.tdd;

import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {

    private List<Integer> listOfElement;
    private int indexOfElement =0;

    public CircularListImpl(List<Integer> list) {
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
        if(listOfElement.size()==0){
            return true;
        }
        return false;
    }

    @Override
    public Optional<Integer> next() {
        if(listOfElement.isEmpty())
            return Optional.empty();
        if(indexOfElement ==listOfElement.size()-1){
            indexOfElement =0;
        }
        else{
            indexOfElement = indexOfElement +1;
        }
        return Optional.of(listOfElement.get(indexOfElement));
    }

    @Override
    public Optional<Integer> previous() {
        if(listOfElement.isEmpty())
            return Optional.empty();
        if(indexOfElement ==0){
            indexOfElement =this.listOfElement.size()-1;
        }
        else{
            indexOfElement = indexOfElement -1;
        }
        return Optional.of(listOfElement.get(indexOfElement));
    }

    @Override
    public void reset() {
        indexOfElement=0;

    }

    @Override
    public List<Integer> getList() {
        return listOfElement;
    }




}
