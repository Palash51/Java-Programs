class CollectionGenerics
{
	public static void main(String[] args) {
		
		Collection c = new ArrayList();

		c.add(1);
		c.add(2);
		c.add(3);
		c.add("pal");

		for (Object o : c ) {

			System.out.println(o);	
			
		}
	}
}