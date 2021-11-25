package com.sonata;

public class TheSwitchExample {

	public static void main(String[] args) {
		int day=3;
		switch(day) {
		case 1:if(day==1) {
			System.out.println("monday");
			break;
		}
		
			case 2:if(day==2) {
			System.out.println("Tuesday");
			break;
			}
			case 3:if(day==3) {
				System.out.println("wednesday");
				break;
			}
			case 4:if(day==4) {
				System.out.println("thrusday");
				break;
			}
			default: 
				System.out.println("no day");
			}
		}
	}


