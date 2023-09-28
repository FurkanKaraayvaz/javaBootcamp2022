package Week1;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 5;
		int remainder = number % 2;
		//System.out.println(remainder);
		Boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı");
			
			for (int i=2; i<number;i++){
				if(number % i== 0) {
					isPrime = false;
		}
		
		if(number<2){
			System.out.println("Geçersiz sayı");
		}
		
		
		return;
		
		
		
	
		    }
	   }
		
	
			
       if(isPrime) {
    	   System.out.println("Sayı asaldır");
       }else {
    	   System.out.println("Sayı asal değildir");
       }
      
	}
}
       
       
       
    	   