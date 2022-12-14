package idatcom.ReservaMicroServicioIIIE.service;

import java.util.List;

import idatcom.ReservaMicroServicioIIIE.dto.ReservaDTO;

public interface ReservaService {
	
	List<ReservaDTO> listar();
	void guardar(ReservaDTO reserva);

}
