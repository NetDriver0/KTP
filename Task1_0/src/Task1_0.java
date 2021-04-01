public class Task1_0{
	public static void main(String[] args) {
		System.out.println(convert(5));
		System.out.println(points(13, 12));
		System.out.println(footballPoints(3, 4, 2));
		System.out.println(divisibleByFive(5));
		System.out.println(and(true,false));
		System.out.println(howManyWalls(100, 4, 5));
		System.out.println(Challenge.squaed(5));
		System.out.println(profitableGamble(0.2, 50, 9));
		System.out.println(sum_kadrov(10, 1));
		System.out.println(ostatok(10, 3));
		
}
public static int convert(int minutes) {	
	return minutes * 60 ; }
public static int points(int sc2,int sc3) {
	return sc2*2 + sc3*3; }
public static int footballPoints(int winx3,int draw,int losex0) {
	return winx3*3 + draw*1 + losex0*0 ; }
public static boolean divisibleByFive(int num1) {
	return num1 % 5 == 0 ;}
public static boolean and(boolean a , boolean b) {
	return a&&b; }
public static int howManyWalls(int n,int w,int h) {
	return n/w*h; }

public static class Challenge {
	public static int squaed(int a) {
		return a * a;}}

public static boolean profitableGamble(double prob, double prize, double pay) {	
	return ( prob * prize - pay ) > 0;}
public static int sum_kadrov(int minutes,int fps) {
	return minutes*fps*60;}
public static int ostatok(int chisl,int znam) {
	return chisl - (chisl / znam) * znam;}}

