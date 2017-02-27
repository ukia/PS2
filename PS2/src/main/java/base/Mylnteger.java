 package base;

public class Mylnteger {
	private int iValue;
	int i;

	public Mylnteger(int iValue){
	}
	
	public int getiValue(){
		return iValue;
	}
	public boolean isEven(){
		if((iValue % 2) == 0) 
			return true;
		else
			return false;
		}
	
	public boolean isOdd(){
		if((iValue % 2) == 1) 
			return true;
		else
			return false;
		}
	
	public boolean isPrime() {
		for(int i = 2 ; i< iValue ; i++){
			if(iValue % i == 0)
				return false;
		}		return true;
		}
                                        //N is a new value
	public static boolean isOdd(int N) {
			if((N % 2) == 1) {
				return true;
			}	return false;
		}
	public static boolean isEven(int N) {
			if((N % 2 ) == 0){
				return true;
			}	return false;
	}
	public static boolean isPrime(int N){
			for(int i = 2; i < N ; i++){
				if(N % i == 0)
					return false;
			}		return true;
			
}
	public static boolean isEven(Mylnteger N){
		return N.isEven();
	}
	public static boolean isOdd(Mylnteger N){
		return N.isOdd();
	}
	public static boolean isPrime(Mylnteger N){
		return N.isPrime();
	}
	public boolean equals(int N){
		return(N == iValue);
	}
	public boolean equals(Mylnteger N){
		return(N.getiValue() == iValue);
		
	}
}
			