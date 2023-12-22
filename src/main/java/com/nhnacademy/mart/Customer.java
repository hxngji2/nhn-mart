package com.nhnacademy.mart;

public class Customer {

    // 고객 구매 목록
    private BuyList buyList;

    // 고객 장바구니
    private Basket basket;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    // TODO pickFoods 메서드 구현
    public void pickFoods(String name, int amount){
        this.buyList = buyList;
    }

    // 거스름 돈 받기(wallet 클래스
    // TODO payTox 메서드 구현
    public void payTox(){

    }

}
