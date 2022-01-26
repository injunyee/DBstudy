package com.hij.region;

import java.util.Scanner;

public class RegionControler
{
	private RegionInput input;
	private RegionDAO dao;
	private RegionView view;
	private Scanner sc;
	
	public RegionControler()
	{
		input = new RegionInput();
		dao = new RegionDAO();
		view = new RegionView();
		sc = new Scanner(System.in);
	}
	
	public void start() throws Exception
	{
		boolean check = true;
		while(check)
		{
			System.out.println("1.region 추가");
			System.out.println("2.region 수정");
			System.out.println("3.region 삭제");
			System.out.println("4.종       료");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				int result = dao.setInsert(input.setInsert());
				if(result != 0)
				{
					view.view("데이터추가 성공");
				}
				else
				{
					view.view("데이터추가 실패");
				}
			}
			else if(select == 2)
			{
				int result = dao.setChange(input.setChange());
				if(result != 0)
				{
					view.view("데이터수정 성공");
				}
				else
				{
					view.view("데이터 수정 실패");
				}
			}
			else if(select == 3)
			{
				int result = dao.setDelete(input.setDelet());
				if(result != 0)
				{
					view.view("데이터삭제 성공");
				}
				else
				{
					view.view("데이터삭제 실패");
				}
			}
			else
			{
				check = false;
			}
		}//while end
	}//public void start end
}
