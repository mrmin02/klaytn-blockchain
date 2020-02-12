package com.busyvacation.klaytn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import klaytn.klaytn;

@SpringBootApplication
public class KlaytnApplication {

	public static void main(String[] args) {
		SpringApplication.run(KlaytnApplication.class, args);
		
		klaytn a = new klaytn();
		try {
//			a.createKey(); // key 생성
//			a.sendKlay(); // 클레이 전송
			
			
//			a.disploy();  // 스마트 컨트렉트 배포
//			a.smart_contract_ex(); // 스마트 컨트렉트로 클레이 전송
			
			
//			a.test_pee_deploy();  // 수수료 대납 스마트 컨트렉트 배포
//			a.test_pee();  // 수수료 대납 스마트 컨트렉트로 전송
			
			
			
			// 솔리디티 테스트
//			a.test_pee_deploy2(); // 수수료 대납 스마트 컨트렉트 배포
			
			
			
//			a.test_pee2();  // 수수료 대납 스마트 컨트렉트에 데이터 전송 (solidity)
			
			
			
			a.load(); // 수수료 대납 스마트 컨트렉트의 데이터 출력 (solidity)
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
