package com.lizhi.vue;

import com.lizhi.vue.common.Result;
import com.lizhi.vue.entity.Item;
import com.lizhi.vue.entity.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/list")
public class ListController {

    @RequestMapping("/doneList")
    public String getDoneList(int startIndex, int pageSize){
        Order order = new Order();
        List <Item> list = new ArrayList<>();

        order.setList(list);
        order.setHasMore(true);


        return Result.success(order).toJsonString();
    }
}
