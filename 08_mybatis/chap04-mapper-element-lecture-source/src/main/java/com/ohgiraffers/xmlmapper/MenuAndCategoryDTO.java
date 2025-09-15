package com.ohgiraffers.xmlmapper;

public class MenuAndCategoryDTO {
    private int menuCode;
    private String menuName;
    private int menuPrice;
    private CategoryDTO categoryCode;
    private String orderableStatus;

    public MenuAndCategoryDTO() {
    }

    public MenuAndCategoryDTO(CategoryDTO categoryCode, int menuCode, String menuName, int menuPrice, String orderableStatus) {
        this.categoryCode = categoryCode;
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.orderableStatus = orderableStatus;
    }

    public CategoryDTO getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(CategoryDTO categoryCode) {
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

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "MenuAndCategoryDTO{" +
                "categoryCode=" + categoryCode +
                ", menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
