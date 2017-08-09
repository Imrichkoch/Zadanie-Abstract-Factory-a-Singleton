
public class Eshop {

	public static void main(String[] args) {
		ManualForClothesFactory eshop = new ClothFactory(); //singleton tovaren pre oblecenie
		
		Clothes addidasTshirt = eshop.createTShirt(36,"red");
		Clothes nikeShirt = eshop.createShirt(45,"black");
		Clothes pumaTrousers = eshop.createTrousers(40,"green");
		
		
		System.out.println("addidasTshirt ma velkost: " + addidasTshirt.getSize()+ " a farbu: " + addidasTshirt.getColor() );
		
		System.out.println("nikeShirt ma velkost: " + nikeShirt.getSize()+ " a farbu: " + nikeShirt.getColor() );
		
		System.out.println("pumaTrousers ma velkost: " + pumaTrousers.getSize()+ " a farbu: " + pumaTrousers.getColor() );

	}

}
