package idatcom.ReservaMicroServicioIIIE.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idatcom.ReservaMicroServicioIIIE.dto.ReservaDTO;
import idatcom.ReservaMicroServicioIIIE.model.Reserva;
import idatcom.ReservaMicroServicioIIIE.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	private ReservaRepository repository;
	
	@Override
	public List<ReservaDTO> listar() {
		
		List<ReservaDTO> listadto = new ArrayList<>();
		ReservaDTO dto = null;
		
		for(Reserva reserva : repository.findAll()) {
			dto = new ReservaDTO();
			dto.setCos(reserva.getCosto());
			dto.setCod(reserva.getIdReserva());
			
			listadto.add(dto);
		}
		return listadto;
		
	}

	@Override
	public void guardar(ReservaDTO reserva) {
		
		Reserva res = new Reserva();
		res.setCosto(reserva.getCos());
		res.setIdReserva(reserva.getCod());
		repository.save(res);

	}

}
