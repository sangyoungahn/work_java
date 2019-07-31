package multiple;
/*
 * Manager	extends		Employee
 * Dog		implements	Flyer
 * Movable				Attackable
 */
public interface Movable {
	void moving();
	void movX();
	void movy();
}

interface Attackable extends Movable{	//기능 강화
	void attck();
	void depense();
}

class Fighter implements Attackable{

	@Override
	public void moving() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movX() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depense() {
		// TODO Auto-generated method stub
		
	}
	
}