package com.lizhi.vue.entity;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {

    private boolean hasMore;
    private List<Item> list;

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<Item> getList() {
        return list;
    }

    public void setList(List<Item> list) {
        this.list = list;
    }
}
