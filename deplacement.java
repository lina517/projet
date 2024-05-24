
public class deplacement {

}
class ErrDeplacement extends Exception{
	private int y;
	private int x;

	ErrDeplacement (String mes)
	{
		super(mes);
	}
	public void deplacement (int x, int y)throws ErrDeplacement
	{
if (this.x+x<0 || this.y+y<0)throw new ErrDeplacement ("le deplacement+"+x+"et +"+y+"n est"+"ne pas autorise");
this.x=this.x+x;
this.y=this.y+y;
	}}