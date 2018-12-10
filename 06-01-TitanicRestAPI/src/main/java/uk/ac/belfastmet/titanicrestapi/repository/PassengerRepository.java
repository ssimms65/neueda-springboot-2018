package uk.ac.belfastmet.titanicrestapi.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanicrestapi.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

	Passenger findByPassengerId(Integer passengerId);
/*
	Passenger findByPassengerId(Integer passengerId);
	Iterable<Passenger> findBySurvived(Integer survived);
	Iterable<Passenger> findByPClass(Integer pClass);
	Iterable<Passenger> findByName(String name);
	Iterable<Passenger> findBySex(String sex);
	Iterable<Passenger> findByAge(Integer age);
	Iterable<Passenger> findBySibSp(Integer sibSp);
	Iterable<Passenger> findByParch(Integer parch);
	Iterable<Passenger> findByTicket(String ticket);
	Iterable<Passenger> findByFare(String fare);
	Iterable<Passenger> findByCabin(String cabin);
	Iterable<Passenger> findByEmbarked(String embarked);
*/
} 