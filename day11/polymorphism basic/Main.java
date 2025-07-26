/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class BattleGround{
    void start(){
        System.out.println("This is a virtual game created in a virtual world dont worry if you are eleminated , You can respawn again!!");
    }
}
class Freefire extends BattleGround{
    @Override
    void start(){
        super.start();
        System.out.println("Free Fire Begins");
    }
}
class Pubg extends BattleGround{
    @Override
    void start(){
        System.out.println("Pubg Begins");
    }
}
public class Main
{
	public static void main(String[] args) {
		Freefire ff = new Freefire();
		ff.start();
		Pubg p = new Pubg();
		p.start();
	}
}
