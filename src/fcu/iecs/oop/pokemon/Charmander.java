package fcu.iecs.oop.pokemon;

public class Charmander extends Pokemon implements Fightable{

	Charmander(String nickName, PokemonType type, int cp) {
		super(nickName, type, cp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("Aqua Tail¡K");		
	}

}
