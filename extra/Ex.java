
class Main
{
	public static void main(String[] args) {
		Ex obj = new Ex();
		obj.setI(5);
		System.out.println(obj.getI());
	}
}

class Ex
{
	
	public static void main(String[] args) {
		
	int i;
	void setI(int j)
	{
		i = j;
	}
	public int getI()
	{
		return i;
	}
	
}