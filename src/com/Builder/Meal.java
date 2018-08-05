package com.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式
 *
 * @author lzy
 * @date 2018-8-5
 */
public class Meal {
    private List<Iteam> iteams = new ArrayList<Iteam>();

    public void addItem(Iteam iteam) {
        iteams.add(iteam);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Iteam item : iteams
                ) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Iteam item : iteams) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }


}
