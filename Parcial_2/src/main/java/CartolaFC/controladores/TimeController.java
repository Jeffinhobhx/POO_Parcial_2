package CartolaFC.controladores;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import CartolaFC.modeloDAO.TimeDAO;

@Controller
public class TimeController {
	
	@RequestMapping(value = "/times", method = RequestMethod.GET)
            public String times(Model model) throws SQLException {
                model.addAttribute("times", TimeDAO.buscarTimes());
                return "times";
            }
}