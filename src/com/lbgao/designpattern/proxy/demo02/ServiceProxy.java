package com.lbgao.designpattern.proxy.demo02;

/**
 * @Auther: lbgao
 * @Date: 2022/2/25 19:36
 */

public class ServiceProxy implements Service{
    private ServiceImpl service;

    public void setService(ServiceImpl service) {
        this.service = service;
    }

    public void add() {
        log("add");
        service.add();
    }


    public void update() {
        log("update");
        service.update();
    }


    public void delete() {
        log("delete");
        service.delete();
    }


    public void query() {
        log("query");
        service.query();
    }

    public void log(String msg) {
        System.out.println(msg);
    }
}
