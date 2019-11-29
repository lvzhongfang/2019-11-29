package com;

import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

public class HelloWorld {
    
    //连接器
    public static final Joiner joiner = Joiner.on(",").skipNulls();

    //分割器
    public static final Splitter splitter = Splitter.on(",").trimResults().omitEmptyStrings();

    public static void main(String[] args) throws Exception {

        String join = joiner.join(Lists.newArrayList("a",null,"b"));

        System.out.println("join = " + join);
        System.out.println("Hello Java");

        for(String tmp : splitter.split(" a,  ,b,,")){
            System.out.println("|" + tmp + "|");
        }

        Optional<String> present = Optional.of("Presend Val");

        System.out.println(present.get());
        System.out.println(present.isPresent());
        System.out.println(present.or("Default Value"));
        System.out.println(present.orNull());
    }

}