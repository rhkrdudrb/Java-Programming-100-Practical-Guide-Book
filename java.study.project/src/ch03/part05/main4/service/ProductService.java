package ch03.part05.main4.service;

import ch03.part05.main4.service.ProductService;
import ch03.part05.main4.vo.ProductVo;

public class ProductService {

	/* 1. 품목번호를 제공하면 해당 품목정보를 반환하는 함수  */
	public ProductVo getProduct(String productNo){
		ProductVo productVo = null ; // 로직생략 - 임의로 null로 처리함.
		return productVo;
	}

   /* 품목정보를 제공하면 해당 품목을 데이터베이스에 수정 후 수정된 데이터의 수를 반환하는 함수 */
	public int updateProduct(ProductVo productVo){
		int updateProduct = 0 ; // 로직생략 - 임의로 0으로 처리함.
		return updateProduct;
	}

   /* 품목정보를 제공하면 해당 품목을 데이터베이스에 등록 후 성공여부를 반환하는 함수 */
	public boolean insertProduct(ProductVo productVo) {
		boolean insertProduct = false ; // 로직생략 - 임의로 false
		return insertProduct;
	}

   /* 품목번호를 제공하면 해당 품목 정보를 삭제하기 위한 함수  */
	public void deleteProduct(String productNo){
	}
}