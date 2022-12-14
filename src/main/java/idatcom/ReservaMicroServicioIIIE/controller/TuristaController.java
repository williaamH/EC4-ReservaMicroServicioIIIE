package idatcom.ReservaMicroServicioIIIE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import idatcom.ReservaMicroServicioIIIE.dto.ReservaDTO;
import idatcom.ReservaMicroServicioIIIE.service.ReservaService;

@Controller
@RequestMapping("api/reserva/v1")
public class TuristaController {
	
	@Autowired
	private ReservaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<ReservaDTO> listar(){
		return service.listar();
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody ReservaDTO dto) {
		service.guardar(dto);
	}
	
}
