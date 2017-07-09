/*Write a program in java to differentiate between instance variables and class variables. And also
show the scope of each.
*/
package com.acadgild.assignment;  //package declaration

class Assignment {

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		
		// INSTANCE VARIABLE
		Assignment1 a1 = new Assignment1();
        a1.subjectNumber = 123456;

        Assignment1 a2 = new Assignment1();
        a2.subjectNumber = 987654;

        System.out.println("Output of Instance Variable: "+a1.subjectNumber);
        System.out.println("Output of Instance Variable: "+a2.subjectNumber);
        
        //CLASS VARIABLE
    	Assignment1 a3 = new Assignment1();
        a3.setBarcode(123456);
        Assignment1 a4 = new Assignment1();
        a4.setBarcode(987654);

        System.out.println("Output of Class Variable: "+a3.getBarcode());
        System.out.println("Output of Class Variable: "+a4.getBarcode());
    }		

	}


public class Assignment1 {

	// INSTANCE VARIABLE
	public int subjectNumber;
	
	//CLASS VARIABLE
    public static int Barcode;

    public int getBarcode() {
        return Barcode;
    }
    public void setBarcode(int value){
        Barcode = value;
    }
}
