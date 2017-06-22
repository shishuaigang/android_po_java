package com.inroad.androidTest.testcase;

import static com.inroad.androidTest.page.Home.*;
import static com.inroad.androidTest.page.Knowledge.*;
import static com.inroad.androidTest.page.Menu.*;

public class TestKnowledge {

    //测试知识库浏览功能
    public void browse(){
        switchbtn.click();
        knowledge.click();
        browse.click();
    }

    //测试知识库我的收藏功能
    public void collection(){
        switchbtn.click();
        knowledge.click();
        collection.click();
    }

    //测试知识库检索功能
    public void search(){
        switchbtn.click();
        knowledge.click();
        search.click();
    }
}
