package test;

import java.util.Scanner;

public class ShopMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		boolean run = true;
		Shop shop = new Shop();
		
		while(run) {
			printMenu();
			System.out.print("메뉴를 선택하세요 : ");
			String input = sc.next();
			switch(input) {
				case "0":
					shop.getProductList();
					break;
				case "1":
					System.out.print("상품 번호를 입력하세요 : ");
					int GetProductDetailNum = sc.nextInt();
					shop.getProduct(GetProductDetailNum);
					break;
				case "2":
					Product product = new Product();
					System.out.print("상품 번호를 입력하세요 : ");
					int userProductNum = sc.nextInt();
					while(shop.isProductExists(userProductNum)) {
						System.out.println("상품 번호가 존재합니다. 다른 번호를 입력하세요");
						//재입력
						userProductNum = sc.nextInt();
					}
					product.setNum(userProductNum);
					System.out.print("상품 명을 입력하세요 : ");
					product.setName(sc.next());
					System.out.print("상품 정보를 입력하세요 : ");
					product.setInfo(sc.next());
					System.out.print("가격을 입력하세요 : ");
					product.setPrice(sc.nextInt());
					System.out.print("수량을 입력하세요 : ");
					product.setQty(sc.nextInt());
					boolean isRegistred = shop.addProduct(product);
					System.out.println("등록 결과 : " + isRegistred);
					break;
				case "3":
					product = new Product();
					System.out.print("수정할 상품 번호를 입력하세요 : ");
					userProductNum = sc.nextInt();
					while(!shop.isProductExists(userProductNum)) {
						System.out.println("상품 번호가 존재하지않습니다. 다른 번호를 입력하세요");
						//재입력
						userProductNum = sc.nextInt();
					}
					product.setNum(userProductNum);
					System.out.print("상품 명을 입력하세요 : ");
					product.setName(sc.next());
					System.out.print("상품 정보를 입력하세요 : ");
					product.setInfo(sc.next());
					System.out.print("가격을 입력하세요 : ");
					product.setPrice(sc.nextInt());
					System.out.print("수량을 입력하세요 : ");
					product.setQty(sc.nextInt());
					boolean isUpdated = shop.updateProduct(product);
					System.out.println("수정 결과 : " + isUpdated);
					break;
				case "4":
					System.out.println("삭제할 상품번호를 입력하세요 : ");
					userProductNum = sc.nextInt();
					while(!shop.isProductExists(userProductNum)) {
						System.out.println("상품 번호가 존재하지않습니다. 삭제 결과 : false");
						//재입력
						userProductNum = sc.nextInt();
					}
					
					boolean isDeleted = shop.deleteProduct(userProductNum);
					System.out.println("삭제 결과 : " + isDeleted);
					
					break;
				case "9":
					System.out.println("종료합니다.");
					run = false;
					break;
				default:
					break;
			}
			System.out.println();
		}
	}
	
	public static void printMenu() {
		System.out.println("[ 0:상품목록, 1:상품상세, 2:상품등록, 3:상품수정, 4:상품삭제, 9:종료 ]");
	}

}
