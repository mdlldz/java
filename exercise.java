public class exercise{
public static void main(String [] args){
boolean x = true;
boolean y = false;
int z = 46;
if((z++ == 46) && (y = true))z++;
	if((++z ==49) || (x = false))z++;
		System.out.println("z=" +z);
}
}