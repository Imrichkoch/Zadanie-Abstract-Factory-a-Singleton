
public class ClothFactory implements ManualForClothesFactory{
	public static ClothFactory INSTANCE; 


	private static final ClothFactory getInstance(){
		if (INSTANCE == null){
			INSTANCE = new ClothFactory();
		}
		return INSTANCE;
	}

	@Override
	public Clothes createShirt(int size, String color) {
		
		return new Shirt(size, color);
	}

	@Override
	public Clothes createTShirt(int size, String color) {
		
		return new Tshirt(size, color);
	}

	@Override
	public Clothes createTrousers(int size, String color) {
		
		return new Trousers(size, color);
	}


}
