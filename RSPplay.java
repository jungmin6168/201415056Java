class RSPplay {
String play1 = null;
String play2 = null;

void play1(String a)
{
	play1= a;
}
void play2(String b)
{
	play2 = b;
}

void Result(){
if(play1 == play2)
{
	System.out.println("Draw");
} else if(play1=="scissor"){
	if(play2=="rock")
	{
	System.out.println("play2 is winner");	
	} else {
    System.out.println("play1 is winner");
	}
} else if(play1=="rock"){
	if(play2=="scissor")
	{
	System.out.println("play1 is winner");
	} else {
	System.out.println("play2 is winner");
	}
} else if(play1=="paper"){
	if(play2=="scissor")
	{
	System.out.println("play2 is winner");
	} else {
	System.out.println("play1 is winner");
	}
} else {
	System.out.println("Error");
}
}
}