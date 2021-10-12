package com.company;

import java.util.HashSet;
import java.util.Set;

public class SweetRepository {
    //private List sweetList = new ArrayList();
    private Set<Sweet> sweetList = new HashSet();

    public Set getSweetList() {
        return sweetList;
    }

    public void add(Sweet sweet) {
        sweetList.add(sweet);
    }

    public void delete(Sweet sweet) {
        sweetList.remove(sweet);
    }
}
