package com.ohgiraffers.xmlmapper;

import java.util.List;

public class CategoryAndMenuDTO {
    private int categoryCode;
    private String categoryName;
    private Integer refCategoryCode;
    private List<MenuDTO> menus;

    public CategoryAndMenuDTO() {
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<MenuDTO> getMenus() {
        return menus;
    }

    public void setMenus(List<MenuDTO> menus) {
        this.menus = menus;
    }

    public Integer getRefCategoryCode() {
        return refCategoryCode;
    }

    public void setRefCategoryCode(Integer refCategoryCode) {
        this.refCategoryCode = refCategoryCode;
    }

    public CategoryAndMenuDTO(int categoryCode, String categoryName, List<MenuDTO> menus, Integer refCategoryCode) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.menus = menus;
        this.refCategoryCode = refCategoryCode;


    }

    @Override
    public String toString() {
        return "CategoryAndMenuDTO{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", refCategoryCode=" + refCategoryCode +
                ", menus=" + menus +
                '}';
    }
}
