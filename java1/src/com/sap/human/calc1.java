package com.sap.human;

public class calc1 {
	
		public int firstvalue;
		public int secondvalue;
		public calc1(int a,int b) {
			if (a<1000) {
				firstvalue=a;
				
				
			}
			if (b<1000 && b!=0) {
				secondvalue=b;
			}
         
			
			
			
			
		}
		
		
	
		 int plus() {
			int ad;
			
			ad=firstvalue+secondvalue;
			return ad;
			
			
		}
		 int min() {
			int sub;
			sub=firstvalue-secondvalue;
			return sub;
		}
		 int M() {
			int mt;
			mt=firstvalue*secondvalue;
			return mt;
				
		}
		
		 int d() {
			int di;
			di=firstvalue/secondvalue;
			return di;
		}
		 

}

