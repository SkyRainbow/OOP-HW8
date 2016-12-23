package fcu.iecs.oop.pokemon;

public class Psyduck extends Pokemon implements Fightable{

	Psyduck(String nickName, PokemonType type, int cp) {
		super(nickName, type, cp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Ember¡K");		

	}

}
