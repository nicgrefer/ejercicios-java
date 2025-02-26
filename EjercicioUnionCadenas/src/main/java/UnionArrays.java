import java.util.ArrayList;


// TODO: Auto-generated Javadoc
/**
 * The Class UnionArrays.
 */
public class UnionArrays {
	
	/**
	 * Merge.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the int[]
	 */
	public int [] merge (int[] a,int[] b)
	{
		
		int c[]=new int[a.length+b.length];
		int i=0;
		for (i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for (int j=0;j<b.length;j++)
		{
			c[i+j]=b[j];
		}
		return c;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		UnionArrays obj = new UnionArrays();
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 6, 7, 8, 9, 10 };
		int c[] = obj.merge(a, b);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
