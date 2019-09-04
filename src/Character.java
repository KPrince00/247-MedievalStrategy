//Written by Kevin Prince (9/4/2019)
public abstract class Character {
	protected String name;
	private WeaponBehavior weaponBehavior; //Weapon the character wields
	public Character(String name) {
		this.name = name;
	}
	//Displays the attack message from the specified weapon.  Will not work if weapon has not been set.
	public void attack() {
		weaponBehavior.attack();
	}
	
	//Sets WeaponBehavior to the passed in class - intended for classes which implement WeaponBehavior
	public void setWeaponBehavior(WeaponBehavior wb) {
		/*
		 * WeaponBehavior is an interface, and as such this method
		 * is intended to be used to set the member WeaponBehavior
		 * to one of the Weapon classes, ex. WeaponSword.  
		 */
		weaponBehavior = wb;
	}
	//Displays character information.  Varies wholly by character type, and as such is abstract.
	public abstract void display();
}
