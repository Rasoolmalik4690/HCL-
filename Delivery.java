package org.hcl;

public class Delivery {
	long over,ball,runs;
	String batsman,bowler,nonStriker;
	Delivery(long over,long ball,long runs,String batsman,String bowler,String nonStriker)
	{
		this.over=over;
		this.ball=ball;
		this.runs=runs;
		this.batsman=batsman;
		this.bowler=bowler;
		this.nonStriker=nonStriker;
	}
	void displayDeliveryDetails()
			{
		System.out.println("Delivery details");
		System.out.println("over : "+over+"\n"+"Ball : "+ball+"\n"+"Runs : "+runs+"\n"+"batsman : "+batsman+"\n"+"bowler : "+bowler+"\n"+"nonStriker : "+nonStriker);
	}

}

