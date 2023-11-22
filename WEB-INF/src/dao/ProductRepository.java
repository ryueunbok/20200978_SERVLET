package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>(); // ArrayList를 Product로 캐스팅
    private static ProductRepository instance = new ProductRepository();

    public static ProductRepository getInstance(){
	            return instance;
   }

	public ProductRepository() {
		Product RoyalCanin = new Product("P1234", "로얄캐닌 그레이비 키튼 파우치", 18900);
		RoyalCanin.setDescription("85g, 12개, 습식사료");
		RoyalCanin.setCategory("Food");
		RoyalCanin.setManufacturer("Royal Canin");
		RoyalCanin.setUnitsInStock(1000);
		RoyalCanin.setCondition("New");
        RoyalCanin.setFilename("P1234.jpg");
        
        Product Whiskas = new Product("P1235", "위스카스 고양이 파우치 믹스 주니어", 12450);
		Whiskas.setDescription("80g, 12개, 습식사료");
		Whiskas.setCategory("Food");
		Whiskas.setManufacturer("Whiskas");
		Whiskas.setUnitsInStock(1000);
		Whiskas.setCondition("New");
        Whiskas.setFilename("P1235.jpg");

		Product Dongwon = new Product("P1236", "동원 뉴트리플랜 고양이 키튼 주식파우치", 11160);
		Dongwon.setDescription("80g, 12개, 습식사료");
		Dongwon.setCategory("Food");
		Dongwon.setManufacturer("Dongwon");
		Dongwon.setUnitsInStock(1000);
		Dongwon.setCondition("New");
        Dongwon.setFilename("P1236.jpg");
        
        Product Seaweed = new Product("P1237", "뽀시래기 고양이 동결건조 간식 큐브 트릿", 14300);
		Seaweed.setDescription("85g, 1통, 북어 트릿");
		Seaweed.setCategory("Snack");
		Seaweed.setManufacturer("뽀시래기");
		Seaweed.setUnitsInStock(2000);
		Seaweed.setCondition("New");
        Seaweed.setFilename("P1237.jpg");
        
        Product Ciao = new Product("P1238", "이나바 고양이 챠오 츄르", 10140);
		Ciao.setDescription("14g, 20개, 츄르");
		Ciao.setCategory("Snack");
		Ciao.setManufacturer("이나바");
		Ciao.setUnitsInStock(2000);
		Ciao.setCondition("New");
        Ciao.setFilename("P1238.jpg");
        
        Product Yami = new Product("P1239", "야미야미 반려동물 간식 순닭가슴살 오리지날", 23000);
		Yami.setDescription("22g, 100개, 닭가슴살");
		Yami.setCategory("Snack");
		Yami.setManufacturer("야미야미");
		Yami.setUnitsInStock(2000);
		Yami.setCondition("New");
        Yami.setFilename("P1239.jpg");
        
        
        Product Cattyman = new Product("P1231", "캐티맨 고양이 강아지풀 장난감 소", 5400);
		Cattyman.setDescription("35cm, 3개, 꼬치형 장난감");
		Cattyman.setCategory("Toy");
		Cattyman.setManufacturer("캐티맨");
		Cattyman.setUnitsInStock(3000);
		Cattyman.setCondition("New");
        Cattyman.setFilename("P1231.jpg");
        
        Product Baladang = new Product("P1232", "발라당 고양이 반자동 움직이는 공놀이 장난감", 8200);
		Baladang.setDescription("4단, 1개, 토이볼");
		Baladang.setCategory("Toy");
		Baladang.setManufacturer("발라당");
		Baladang.setUnitsInStock(3000);
		Baladang.setCondition("New");
        Baladang.setFilename("P1232.jpg");
        
        Product Neko = new Product("P1233", "네코이찌 캐치미이프유캔2 고양이장난감", 27900);
		Neko.setDescription("0.45kg, 1개, 반자동 사냥 장난감");
		Neko.setCategory("Toy");
		Neko.setManufacturer("네코이찌");
		Neko.setUnitsInStock(3000);
		Neko.setCondition("New");
        Neko.setFilename("P1233.jpg");
		
		// 위와 같이 상품 초기화 하고 아래에 상품을 추가

		listOfProducts.add(RoyalCanin);
		listOfProducts.add(Whiskas);
		listOfProducts.add(Dongwon);
        
        listOfProducts.add(Seaweed);
        listOfProducts.add(Ciao);
        listOfProducts.add(Yami);
        
        listOfProducts.add(Cattyman);
        listOfProducts.add(Baladang);
        listOfProducts.add(Neko);
		// listOfProducts.add(상품명);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
    
    public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
   public void addProduct(Product product) {
	listOfProducts.add(product);
   }
}
