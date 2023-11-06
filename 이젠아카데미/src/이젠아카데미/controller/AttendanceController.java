package 이젠아카데미.controller;

import java.util.ArrayList;

import 이젠아카데미.model.dao.AttendanceDao;
import 이젠아카데미.model.dto.StudentDto;

public class AttendanceController {
 
	private static AttendanceController attendanceController = new AttendanceController();
	public static AttendanceController getInstance() {return attendanceController;}
	private AttendanceController () {}
	
	public boolean attendAction() {
		return AttendanceDao.getInstance().attendAction(BoardController.getInstance().getLoginSession());
	}
	
	
	public int checkInCount() {
			return AttendanceDao.getInstance().checkInCount(BoardController.getInstance().getLoginSession());
		}
	
	public int totalDaysAttended() {
		return AttendanceDao.getInstance().totalDaysAttended(BoardController.getInstance().getLoginSession());
	}
	
	public ArrayList<StudentDto> attendancePrint() {
		return AttendanceDao.getInstance().attendancePrint();
		
	}
}
