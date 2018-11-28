package CartolaFC.controladores;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import CartolaFC.modeloDAO.CartoletaDAO;
import CartolaFC.modelodados.Cartoleta;

@Controller
public class CartoletaController {
	
	@RequestMapping(value = "/cartoletas", method = RequestMethod.GET)
		public String novoCartoleta(Model model) {
                    model.addAttribute("cartoleta", new Cartoleta());
				return "cartoletas";
		}
	
	@RequestMapping(value = "/salvarcartoleta", method = RequestMethod.POST)
		public String salvar(@ModelAttribute Cartoleta cartoleta, Model model) throws SQLException {
			cartoleta.informacoesCartoleta();
			CartoletaDAO.adicionarCartoleta(cartoleta);
		model.addAttribute("cartoleta", new Cartoleta());
	    	return "cartoletas";
		}
	
}