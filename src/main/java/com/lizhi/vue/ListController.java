package com.lizhi.vue;

import com.lizhi.vue.common.Result;
import com.lizhi.vue.entity.Item;
import com.lizhi.vue.entity.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/list")
public class ListController {

    @RequestMapping("/doneList")
    public String getDoneList(int startIndex, int pageSize){
        Order order = new Order();
        List <Item> list = new ArrayList<>();

        int i = 0;

        for (i = startIndex; i < startIndex+pageSize; i++) {

            Item item = new Item();
            item.setCreateTime("5555");
            item.setRecordId(new String(i));
            item.setTitle("123");
            item.setThumbUrl("");
        }

        order.setList(list);

        if (i > 200){
            order.setHasMore(false);
        }else {
            order.setHasMore(true);
        }




        return Result.success(order).toJsonString();
    }
}
