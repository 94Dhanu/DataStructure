package FacadeDemo;

public class ShopKeeper
{

private MobileShop iphone;
private MobileShop samsung;
private MobileShop nokia;
	public ShopKeeper()
	{
		iphone=new Iphone();
		samsung=new Samsung();
		nokia=new Nokia();
	}
	public void iphonesale()
	{
		iphone.Model();
		iphone.Price();
	}
	public void samsungsale()
	{
		samsung.Model();
		samsung.Price();
	}
	public void nokiasale()
	{
		nokia.Model();
		nokia.Price();
	}


}

