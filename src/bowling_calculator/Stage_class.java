package bowling_calculator;

import java.util.Scanner;


class Stage_class_test {
	private int sc_1 = 0;
	private int sc_1_2 = 0;
	private int sc_2 = 0;
	private int sc_2_2 = 0;
	private int sc_3 = 0;
	private int sc_3_2 = 0;
	private int sc_4 = 0;
	private int sc_4_2 = 0;
	private int sc_5 = 0;
	private int sc_5_2 = 0;
	private int sc_6 = 0;
	private int sc_6_2 = 0;
	private int sc_7 = 0;
	private int sc_7_2 = 0;
	private int sc_8 = 0;
	private int sc_8_2 = 0;
	private int sc_9 = 0;
	private int sc_9_2 = 0;
	private int sc_10 = 0;
	private int sc_10_2 = 0;
	private int sc_11 = 0;

	private int score_1 = 0;
	private int score_2 = 0;
	private int score_3 = 0;
	private int score_4 = 0;
	private int score_5 = 0;
	private int score_6 = 0;
	private int score_7 = 0;
	private int score_8 = 0;
	private int score_9 = 0;
	private int score_10 = 0;
	private int score_bonus_11 = 0;
	private int score_bonus_12 = 0;

	private final int STRIKE = 10;
	private int pin_rest = 10;

	Scanner sc = new Scanner(System.in);

