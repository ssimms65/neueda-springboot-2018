package uk.ac.belfastmet.breakfastCereals.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.breakfastCereals.domain.Cereals;

public interface CerealsRepository extends CerealsRepository<Cereals, Integer> {
	
	Iterable <Cereals> findByCerealManufacturer(String manufacturer);
	Cereals findByCerealName(String cerealName);
	Iterable <Cereals> findByCerealEnergyKj(String energyKj);
	Iterable <Cereals> findByCerealCaloriesKcal(String caloriesKcal);
	Iterable <Cereals> findByCerealProtienG(String protienG);
	Iterable <Cereals> findByCerealCarbohydrateG(String carbohydrateG);
	Iterable <Cereals> findByCerealSugarsG(String sugarsG);
	Iterable <Cereals> findByCerealFatG(String fatG);
	Iterable <Cereals> findByCerealSaturatesG(String saturatesG);
	Iterable <Cereals> findByCerealFibreG(String fibreG);
	Iterable <Cereals> findByCerealSodiumG(String sodiumG);
	Iterable <Cereals> findByCerealSaltG(String saltG);
	Iterable <Cereals> findByCerealIronMg(String ironMg);

}
