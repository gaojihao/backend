package com.lizhi.vue;

import com.lizhi.vue.common.Result;
import com.lizhi.vue.entity.Item;
import com.lizhi.vue.entity.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String time = dateFormat.format(date);

        int i = 0;

        for (i = startIndex; i < startIndex+pageSize; i++) {

            Item item = new Item();
            item.setCreateTime(time);
            item.setRecordId(String.valueOf(i));
            item.setTitle("title"+String.valueOf(i));
            item.setThumbUrl("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3261505962,1852331320&fm=26&gp=0.jpg");
            list.add(item);
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
