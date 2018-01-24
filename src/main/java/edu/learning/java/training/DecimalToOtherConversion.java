package edu.learning.java.training;


public class DecimalToOtherConversion {
	
	public static void main(String[] args) {
		int number = 63;
		String base = "hexa";
		DecimalToOtherConversion deccimalToOtherConversin = new DecimalToOtherConversion();
		deccimalToOtherConversin.changeToOtherBase(number,base);
	}

	public int changeToOtherBase(int number, String base) {
		int tmp = number;
		Integer binary[] = new Integer[50] ;
		Character cha[]  = new Character[50] ;
		int index = 0;
		if(base.equals("binary")){
		while(tmp>0){
			binary[index++] =tmp%2;
			tmp = tmp/2;
			
		}
		for(int i = index-1 ; i>=0 ; i--){
			System.out.print(binary[i]);
		}
		}
		else if(base.equals("hexa")){
			//System.out.println("15 to char " + String.valueOf(15).to);
			while(tmp>0){
				cha[index++] =isHexaValue(tmp%16);
			 tmp = tmp/16;
				
				
			}
			for(int i = index-1 ; i>=0 ; i--){
				System.out.print(cha[i]);
			}
		}
		
		return number;
		
	}

	public char isHexaValue(int tmp) {
		char c = 0  ;
		switch (tmp){
			case 0:
			c='0';	
			break;
			case 1:
			c='1';
			break;
			case 2:
			c='2';
			break;
			case 3:
			c='3';
			break;
			case 4:
			c='4';
			break;
			case 5:
			c='5';
			break;
			case 6:
			c='6';	
			break;
			case 7:
			c='7';
			break;
			case 8:
			c='8';
			break;
			case 9:
			c='9';
			break;
			case 10:
				c='A';
				break;
			case 11:
				c='B';
				break;
			case 12:
				c='C';
				break;
			case 13:
				c='D';
				break;
			case 14:
				c='E';
				break;
			case 15:
				c='f';
				break;
			
				
		}
		
		return c;
	}
}
