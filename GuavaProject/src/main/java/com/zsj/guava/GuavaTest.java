package com.zsj.guava;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;

/**
 * @author Zhou SiJian, 2020-07-24
 * @version Araf v2.1
 */
public class GuavaTest {
    public static void main(String[] args) {
//        Ordering ordering = Ordering.natural().nullsFirst().onResultOf(new Function<Entity,Integer>() {
//            public Integer apply(Entity input) {
//                return input.getOrder();
//            }
//        });

        Ordering ordering = Ordering.natural().onResultOf(new Function<Entity,Integer>() {
            public Integer apply(Entity input) {
                return input.getOrder();
            }
        });


        Entity entity1 = new Entity();
        entity1.setOrder(1);

        Entity entity2 = new Entity();
        entity2.setOrder(2);

        Entity entity3 = new Entity();
        entity3.setOrder(3);

        Entity entity4 = null;

        Entity res = (Entity)ordering.max(entity1,entity2,entity3);
        System.out.println(res);

         res = (Entity)ordering.min(entity1,entity2,entity3);
        System.out.println(res);
    }
}
