package com.company;

import java.util.List;

public class UserInterface {
    void print(List list) {
        for (int i = 0; i < list.size(); i++ ) {
            System.out.println(list.get(i));
        }
    }
}
