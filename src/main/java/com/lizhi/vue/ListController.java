package com.lizhi.vue;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/list")
public class ListController {

    @RequestMapping("/doneList")
    public String getDoneList(int startIndex, int pageSize){
        return "";
    }
}
