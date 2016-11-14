
public class EnumGrades {
	public enum Grade {Aplus,A,Aminus,Bplus,B,Bminus,Cplus,C,Cminus,Dplus,D,F};
	
	public void justDoIt(Grade x){
		switch(x){
		case Aplus:System.out.println("This is 65-60\nYou guys did good.");break;
		case A:System.out.println("This is 60-55\nYou guys did good.");break;
		case Aminus:System.out.println("This is 55-50\nYou guys did good.");break;
		case Bplus:System.out.println("This is 50-45\nYou guys did okay.");break;
		case B:System.out.println("This is 45-40\nYou guys did okay.");break;
		case Bminus:System.out.println("This is 40-35\nYou guys did okay.");break;
		case Cplus:System.out.println("This is 35-30\nYou guys did not so good.");break;
		case C:System.out.println("This is 30-25\nYou guys did not so good.");break;
		case Cminus:System.out.println("This is 25-20\nYou guys did not so good.");break;
		case Dplus:System.out.println("This is 20-15\nYou guys did terrible.");break;
		case D:System.out.println("This is 15-10\nYou guys did terrible.");break;
		case F:System.out.println("This is 15-0\nGet out of my class.");break;
		default:System.out.println("LOL that is not a grade.");break;
		}
	}
}
