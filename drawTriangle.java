class drawTriangle {
public static void main(String[] args)
{
String s = "*";
StringBuffer sjmbuf = new StringBuffer();
for(int i = 1; i<12; i++) {
	for(int j=0; j<i; j++)
	{
	sjmbuf.append(s);
	}
	System.out.printf("%d %s\n ",i,sjmbuf.toString());
	sjmbuf.delete(0, sjmbuf.length());
}
}
}