package Week1;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün Hava Çok Güzel.";
		System.out.println(mesaj);

//		System.out.println("Elaman Sayısı = " + mesaj.length());
//		System.out.println("5. elaman : " + mesaj.charAt(4));
//		System.out.println(mesaj.concat(" Yaşaın!"));
//		System.out.println(mesaj.startsWith("B"));
//		System.out.println(mesaj.endsWith("."));
//		char[] karakterler = new char [5] ;
//		mesaj.getChars(srcBegin:0, srcEnd:5, karakterler, dstBegin: 0);
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOF("av"));
//		System.out.println(mesaj.lastIndexOf(str:"a"));
		
	    String yeniMesaj = mesaj.replace(' ', '-');
	    System.out.println(yeniMesaj);
	    System.out.println(mesaj.substring(2,5));
	    for (String kelime : mesaj.split(" ")) {
	    	System.out.println(kelime); {
	    		
	    	 }
	    System.out.println(mesaj.toLowerCase());	
	    System.out.println(mesaj.toUpperCase());	

	    	
	    }

	}

}
