package application;

import java.util.Random;

public class GeneratePlayer1Random {
	public String[] randomGen(String []ply1Dis){
		for(int x=0;x<=6;x++){
			if(ply1Dis[x].equals("")){
				Random gen = new Random();
				int r = gen.nextInt(25);
				NumAccordingTo obj = new NumAccordingTo();
				ply1Dis[x]=obj.gen(r);
			}
		}

		return ply1Dis;}
}
