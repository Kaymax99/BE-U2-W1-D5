package com.U2W1D5.runner;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.U2W1D5.model.Reservation;
import com.U2W1D5.model.Station;
import com.U2W1D5.model.User;
import com.U2W1D5.service.BuildingService;
import com.U2W1D5.service.ReservationService;
import com.U2W1D5.service.StationService;
import com.U2W1D5.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Runner implements ApplicationRunner {
	
	public static Scanner s = new Scanner(System.in);
	
	@Autowired
	UserService userDAO;
	
	@Autowired
	BuildingService buildingDAO;
	
	@Autowired
	StationService stationDAO;
	
	@Autowired
	ReservationService reservationDAO;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		log.info("### Main runner executed. ###");
		
		
//		buildingDAO.newFakeBuilding();
//		User u = userDAO.findUser(1l);
//		Station s = stationDAO.findStation(1l);
//		LocalDate d = LocalDate.of(2023, 4, 16);
//		reservationDAO.saveReservation(new Reservation(u, s, d));
//		System.out.println(stationDAO.findByCity("roma"));
		
	}
}
