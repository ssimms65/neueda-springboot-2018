package uk.ac.belfastmet.passengers.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.passengers.domain.Passengers;

public interface PassengersRepository extends CrudRepository<Passengers, Integer> {

	Passengers findByPassengerId(Integer passengerId);
	Iterable<Passengers> findBySurvived(Integer survived);
	Iterable<Passengers> findByPClass(Integer pClass);
	Iterable<Passengers> findByName(String name);
	Iterable<Passengers> findBySex(String sex);
	Iterable<Passengers> findByAge(Integer age);
	Iterable<Passengers> findBySibSp(Integer sibSp);
	Iterable<Passengers> findByParch(Integer parch);
	Iterable<Passengers> findByTicket(String ticket);
	Iterable<Passengers> findByFare(String fare);
	Iterable<Passengers> findByCabin(String cabin);
	Iterable<Passengers> findByEmbarked(String embarked);

} 