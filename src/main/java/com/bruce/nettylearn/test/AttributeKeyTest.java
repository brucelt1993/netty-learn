package com.bruce.nettylearn.test;

import io.netty.util.AttributeKey;
import io.netty.util.AttributeMap;
import io.netty.util.DefaultAttributeMap;

public class AttributeKeyTest {
    public static void main(String[] args) {
        // 创建一个AttributeKey对象
        AttributeKey<Integer> idAttribute = AttributeKey.newInstance("test");
        // 获取AttributeKey的名字
        System.out.println(idAttribute.id());
        System.out.println(idAttribute.name());
    }
}
