package com.company;

import java.util.ArrayList;
import java.util.List;

public class SweetRepository {
    private List sweetList = new ArrayList();

    public List getSweetList() {
        return sweetList;
    }

    public void add(Laddu laddu) {
        sweetList.add(laddu);
    }

    public void add(RasGulla rasGulla) {
        sweetList.add(rasGulla);
    }

    public void add(Jalebi jalebi) {
        sweetList.add(jalebi);
    }

    public void add(Kalakhand kalakhand) {
        sweetList.add(kalakhand);
    }

    public void add(GulabJamun gulabJamun) {
        sweetList.add(gulabJamun);
    }
}
