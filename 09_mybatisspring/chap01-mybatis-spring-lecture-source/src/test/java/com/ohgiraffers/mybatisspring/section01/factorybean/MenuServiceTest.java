package com.ohgiraffers.mybatisspring.section01.factorybean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional      // Test 클래스에도 @Transactional을 붙일 수 있는데 이렇게 되면 테스트 시 트랜잭션은 rollback 됨
class MenuServiceTest {

    @Autowired
    private MenuService menuService;

    @DisplayName("주문 가능 상태별 메뉴 조회 확인 테스트")
    @ParameterizedTest
    @ValueSource(strings={"Y", "N"})
    void testFindAllMenus(String orderableStatus) {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<MenuDTO> menus = menuService.findAllMenuByOrderableStatus(orderableStatus);
                    menus.forEach(System.out::println);
                }
        );
    }
}