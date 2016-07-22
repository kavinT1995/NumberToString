# NumberToString
public class Converting {

	
	
	
		public static void main(String[] args) {
			System.out.println("enter size of array");
			
			Scanner sr=new Scanner(System.in);
			int n=sr.nextInt();
			int num;
			int a[]=new int[n];
			
			char[] ch=new char[a.length];
			int b=0;
			for(int i=0;i<a.length;i++){
				num=sr.nextInt();
				a[i]=num+96;
			}
			for(int j=0;j<a.length;j++){
				ch[j]=(char)a[j];
				System.out.println(ch[j]);
			}
	           
		}

	}
	
