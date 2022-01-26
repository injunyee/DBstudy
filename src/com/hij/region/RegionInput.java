package com.hij.region;

import java.util.Scanner;

public class RegionInput
{
private Scanner sc;
	
	public RegionInput()
	{
		sc = new Scanner(System.in);
	}
	
	public RegionDTO setInsert()
	{
		RegionDTO rdto = new RegionDTO();
		System.out.println("region_id를 입력");
		rdto.setRegion_id(sc.nextInt());
		System.out.println("region_name을 입력");
		rdto.setRegion_name(sc.next());
		return rdto;
	}
	
	public RegionDTO setDelet()
	{
		RegionDTO rdto = new RegionDTO();
		System.out.println("삭제할 region_id를 입력하세요");
		rdto.setRegion_id(sc.nextInt());
		return rdto;
	}
	
	public int[] setChange()
	{
		int num[] = new int[2];
		System.out.println("변경할 region_id를 입력하세요");
		num[0] = sc.nextInt();
		System.out.println("변경될 region_id값을 입력하세요");
		num[1] = sc.nextInt();
		
		return num;
	}
}
