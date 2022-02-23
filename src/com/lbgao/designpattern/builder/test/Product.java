package com.lbgao.designpattern.builder.test;

/**
 * @Auther: lbgao
 * @Date: 2022/2/23 22:24
 */

public class Product {
    private String BuildA;
    private String BuildB;
    private String BuildC;
    private String BuildD;

    public Product() {
    }

    public String getBuildA() {
        return BuildA;
    }

    public void setBuildA(String buildA) {
        BuildA = buildA;
    }

    public String getBuildB() {
        return BuildB;
    }

    public void setBuildB(String buildB) {
        BuildB = buildB;
    }

    public String getBuildC() {
        return BuildC;
    }

    public void setBuildC(String buildC) {
        BuildC = buildC;
    }

    public String getBuildD() {
        return BuildD;
    }

    public void setBuildD(String buildD) {
        BuildD = buildD;
    }
}
