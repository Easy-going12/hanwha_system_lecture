-- 주석

SELECT * FROM tbl_menu;	     -- 메뉴 조회
SELECT * FROM tbl_category;

SELECT category_code, category_name FROM tbl_category;
SELECT category_name, category_code  FROM tbl_category;

-- *(asterisk) 쓰면 감리사한테 혼난다.
SELECT
       category_code
     , category_name				-- 코딩컨벤션에 따라 콤마는 다음줄에...
     , ref_category_code
  FROM tbl_category;
