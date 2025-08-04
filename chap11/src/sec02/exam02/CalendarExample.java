package sec02.exam02;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;


public class CalendarExample {
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // 캘린더 자식객체 리턴 
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		System.out.println(year + "년 ");
		System.out.println(month + "월 ");
		System.out.println(day + "일 ");
		
		int week = now.get(Calendar.DAY_OF_MONTH); // 요일: 아오 이걸 왜쓰는거야
		String strWeek = null;
		
		switch (week) {
		case Calendar.MONDAY: strWeek = "월"; break;
		case Calendar.THURSDAY: strWeek = "화"; break;
		case Calendar.WEDNESDAY: strWeek = "수"; break;
		case Calendar.TUESDAY: strWeek = "목"; break;
		case Calendar.FRIDAY: strWeek = "금"; break;
		case Calendar.SATURDAY: strWeek = "토"; break;
		case Calendar.SUNDAY: strWeek = "일"; break;
		}
		
		System.out.println(strWeek + "요일");
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		
		if (amPm == Calendar.AM) strAmPm = "오전";
		else strAmPm = "오후";
		
		System.out.println(strAmPm + " ");
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(hour + " 시");
		System.out.println(minute + " 분");
		System.out.println(second + " 초");

		System.out.println("=============");
		
		// 참고: 자바 8 이후 권장 방식
		// Calendar 대신 java.time API로 대체 가능
		// 현재 날짜/시간 얻기
		LocalDateTime now2 = LocalDateTime.now();
	
		// 날짜 구성 요소 얻기
		int year2 = now2.getYear();
		int month2 = now2.getMonthValue();
		int day2 = now2.getDayOfMonth();
		
		System.out.println(year2 + "년 ");
		System.out.println(month2 + "월 ");
		System.out.println(day2 + "일 ");
		
		DayOfWeek dayOfWeek = now2.getDayOfWeek();
		String strWeek2 = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREAN);
		System.out.println(strWeek2 + "요일 ");
		
		// 오전/오후
		int hour24 = now2.getHour();
		String strAmPm2 = hour24 < 12 ? "오전" : "오후";
		System.out.println(strAmPm2 + " ");
		
		// 12시간제 시각으로
		int hour12 = hour24 % 12;
		if (hour12 == 0) hour12 = 12;

		int minute2 = now2.getMinute();
		int second2 = now2.getSecond();
		
		System.out.println(hour12 + " 시");
		System.out.println(minute2 + " 분");
		System.out.println(second2 + " 초");

		System.out.println("=============");
		
		// 날짜 더하기/빼기 : plusDays(), minusDays()
		
		LocalDateTime plusDays = now2.plusDays(3);
		System.out.println("3일 후 : " + plusDays);
		
		System.out.println("=============");
		
		// 날짜/시간 비교 : isBefore(), isAfter(), isEqual()
		// 날짜 비교
		LocalDate today = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2025, 12, 25);
		if (today.isBefore(targetDate)) {
			System.out.println("크리스마스 전 입니다");
		} else if (today.isAfter(targetDate)) {
			System.out.println("크리스마스 이후 ");
		} else System.out.println("크리스마스입니다");
		
		// 시간 비교
		LocalDateTime todayTime = LocalDateTime.now();
		LocalDateTime deadline = LocalDateTime.of(2025, 8, 4, 18, 0);
		
		if (todayTime.isBefore(deadline)) {
			System.out.println("마감 전");
		} else if (todayTime.isAfter(deadline)) {
			System.out.println("마감 후");
		} else
			System.out.println("마감");
		
		System.out.println("=============");

		// 날짜/시간 차이 구하기
		// 날짜
		LocalDate startDate = LocalDate.of(2025, 4, 7);
		LocalDate endDate = LocalDate.of(2025, 10, 24);
		
		// 날짜 차이 계산
		// Period 클래스: 날짜사이 간격 다루는
		Period period = Period.between(startDate, endDate);
		
		System.out.println("연 차이: " + period.getYears());
		System.out.println("월 차이: " + period.getMonths());
		System.out.println("일 차이: " + period.getDays());

		System.out.println("=============");

		// 시간 차이
		LocalTime start = LocalTime.of(10, 0, 0);
		LocalTime end = LocalTime.of(10, 5, 30);
		
		// Duration 클래스 : 시간 간격 다루는
		Duration duration = Duration.between(start, end);
		
		System.out.println("초 : " + duration.getSeconds());
		System.out.println("분 : " + duration.toMinutes());
		
		System.out.println("=============");

		// 차이 계산 : ChronoUnit
		// 두 날짜 시간 사이의 차이를 원하는 단위로 계산
		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println("차이 : " + daysBetween + "일");
		
		
	}
}
