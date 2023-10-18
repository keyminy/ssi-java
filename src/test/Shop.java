package test;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Shop {
	private ArrayList<Product> productList = new ArrayList<Product>();
	
	// 상품 목록 (정렬, 검색)
	public ArrayList<Product> getProductList() {
		if(!productList.isEmpty()) {
			System.out.println("------------------------------------");
			System.out.println("번호\t상품명\t가격");
			System.out.println("------------------------------------");
			productList.forEach(product -> {
				System.out.printf("%d\t%s\t%d\n",product.getNum(),product.getName(),product.getPrice());
			});
			System.out.println("------------------------------------");
		}else {
			System.out.println("------------------------------------");
			System.out.println("번호\t상품명\t가격");
			System.out.println("------------------------------------");
			System.out.println("등록된 상품이 없습니다.");
			System.out.println("------------------------------------");			
		}
		return productList;
	}
	
	public boolean isProductExists(int num) {
		for(Product product : productList) {
			if(product.getNum() == num) {
				return true;
			}
		}
		return false;
	}
	
	// 상품 상세
	public Product getProduct(int num) {		
		Product product = null;
		try {
			product = productList.get(num);
		} catch (IndexOutOfBoundsException  e) {
			System.out.printf("%d번 상품은 존재하지 않습니다.\n",num);
			return null;
		}
		
		if(product == null) {
			System.out.printf("%d번 상품은 존재하지 않습니다.\n",num);
			return null;
		}else {
			System.out.println("번호\t"+ product.getNum());
			System.out.println("상품명\t"+ product.getQty());
			System.out.println("상품정보\t"+ product.getQty());
			System.out.println("가격\t"+ product.getQty());
			System.out.println("수량\t" + product.getQty());
		}
		return product;
	}
	
	// 상품 등록
	public boolean addProduct(Product product) {
		return productList.add(product);
	}
	
	// 상품 수정
	public boolean updateProduct(Product product) {
		int userProductNum = product.getNum();
		Product targetProduct = productList.stream()
									.filter(p -> p.getNum() == userProductNum)
									.findAny()
									.orElseThrow();
        if(targetProduct !=null){
        	targetProduct.setName(product.getName());
        	targetProduct.setInfo(product.getInfo());
        	targetProduct.setPrice(product.getPrice());
        	targetProduct.setQty(product.getQty());
        }
		return true;
	}
	
	// 상품 삭제
	public boolean deleteProduct(int num) {
		productList = (ArrayList<Product>) productList.stream()
							.filter(p -> p.getNum() != num)
							.collect(Collectors.toList());
		return true;
	}
}
