package com.njupt.swg.service;

import org.springframework.stereotype.Component;

@Component("performAop")
public class PerformAop {
		public void BeforePerform(){
			System.out.println("���Һ�λ��!");
		}
		
		public void AfterPerform(){
			System.out.println("����������!");
		}
}
