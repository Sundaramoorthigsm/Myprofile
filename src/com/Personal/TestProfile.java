package com.Personal;

public class TestProfile {
	public static void printProfile(Myprofile profile)
	{
		profile.myPersonalInfo();
		profile.myHobbies();
		
	}
	public static void main(String args[])
	{
	Myprofile myProfile = new SundarProfile();
	//SundarProfile.MyProfile();
	printProfile(myProfile);
	}
}
	


