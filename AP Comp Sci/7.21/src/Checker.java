
public class Checker {
	public void board(int n){
		
		for(int i=n; i>0;i--){
			if(i%2 == 0){
				for(int j=n; j>0; j--){
					if(j%2 == 0)
						System.out.print("#");
					else
						System.out.print("o");
				}
				System.out.print("\n");
			}
			else{
				for(int j=n; j>0; j--){
					if(j%2 == 0)
						System.out.print("o");
					else
						System.out.print("#");
				}
				System.out.print("\n");
			}
		}
	}
}
