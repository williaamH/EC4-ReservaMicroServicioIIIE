package idatcom.ReservaMicroServicioIIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idatcom.ReservaMicroServicioIIIE.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

}
