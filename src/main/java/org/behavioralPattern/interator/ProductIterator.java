package org.behavioralPattern.interator;

import java.util.List;
public class ProductIterator implements AbstractIterator {
    private List<Object> products;
    private int cur1;
    private int cur2;

    public ProductIterator(ProductList list){
        this.products = list.getObjects();
        cur1 = 0;
        cur2 = products.size()-1;
    }
    @Override
    public void next() {
        if(cur1 < products.size()){
            cur1++;
        }
    }

    @Override
    public boolean isLast() {
        return (cur1 == products.size());
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
        return products.get(cur1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cur2);
    }
}
