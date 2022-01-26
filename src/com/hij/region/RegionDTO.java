package com.hij.region;

public class RegionDTO
{
	//DTO의 기본
		//멤버변수의 접근지정자는 모두 'private'
		//Getter, Setter는 모두 생성
		//멤버변수의 Datetype과 변수명은 Table과 일치
		//생성자는 여러게 만들어도 상관없지만 기본 생성자는 있어야함
		private Integer region_id;
		private String region_name;
		
		public Integer getRegion_id()
		{
			return region_id;
		}
		public void setRegion_id(Integer region_id)
		{
			this.region_id = region_id;
		}
		public String getRegion_name()
		{
			return region_name;
		}
		public void setRegion_name(String region_name)
		{
			this.region_name = region_name;
		}
}
