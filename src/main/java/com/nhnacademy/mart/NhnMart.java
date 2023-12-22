package com.nhnacademy.mart;

public class NhnMart {

    private final FoodStand foodStand = new FoodStand();

    public void prepareMart() {
        fillFoodStand();
        System.out.println("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요.\n");
    }

    // 음식 세팅
    private void fillFoodStand() {

        for (int i = 0; i < 2; i++) {
            foodStand.add(new Food("양파", 1000));
        }
        for (int i = 0; i < 5; i++) {
            foodStand.add(new Food("계란", 5000));
        }
        for (int i = 0; i < 10; i++) {
            foodStand.add(new Food("파", 500));
        }
        for (int i = 0; i < 20; i++) {
            foodStand.add(new Food("사과", 2000));
        }
    }

    public Basket provideBasket() {

        return new Basket();
    }

    public FoodStand getFoodStand() {
        return new FoodStand();
    }

    public  Counter getCounter(){
        return new Counter();
    }
}
