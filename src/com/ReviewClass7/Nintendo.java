package com.ReviewClass7;

public class Nintendo extends GameConsole {

	public static void main(String[] args) {
		Nintendo nn=new Nintendo();
		nn.controller="red & blue";
		nn.numberOfController=4;
		nn.ifTvNeeded=true;
		nn.cd=false;
		nn.powerSource="outlet";
	       // -------------- below are attributes-------------------------
//      System.out.println(nintendo.controller + " Controler color");
//      System.out.println(nintendo.numberOfController + " number of controler");
//      System.out.println(nintendo.ifTvNeeded + " if tv is needed");
//      System.out.println(nintendo.cd + " is cd required");
//      System.out.println(nintendo.powerSource + " is power source needed");

      // -------------- below are behaviors-------------------------
      /**
       * ----System.out.println(nintendo.portable() + " is game system portable");
       * //----System.out.println(nintendo.surfWeb()+" able to surf the web"); ----too
       * old to play on web
       * nintendo.readDisk(); nintendo is a casset player not disk
       **/

     
    
		System.out.println(nn.controller);
		System.out.println(nn.numberOfController);
		System.out.println(nn.ifTvNeeded);
		System.out.println(nn.cd);
		System.out.println(nn.powerSource);
		
		//--------------behavior--------
		System.out.println(nn.portAble());
		System.out.println(nn.surfWeb());
		nn.readDisk();
		nn.ableToPlay();

	}

}
