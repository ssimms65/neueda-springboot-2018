package uk.ac.belfastmet.passengers.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.passengers.domain.Passengers;

public interface PassengersRepository extends CrudRepository<Passengers, Integer> {

	Iterable<Passengers> findByPassengerId(Integer passengerId);
	Iterable<Passengers> findBySurvived(Integer survived);
	Iterable<Passengers> findByPClass(Integer pClass);
	Iterable<Passengers> findByName(String name);
	Iterable<Passengers> findBySex(String sex);
	Iterable<Passengers> findByAge(Integer age);
	Iterable<Passengers> findBySibSp(Integer sibSp);
	Iterable<Passengers> findByParch(Integer parch);
	Iterable<Passengers> findByTicket(Double ticket);
	Iterable<Passengers> findByFare(Double fare);
	Iterable<Passengers> findByCabin(Double cabin);
	Iterable<Passengers> findByEmbarked(String embarked);

}