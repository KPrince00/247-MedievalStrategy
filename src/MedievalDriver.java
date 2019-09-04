//Written by Kevin Prince (9/4/2019)
public class MedievalDriver {
	
	public static void main(String[] args) {
		Character king = new King("Thomas"); //Create a King named Thomas
		king.setWeaponBehavior(new WeaponSword()); //Set his weapon to a Sword
		Character queen = new Queen("Isabella");
		queen.setWeaponBehavior(new WeaponBow());
		Character knight = new Knight("Luke");
		knight.setWeaponBehavior(new WeaponKnife());
		Character troll = new Troll("Brownwen");
		troll.setWeaponBehavior(new WeaponAxe());
		
		king.display();
		king.attack();
		System.out.println("----------------");
		
		queen.display();
		queen.attack();
		System.out.println("----------------");
		
		knight.display();
		knight.attack();
		System.out.println("----------------");
		
		troll.display();
		troll.attack();
		troll.setWeaponBehavior(new WeaponNone());
		troll.attack();

	}
}
