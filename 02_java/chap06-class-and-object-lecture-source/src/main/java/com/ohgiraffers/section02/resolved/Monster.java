package com.ohgiraffers.section02.resolved;

public class Monster {

    private String name;
    private int hp;

    public void setInfo1(String info1){
        this.name = info1;
    }

    public void setInfo2(int info2){
        if(info2 >= 0){
            this.hp = info2;
        }else{
            this.hp = 0;
        }
    }

    public String getInfo(){
        return this.name + "의 hp는 " + this.hp;
    }
}
