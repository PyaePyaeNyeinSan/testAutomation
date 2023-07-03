package kbz.test;

public class Tutorial1 {

	public int aaa=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aa[]= {11,22,33,44,10,21,9,12,16,31};
		int smallest=aa[0];
		for(int i=1;i<10;i++) {
			if(aa[i]<smallest) {
				smallest=aa[i];
				
			}
		
		}
		System.out.println("smallest ="+ smallest);
		
		int largest=aa[0];
		for(int i=1;i<10;i++) {
			if(aa[i]>largest) {
				largest=aa[i];
			}
			
		}
		
		System.out.println("Largest ="+ largest);
		
		
		String name[]= {"Po Po","Win Aung","Bo Bo","Toe Aung"};
		
		String temp=name[0];
		for (int i=1;i<4;i++) {
			if(name[i].compareTo(temp)<0) {
				temp=name[i];
			}
		}
		System.out.println("First Person ="+ temp);
		
		
		
	}

}