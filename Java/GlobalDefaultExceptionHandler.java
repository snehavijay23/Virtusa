package in.bushansirgur.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "The page is not constructed!");
		
		mv.addObject("errorDescription", "The page you are looking for is not available now!");
		
		mv.addObject("title", "404 Error Page");
		
		return mv;
	}
	
	@ExceptionHandler(CountryNotFoundException.class)
	public ModelAndView handleCountryNotFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "Country not available!");
		
		mv.addObject("errorDescription", "The country you are looking for is not available right now!");
		
		mv.addObject("title", "Country Unavailable");
		
		return mv;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception ex) {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "Contact Your Administrator!!");
						
		mv.addObject("errorDescription", ex.toString());
		
		mv.addObject("title", "Error");
		
		return mv;
	}
}
