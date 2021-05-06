package com.zsj.guava;

import com.google.common.collect.*;

/**
 * @author Zhou SiJian, 2020-07-24
 * @version Araf v2.1
 */
public class MultisetTest {
    public static void main(String[] args) {
        Multiset<String> set = HashMultiset.create();
        set.add("a");
        set.add("a");
        set.add("a");
        set.add("B");
        set.add("b");
        System.out.println(set.count("a"));
        System.out.println(set.count("b"));

        HashBasedTable hashBasedTable = HashBasedTable.create();
        hashBasedTable.put("1","asdf","asdfasdfasdf");
        System.out.println(hashBasedTable.row("1"));


        RangeSet<String> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.closed("a","d"));
        rangeSet.add(Range.closed("a","b"));
        System.out.println(rangeSet.rangeContaining("c"));
        System.out.println(rangeSet.complement());
        //System.out.println(rangeSet.toString());


    }
}
