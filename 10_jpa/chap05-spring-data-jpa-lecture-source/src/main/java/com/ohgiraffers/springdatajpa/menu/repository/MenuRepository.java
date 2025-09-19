package com.ohgiraffers.springdatajpa.menu.repository;

import com.ohgiraffers.springdatajpa.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

// 인터페이스는 bean으로 만들수 없기 때문에 jpaRepository을 상속받아야 bean으로 취급된다.
public interface MenuRepository  extends JpaRepository<Menu, Integer> {

}
