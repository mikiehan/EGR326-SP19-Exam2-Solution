package iterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ListOfList {
    private List<List<String>> list;

    public ListOfList(List<List<String>> list){
        this.list = list;
    }

    public Iterator<String> getIterator(){
        return new MyIterator();
    }

    //Inner class that implements Iterator interface
    private class MyIterator implements Iterator<String> {
        private int outerIndex = 0;
        private int innerIndex = 0;

        public MyIterator(){
            outerIndex = 0;
            innerIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return (outerIndex < list.size()); //&&
                    //innerIndex < list.get(outerIndex).size());
        }

        @Override
        public String next() {
            if(!hasNext())
                throw new NoSuchElementException();
            List<String> innerList = list.get(outerIndex);
            String str = innerList.get(innerIndex);
            innerIndex++;
            if (innerIndex == innerList.size()) {
                outerIndex++;
                innerIndex = 0;
            }
            return str;
        }
    }
}
