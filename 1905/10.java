/**
 * 如何设计一个类（日期类）
 * 1. 根据需求列出功能：
 * 	1. 传 年、月、日 构造日期类
 * 	2. 在当前日期上增加多少天
 * 	3. 在当前日期上减少多少天
 * 	4. 可以返回字符串 String 的方法		”2019-05-20“
 * 	5. 加一些限制,年支持的范围 [1900, 2100]
 *  6. 如果给定两个日期，希望计算下两个日期之间相差多少天
 * 2. 设计属性
 *	1. 年、月、日
 */
 
 public class Date{
	 private int year;
	 private int month;
	 private int day;
	 
	 //构造方法
	 public Date(int year,int month,int day){
		 if(year < 1900 || year > 2100){
			 System.out.println("年不符合" + year);
			 return;
		 }
		 
		 if (month < 1 || month > 12) {
			System.out.println("月不合法: " + month);
			return;
		}
		
		if (day < 1 || day > getDayOfMonth(year, month)) {
			System.out.println("日不合法: " + day);
			return;
		}
		
		this.year = year;
		this.month = month;
		this.day = day;
	 }
	 public Date(Date other){
		 this(other.year, other.month, other.day);
	 }
	 
	 // 支持的方法
	public void add(int days) {
		if(day < 0){
			System.out.println("days 不合法: " + days);
			return;
		}
		day += days;
		if(day > getDayOfMonth(year, month)){
			day -= getDayOfMonth(year, month);
			month++;
			if(month > 12){
				month = 1;
				year++;
			}
		}
		
	}
	
	public void sub(int days) {
		if (days < 0) {
			System.out.println("days 不合法: " + days);
			return;
		}
        day -= days;
		while(day <= 0){
			month--;
			if(month < 0){
				month = 12;
				year --;
			}
			day += getDayOfMonth(year, month);
		}
	}
	
	public  String toString() {
		return String.format("%04d-%02d-%02d", year, month, day);
	}
	
	// 返回 d1 和 d2 之间相差的天数
	// 要求 d1 必须大于 d2
	public static int differ(Date d1, Date d2) {
		if (!isGreatThan(d1, d2)) {
			System.out.println("必须 d1 大于 d2");
			return -1;
		}
		
		int days =  0;
		Date tmp = new Date(d1);
		while(isGreatThan(tmp,d2)){
			tmp.sub(1);
			days++;
		}
		return days;
	}
	 
	 //内部方法
	 private static final int[] DAY_OF_MONTH = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	 private static int getDayOfMonth(int year,int month){
		int days = DAY_OF_MONTH[month - 1];
		if (month == 2 && isLeapYear(year)) {
			days = 29;
		}
		
		return days;
	 }
	 
	 private static boolean isLeapYear(int year){
		 if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
			 return true;
		 }
		 return false;
	 }
	 
	 private static boolean isGreatThan(Date d1, Date d2) {
		if (d1.year > d2.year) {
			return true;
		}
		
		if (d1.year == d2.year && d1.month > d2.month) {
			return true;
		}
		
		if (d1.year == d2.year && d1.month == d2.month && d1.day > d2.day) {
			return true;
		}
		
		return false;
	 }
	 
	 //入口方法
	 public static void main(String[] args){
		 Date date = new Date(2019, 5, 26);
		 System.out.println(date.toString());
		 date.add(10);
		 System.out.println(date.toString());
		 date.add(10);
		System.out.println(date.toString());
		date.sub(22);
		System.out.println(date.toString());
		
		Date today = new Date(2019, 5, 26);
		Date intern = new Date(2019, 12, 1);
		
		System.out.printf("距离找实习还有 %d 天%n", 
		Date.differ(intern, today));
	 }
 }
