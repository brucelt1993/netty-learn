package com.bruce.nettylearn.test;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;

public class ByteBufTest {
    public static void main(String[] args) {
        ByteBuf byteBuf = Unpooled.buffer(1024);
        byteBuf.writeBytes("hello world".getBytes());
        // 读取数据
        if (byteBuf.hasArray()) {
            byte[] content = byteBuf.array();
            System.out.println(new String(content, 0, byteBuf.readableBytes()));
        }
        // 释放
        byteBuf.release();
    }
}
