package chapter09;

import java.sql.DataTruncation;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JToggleButton.ToggleButtonModel;

// == java.time 패키지 ==
// : ISO-86001 표준 기반으로 설계
// : YYYY-MM-DDThh:mm:ss.sssZ
// - import 문을 사용하여 클래스를 명시!

public class JavaTime {
	public static void main(String[] args) {
		// 1) LocalDate - 날짜
		// : 날짜(연도, 월, 일)
		// .now(): 현재 날짜 반환
		// .of(연도, 월, 일): 특정 날짜를 국제 표기법 상 반환
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate yesterday = LocalDate.of(2025, 2, 18);
		System.out.println(yesterday);
		
		// .plus(Years, Months, Days): N년 후, N달 후, N일 
		LocalDate tommorrow = today.plusDays(1);
		System.out.println(tommorrow);
		
		// .minus(Years, Months, Days): N년 후, N달 후, N일 
		LocalDate oneMonthsAgo = today.minusMonths(1);
		System.out.println(oneMonthsAgo);
		
		// 2) LocalTime - 시간
		// : 시간(시, 분, 초, 나노초)만 다룸
		// - 날짜와 시간대 정보는 포함하지 X
		// .now() - 현재 시간 반환
		// .of(시, 분, 초) - 특정 시간을 표준 형태로 반환
		LocalTime now = LocalTime.now();;
		System.out.println(now);
		
		LocalTime lunchTime = LocalTime.of(12, 50);
		System.out.println(lunchTime);
		
		// .plus(Hours, Minutes, Seconds)
		// .minus(Hours, Minutes, Seconds)
		
		LocalTime restTime = now.plusMinutes(35);
		System.out.println(restTime); // 11:50:44.235689
		
		// cf) LocalDateTIme 클래스
		//		: 날짜와 시간을 함께 다루는 클래스
		//		> .now(), .of(), .plus~(), .minus~() 사용 가능
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println(nowDateTime); // 2025-02-19T11:17:09.415270
		
		// cf) get 메서드
		// : getYear(), getMonth(), getDayOfMonth() : 날짜 정보를 반환
		// : getHour(), getMinute(), getSecond() : 시간 정보를 반환
		System.out.println(today.getYear()); // 2025
		System.out.println(today.getMonth()); // FEBRUARY
		System.out.println(today.getDayOfMonth()); // 19
		
		// cf) 날짜/시간 포맷팅
		// : formatting - 원하는 형식으로 출력
		LocalDateTime example = LocalDateTime.now();
		System.out.println(example); // 2025-02-19T11:22:32.205487 
		
		// DateTimeFormatter: LocalDateTime의 날짜/시간 데이터를 원하는 패턴으로 변경
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
		// 변경할 날짜/시간 데이터.format(원하는 포맷 형식)
		System.out.println(example.format(formatter));
		
		
		
		
		
	}
}
