

/*public class MyInteger {
	int iValue;
	
	
	public MyInteger(int newValue) {
		this.iValue  = newValue;
		
	}
	
	public int getiValue() {
		return iValue;
		
	}
	
	public boolean isEven() {
		if (iValue % 2 == 0)
			return true;
		return false;
		
	}
	
	public boolean isOdd() {
		if (iValue % 2== 1)
			return true;
		return false;
			
	}
	
	public boolean isPrime() {
		if ( iValue %2 == 0)
			return false;
		for (int i=3; i*i <= iValue; i++)
			if (iValue % i == 0)
				return false;
	
	return true;
				
}
	public boolean isEven(int iValue ) {
		if (iValue % 2 == 0)
			return true;
		return false;
		
	}
	
	public boolean isOdd (int iValue ) {
		if (iValue % 2== 1)
			return true;
		return false;
		}
	
	
	public boolean isPrime (int iValue) {
		if ( iValue %2 == 0)
			return false;
		for (int i=3; i*i <= iValue; i++)
			if (iValue % i == 0)
				return false;
	
	return true;
	}
	
	public static boolean isEven (MyInteger newValue) {
		if (iValue % 2 == 0)
			return true;
	}
	
	public static boolean isOdd (myInteger newValue) {
		if (iValue %2 != 0)
			return true;
		
	}
	
	public static boolean isPrime(MyInteger newValue) {
		if ( iValue %2 == 0)
			return false;
		for (int i=3; i*i <= iValue; i++)
			if (iValue % i == 0)
				return false;
	
	return true;
	
		
		

}
*/
package pkgPS2;
public class MyInteger {

 
	private int iValue;
 
    public MyInteger(int newValue) {
        iValue = newValue;
    }
 
    public int getValue() {
        return iValue;
    }
 
    public boolean isEven() {
        if (iValue % 2 == 0)
            return true;
        return false;
    }
 
    public boolean isOdd() {
        if (iValue % 2 != 0)
            return true;
        return false;
    }
 
    public boolean isPrime() {
        int i= 2;
    	    for (i = 2; i <= Math.sqrt(iValue); i++) {
            if (iValue % i == 0)
                return false;
   
        }
        return true;
    }
 
    public boolean isEven(int iValue) {
        if (iValue % 2 == 0)
            return true;
        return false;
    }
 
    public boolean isOdd(int iValue) {
        if (iValue % 2 != 0)
            return true;
        return false;
    }
 
    public static boolean isPrime(int iValue) {
        int i= 2;
	    for (i = 2; i <= Math.sqrt(iValue); i++) {
        if (iValue % i == 0)
            return false;

    }
    return true;
    }
 
    public boolean isEven(MyInteger myInt) {
        return myInt.isEven(myInt.getValue());
    }
 
    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd(myInt.getValue());
    }
 
    public static boolean isPrime(MyInteger myInt) {
        return MyInteger.isPrime(myInt.getValue());
    }
 
    public boolean equals(int intValue) {
        return iValue == intValue;
        	
    }

    public boolean equals(MyInteger myInt) {
        return equals(myInt.getValue());
    }
}
 