package ch01.sub02.case03;

public class Shooter {
	private Gun gun; //확장성을 위해 타입을 상위클래스로 줌
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	public void fire() {
		this.gun.fire();
	}
}

//
//private pistol pistol;
//private Rifle rifle;
//
//public void setPistol(Pistol pistol) {
//	this.pistol = pistol;
//}
//public void setRifle(Rifle rifle) {
//	this.rifle = rifle;
//}