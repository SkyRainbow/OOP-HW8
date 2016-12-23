package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable{
	
	private String nickName;
	private final PokemonType type;
	private int cp;
	
	Pokemon(String nickName,PokemonType type,int cp)
	{
		this.nickName=nickName;
		this.type=type;
		this.cp=cp;
	}
	
	
	public PokemonType getType()
	{
		return type;
	}
	public String getNickName()
	{
		return nickName;
	}
	public void setNickName(String nickName)
	{
		this.nickName=nickName;
	}
	public int getCP()
	{
		return cp;
	}
	public void setcp(int cp)
	{
		this.cp=cp;
	}
}