	void stage_1() 
	{
		//sc_1
		do{
			System.out.println("[1]");
			sc_1 = sc.nextInt();
			if(sc_1 > 10)
			{
				System.out.println("잘못된 값 입력");
			}

		}while(sc_1 > 10);

		//sc_1_2
		while(sc_1 + sc_1_2 < 10)
		{
			System.out.println("spare 1");
			sc_1_2 = sc.nextInt();
			if(sc_1 + sc_1_2 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}

		//sc_2
		do{
			System.out.println("[2]");
			sc_2 = sc.nextInt();
			if(sc_2 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}while(sc_2 > 10);

		//sc_2_2
		while(sc_2 + sc_2_2 < 10)
		{
			System.out.println("spare 2");
			sc_2_2 = sc.nextInt();
			if(sc_2 + sc_2_2 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}

		//sc_3
		do{
			System.out.println("[3]");
			sc_3 = sc.nextInt();
			if(sc_3 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}while(sc_3 > 10);

		//sc_3_2
		while(sc_3 + sc_3_2 < 10)
		{
			System.out.println("spare 3");
			sc_3_2 = sc.nextInt();
			if(sc_3 + sc_3_2 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}

		if(sc_1 == STRIKE)	//strike
		{
			if(sc_2 == STRIKE)	//sc_2 strike
			{
				score_1 = sc_1 + sc_2 + sc_3;
			}
			else	//sc_2 not strike
			{
				score_1 = sc_1 + (sc_2 + sc_2_2);
			}
		}
		else	//not strike
		{
			if(pin_rest == (sc_1 + sc_1_2))	//spare
			{
				score_1 = (sc_1 + sc_1_2) + sc_2;
			}
			else		//not spare
			{
				score_1 = sc_1 + sc_1_2;	
			}

		}
		System.out.printf("\tscore 1: %d\n", score_1);
		System.out.println();
	}

	void stage_2()
	{
		//sc_4
		do {
			System.out.println("[4]");
			sc_4 = sc.nextInt();
			if(sc_4 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}while(sc_4 > 10);

		//sc_4
		while(sc_4 + sc_4_2 < 10)
		{
			System.out.println("spare 4");
			sc_4_2 = sc.nextInt();
			if(sc_4 + sc_4_2 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}

		if(sc_2 == STRIKE)
		{
			if(sc_3 == STRIKE)
			{
				score_2 = sc_2 + sc_3 + sc_4;
			}
			else
			{
				score_2 = sc_2 + (sc_3 + sc_3_2);
			}
		}
		else		//not strike
		{
			if(pin_rest == (sc_2 + sc_2_2))	//spare
			{
				score_2 = (sc_2 + sc_2_2) + sc_3;
			}
			else	//not spare
			{
				score_2 = sc_2 + sc_2_2;	
			}
		}

		System.out.printf("\tscore 2: %d\n", score_2);
		System.out.println();
	}

	void stage_3()
	{
		//sc_5
		do {
			System.out.println("[5]");
			sc_5 = sc.nextInt();
			if(sc_5 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}while(sc_5 > 10);

		//sc_5_2
		while(sc_5 + sc_5_2 < 10)
		{
			System.out.println("spare 5");
			sc_5_2 = sc.nextInt();
			if(sc_5 + sc_5_2 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}

		if(sc_3 == STRIKE)
		{
			if(sc_4 == STRIKE)
			{
				score_3 = sc_3 + sc_4 + sc_5;
			}
			else
			{
				score_3 = sc_3 + (sc_4 + sc_4_2);
			}
		}
		else	//not strike
		{
			if(pin_rest == (sc_3 + sc_3_2))	//spare
			{
				score_3 = (sc_3 + sc_3_2) + sc_4;
			}
			else	//not spare
			{
				score_3 = sc_3 + sc_3_2;	
			}
		}

		System.out.printf("\tscore 3: %d\n", score_3);
		System.out.println();
	}

	void stage_4()
	{
		//sc_6
		do {
			System.out.println("[6]");
			sc_6 = sc.nextInt();
			if(sc_6 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}while(sc_6 > 10);

		//sc_6_2
		while(sc_6 + sc_6_2 > 10)
		{
			System.out.println("spare 6");
			sc_6_2 = sc.nextInt();
			if(sc_6 + sc_6_2 < 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}

		if(sc_4 == STRIKE)
		{
			if(sc_5 == STRIKE)
			{
				score_4 = sc_4 + sc_5 + sc_6;
			}
			else
			{
				score_4 = sc_4 + (sc_5 + sc_5_2);
			}
		}
		else	//not strike
		{
			if(pin_rest == (sc_4 + sc_4_2))	//spare
			{
				score_4 = (sc_4 + sc_4_2) + sc_5;
			}
			else	//not spare
			{
				score_4 = sc_4 + sc_4_2;	
			}
		}

		System.out.printf("\tscore 4: %d\n", score_4);
		System.out.println();
	}

	void stage_5()
	{
		//sc_7
		do {
			System.out.println("[7]");
			sc_7 = sc.nextInt();
			if(sc_7 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}while(sc_7 > 10);

		//sc_7_2
		while(sc_7 + sc_7_2 < 10)
		{
			System.out.println("spare 7");
			sc_7_2 = sc.nextInt();
			if(sc_7 + sc_7_2 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}

		if(sc_5 == STRIKE)
		{
			if(sc_6 == STRIKE)
			{
				score_5 = sc_5 + sc_6 + sc_7;
			}
			else
			{
				score_5 = sc_5 + (sc_6 + sc_6_2);
			}
		}
		else	//not strike
		{

			if(pin_rest == (sc_5 + sc_5_2))	//spare
			{
				score_5 = (sc_5 + sc_5_2) + sc_6;
			}
			else		//not spare
			{
				score_5 = sc_5 + sc_5_2;	
			}

		}

		System.out.printf("\tscore 5: %d\n", score_5);
		System.out.println();
	}

	void stage_6()
	{
		//sc_8
		do {
			System.out.println("[8]");
			sc_8 = sc.nextInt();
			if(sc_8 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}while(sc_8 > 10);

		//sc_8_2
		while(sc_8 + sc_8_2 < 10)
		{
			System.out.println("spare 8");
			sc_8_2 = sc.nextInt();
			if(sc_8 + sc_8_2 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}

		if(sc_6 == STRIKE)
		{
			if(sc_7 == STRIKE)
			{
				score_6 = sc_6 + sc_7 + sc_8;
			}
			else
			{
				score_6 = sc_6 + (sc_7 + sc_7_2);
			}
		}
		else		//not strike
		{
			if(pin_rest == (sc_6 + sc_6_2))	//spare
			{
				score_6 = (sc_6 + sc_6_2) + sc_7;
			}
			else		//not spare
			{
				score_6 = sc_6 + sc_6_2;	
			}

		}

		System.out.printf("\tscore 6: %d\n", score_6);
		System.out.println();
	}

	void stage_7()
	{
		//sc_9
		do {
			System.out.println("[9]");
			sc_9 = sc.nextInt();
			if(sc_9 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}while(sc_9 > 10);

		//sc_9_2
		while(sc_9 + sc_9_2 < 10)
		{
			System.out.println("spare 9");
			sc_9_2 = sc.nextInt();
			if(sc_9 + sc_9_2 > 10)
			{
				System.out.println("잘못된 값 입력");
			}
		}	

		if(sc_7 == STRIKE)
		{
			if(sc_8 == STRIKE)
			{
				score_7 = sc_7 + sc_8 + sc_9;
			}
			else
			{
				score_7 = sc_7 + (sc_8 + sc_8_2);
			}
		}
		else	//not strike
		{
			if(pin_rest == (sc_7 + sc_7_2))	//spare
			{
				score_7 = (sc_7 + sc_7_2) + sc_8;
			}
			else		//not spare
			{
				score_7 = sc_7 + sc_7_2;	
			}

		}

		System.out.printf("\tscore 7: %d\n", score_7);
		System.out.println();
	}

	void stage_8_9_10()
	{
		//sc_10
		while(true)
		{
			System.out.println("[10]");
			sc_10 = sc.nextInt();
			if(sc_10 >= 0 && sc_10 <= 10)
			{
				break;
			}
			System.out.println("잘못된 값 입력");
		}
		
		if(sc_8 == STRIKE)
		{
			if(sc_9 == STRIKE)
			{
				score_8 = sc_8 + sc_9 + sc_10;
			}
			else
			{
				score_8 = sc_8 + (sc_9 + sc_9_2);
			}
		}
		else	//not strike
		{
			if(pin_rest <= sc_8_2)	//spare
			{
				score_8 = (sc_8 + sc_8_2) + sc_9;
			}
			else		//not spare
			{
				score_8 = sc_8 + sc_8_2;	
			}

		}

		System.out.printf("\tscore 8: %d\n", score_8);
		System.out.println();

		//sc_10_2
		while(true)
		{
			System.out.println("spare 10");
			sc_10_2 = sc.nextInt();
			if(sc_10 == STRIKE)	//strike
			{
				if(sc_10_2 > 0 && sc_10_2 <= 10)
				{
					while(true)
					{
						System.out.println("+bonus 11+");
						sc_11 = sc.nextInt();
						if(sc_10_2 == STRIKE)	//strike
						{
							if(sc_11 > 0 && sc_11 <= 10)
							{
								//System.out.println("프로그램 종료");
								break;
							}
							else if(sc_10 + sc_10_2 == 10)	//spare
							{
								//System.out.println("SPARE");
								//System.out.println("프로그램 종료");
								break;
							}
							else 
							{
								System.out.println("잘못된  값 입력");
								continue;
							}
						}
						else if(sc_10_2 >= 0 && sc_10_2 < 10)
						{
							break;
						}
					}
					break;
				}
			}
			else	//fail strike
			{
				while(true)
				{
					if(sc_10 + sc_10_2 == 10)	//spare
					{
						System.out.println("+bonus 11+");
						sc_11 = sc.nextInt();
						if(sc_11 > 0 && sc_11 <= 10)
						{
							//System.out.println("프로그램 종료");
							break;
						}

					}
					else if(sc_10_2 >= 0 && (sc_10 + sc_10_2) < 10)	//fail spare
					{
						//System.out.println("프로그램 종료");
						break;
					}
					else
					{
						//System.out.println("잘못된 값 입력");
					}
					continue;
				}
				break;
			}
		}

		if(sc_9 == STRIKE)
		{
			score_9 = sc_9 + sc_10 + sc_11;
		}
		else		//not strike
		{
			if(pin_rest <= sc_9_2)	//spare
			{
				score_9 = (sc_9 + sc_9_2) + sc_10;
			}
			else		//not spare
			{
				score_9 = sc_9 + sc_9_2;	
			}

		}

		System.out.printf("\tscore 9: %d\n", score_9);
		System.out.println();


		score_10 = sc_10;
		score_bonus_11 = sc_10_2;
		score_bonus_12 = sc_11;

	}
	
	void all_score()
	{
		Stage_class_test sct = new Stage_class_test();
		int all_score = score_1 + score_2 + score_3 + score_4 + score_5 + score_6 + 
				score_7 + score_8 + score_9 + score_10 + score_bonus_11 + score_bonus_12;
		System.out.printf("\tall score: %d", all_score);
	}
	
	void all_pin()
	{
		Stage_class_test sct = new Stage_class_test();
		int all_pin = sc_1 + sc_2 + sc_3 + sc_4 + sc_5 + sc_6
				+ sc_7 + sc_8 + sc_9 + sc_10 + sc_10_2 + sc_11;
		System.out.printf("\tall pin: %d\n", all_pin);
		
	}

}
