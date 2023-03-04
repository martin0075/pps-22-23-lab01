package lab01Step3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CircularListStep3Impl implements CircularListStep3 {

    private List<Integer> listOfElement;
    private int indexOfElement=0;

    public CircularListStep3Impl(ArrayList<Integer> list) {
        this.listOfElement=list;
    }

    @Override
    public void add(int element) {
        listOfElement.add(element);
    }

    @Override
    public Optional<Integer> filteredNext(Predicate<Integer> value) {
        Optional<Integer> result=Stream.concat(listOfElement.subList(indexOfElement, listOfElement.size()).stream(),
                listOfElement.subList(0, indexOfElement).stream()).filter(value).findFirst();
        if(result.isEmpty()){
            return result;
        }
        else{
            for(int i=indexOfElement; i<listOfElement.size(); i++){
                if(result.get().equals(listOfElement.get(i))){
                    indexOfElement=i;
                    i=listOfElement.size();
                }
            }
            if(indexOfElement ==listOfElement.size()-1){
                indexOfElement =0;
            }
            else{
                indexOfElement = indexOfElement +1;
            }
            return result;
        }


    }


    @Override
    public List<Integer> getList() {
        return listOfElement;
    }


}
