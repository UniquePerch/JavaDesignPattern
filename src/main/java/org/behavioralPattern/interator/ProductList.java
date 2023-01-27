package org.behavioralPattern.interator;

import java.util.List;

public class ProductList extends AbstractObjectList{

    public ProductList(List<Object> list) {
        super(list);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }

    public class ProductIterator1 implements AbstractIterator{
        int cur1 = 0;
        int cur2 = objects.size()-1;

        public ProductIterator1(){
            cur1 = 0;
            cur2 = objects.size()-1;
        }

        @Override
        public void next() {
            if(cur1 <objects.size()){
                cur1++;
            }
        }

        @Override
        public boolean isLast() {
            return cur1 == objects.size();
        }

        @Override
        public void previous() {
            if(cur2 > -1){
                cur2--;
            }
        }

        @Override
        public boolean isFirst() {
            return cur2 == -1;
        }

        @Override
        public Object getNextItem() {
            return objects.get(cur1);
        }

        @Override
        public Object getPreviousItem() {
            return objects.get(cur2);
        }
    }
}
