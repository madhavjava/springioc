package bookresource;

public class TeluguBook implements BookInterface{
    String name;
	@Override
	public void setName() {
		// TODO Auto-generated method stub
		name="telugu";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
		
	}
}