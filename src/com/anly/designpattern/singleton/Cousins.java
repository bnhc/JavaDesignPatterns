package com.anly.designpattern.singleton;

/**
 * Created by mingjun on 2016/12/16.
 */
public class Cousins {

    public Form submitReport() {
        // 直接新建一个表格
        // Form form = new Form();

        // 从固定的接口取表格
        Form form = HungryForm.getInstance();
        form.write("光谷店数据");
        return form;
    }
}
