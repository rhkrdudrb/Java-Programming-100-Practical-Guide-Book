package ch07.part05.main5.sub3;

public class ProductVo {
	private String productNo;
	private String productName;
	private int price;

	public ProductVo(String productNo, String productName, int price) {
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
	}

	public Object[] getData() {
		return new Object[] { productNo, productName, price };
	}

	public String[] getHeaderInfo() {
		return new String[] { "품목번호", "품목명", "단가" };
	}
}