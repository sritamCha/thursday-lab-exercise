package Thursday_Exercises ;
public class Inside {
	class inner{
int a;
	}
public static void main(String[]args) {

	Inside inn=new Inside();
	inner on= inn.new inner();
	on.a=10;
	}

}
