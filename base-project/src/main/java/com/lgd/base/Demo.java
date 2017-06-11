package com.lgd.base;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liguodong on 2017/4/23.
 */
public class Demo {

    public static void main(String[] args) {

        String str = "ds,12,543,54";
        System.out.println(str.length());

        String[] arr = str.split(",");
        System.out.println(arr.length);

        List list = new ArrayList<String>();
        System.out.println(list.size());

        String answer = "  ";
        System.out.println(StringUtils.isNotEmpty(answer)); //true
        System.out.println(StringUtils.isNotBlank(answer)); //false

    }

}