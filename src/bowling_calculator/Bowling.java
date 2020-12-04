package bowling_calculator;

import java.util.Scanner;

public class Bowling {

	public static void main(String[] args) {
		//Calculator cc = new Calculator();
		//System.out.println();
		
		int score_1 = 0;
		int score_2 = 0;
		int score_3 = 0;
		int score_4 = 0;
		int score_5 = 0;
		int score_6 = 0;
		int score_7 = 0;
		int score_8 = 0;
		int score_9 = 0;
		int score_10 = 0;
		int score_bonus_11 = 0;
		int score_bonus_12 = 0;
		
		int all_score = 0;
		

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[1]");
		int sc_1 = sc.nextInt();
		System.out.println(" 1 spare");
		int sc_1_2 = sc.nextInt();
		
		System.out.println("[2]");
		int sc_2 = sc.nextInt();
		System.out.println(" 2 spare");
		int sc_2_2 = sc.nextInt();
		
		System.out.println("[3]");
		int sc_3 = sc.nextInt();
		System.out.println(" 3 spare");
		int sc_3_2 = sc.nextInt();
		
		System.out.println("[4]");
		int sc_4 = sc.nextInt();
		System.out.println(" 4 spare");
		int sc_4_2 = sc.nextInt();
		
		System.out.println("[5]");
		int sc_5 = sc.nextInt();
		System.out.println(" 5 spare");
		int sc_5_2 = sc.nextInt();
		
		System.out.println("[6]");
		int sc_6 = sc.nextInt();
		System.out.println(" 6 spare");
		int sc_6_2 = sc.nextInt();
		
		System.out.println("[7]");
		int sc_7 = sc.nextInt();
		System.out.println(" 7 spare");
		int sc_7_2 = sc.nextInt();
		
		System.out.println("[8]");
		int sc_8 = sc.nextInt();
		System.out.println(" 8 spare");
		int sc_8_2 = sc.nextInt();
		
		System.out.println("[9]");
		int sc_9 = sc.nextInt();
		System.out.println(" 9 spare");
		int sc_9_2 = sc.nextInt();
		
		System.out.println("[10]");
		int sc_10 = sc.nextInt();
		System.out.println(" bonus 11");
		int sc_11 = sc.nextInt();
		System.out.println(" bonus 12");
		int sc_12 = sc.nextInt();
		
		/////1stage/////
		if(sc_1 == 10)	//strike
		{
			if(sc_2 == 10)	//sc_2에서도 strike일때
			{
			score_1 = sc_1 + sc_2 + sc_3;
			}
			else	//sc_2에서 strike가 아닐때
			{
				score_1 = sc_1 + (sc_2 + sc_2_2);
			}
		}
		else if(sc_1 != 10)	//strike가 아닐때
		{
			if(score_1 == 10)	//spare
			{
				score_1 = (sc_1 + sc_1_2) + sc_2;
			}
			
			else	//처리를 못했을 떄
			{
				score_1 = sc_1 + sc_1_2;	
			}
		}
		
		System.out.printf("score 1: %d\n", score_1);
		
		/////2stage/////
		if(sc_2 == 10)
		{
			if(sc_3 == 10)
			{
				score_2 = sc_2 + sc_3 + sc_4;
			}
			else
			{
				score_2 = sc_2 + (sc_3 + sc_3_2);
			}
		}
		else if(sc_2 != 10)
		{
			if(score_2 == 10)
			{
				score_2 = (sc_2 + sc_2_2) + sc_3;
			}
			
			else
			{
				score_2 = sc_2 + sc_2_2;	
			}
		}
		
		System.out.printf("score 2: %d\n", score_2);
		
		/////3stage/////
		if(sc_3 == 10)
		{
			if(sc_4 == 10)
			{
				score_3 = sc_3 + sc_4 + sc_5;
			}
			else
			{
				score_3 = sc_3 + (sc_4 + sc_4_2);
			}
		}
		else if(sc_3 != 10)
		{
			if(score_3 == 10)
			{
				score_3 = (sc_3 + sc_3_2) + sc_4;
			}
			
			else
			{
				score_3 = sc_3 + sc_3_2;	
			}
		}
		
		System.out.printf("score 3: %d\n", score_3);
		
		/////4stage/////
		if(sc_4 == 10)
		{
			if(sc_5 == 10)
			{
				score_4 = sc_4 + sc_5 + sc_6;
			}
			else
			{
				score_4 = sc_4 + (sc_5 + sc_5_2);
			}
		}
		else if(sc_4 != 10)
		{
			if(score_4 == 10)
			{
				score_4 = (sc_4 + sc_4_2) + sc_5;
			}
			
			else
			{
				score_4 = sc_4 + sc_4_2;	
			}
		}
		
		System.out.printf("score 4: %d\n", score_4);
	
		/////5stage/////
		if(sc_5 == 10)
		{
			if(sc_6 == 10)
			{
				score_5 = sc_5 + sc_6 + sc_7;
			}
			else
			{
				score_5 = sc_5 + (sc_6 + sc_6_2);
			}
		}
		else if(sc_5 != 10)
		{
			if(score_5 == 10)
			{
				score_5 = (sc_5 + sc_5_2) + sc_6;
			}
			
			else
			{
				score_5 = sc_5 + sc_5_2;	
			}
		}
		
		System.out.printf("score 5: %d\n", score_5);
		
		/////6stage/////
		if(sc_6 == 10)
		{
			if(sc_7 == 10)
			{
				score_6 = sc_6 + sc_7 + sc_8;
			}
			else
			{
				score_6 = sc_6 + (sc_7 + sc_7_2);
			}
		}
		else if(sc_6 != 10)
		{
			if(score_6 == 10)
			{
				score_6 = (sc_6 + sc_6_2) + sc_7;
			}
			
			else
			{
				score_6 = sc_6 + sc_6_2;	
			}
		}
		
		System.out.printf("score 6: %d\n", score_6);
		
		/////7stage/////
		if(sc_7 == 10)
		{
			if(sc_8 == 10)
			{
				score_7 = sc_7 + sc_8 + sc_9;
			}
			else
			{
				score_7 = sc_7 + (sc_8 + sc_8_2);
			}
		}
		else if(sc_7 != 10)
		{
			if(score_7 == 10)
			{
				score_7 = (sc_7 + sc_7_2) + sc_8;
			}
			
			else
			{
				score_7 = sc_7 + sc_7_2;	
			}
		}
		
		System.out.printf("score 7: %d\n", score_7);
		
		/////8stage/////
		if(sc_8 == 10)
		{
			if(sc_9 == 10)
			{
				score_8 = sc_8 + sc_9 + sc_10;
			}
			else
			{
				score_8 = sc_8 + (sc_9 + sc_9_2);
			}
		}
		else if(sc_8 != 10)
		{
			if(score_8 == 10)
			{
				score_8 = (sc_8 + sc_8_2) + sc_9;
			}
			
			else
			{
				score_8 = sc_8 + sc_8_2;	
			}
		}
		
		System.out.printf("score 8: %d\n", score_8);
		
		/////9stage/////
		if(sc_9 == 10)
		{
			score_9 = sc_9 + sc_10 + sc_11;
		}
		else if(sc_9 != 10)
		{
			if(score_9 == 10)
			{
				score_9 = (sc_9 + sc_9_2) + sc_10;
			}
			
			else
			{
				score_9 = sc_9 + sc_9_2;	
			}
		}
		
		System.out.printf("score 9: %d\n", score_9);
		
		/////10stage/////
		if(sc_10 == 10)
		{
			score_10 = 10;
			if(sc_11 == 10)	//sc_11이 strike일때
			{
				score_bonus_11 = sc_11;
				score_bonus_12 = sc_12;
				
			}
			else if(sc_11 != 10)	//sc_11이 strike아닐때
			{
				score_bonus_11 = sc_11;
				int ten_pin_rest = 10 - score_bonus_11;
				
				if(ten_pin_rest >= sc_12)	//sc_12가 spare인데 spare값을 넘어가면 안되니깐 여기서 한번 막아줌
				{
					score_bonus_12 = sc_12;
				}
			}
		}
		else if(sc_10 != 10)	//sc_10이 strike가 아닐때
		{
			score_10 = sc_10;
			int ten_pin_rest = 10 - score_10;
			
			if(ten_pin_rest >= sc_11)	//sc_11이 spare인데 spare값을 넘어가면 안되니깐 여기서 한번 막아줌
			{
				score_bonus_11 = sc_11;
				if((sc_10 + sc_11) == 10) 	//sc_12가 들어가야함
				{
					score_bonus_12 = sc_12;
				}
			}
			else if((sc_10 + sc_11) <= 10)
			{
				//프로그램 종료
			}
		}
		
		all_score = score_1 + score_2 + score_3 + score_4 + score_5 + score_6 
				+ score_7 + score_8 + score_9 + sc_10 + sc_11 + sc_12;
		System.out.printf("all score: %d", all_score);

	}

}
