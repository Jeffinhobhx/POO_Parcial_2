package CartolaFC.controladores;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import CartolaFC.modeloDAO.JogadorDAO;

@Controller
public class JogadorController {
	
	@RequestMapping(value = "/jogadores", method = RequestMethod.GET)
            public String jogadores(Model model) throws SQLException {
                model.addAttribute("jogadores", JogadorDAO.buscarJogadores());
                return "jogadores";
            }
}