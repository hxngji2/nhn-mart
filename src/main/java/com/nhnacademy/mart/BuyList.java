package com.nhnacademy.mart;

import java.util.ArrayList;

public class BuyList {

    //Generic 방식으로 타입을 미리 지정해두어 같은 타입의 객체들만 리스트에 추가
    private final ArrayList<Item> items = new ArrayList<>();

    public ArrayList<Item> getItems() {
        return items;
    }

    BuyList buyList = new BuyList();
    private int amount;
    private String name;

    // TODO add 메서드 생성

    public void add(String name, int amount){
        this.name = name;
        this.amount = amount;
    }

    // 양파 몇 개, 파 몇 개 요런거?
    private static class Item {
        private final String name;
        private final int amount;

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }
    }
}
