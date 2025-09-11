package com.ohgiaffers.section01.xmlconfig;

public class MenuDTO {
    private int menuCode;
    private String menuName;
    private int menuPrice;
    private int categoryCode;
    private String orderabelStatus;

    public MenuDTO() {
    }

    public MenuDTO(int categoryCode, int menuCode, String menuName, int menuPrice, String orderabelStatus) {
        this.categoryCode = categoryCode;
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.orderabelStatus = orderabelStatus;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getOrderabelStatus() {
        return orderabelStatus;
    }

    public void setOrderabelStatus(String orderabelStatus) {
        this.orderabelStatus = orderabelStatus;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "categoryCode=" + categoryCode +
                ", menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", orderabelStatus='" + orderabelStatus + '\'' +
                '}';
    }
}
